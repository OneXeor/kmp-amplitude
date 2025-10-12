import com.android.build.api.dsl.androidLibrary
import com.android.build.gradle.internal.utils.createPublishingInfoForLibrary
import org.gradle.api.publish.maven.internal.MavenPublishServices

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinCocoapods)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    `maven-publish`
}

version = "1.0.0"
group = "dev.onexeor"

kotlin {
    @Suppress("UnstableApiUsage")
    androidLibrary {
        namespace = "$group.kmpAmplitude"
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
        version = "1.0.0"
        ios.deploymentTarget = "12.0"
        framework {
            baseName = "KMPAmplitude"
        }
        pod("Amplitude", "8.21.0")
    }

    sourceSets {
        androidMain.dependencies {
            implementation(libs.amplitude)
        }
    }
}

publishing {
    publications {
        withType<MavenPublication> {
            groupId = project.group.toString()
            version = project.version.toString()

            pom {
                name.set(project.name)
                description.set("Kotlin Multiplatform wrapper for Amplitude Analytics supporting Android and iOS")
                url.set("https://github.com/OneXeor/kmp-amplitude")

                developers {
                    developer {
                        id.set("OneXeor")
                        name.set("Viktor Savchik")
                        email.set("vi@onexeor.dev")
                    }
                }

                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/OneXeor/kmp-amplitude.git")
                    developerConnection.set("scm:git:ssh://github.com/OneXeor/kmp-amplitude.git")
                    url.set("https://github.com/OneXeor/kmp-amplitude")
                }
            }
        }
    }
    repositories {
        maven {
            name = project.name
            url = uri("https://maven.pkg.github.com/OneXeor/kmp-amplitude")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}