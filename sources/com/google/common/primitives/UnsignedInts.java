package com.google.common.primitives;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.util.Comparator;

public final class UnsignedInts {

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                if (i2 != i3) {
                    int i4 = i2 ^ Integer.MIN_VALUE;
                    int i5 = Integer.MIN_VALUE ^ i3;
                    if (i4 < i5) {
                        return -1;
                    }
                    if (i4 > i5) {
                        return 1;
                    }
                    return 0;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    /* renamed from: a */
    public static long m26389a(int i) {
        return ((long) i) & UnsignedInteger.INT_MASK;
    }
}
