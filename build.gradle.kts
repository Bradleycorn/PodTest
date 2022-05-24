import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.Platform
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    kotlin("multiplatform") version "1.6.10"
    kotlin("native.cocoapods") version "1.6.21"
    id("com.android.library")
    id("kotlin-android-extensions")
//    id("com.chromaticnoise.multiplatform-swiftpackage") version "2.0.3"
    id("jacoco")
    id("org.jetbrains.dokka") version "1.4.32"
}

group = "com.twinspires.wagerutils"
version = "1.1.6"

repositories {
    google()
    jcenter()
    mavenCentral()
}

jacoco {
    toolVersion = "0.8.7"
    reportsDir = file("$buildDir/coverage")
}

kotlin {

    jvm()
    android()
//    ios("ios") {
//        binaries {
//            framework {
//                baseName = "CdiWagerUtils"
//            }
//        }
//    }

    //iOS
    val xcFframework = XCFramework()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "CdiWagerUtils"
            xcFframework.add(this)
        }
    }

    cocoapods {
        // Required properties
        // Specify the required Pod version here. Otherwise, the Gradle project version is used.
        // version = "1.0"
        summary = "Wager Calulations for Twinspires"
        homepage = "https://github.com/twinspires/wager-utils"

        // Optional properties
        // Configure the Pod name here instead of changing the Gradle project name
        name = "CdiWagerUtils"

        framework {
            // Required properties
            // Framework name configuration. Use this property instead of deprecated 'frameworkName'
            baseName = "CdiWagerUtils"

            // Optional properties
            // Dynamic framework support
            isStatic = true
            // Dependency export
            //export(project(":anotherKMMModule"))
            //transitiveExport = false // This is default.
            // Bitcode embedding
            embedBitcode(org.jetbrains.kotlin.gradle.plugin.mpp.BitcodeEmbeddingMode.BITCODE)
        }

        // Maps custom Xcode configuration to NativeBuildType
        xcodeConfigurationToNativeBuildType["CUSTOM_DEBUG"] = org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.DEBUG
        xcodeConfigurationToNativeBuildType["CUSTOM_RELEASE"] = org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE
    }



    js(IR) {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = false
            }
        }
        binaries.executable()
    }


    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.core:core-ktx:1.3.2")
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }

//        val iosMain by getting
//        val iosTest by getting {
//            dependencies {
//                implementation(kotlin("test-junit"))
//                implementation("junit:junit:4.13.2")
//            }
//        }

        val jvmMain by getting
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }

        val jsMain by getting
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

    }
}

android {
    compileSdkVersion(30)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(23)
        targetSdkVersion(30)
    }
}

//multiplatformSwiftPackage {
//    swiftToolsVersion("5.3")
//    targetPlatforms {
//        iOS { v("12") }
//    }
//    distributionMode { local() }
//    outputDirectory(File("$buildDir/outputs", "framework"))
//}

tasks.register<JacocoReport>("jacocoTestReport") {
    dependsOn("jvmTest")
    group = "Reporting"
    description = "Generates JaCoCo coverage reports for all variants."

    reports.apply {
        csv.isEnabled = false
        xml.isEnabled = false
        html.isEnabled = true
        html.destination = file("$buildDir/coverage")
    }

    classDirectories.setFrom(fileTree("$buildDir/classes/kotlin/jvm").matching {
        exclude("**/*Test*.*", "**/*WagerData*", "**/*Logger*.class")
    })


    sourceDirectories.setFrom(files("src/commonMain/kotlin"))
    executionData.setFrom(files("$buildDir/jacoco/jvmTest.exec"))
}

tasks.register<Exec>("openCoverageReport") {
    executable = "open"
    setArgs(listOf("${buildDir}/coverage/jacocoTestReport/html/index.html"))
}
