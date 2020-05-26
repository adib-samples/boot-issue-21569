plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(enforcedPlatform("org.springframework.boot:spring-boot-dependencies:${Versions.SpringBootVersion}"))
    constraints {
        api("com.github.bbottema:emailaddress-rfc2822:2.1.4")
        api("com.icegreen:greenmail:1.5.11")
        api("nl.jqno.equalsverifier:equalsverifier:3.1.13")
        api("com.google.guava:guava:28.2-jre")
        api("io.rest-assured:rest-assured:4.3.0")
        api("org.awaitility:awaitility:4.0.2")
        api("org.threeten:threeten-extra:1.5.0")
        api("com.vladmihalcea:hibernate-types-52:2.9.7")
    }
}
