package org.algotest.submitbuilder;

import java.io.FileWriter;
import java.io.IOException;

public class SubmitBuilder {
    private final String platform;

    private SubmitBuilder(String platform) {
        this.platform = platform.toLowerCase();
    }

    public static SubmitBuilder generate(String platform) {
        return new SubmitBuilder(platform);
    }

    public void print() {
        System.out.println(getTemplate());
    }

    public void writeToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(getTemplate());
            System.out.println("✅ File written: " + fileName);
        } catch (IOException e) {
            System.err.println("❌ Failed to write file: " + e.getMessage());
        }
    }

    private String getTemplate() {
        switch (platform) {
            case "boj", "baekjoon", "백준":
                return getBojTemplate();
            default:
                return "// 어머나!! 아직 지원하지 않는 플랫폼입니다 🫡: " + platform;
        }
    }

    private String getBojTemplate() {
        return """
            // 백준 기본 템플릿입니다 🫡

            import java.io.*;
            import java.util.*;

            public class Main {
                public static void main(String[] args) throws IOException {
                    FastReader sc = new FastReader();
                    int n = sc.nextInt();
                    // your code here
                }

                static class FastReader {
                    BufferedReader br;
                    StringTokenizer st;

                    public FastReader() {
                        br = new BufferedReader(new InputStreamReader(System.in));
                    }

                    String next() {
                        while (st == null || !st.hasMoreTokens()) {
                            try {
                                st = new StringTokenizer(br.readLine());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        return st.nextToken();
                    }

                    int nextInt() {
                        return Integer.parseInt(next());
                    }

                    // Add more methods like nextLong(), nextDouble() as needed
                }
            }
            """;
    }
}
