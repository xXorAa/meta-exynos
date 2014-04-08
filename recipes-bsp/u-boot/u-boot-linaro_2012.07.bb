require u-boot-linaro.inc

# SPL build
UBOOT_BINARY = "u-boot.bin"
UBOOT_IMAGE = "u-boot-${MACHINE}-${PV}-${PR}.bin"
UBOOT_SYMLINK = "u-boot-${MACHINE}.bin"

PV = "2012.07"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(arndale-octa)"

# File is board-specific, only copy when it will be correct.
FWENV = ""

SRC_URI = "git://git.linaro.org/git/landing-teams/working/samsung/u-boot.git;protocol=http;branch=tracking-arndale_octa \
           ${FWENV} \
          "

SRCREV = "0cc80dee4203027f3f1ce0a45b8940fc5757f322"

LIC_FILES_CHKSUM = "file://README;beginline=1;endline=22;md5=78b195c11cb6ef63e6985140db7d7bab"

S = "${WORKDIR}/git"

