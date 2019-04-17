plugins {
    kotlin("jvm") version "1.3.30"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.2")
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.compileTestKotlin {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.test {
    useJUnitPlatform()

    failFast = true
    testLogging.showStandardStreams = true
}
