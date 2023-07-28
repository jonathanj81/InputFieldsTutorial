// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    dependencies {
        classpath(BuildPlugins.androidTools)
        classpath(BuildPlugins.kotlinAllOpen)
        classpath(BuildPlugins.hiltGradle)
        classpath(BuildPlugins.kotlinGradle)
    }
}

plugins {
    java
    idea
}

allprojects {

    // Automatically pull down javadocs and sources (if available)
    apply(plugin = "idea")
    idea {
        module {
            isDownloadJavadoc = true
            isDownloadSources = true
        }
    }

    // Verbose output for usage of deprecated APIs
    tasks.withType<JavaCompile> {
        options.compilerArgs = mutableListOf("-Xlint:deprecation")
    }
}