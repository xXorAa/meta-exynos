require linux.inc

DESCRIPTION = "Linux kernel"
KERNEL_IMAGETYPE ?= "zImage"

COMPATIBLE_MACHINE = "(arndale)"

FILESPATH =. "${FILE_DIRNAME}/linux-exynos-${PV}:${FILE_DIRNAME}/linux-exynos-${PV}/${MACHINE}:"

S = "${WORKDIR}/git"

PV = "3.14"
PR = "r1"

SRC_URI = "git://github.com/torvalds/linux.git"
SRCREV_pn-${PN} = "455c6fdbd219161bd09b1165f11699d6d73de11c"

SRC_URI += " \
             file://defconfig \
            "
