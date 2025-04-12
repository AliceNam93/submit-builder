package org.algotest.submitbuilder;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SubmitBuilderTest {

    @Test
    void testBasicGeneration() {
        SubmitBuilder builder = SubmitBuilder.generate("boj");
        assertNotNull(builder);
    }

    @Test
    void testWriteToFile() throws Exception {
        SubmitBuilder builder = SubmitBuilder.generate("boj");
        String fileName = "TestMain.java";

        builder.writeToFile(fileName);

        Path path = Path.of(fileName);
        assertTrue(Files.exists(path), "파일이 실제로 생성되어야 함");
        String content = Files.readString(path);
        assertTrue(content.contains("public class Main"));

        // 테스트 끝나고 정리
        Files.deleteIfExists(path);
    }
}
