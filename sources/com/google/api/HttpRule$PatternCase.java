package com.google.api;

public enum HttpRule$PatternCase {
    GET(2),
    PUT(3),
    POST(4),
    DELETE(5),
    PATCH(6),
    CUSTOM(8),
    PATTERN_NOT_SET(0);
    
    private final int value;

    private HttpRule$PatternCase(int i) {
        this.value = i;
    }

    public static HttpRule$PatternCase forNumber(int i) {
        if (i == 0) {
            return PATTERN_NOT_SET;
        }
        if (i == 8) {
            return CUSTOM;
        }
        if (i == 2) {
            return GET;
        }
        if (i == 3) {
            return PUT;
        }
        if (i == 4) {
            return POST;
        }
        if (i == 5) {
            return DELETE;
        }
        if (i != 6) {
            return null;
        }
        return PATCH;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static HttpRule$PatternCase valueOf(int i) {
        return forNumber(i);
    }
}
