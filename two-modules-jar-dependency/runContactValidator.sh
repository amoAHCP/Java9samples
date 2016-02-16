#!/bin/bash
set -x #echo on
java -modulepath .:../lib -m ch.trivadis.contactvalidator/ch.trivadis.contactvalidator.api.Run $1
