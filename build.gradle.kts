plugins {
    id("java")
}

group = "com.javierlorenzo.shoppingcart"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation(platform("org.assertj:assertj-bom:3.26.3"))
    testImplementation("org.assertj:assertj-core")
}

tasks.test {
    useJUnitPlatform()
}