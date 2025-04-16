plugins {
    java
}

group = "com.github.AliceNam93"
version = "1.0.2"

java {
    withJavadocJar()
    withSourcesJar()
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()  // 일반적인 라이브러리
    maven("https://jitpack.io")  // GitHub 프로젝트용
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("com.github.AliceNam93:submit-builder:v1.0.2")
}

tasks.test {
    useJUnitPlatform()
}

//한글깨짐 방지
tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
}

tasks.withType<Jar> {
    manifest {
        attributes["Implementation-Title"] = "SubmitBuilder"
        attributes["Implementation-Version"] = version
    }
}
