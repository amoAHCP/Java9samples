
#!/bin/bash
set -x #echo on
java -mp bin:../lib -m ch.trivadis.contactvalidator $1
