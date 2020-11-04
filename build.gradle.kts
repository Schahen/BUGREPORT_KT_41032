plugins {
    //kotlin("js") version "1.4.20-M2"
    kotlin("js") version "1.4.255-SNAPSHOT"
}
group = "me.shagen"
version = "1.0-SNAPSHOT"

repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
        maven(url = "https://cache-redirector.jetbrains.com/jcenter.bintray.com")
        maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
}

dependencies {
    testImplementation(kotlin("test-js"))
}

kotlin {
    js {
        nodejs {
            binaries.executable()
        }
    }
}

tasks.withType<Test> {
    testLogging{
        showStandardStreams = true
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}
