package com.itera.java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class InstanceOfPatternMatchingTest {
    Object testString = "testString";

    // How we used to have to use instanceof

    @Test
    void testInstanceOf() {
        if (testString instanceof String) {
            String testObjectString = (String) testString;

            assertEquals("testString", testObjectString);
        } else {
            fail("Not instance of String");
        }
    }

    // instanceof with the simplest pattern match

    @Test
    void testInstanceOfPatternMatch() {
        if (testString instanceof String testObjectString) {
            assertEquals("testString", testObjectString);
        } else {
            fail("Not instance of String");
        }
    }

    @Test
    void testInstanceOfInEquals() {
        IntPair intPair = new IntPair(1, 2);

        assertEquals(new IntPair(1, 2), intPair);
    }
}
