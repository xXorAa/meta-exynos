require recipes-bsp/u-boot/u-boot.inc

# SPL build
UBOOT_BINARY = "u-boot-dtb.bin"
UBOOT_IMAGE = "u-boot-${MACHINE}-${PV}-${PR}.img"
UBOOT_SYMLINK = "u-boot-${MACHINE}.img"

PV = "v2014.01+v2014.04-rc3"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(arndale)"

SRC_URI = "git://git.denx.de/u-boot.git \
	   file://0001-arndale-enabled-bootz-command.patch \
	   file://0002-Patch-to-get-the-arndale-board-booting-using-the-met.patch \
          "

# v2014.04-rc3 release tag
SRCREV = "c494eaf409cb8db9a5a513e9bdfac20b7a83daca"

LIC_FILES_CHKSUM = "file://README;beginline=1;endline=22;md5=2687c5ebfd9cb284491c3204b726ea29"

S = "${WORKDIR}/git"

