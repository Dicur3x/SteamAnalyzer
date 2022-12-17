plugins {
    id("java")
}

group = "org.steam.analyzer"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

val jacksonVersion = "2.13.4.1"
val reactorNettyVersion = "1.0.23"
val lombokVersion = "1.18.24"
val springVersion = "2.7.6"

dependencies {

    compileOnly("org.projectlombok:lombok:$lombokVersion")

    implementation("org.springframework.boot:spring-boot-starter:$springVersion")
    implementation("org.springframework.boot:spring-boot-starter-web:$springVersion")
    implementation("org.springframework.boot:spring-boot-starter-webflux:$springVersion")

    implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")

    implementation("org.springdoc:springdoc-openapi-ui:1.6.13")

    testImplementation("org.assertj:assertj-core:3.23.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}