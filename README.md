# boot-issue-21569
Demo Project for boot issue 21569

# Gradle Build

Gradle with the Kotlin DSL is used for building the application. Build logic has been 
extracted into `buildSrc` as recommended by Gradle best practices. A gradle `java-platfrom` 
is used to align dependencies across all projects in this repo. 

The Spring boot version is set by editing `buildSrc/src/main/resources/springBootVersion.txt`. This 
is needed because the spring boot BOM and plugin are used, and it is easy to change the BOM 
version in the platform and forget to change the plugin version which can lead to bugs. Therefore,
the spring boot version is read from the value in `buildSrc/src/main/resources/springBootVersion.txt`. 
