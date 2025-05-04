plugins {
    application
    java
}

java {
    withJavadocJar()
    withSourcesJar()
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))//자바 21버전만 지원
    }

}

repositories {
    //공공저장소
    mavenCentral()
    //GitHub 저장소
    maven("https://jitpack.io")
}

dependencies {
    //SubmitBuilder 라이브러리 소환
//    implementation("com.github.AliceNam93:submit-builder:v1.0.2")
    implementation(project(":"))  // 루트 프로젝트 (submit-builder) 사용
}

application {
    mainClass.set("example.Main")  // 예시 Main 클래스 경로
}
