plugins {
    java
}

group = "com.github.YourGitHubID" // ← JitPack용 group (예: com.github.hongjyeon)
version = "1.0.0"                  // ← 스냅샷 말고 릴리즈 버전으로 변경

java {
    withJavadocJar()
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    manifest {
        attributes["Implementation-Title"] = "SubmitBuilder"
        attributes["Implementation-Version"] = version
    }
}
