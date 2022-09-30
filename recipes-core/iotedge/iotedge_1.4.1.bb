inherit cargo pkgconfig

SRC_URI += " \
           git://github.com/Azure/iotedge.git;protocol=https;nobranch=1 \
           crate://crates.io/addr2line/0.17.0 \
           crate://crates.io/adler/1.0.2 \
           crate://crates.io/aho-corasick/0.7.18 \
           crate://crates.io/aho-corasick/0.7.19 \
           crate://crates.io/android_system_properties/0.1.4 \
           crate://crates.io/android_system_properties/0.1.5 \
           crate://crates.io/ansi_term/0.12.1 \
           crate://crates.io/anyhow/1.0.60 \
           crate://crates.io/anyhow/1.0.62 \
           crate://crates.io/anyhow/1.0.65 \
           crate://crates.io/async-recursion/1.0.0 \
           crate://crates.io/async-trait/0.1.57 \
           crate://crates.io/atty/0.2.14 \
           crate://crates.io/autocfg/1.1.0 \
           crate://crates.io/backtrace/0.3.66 \
           crate://crates.io/base64/0.13.0 \
           crate://crates.io/bindgen/0.60.1 \
           crate://crates.io/bitflags/1.3.2 \
           crate://crates.io/block-buffer/0.10.2 \
           crate://crates.io/block-buffer/0.10.3 \
           crate://crates.io/block-buffer/0.9.0 \
           crate://crates.io/bumpalo/3.10.0 \
           crate://crates.io/bumpalo/3.11.0 \
           crate://crates.io/byteorder/1.4.3 \
           crate://crates.io/bytes/1.2.1 \
           crate://crates.io/byte-unit/4.0.14 \
           crate://crates.io/cc/1.0.73 \
           crate://crates.io/cexpr/0.6.0 \
           crate://crates.io/cfg-if/0.1.10 \
           crate://crates.io/cfg-if/1.0.0 \
           crate://crates.io/chrono/0.4.20 \
           crate://crates.io/chrono/0.4.22 \
           crate://crates.io/chrono-humanize/0.2.2 \
           crate://crates.io/clang-sys/1.3.3 \
           crate://crates.io/clang-sys/1.4.0 \
           crate://crates.io/clap/2.34.0 \
           crate://crates.io/colored/2.0.0 \
           crate://crates.io/config/0.13.2 \
           crate://crates.io/core-foundation-sys/0.8.3 \
           crate://crates.io/cpufeatures/0.2.2 \
           crate://crates.io/cpufeatures/0.2.4 \
           crate://crates.io/cpufeatures/0.2.5 \
           crate://crates.io/crc32fast/1.3.2 \
           crate://crates.io/crossbeam-channel/0.5.6 \
           crate://crates.io/crossbeam-deque/0.8.2 \
           crate://crates.io/crossbeam-epoch/0.9.10 \
           crate://crates.io/crossbeam-utils/0.8.11 \
           crate://crates.io/crypto-common/0.1.6 \
           crate://crates.io/crypto-mac/0.8.0 \
           crate://crates.io/darling/0.14.1 \
           crate://crates.io/darling_core/0.14.1 \
           crate://crates.io/darling_macro/0.14.1 \
           crate://crates.io/digest/0.10.3 \
           crate://crates.io/digest/0.10.5 \
           crate://crates.io/digest/0.9.0 \
           crate://crates.io/doc-comment/0.3.3 \
           crate://crates.io/either/1.7.0 \
           crate://crates.io/either/1.8.0 \
           crate://crates.io/env_logger/0.9.0 \
           crate://crates.io/env_logger/0.9.1 \
           crate://crates.io/erased-serde/0.3.22 \
           crate://crates.io/erased-serde/0.3.23 \
           crate://crates.io/fastrand/1.8.0 \
           crate://crates.io/filetime/0.2.17 \
           crate://crates.io/flate2/1.0.24 \
           crate://crates.io/fnv/1.0.7 \
           crate://crates.io/foreign-types/0.3.2 \
           crate://crates.io/foreign-types-shared/0.1.1 \
           crate://crates.io/form_urlencoded/1.0.1 \
           crate://crates.io/form_urlencoded/1.1.0 \
           crate://crates.io/fsevent/0.4.0 \
           crate://crates.io/fsevent-sys/2.0.1 \
           crate://crates.io/fuchsia-zircon/0.3.3 \
           crate://crates.io/fuchsia-zircon-sys/0.3.3 \
           crate://crates.io/futures/0.3.21 \
           crate://crates.io/futures/0.3.23 \
           crate://crates.io/futures/0.3.24 \
           crate://crates.io/futures-channel/0.3.21 \
           crate://crates.io/futures-channel/0.3.23 \
           crate://crates.io/futures-channel/0.3.24 \
           crate://crates.io/futures-core/0.3.21 \
           crate://crates.io/futures-core/0.3.23 \
           crate://crates.io/futures-core/0.3.24 \
           crate://crates.io/futures-executor/0.3.21 \
           crate://crates.io/futures-executor/0.3.23 \
           crate://crates.io/futures-executor/0.3.24 \
           crate://crates.io/futures-io/0.3.21 \
           crate://crates.io/futures-io/0.3.23 \
           crate://crates.io/futures-io/0.3.24 \
           crate://crates.io/futures-macro/0.3.21 \
           crate://crates.io/futures-macro/0.3.23 \
           crate://crates.io/futures-macro/0.3.24 \
           crate://crates.io/futures-sink/0.3.21 \
           crate://crates.io/futures-sink/0.3.23 \
           crate://crates.io/futures-sink/0.3.24 \
           crate://crates.io/futures-task/0.3.21 \
           crate://crates.io/futures-task/0.3.23 \
           crate://crates.io/futures-task/0.3.24 \
           crate://crates.io/futures-util/0.3.21 \
           crate://crates.io/futures-util/0.3.23 \
           crate://crates.io/futures-util/0.3.24 \
           crate://crates.io/generic-array/0.14.6 \
           crate://crates.io/getrandom/0.2.7 \
           crate://crates.io/gimli/0.26.2 \
           crate://crates.io/glob/0.3.0 \
           crate://crates.io/h2/0.3.13 \
           crate://crates.io/h2/0.3.14 \
           crate://crates.io/hashbrown/0.12.3 \
           crate://crates.io/headers/0.3.7 \
           crate://crates.io/headers/0.3.8 \
           crate://crates.io/headers-core/0.2.0 \
           crate://crates.io/heck/0.3.3 \
           crate://crates.io/hermit-abi/0.1.19 \
           crate://crates.io/hex/0.4.3 \
           crate://crates.io/hmac/0.8.1 \
           crate://crates.io/http/0.2.8 \
           crate://crates.io/httparse/1.7.1 \
           crate://crates.io/httparse/1.8.0 \
           crate://crates.io/http-body/0.4.5 \
           crate://crates.io/httpdate/1.0.2 \
           crate://crates.io/humantime/2.1.0 \
           crate://crates.io/humantime-serde/1.1.1 \
           crate://crates.io/hyper/0.14.20 \
           crate://crates.io/hyper-openssl/0.9.2 \
           crate://crates.io/hyper-proxy/0.9.1 \
           crate://crates.io/iana-time-zone/0.1.46 \
           crate://crates.io/iana-time-zone/0.1.50 \
           crate://crates.io/ident_case/1.0.1 \
           crate://crates.io/idna/0.2.3 \
           crate://crates.io/idna/0.3.0 \
           crate://crates.io/indexmap/1.9.1 \
           crate://crates.io/inotify/0.7.1 \
           crate://crates.io/inotify-sys/0.1.5 \
           crate://crates.io/instant/0.1.12 \
           crate://crates.io/iovec/0.1.4 \
           crate://crates.io/itertools/0.8.2 \
           crate://crates.io/itoa/1.0.3 \
           crate://crates.io/js-sys/0.3.59 \
           crate://crates.io/js-sys/0.3.60 \
           crate://crates.io/kernel32-sys/0.2.2 \
           crate://crates.io/lazycell/1.3.0 \
           crate://crates.io/lazy_static/1.4.0 \
           crate://crates.io/libc/0.2.127 \
           crate://crates.io/libc/0.2.132 \
           crate://crates.io/libc/0.2.133 \
           crate://crates.io/libloading/0.7.3 \
           crate://crates.io/linked-hash-map/0.5.6 \
           crate://crates.io/linked_hash_set/0.1.4 \
           crate://crates.io/lock_api/0.4.7 \
           crate://crates.io/lock_api/0.4.9 \
           crate://crates.io/log/0.4.17 \
           crate://crates.io/matches/0.1.9 \
           crate://crates.io/memchr/2.5.0 \
           crate://crates.io/memoffset/0.6.5 \
           crate://crates.io/mime/0.3.16 \
           crate://crates.io/minimal-lexical/0.2.1 \
           crate://crates.io/miniz_oxide/0.5.3 \
           crate://crates.io/miniz_oxide/0.5.4 \
           crate://crates.io/mio/0.6.23 \
           crate://crates.io/mio/0.8.4 \
           crate://crates.io/mio-extras/2.0.6 \
           crate://crates.io/miow/0.2.2 \
           crate://crates.io/net2/0.2.37 \
           crate://crates.io/nix/0.24.2 \
           crate://crates.io/nom/7.1.1 \
           crate://crates.io/notify/4.0.17 \
           crate://crates.io/ntapi/0.3.7 \
           crate://crates.io/num_cpus/1.13.1 \
           crate://crates.io/num-integer/0.1.45 \
           crate://crates.io/num_threads/0.1.6 \
           crate://crates.io/num-traits/0.2.15 \
           crate://crates.io/object/0.29.0 \
           crate://crates.io/once_cell/1.13.0 \
           crate://crates.io/once_cell/1.13.1 \
           crate://crates.io/once_cell/1.15.0 \
           crate://crates.io/opaque-debug/0.3.0 \
           crate://crates.io/openssl/0.10.41 \
           crate://crates.io/openssl/0.10.42 \
           crate://crates.io/openssl-errors/0.1.0 \
           crate://crates.io/openssl-errors/0.2.0 \
           crate://crates.io/openssl-macros/0.1.0 \
           crate://crates.io/openssl-sys/0.9.75 \
           crate://crates.io/parking_lot/0.12.1 \
           crate://crates.io/parking_lot_core/0.9.3 \
           crate://crates.io/paste/1.0.8 \
           crate://crates.io/paste/1.0.9 \
           crate://crates.io/pathdiff/0.2.1 \
           crate://crates.io/peeking_take_while/0.1.2 \
           crate://crates.io/percent-encoding/2.1.0 \
           crate://crates.io/percent-encoding/2.2.0 \
           crate://crates.io/pin-project-lite/0.2.9 \
           crate://crates.io/pin-utils/0.1.0 \
           crate://crates.io/pkg-config/0.3.25 \
           crate://crates.io/proc-macro2/1.0.43 \
           crate://crates.io/proc-macro2/1.0.44 \
           crate://crates.io/proc-macro-error/1.0.4 \
           crate://crates.io/proc-macro-error-attr/1.0.4 \
           crate://crates.io/quote/1.0.21 \
           crate://crates.io/rayon/1.5.3 \
           crate://crates.io/rayon-core/1.9.3 \
           crate://crates.io/redox_syscall/0.2.16 \
           crate://crates.io/regex/1.6.0 \
           crate://crates.io/regex-syntax/0.6.27 \
           crate://crates.io/remove_dir_all/0.5.3 \
           crate://crates.io/rustc-demangle/0.1.21 \
           crate://crates.io/rustc-hash/1.1.0 \
           crate://crates.io/rustversion/1.0.9 \
           crate://crates.io/ryu/1.0.11 \
           crate://crates.io/same-file/1.0.6 \
           crate://crates.io/scopeguard/1.1.0 \
           crate://crates.io/serde/1.0.142 \
           crate://crates.io/serde/1.0.144 \
           crate://crates.io/serde/1.0.145 \
           crate://crates.io/serde_derive/1.0.142 \
           crate://crates.io/serde_derive/1.0.144 \
           crate://crates.io/serde_derive/1.0.145 \
           crate://crates.io/serde_json/1.0.83 \
           crate://crates.io/serde_json/1.0.85 \
           crate://crates.io/serde_with/2.0.0 \
           crate://crates.io/serde_with/2.0.1 \
           crate://crates.io/serde_with_macros/2.0.0 \
           crate://crates.io/serde_with_macros/2.0.1 \
           crate://crates.io/serial_test/0.8.0 \
           crate://crates.io/serial_test_derive/0.8.0 \
           crate://crates.io/sha-1/0.10.0 \
           crate://crates.io/sha1/0.10.5 \
           crate://crates.io/sha2/0.10.2 \
           crate://crates.io/sha2/0.9.9 \
           crate://crates.io/shlex/1.1.0 \
           crate://crates.io/signal-hook-registry/1.4.0 \
           crate://crates.io/slab/0.4.7 \
           crate://crates.io/smallvec/1.9.0 \
           crate://crates.io/socket2/0.4.4 \
           crate://crates.io/socket2/0.4.7 \
           crate://crates.io/strsim/0.10.0 \
           crate://crates.io/strsim/0.8.0 \
           crate://crates.io/structopt/0.3.26 \
           crate://crates.io/structopt-derive/0.4.18 \
           crate://crates.io/subtle/2.4.1 \
           crate://crates.io/syn/1.0.101 \
           crate://crates.io/syn/1.0.99 \
           crate://crates.io/sysinfo/0.15.9 \
           crate://crates.io/sysinfo/0.25.3 \
           crate://crates.io/tabwriter/1.2.1 \
           crate://crates.io/tempfile/3.3.0 \
           crate://crates.io/termcolor/1.1.3 \
           crate://crates.io/test-case/2.2.1 \
           crate://crates.io/test-case-macros/2.2.1 \
           crate://crates.io/textwrap/0.11.0 \
           crate://crates.io/thiserror/1.0.32 \
           crate://crates.io/thiserror-impl/1.0.32 \
           crate://crates.io/time/0.1.44 \
           crate://crates.io/time/0.3.13 \
           crate://crates.io/time/0.3.14 \
           crate://crates.io/tinyvec/1.6.0 \
           crate://crates.io/tinyvec_macros/0.1.0 \
           crate://crates.io/tokio/1.20.1 \
           crate://crates.io/tokio/1.21.2 \
           crate://crates.io/tokio-macros/1.8.0 \
           crate://crates.io/tokio-openssl/0.6.3 \
           crate://crates.io/tokio-util/0.7.3 \
           crate://crates.io/tokio-util/0.7.4 \
           crate://crates.io/toml/0.5.9 \
           crate://crates.io/tower-layer/0.3.1 \
           crate://crates.io/tower-service/0.3.2 \
           crate://crates.io/tracing/0.1.36 \
           crate://crates.io/tracing-attributes/0.1.22 \
           crate://crates.io/tracing-core/0.1.29 \
           crate://crates.io/try-lock/0.2.3 \
           crate://crates.io/typenum/1.15.0 \
           crate://crates.io/unicode-bidi/0.3.8 \
           crate://crates.io/unicode-ident/1.0.3 \
           crate://crates.io/unicode-ident/1.0.4 \
           crate://crates.io/unicode-normalization/0.1.21 \
           crate://crates.io/unicode-normalization/0.1.22 \
           crate://crates.io/unicode-segmentation/1.10.0 \
           crate://crates.io/unicode-segmentation/1.9.0 \
           crate://crates.io/unicode-width/0.1.10 \
           crate://crates.io/unicode-width/0.1.9 \
           crate://crates.io/url/2.2.2 \
           crate://crates.io/url/2.3.1 \
           crate://crates.io/utf8-width/0.1.6 \
           crate://crates.io/uuid/1.1.2 \
           crate://crates.io/vcpkg/0.2.15 \
           crate://crates.io/vec_map/0.8.2 \
           crate://crates.io/version_check/0.9.4 \
           crate://crates.io/walkdir/2.3.2 \
           crate://crates.io/want/0.3.0 \
           crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
           crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
           crate://crates.io/wasm-bindgen/0.2.82 \
           crate://crates.io/wasm-bindgen/0.2.83 \
           crate://crates.io/wasm-bindgen-backend/0.2.82 \
           crate://crates.io/wasm-bindgen-backend/0.2.83 \
           crate://crates.io/wasm-bindgen-macro/0.2.82 \
           crate://crates.io/wasm-bindgen-macro/0.2.83 \
           crate://crates.io/wasm-bindgen-macro-support/0.2.82 \
           crate://crates.io/wasm-bindgen-macro-support/0.2.83 \
           crate://crates.io/wasm-bindgen-shared/0.2.82 \
           crate://crates.io/wasm-bindgen-shared/0.2.83 \
           crate://crates.io/wildmatch/2.1.1 \
           crate://crates.io/winapi/0.2.8 \
           crate://crates.io/winapi/0.3.9 \
           crate://crates.io/winapi-build/0.1.1 \
           crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
           crate://crates.io/winapi-util/0.1.5 \
           crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
           crate://crates.io/windows_aarch64_msvc/0.36.1 \
           crate://crates.io/windows_i686_gnu/0.36.1 \
           crate://crates.io/windows_i686_msvc/0.36.1 \
           crate://crates.io/windows-sys/0.36.1 \
           crate://crates.io/windows_x86_64_gnu/0.36.1 \
           crate://crates.io/windows_x86_64_msvc/0.36.1 \
           crate://crates.io/ws2_32-sys/0.2.1 \
           crate://crates.io/yaml-rust/0.4.5 \
           crate://crates.io/zip/0.6.2 \
           file://0001-Panic-strategy-changed-from-abort-to-unwind-for-iote.patch \
           git://github.com/Azure/iot-identity-service;protocol=https;nobranch=1;name=iot-identity-service;destsuffix=iot-identity-service \
           file://change_packages.sh \
           file://0001-Updated-openssl-errors-version-to-0.2.patch;patchdir=${WORKDIR}/iot-identity-service \
           file://0002-Updated-engine.c-for-openssl3.patch;patchdir=${WORKDIR}/iot-identity-service \
           file://0003-Panic-strategy-changed-from-abort-to-unwind.patch;patchdir=${WORKDIR}/iot-identity-service \
