package com.google.api;

public enum JwtLocation$InCase {
    HEADER(1),
    QUERY(2),
    IN_NOT_SET(0);
    
    private final int value;

    private JwtLocation$InCase(int i) {
        this.value = i;
    }

    public static JwtLocation$InCase forNumber(int i) {
        if (i == 0) {
            return IN_NOT_SET;
        }
        if (i == 1) {
            return HEADER;
        }
        if (i != 2) {
            return null;
        }
        return QUERY;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static JwtLocation$InCase valueOf(int i) {
        return forNumber(i);
    }
}
