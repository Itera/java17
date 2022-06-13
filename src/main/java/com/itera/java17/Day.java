package com.itera.java17;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekendOldStyle() {
        boolean response = false;

        switch (this) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                response = false;
                break;
            case SATURDAY:
            case SUNDAY:
                response = true;
        }

        return response;
    }

    boolean isWeekend() {
        return switch (this) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            case SATURDAY, SUNDAY -> true;
        };
    }

    boolean isWeekendUsingDefault() {
        return switch (this) {
            case SATURDAY, SUNDAY -> true;
            default -> false;
        };
    }
}