"
SRCREV = "d65a3aeac060296280ff5ef4475137b79031e29e"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "edgelet"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched

SRCREV_FORMAT .= "_iot-identity-service"
SRCREV_iot-identity-service = "f349b64d3b555b917a417f1c7543d245612495e3"

SUMMARY = "IoT Edge Security Daemon and tools"
HOMEPAGE = "https://github.com/Azure/iotedge"
LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=0f7e3b1308cb5c00b372a6e78835732d"

DEPENDS += "openssl virtual/docker iot-identity-service"
RDEPENDS:${PN} += "docker iot-identity-service"

do_compile () {
        rm -rf ${WORKDIR}/iot-identity-service/{.pc,Cargo.lock}
        pushd "${WORKDIR}/git/edgelet" ; \
        rm -f Cargo.lock ; \
        ../../change_packages.sh "${WORKDIR}/iot-identity-service" ; \
        popd

        oe_cargo_fix_env
        oe_cargo_build
}

do_install () {
        # Binaries
        install -m 755 -D ${B}/target/${CARGO_TARGET_SUBDIR}/aziot-edged ${D}${libexecdir}/aziot/aziot-edged
        install -m 755 -D ${B}/target/${CARGO_TARGET_SUBDIR}/iotedge ${D}${bindir}/iotedge

        # Default configs and config directories
        install -m 644 -D ${WORKDIR}/git/edgelet/contrib/config/linux/template.toml ${D}${sysconfdir}/aziot/config.toml.edge.template
        install -m 644 -D ${WORKDIR}/git/edgelet/contrib/config/linux/default.toml ${D}${sysconfdir}/aziot/edged/config.toml.default
        install -m 644 -D ${WORKDIR}/git/edgelet/contrib/config/linux/logrotate ${D}${sysconfdir}/logrotate.d/aziot-edge
        install -d -m 0700 ${D}${sysconfdir}/aziot/edged/config.d
        CONNECT_MANAGEMENT_URI=unix:///var/run/iotedge/mgmt.sock ; \
        CONNECT_WORKLOAD_URI=unix:///var/run/iotedge/workload.sock ; \
        LISTEN_MANAGEMENT_URI=fd://aziot-edged.mgmt.socket ; \
        LISTEN_WORKLOAD_URI=fd://aziot-edged.workload.socket ; \
        for CONF_FILE in ${D}${sysconfdir}/aziot/{edged/config.toml.default,config.toml.edge.template} ; do
            sed -i \
                -e "s|@connect_workload_uri@|${CONNECT_WORKLOAD_URI}|" \
                -e "s|@connect_management_uri@|${CONNECT_MANAGEMENT_URI}|" \
                -e "s|@listen_workload_uri@|${LISTEN_WORKLOAD_URI}|" \
                -e "s|@listen_management_uri@|${LISTEN_MANAGEMENT_URI}|" \
                $CONF_FILE
        done

        # Systemd services and sockets
        install -m 644 -D "${WORKDIR}/git/edgelet/contrib/systemd/enterprise-linux/aziot-edged.service" "${D}${systemd_unitdir}/system/aziot-edged.service";
        install -m 644 -D "${WORKDIR}/git/edgelet/contrib/systemd/enterprise-linux/aziot-edged.workload.socket" "${D}${systemd_unitdir}/system/aziot-edged.workload.socket";
        install -m 644 -D "${WORKDIR}/git/edgelet/contrib/systemd/enterprise-linux/aziot-edged.mgmt.socket" "${D}${systemd_unitdir}/system/aziot-edged.mgmt.socket";
}

FILES:${PN} += " \
    ${systemd_unitdir}/system/* \
"

inherit systemd
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"
SYSTEMD_SERVICE:${PN} = "aziot-edged.service"

inherit useradd
USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "-r -c 'iotedge user' -u 15580 -g iotedge -G docker -d ${localstatedir}/lib/aziot/edged -m -k /dev/null -s /bin/false iotedge; "
USERADD_PARAM:${PN} += "-r -g iotedge -c 'edgeAgent user' -s /bin/sh edgeagentuser; "
USERADD_PARAM:${PN} += "-r -c 'edgeHub user' -s /bin/sh edgehubuser; "
GROUPADD_PARAM:${PN} = "-r -g 15580 iotedge; "

