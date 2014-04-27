require linux.inc

DESCRIPTION = "Linux kernel"
KERNEL_IMAGETYPE ?= "zImage"

COMPATIBLE_MACHINE = "(arndale-octa)"

FILESPATH =. "${FILE_DIRNAME}/linux-linaro:${FILE_DIRNAME}/linux-linaro/${MACHINE}:"

S = "${WORKDIR}/git"

PV = "3.14.0"

SRC_URI = "git://git.linaro.org/kernel/linux-linaro-tracking.git;protocol=http;branch=linux-linaro"
SRCREV_pn-${PN} = "3f169e1854aa8b7b555391b661f13349920cfbbb"

SRC_URI += " \
             file://defconfig \
"
