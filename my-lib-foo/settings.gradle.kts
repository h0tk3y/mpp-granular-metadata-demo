pluginManagement {
    repositories {
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        gradlePluginPortal()
    }
}

rootProject.name = "my-lib-foo"

enableFeaturePreview("GRADLE_METADATA")