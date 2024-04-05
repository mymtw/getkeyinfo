package com.google.type;

public enum DateTime$TimeOffsetCase {
    UTC_OFFSET(8),
    TIME_ZONE(9),
    TIMEOFFSET_NOT_SET(0);
    
    private final int value;

    private DateTime$TimeOffsetCase(int i) {
        this.value = i;
    }

    public static DateTime$TimeOffsetCase forNumber(int i) {
        if (i == 0) {
            return TIMEOFFSET_NOT_SET;
        }
        if (i == 8) {
            return UTC_OFFSET;
        }
        if (i != 9) {
            return null;
        }
        return TIME_ZONE;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DateTime$TimeOffsetCase valueOf(int i) {
        return forNumber(i);
    }
}
