pluginManagement {
    repositories {
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        gradlePluginPortal()
    }
}

rootProject.name = "mpp-granular-metadata-demo"

include("my-lib-foo", "my-lib-bar", "my-app")

enableFeaturePreview("GRADLE_METADATA")