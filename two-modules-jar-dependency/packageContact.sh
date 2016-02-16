#!/bin/bash
set -x #echo on
jar --create --file=bin/contactvalidator.jar --module-version=1.0 --main-class=ch.trivadis.contactvalidator.api.Run -C ch.trivadis.contactvalidator .
