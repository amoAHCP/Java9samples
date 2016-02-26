#!/bin/bash
set -x #echo on
rm -R mlib
mkdir mlib
jar --create --file=mlib/ch.trivadis.phoneValidator@1.0.jar --module-version=1.0 -C mods/ch.trivadis.phoneValidator .
jar --create --file=mlib/ch.trivadis.contactValidator.jar --main-class=ch.trivadis.contactvalidator.api.Run -C mods/ch.trivadis.contactvalidator .
