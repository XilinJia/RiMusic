plugins {
    kotlin("jvm")
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.kotlin.serialization)
//    kotlin("jvm") version "2.0.10"
}


sourceSets.all {
    java.srcDir("src/$name/kotlin")
}

/*
dependencies {
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.serialization.json)
    implementation(libs.ktor.client.encoding)
    implementation(libs.brotli)
    //testImplementation(libs.junit)
}
 */
dependencies {
    implementation(kotlin("stdlib"))
}
//repositories {
//    mavenCentral()
//}