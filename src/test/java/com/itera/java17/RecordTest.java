package com.itera.java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {
    // Define a new record

    record TestRecord(String name, int value){};

    @Test
    void testSimpleRecord() {
        // Create instance of new record
        TestRecord testRecord = new TestRecord("Test", 1);

        // Can test values
        assertEquals("Test", testRecord.name);
        assertEquals(1, testRecord.value);

        // Provides a sensible default equals/hashcode - based only on values
        assertEquals(new TestRecord("Test", 1), testRecord);

        // Provides a sensible default toString
        assertEquals("TestRecord[name=Test, value=1]", testRecord.toString());
    }
}
