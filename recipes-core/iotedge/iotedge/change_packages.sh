#!/bin/bash

REPLACE_STRING=github.com/Azure ; \
for CURFILE in $(find -type f -name Cargo.toml) ; do \
    IFS=$'\n' ; set -f ; \
    targets=($(cat $CURFILE | grep ${REPLACE_STRING})) ; \
    for ((i = 0; i < ${#targets[@]}; i++)) ; do \
        packagename=$(echo ${targets[$i]}| awk '{print $1;}') ; \
        packagepath=$(find ${1} -type d -name ${packagename}); \
        realpackagepath=$(realpath --relative-to=$(dirname ${CURFILE}) ${packagepath}) ; \
        if [ ! -z "$realpackagepath" ]; then \
            PACKDATA=$(echo "${targets[$i]}" |  grep -o -P '(?<={).*(?=})') ; \
            IFS=',' read -r -a parameters <<< "$PACKDATA" ; \
            outparameters=(" path = \"${realpackagepath}\"") ; \
            for ((j = 0; j < ${#parameters[@]}; j++)) ; do \
                IFS='= ' read -r -a values <<< "${parameters[j]}" ; \
                case ${values[0]} in
                    "git" )
                        ;;
                    "branch" )
                        ;;
                    * )
                        outparameters+=("${parameters[j]}")
                        ;;
                esac ; \
            done ; \
            NEWDATA=$(for ((j = 0; j < ${#outparameters[@]}; j++)) ; do \
                [[ "$j" != "0" ]] && printf "," ; \
                printf "%s" ${outparameters[$j]} ; \
            done) ; \
            echo ${CURFILE}: package $packagename change from [${PACKDATA}] to [${NEWDATA}] ; \
            sed -i -e 's@'"${targets[$i]}"'@'"${packagename}"' = {'"${NEWDATA}"' }@g' ${CURFILE}; \
        fi ; \
    done ; \
done
