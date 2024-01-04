import org.jetbrains.kotlin.gradle.plugin.mpp.BitcodeEmbeddingMode

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinCocoapods)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Amplitude for KMP"
        homepage = "https://onexeor.dev/"
        version = "1.0"
        ios.deploymentTarget = "12.0"
        framework {
            baseName = "KMPAmplitude"
            isStatic = true
            transitiveExport = true
            embedBitcode(BitcodeEmbeddingMode.BITCODE)
        }
        pod("Amplitude", "8.17.2")
    }

    sourceSets {
        commonMain.dependencies {
        }
        androidMain.dependencies {
            implementation(libs.amplitude)
        }
    }
}

android {
    namespace = "dev.onexeor.kmpAmplitude"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
    }
}
