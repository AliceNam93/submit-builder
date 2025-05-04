package example;

import org.algotest.submitbuilder.SubmitBuilder;

public class Main {
    public static void main(String[] args) {
        //백준 전용 템플릿 만들기
        SubmitBuilder.generate("boj").writeToFile("BojTemp.java");

    }
}