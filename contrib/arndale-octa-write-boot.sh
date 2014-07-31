#!/bin/sh

BL1=""
BL2=""
TZSW=""
UBOOT=""
TARGET=""

if [ "$#" -eq 5 ]; then
	BL1=$1
	BL2=$2
	TZSW=$3
	UBOOT=$4
	TARGET=$5
else
	echo "$0 <bl1image> <bl2image> <TrustZone S/W> <u-boot.bin> <target>"
	exit
fi

echo "Copying BL1"
dd iflag=dsync oflag=dsync if=$BL1 of=$TARGET seek=1
echo "Copying BL2"
dd iflag=dsync oflag=dsync if=$BL2 of=$TARGET  seek=31
echo "Copying u-boot"
dd iflag=dsync oflag=dsync if=$UBOOT of=$TARGET seek=63
echo "Copying TrustZone S/W"
dd iflag=dsync oflag=dsync if=$TZSW of=$TARGET seek=719

####################################
echo "U-boot image copied successfully."
