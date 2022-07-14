import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.springframework.boot") version "2.4.4" apply false

    kotlin("jvm") version "1.6.21" apply false
    kotlin("plugin.jpa") version "1.4.32" apply false
    kotlin("plugin.spring") version "1.4.32" apply false
}

allprojects {
    group = "com.gamebooks"
    version = "1.0-SNAPSHOT"

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }

    subprojects {
        repositories {
            mavenCentral()
        }

        apply {
            plugin("io.spring.dependency-management")
        }
    }

//    dependencies {
//        implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//        implementation("org.springframework.boot:spring-boot-starter-mustache")
//        implementation("org.springframework.boot:spring-boot-starter-web")
//        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//        implementation("org.jetbrains.kotlin:kotlin-reflect")
//        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//        runtimeOnly("com.h2database:h2")
//        runtimeOnly("org.springframework.boot:spring-boot-devtools")
//
//        testImplementation(kotlin("test"))
//        testImplementation("org.springframework.boot:spring-boot-starter-test")
//    }
}

//application {
//    mainClass.set("MainKt")
//}

//tasks.test {
//    useJUnitPlatform()
//}