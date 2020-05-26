plugins {
    `java-library-conventions`
    `spring-boot-conventions`
}

springBoot {
    mainClassName = "com.example.ExampleApplication"
}


dependencies {
    implementation(project(":components:util"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    testImplementation(testFixtures(project(":components:util")))
}
