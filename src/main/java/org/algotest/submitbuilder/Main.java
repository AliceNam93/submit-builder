package org.algotest.submitbuilder;

public class Main {
    public static void main(String[] args) {
        SubmitBuilder builder = SubmitBuilder.generate("boj");
        builder.print(); // 콘솔 출력
        builder.writeToFile("MainTemplate.java"); // 파일 생성
    }
}
