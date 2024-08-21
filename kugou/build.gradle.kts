plugins {
    kotlin("jvm")
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.kotlin.serialization)
//    kotlin("jvm") version "2.0.10"
}

sourceSets.all {
    java.srcDir("src/$name/kotlin")
}

dependencies {
    implementation(libs.kotlin.coroutines)

    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.client.encoding)
    implementation(libs.ktor.client.serialization)
    implementation(libs.ktor.serialization.json)

    //testImplementation(libs.junit)
    implementation(kotlin("stdlib"))
}
//repositories {
//    mavenCentral()
//}