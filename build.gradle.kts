plugins {
    id("org.sonarqube") version "2.8"
}

subprojects {

    repositories {
        mavenCentral()
    }

    group = "com.example"
    version = "1.0.0"

    @Suppress("UnstableApiUsage")
    plugins.withType<JavaTestFixturesPlugin> {
        sonarqube {
            properties {
                property("sonar.tests", "src/test,src/testFixtures,src/main/resources")
            }
        }
    }
}
