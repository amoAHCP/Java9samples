# Java9samples
This example repo provides some Java9 (Jigsaw) samples

## prerequisite
- Install Java9 Jigsaw package https://jdk9.java.net/jigsaw/
- on UNIX systems you can configure your different Java versions like this:

Edit .bash_profile
```bash
export GRADLE_HOME=/usr/local/Cellar/gradle/2.0/libexec
export M2_HOME=/usr/local/Cellar/maven/3.3.3/libexec
export JAVA_8_HOME=$(/usr/libexec/java_home -v1.8) # on linux try to add the path
export JAVA_7_HOME=$(/usr/libexec/java_home -v1.7)# on linux try to add the path
export VERTX_HOME=/Users/XXX/development/servers/vert.x-3.2.0-full
export JAVA9_BIN=/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home

export JAVA_HOME=$JAVA_8_HOME
export PATH=$PATH:$GRADLE_HOME/bin:$VERTX_HOME/bin:$JAVA9_BIN/bin

alias java9='export JAVA_HOME=$JAVA9_BIN'
alias java7='export JAVA_HOME=$JAVA_7_HOME'
alias java8='export JAVA_HOME=$JAVA_8_HOME'
```