
plugins {
    java // <1>
}

repositories {
    mavenCentral() // <2>
}

dependencies {
    constraints {
        implementation("org.apache.commons:commons-text:1.10.0") // <3>
    }

    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3") // <4>

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Test>("test") {
    useJUnitPlatform() // <5>
}
