require linux.inc

DESCRIPTION = "Linux kernel"
KERNEL_IMAGETYPE ?= "uImage"

COMPATIBLE_MACHINE = "(chromebook-snow)"

FILESPATH =. "${FILE_DIRNAME}/linux-chromeos-${PV}:${FILE_DIRNAME}/linux-chromeos-${PV}/${MACHINE}:"

S = "${WORKDIR}/git"

PV = "3.8.11"
PR = "r1"

SRC_URI = "git://chromium.googlesource.com/chromiumos/third_party/kernel;protocol=https;branch=chromeos-3.8 \
	   file://0001-mwifiex-do-not-create-AP-and-P2P-interfaces-upon-dri.patch \
"

SRCREV_pn-${PN} = "39e972fc04262df2bac3524a85b21de92e113735"

SRC_URI += " \
             file://defconfig \
            "
