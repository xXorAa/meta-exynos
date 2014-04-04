require linux.inc

DESCRIPTION = "Linux kernel"
KERNEL_IMAGETYPE ?= "uImage"

COMPATIBLE_MACHINE = "(chromebook-snow)"

FILESPATH =. "${FILE_DIRNAME}/linux-chromeos-${PV}:${FILE_DIRNAME}/linux-chromeos-${PV}/${MACHINE}:"

S = "${WORKDIR}/git"

PV = "3.8.11"

SRC_URI = "git://chromium.googlesource.com/chromiumos/third_party/kernel-next;protocol=https"
SRCREV_pn-${PN} = "21856bfd135260ec3c2e999cc8b697920ca2ec06"

SRC_URI += " \
             file://defconfig \
            "
