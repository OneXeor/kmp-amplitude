import com.android.build.api.dsl.androidLibrary

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinCocoapods)
    alias(libs.plugins.android.kotlin.multiplatform.library)
}

kotlin {
    androidLibrary {
        namespace = "dev.onexeor.kmpAmplitude"
        compileSdk = 36
        minSdk = 21
    }
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    )
    cocoapods {
        summary = "Amplitude for KMP"
        homepage = "https://onexeor.dev/"
        authors = "Viktor Savchik"
        version = "1.0"
        ios.deploymentTarget = "12.0"
        framework {
            baseName = "KMPAmplitude"
        }
        pod("Amplitude") {
            version = "8.21.0"
            extraOpts += listOf("-compiler-option", "-fmodules-prune-after=345600")
        }
    }

    sourceSets {
        commonMain.dependencies {

        }
        androidMain.dependencies {
            implementation(libs.amplitude)
        }
    }
}
