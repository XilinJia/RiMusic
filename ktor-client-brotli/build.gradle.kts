plugins {
//    alias(libs.plugins.kotlin)
    kotlin("jvm")
//    kotlin("jvm") version "2.0.10"
}

sourceSets.all {
    java.srcDir("src/$name/kotlin")
}

dependencies {
    implementation(libs.ktor.client.encoding)
    implementation(libs.brotli)
    implementation(kotlin("stdlib"))
}
//repositories {
//    mavenCentral()
//}