import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.30"
    `maven-publish`
}

group = "il.ac.technion.cs.softwaredesign"
version = "1.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("com.google.inject", "guice", "4.2.3")
    implementation("dev.misfitlabs.kotlinguice4", "kotlin-guice", "1.4.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "il.ac.technion.cs.softwaredesign"
            artifactId = "sd-loan-service"
            version = "1.0.1"
            from(components["java"])
        }
    }
}
