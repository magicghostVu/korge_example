import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import korlibs.korge.gradle.*

plugins {
    alias(libs.plugins.korge)
}

group = "org.example"
version = "1.0-SNAPSHOT"

korge {
    this.jvmMainClassName= "pack.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(kotlin("test"))
    //add("commonMainApi", project(":deps"))

    // add log4j?
}

/*tasks.test {
    useJUnitPlatform()
}*/

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}