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

    // Notes:

    // Cannot be extended
    // Can implement interfaces
    // Values are immutable - and cannot be changed
    // Default constructor/toString/equals/hashcode can be overridden
    // Can have other methods on the object - as long as they do not change the values
    // Cannot have other instance variables
    // Very similar to Lombok @Value - except that you cannot override the finality with @NonFinal
}
