package com.itera.java17;

public class ToString {

    // Uses simple pattern match on instanceof

    static String toString(String name, Object value) {
        String formattedValue = "";

        if (value == null) {
            formattedValue = "NULL";
        } else if (value instanceof Integer i) {
            formattedValue = i.toString();
        } else if (value instanceof Long l) {
            formattedValue = l.toString() + "L";
        } else if (value instanceof Double d) {
            formattedValue = d.toString() + "D";
        } else if (value instanceof String s) {
            formattedValue = s;
        } else {
            formattedValue = value.toString();
        }

        return String.format("Name: %s, Value: %s", name, formattedValue);
    }

    // Switch expression - requires setting lang level to "17 (Preview)"

    static String toStringWithSwitch(String name, Object value) {
        String formattedValue = switch (value) {
            case null -> "NULL";
            case Integer i -> i.toString();
            case Long l -> l + "L";
            case Double d -> d + "D";
            case String s -> s;
            default -> value.toString();
        };

        return String.format("Name: %s, Value: %s", name, formattedValue);
    }
}
