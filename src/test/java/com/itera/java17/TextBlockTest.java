package com.itera.java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBlockTest {

    @Test
    void testText() {
        String testString = "123" + "\n" + "456" + "\n";

        assertEquals("123\n456\n", testString);
    }

    // Text blocks are multiline strings

    @Test
    void testTextBlock() {
        String testString = """
123
456
                """;

        assertEquals("123\n456\n", testString);
    }

    // Shared leading indent is ignored

    @Test
    void testTextBlockLeadingSpace() {
        String testString = """
                123
                456
                """;

        assertEquals("123\n456\n", testString);
    }

    // Using text block to hold e.g. test json data

    @Test
    void testTextBlockJsonExample() {
        String testString = """
                {
                    "field1": 123,
                    "field2": 456
                }
                """;

        assertEquals("{\n    \"field1\": 123,\n    \"field2\": 456\n}\n", testString);
    }
}
