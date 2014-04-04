LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENCE.Marvell;md5=2d2127d203ac000f1afabfce593659ce"

SRC_URI = "file://sd8797_uapsta.bin \
           file://LICENCE.Marvell"

S = "${WORKDIR}"

do_install () {
	install -d ${D}/lib/firmware/
	install ${S}/sd8797_uapsta.bin ${D}/lib/firmware/
}

FILES_${PN} = "/lib/firmware/sd8797_uapsta.bin"

