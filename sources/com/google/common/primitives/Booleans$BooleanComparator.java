package com.google.common.primitives;

import java.util.Comparator;

enum Booleans$BooleanComparator implements Comparator<Boolean> {
    TRUE_FIRST(1, "Booleans.trueFirst()"),
    FALSE_FIRST(-1, "Booleans.falseFirst()");
    
    private final String toString;
    private final int trueValue;

    private Booleans$BooleanComparator(int i, String str) {
        this.trueValue = i;
        this.toString = str;
    }

    public String toString() {
        return this.toString;
    }

    public int compare(Boolean bool, Boolean bool2) {
        int i = 0;
        int i2 = bool.booleanValue() ? this.trueValue : 0;
        if (bool2.booleanValue()) {
            i = this.trueValue;
        }
        return i - i2;
    }
}
