
# SubmitBuilder 🚀

코딩 테스트 플랫폼용 자바 제출 템플릿 생성기입니다.  
BOJ(백준), Softeer 등의 플랫폼은 제출 양식을 지켜야 통과되는데, IDE에서 푼 사람들은 매번 복붙하기 귀찮죠?  
SubmitBuilder는 버튼 하나로 제출용 코드를 생성해줍니다!

[![](https://jitpack.io/v/AliceNam93/submit-builder.svg)](https://jitpack.io/#AliceNam93/submit-builder)

## ✨ 기능
- 플랫폼에 맞는 Java 템플릿 생성 (2025-4-14기준 백준만 지원)
- 콘솔 출력 또는 템플릿 파일 생성
- 귀엽고 유쾌한 이모지 피드백 🤭

## 🛠 설치 방법

### Gradle
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.AliceNam93:submit-builder:v1.0.2")
}
