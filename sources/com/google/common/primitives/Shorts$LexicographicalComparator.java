package com.google.common.primitives;

import java.util.Comparator;

enum Shorts$LexicographicalComparator implements Comparator<short[]> {
    INSTANCE;

    public String toString() {
        return "Shorts.lexicographicalComparator()";
    }

    public int compare(short[] sArr, short[] sArr2) {
        int min = Math.min(sArr.length, sArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = sArr[i] - sArr2[i];
            if (i2 != 0) {
                return i2;
            }
        }
        return sArr.length - sArr2.length;
    }
}
