package com.google.common.primitives;

import java.util.Comparator;

enum Booleans$LexicographicalComparator implements Comparator<boolean[]> {
    INSTANCE;

    public String toString() {
        return "Booleans.lexicographicalComparator()";
    }

    public int compare(boolean[] zArr, boolean[] zArr2) {
        int min = Math.min(zArr.length, zArr2.length);
        for (int i = 0; i < min; i++) {
            boolean z = zArr[i];
            int i2 = z == zArr2[i] ? 0 : z ? 1 : -1;
            if (i2 != 0) {
                return i2;
            }
        }
        return zArr.length - zArr2.length;
    }
}
