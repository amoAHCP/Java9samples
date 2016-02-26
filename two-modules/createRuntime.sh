#!/bin/bash
set -x #echo on
rm -R contactValidator
jlink --modulepath $JAVA9_BIN/jmods:mlib --addmods ch.trivadis.contactvalidator --output contactValidator --compress 2 --exclude-files *.diz
du -h contactValidator
