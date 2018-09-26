# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by SECO"
DESCRIPTION = "Linux Kernel provided and supported by SECO based on NXP"


require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-imx-src.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

PV = "4.9.51"

SCMVERSION = "n"
SRC_URI = "git://secogit.seco.com/imx8/linux-kernel-4-9-51-imx8mq-ga.git;protocol=https;user=user:password file://defconfig" 
#SRC_URI = "git:///home/seco/linux-kernel-4-9-51-imx8mq-ga.git; \
#	file://defconfig"


SRCREV = "${AUTOREV}"

KERNEL_DEVICETREE = " \
	seco/fsl-imx8mq-seco-c12.dtb \
	\
	seco/overlays/fsl-imx8mq-seco-c12-dual-display.dtbo \
	seco/overlays/fsl-imx8mq-seco-c12-lcdif-sn65dsi84.dtbo \
	seco/overlays/fsl-imx8mq-seco-c12-wilink.dtbo \
"
