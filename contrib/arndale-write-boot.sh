#! /bin/sh

BL1=""
SPL=""
UBOOT=""
TARGET=""

if [ "$#" -eq 4 ]; then
	BL1=$1
	SPL=$2
	UBOOT=$3
	TARGET=$4
elif [ "$#" -eq 3 ]; then
	SPL=$1
	UBOOT=$2
	TARGET=$4
else
	echo "$0 [<bl1image>] <u-boot spl> <u-boot> <target>"
	exit
fi

if [ -n "$BL1" ]; then
	echo dd if=$BL1 of=$TARGET seek=1
fi

echo dd if=$SPL of=$TARGET seek=17
echo dd if=$UBOOT of=$TARGET seek=49

