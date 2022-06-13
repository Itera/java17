package com.itera.java17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchExpressionTest {
    @Test
    void testSwitchExpression() {
        assertEquals(true, Day.SATURDAY.isWeekendOldStyle());
        assertEquals(true, Day.SATURDAY.isWeekend());
        assertEquals(true, Day.SATURDAY.isWeekendUsingDefault());

        assertEquals(false, Day.THURSDAY.isWeekendOldStyle());
        assertEquals(false, Day.THURSDAY.isWeekend());
        assertEquals(false, Day.THURSDAY.isWeekendUsingDefault());
    }


    @ParameterizedTest
    @MethodSource("valuesForTest")
    void testInstanceOfFormatter(String name, Object value, String expectedResult) {
        assertEquals(expectedResult, ToString.toString(name, value));
    }

    @ParameterizedTest
    @MethodSource("valuesForTest")
    void testSwitchFormatter(String name, Object value, String expectedResult) {
        assertEquals(expectedResult, ToString.toStringWithSwitch(name, value));
    }

    static Stream<Arguments> valuesForTest() {
        return Stream.of(
                Arguments.of("NullTest", null, "Name: NullTest, Value: NULL"),
                Arguments.of("IntTest", 3, "Name: IntTest, Value: 3"),
                Arguments.of("LongTest", 3L, "Name: LongTest, Value: 3L"),
                Arguments.of("DoubleTest", 3.1, "Name: DoubleTest, Value: 3.1D"),
                Arguments.of("StringTest", "TestString", "Name: StringTest, Value: TestString"),
                Arguments.of("ListTest", List.of("1", "2"), "Name: ListTest, Value: [1, 2]")
        );
    }
}
