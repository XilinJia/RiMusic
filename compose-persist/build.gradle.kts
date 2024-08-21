import org.gradle.kotlin.dsl.add
import org.gradle.kotlin.dsl.invoke
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import kotlin.text.set

plugins {
    id("com.android.library")
//    kotlin("android")
    alias(libs.plugins.kotlin)
//    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.compose.compiler)
//    kotlin("jvm") version "2.0.10"
}


/*
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin)
    //alias(libs.plugins.kotlin.compose)
}
 */

android {
    namespace = "it.fast4x.compose.persist"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        //targetSdk = 34
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    sourceSets.all {
        kotlin.srcDir("src/$name/kotlin")
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

//    composeOptions {
//        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
//    }

//    kotlinOptions {
//        jvmTarget = "17"
//    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
}

dependencies {
    implementation(libs.compose.foundation)
}
