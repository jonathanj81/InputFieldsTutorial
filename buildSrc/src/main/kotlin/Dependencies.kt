object BuildPlugins {
    val androidTools by lazy { "com.android.tools.build:gradle:${DependencyVersions.androidPluginVersion}" }
    val kotlinGradle by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${DependencyVersions.kotlinVersion}" }
    val kotlinAllOpen by lazy { "org.jetbrains.kotlin:kotlin-allopen:${DependencyVersions.kotlinVersion}" }
    val hiltGradle by lazy { "com.google.dagger:hilt-android-gradle-plugin:${DependencyVersions.hiltVersion}" }
}

object Dependencies {
    val composeUi by lazy { "androidx.compose.ui:ui:${DependencyVersions.composeVersion}" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling-preview:${DependencyVersions.composeVersion}" }
    val material by lazy { "androidx.compose.material:material:${DependencyVersions.materialVersion}" }
    val material3 by lazy { "androidx.compose.material3:material3:${DependencyVersions.material3Version}" }
    val materialIcons by lazy { "androidx.compose.material:material-icons-extended:${DependencyVersions.materialIconsVersion}" }
    val coreKtx by lazy { "androidx.core:core-ktx:${DependencyVersions.kotlinVersion}" }
    val hilt by lazy { "com.google.dagger:hilt-android:${DependencyVersions.hiltVersion}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${DependencyVersions.hiltVersion}" }
    val composeActivity by lazy { "androidx.activity:activity-compose:${DependencyVersions.composeActivity}" }
    val lifecycleKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${DependencyVersions.lifecycleKtx}" }
    val fonts by lazy { "androidx.compose.ui:ui-text-google-fonts:${DependencyVersions.composeVersion}"}

    val jUnit by lazy { "junit:junit:${DependencyVersions.junitVersion}" }
    val jUnitTest by lazy { "androidx.test.ext:junit:${DependencyVersions.junitTestVersion}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${DependencyVersions.espressoVersion}" }
    val composeTest by lazy { "androidx.compose.ui:ui-test-junit4:${DependencyVersions.composeVersion}" }

    val composeDebug by lazy { "androidx.compose.ui:ui-tooling:${DependencyVersions.composeVersion}" }
    val composeManifest by lazy { "androidx.compose.ui:ui-test-manifest:${DependencyVersions.composeVersion}" }
}