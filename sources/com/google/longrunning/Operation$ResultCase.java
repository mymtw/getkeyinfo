package com.google.longrunning;

public enum Operation$ResultCase {
    ERROR(4),
    RESPONSE(5),
    RESULT_NOT_SET(0);
    
    private final int value;

    private Operation$ResultCase(int i) {
        this.value = i;
    }

    public static Operation$ResultCase forNumber(int i) {
        if (i == 0) {
            return RESULT_NOT_SET;
        }
        if (i == 4) {
            return ERROR;
        }
        if (i != 5) {
            return null;
        }
        return RESPONSE;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static Operation$ResultCase valueOf(int i) {
        return forNumber(i);
    }
}
