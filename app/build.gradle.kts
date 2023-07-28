plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-allopen")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = ConfigVersions.compileSdkVersion
    namespace = "com.atomicrobot.inputfieldstutorial"

    defaultConfig {
        applicationId = "com.atomicrobot.inputfieldstutorial"
        minSdkVersion(ConfigVersions.minSdkVersion)
        targetSdkVersion(ConfigVersions.targetSdkVersion)
        versionCode = ConfigVersions.versionCode
        versionName = ConfigVersions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleKtx)
    implementation(Dependencies.composeActivity)
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeUiTooling)
    implementation(Dependencies.material3)
    implementation(Dependencies.materialIcons)
    implementation(Dependencies.hilt)
    implementation(Dependencies.fonts)

    kapt(Dependencies.hiltCompiler)

    testImplementation(Dependencies.jUnit)
    androidTestImplementation(Dependencies.jUnitTest)
    androidTestImplementation(Dependencies.espresso)
    androidTestImplementation(Dependencies.composeTest)

    debugImplementation(Dependencies.composeDebug)
    debugImplementation(Dependencies.composeManifest)
}