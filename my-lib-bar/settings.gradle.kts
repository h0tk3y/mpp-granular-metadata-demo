pluginManagement {
    repositories {
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        gradlePluginPortal()
    }
}

rootProject.name = "my-lib-bar"

enableFeaturePreview("GRADLE_METADATA")