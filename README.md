
# SubmitBuilder 🚀

코딩 테스트 플랫폼용 자바 제출 템플릿 생성기입니다.  
BOJ(백준), Softeer 등의 플랫폼은 제출 양식을 지켜야 통과되는데, IDE에서 푼 사람들은 매번 복붙하기 귀찮죠?  
SubmitBuilder는 버튼 하나로 제출용 코드를 생성해줍니다!

[![](https://jitpack.io/v/AliceNam93/submit-builder.svg)](https://jitpack.io/#AliceNam93/submit-builder)

## ✨ 기능
- 플랫폼에 맞는 Java 템플릿 생성 (백준만 지원)
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
```
### Main.java
```aiignore
import org.algotest.submitbuilder.SubmitBuilder;

public class Main {
    public static void main(String[] args) {
        //백준 전용 템플릿 만들기
        SubmitBuilder.generate("boj").writeToFile("BojTemp.java");
    }
}
```
## 🎥 시연 영상
### - Gradle 설정하기
![Image](https://github.com/user-attachments/assets/18dc80d6-6064-4f79-bf88-ae0dea46cf94)
### - Main에서 템플릿 파일 생성하기
![Image](https://github.com/user-attachments/assets/9d91e979-ed8e-4a18-9d70-0eaa8d8e7edd)




## License

This project is licensed under the [MIT License](./LICENSE).

## Disclaimer...
- 현재는 자바21만 지원합니다
- 현재는 백준 기준으로밖에..ㅠㅠ
