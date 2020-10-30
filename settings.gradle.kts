
pluginManagement {
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
}

rootProject.name = "minimal-KT-41032-JS"

