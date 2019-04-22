plugins {
    kotlin("multiplatform").version("1.3.40-dev-1840").apply(false)
}

allprojects {
    repositories {
        maven("$rootDir/repo")
        maven("https://kotlin.bintray.com/kotlin-dev")
        jcenter()
    }
}