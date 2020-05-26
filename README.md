# boot-issue-21569
Demo Project for boot issue 21569

Previous commit has code based on Boot 2.2.6 that works, this commit follows upgrade directions
from boot 2.2 to  2.3 and it does not work.

check `app/app.gradle.kts` for a commented line ot make it work the build  work. If you examine
the previous commit you will  see that this code works in Spring Boot 2.2.6.RELEASE but not in 
2.3.0

fails with 
```
./gradlew build
> Task :app:bootJar FAILED

During the build, one or more dependencies that were declared without a version failed to resolve:
    org.springframework.boot:spring-boot-devtools:

Did you forget to apply the io.spring.dependency-management plugin to the app project?


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:bootJar'.
> Could not resolve all files for configuration ':app:developmentOnly'.
   > Could not find org.springframework.boot:spring-boot-devtools:.
     Required by:
         project :app

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 1s
7 actionable tasks: 1 executed, 6 up-to-date
```

# Gradle Build

Gradle with the Kotlin DSL is used for building the application. Build logic has been 
extracted into `buildSrc` as recommended by Gradle best practices. A gradle `java-platfrom` 
is used to align dependencies across all projects in this repo. 

The Spring boot version is set by editing `buildSrc/src/main/resources/springBootVersion.txt`. This 
is needed because the spring boot BOM and plugin are used, and it is easy to change the BOM 
version in the platform and forget to change the plugin version which can lead to bugs. Therefore,
the spring boot version is read from the value in `buildSrc/src/main/resources/springBootVersion.txt`. 
