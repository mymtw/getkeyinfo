package com.google.zxing.oned;

import androidx.preference.C3039b;

/* renamed from: com.google.zxing.oned.a */
public final class C16972a extends C3039b {

    /* renamed from: c */
    public static final char[] f37347c = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: d */
    public static final int[] f37348d = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: u0 */
    public static boolean m28490u0(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}
