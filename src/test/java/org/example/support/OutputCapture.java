package org.example.support;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/** Test helper that captures console output and always restores System.out. */
public final class OutputCapture {
    private OutputCapture() {
    }

    public static String capture(Runnable action) {
        PrintStream original = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (PrintStream captured = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            System.setOut(captured);
            action.run();
        } finally {
            System.setOut(original);
        }
        return buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n");
    }
}
