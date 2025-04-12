package org.algoTest;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SubmitBuilderTest {

    @Test
    void testBasicGeneration() {
        String generated = SubmitBuilder.generate("boj").toString();
        assertTrue(generated.contains("public class Main"), "출력에 Main 클래스가 포함되어야 함");
    }

    @Test
    void testWriteToFile() throws Exception {
        String code = SubmitBuilder.generate("boj");
        String fileName = "TestMain.java";

        SubmitBuilder.writeToFile(code, fileName);

        Path path = Path.of(fileName);
        assertTrue(Files.exists(path), "파일이 실제로 생성되어야 함");
        String content = Files.readString(path);
        assertTrue(content.contains("public class Main"));

        // 깔끔하게 테스트 후 삭제
        Files.deleteIfExists(path);
    }
}
