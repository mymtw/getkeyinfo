package com.google.zxing.oned;

import androidx.preference.C3039b;
import com.google.zxing.FormatException;

/* renamed from: com.google.zxing.oned.n */
public abstract class C16985n extends C3039b {

    /* renamed from: c */
    public static final int[] f37361c = {1, 1, 1};

    /* renamed from: d */
    public static final int[] f37362d = {1, 1, 1, 1, 1};

    /* renamed from: e */
    public static final int[] f37363e = {1, 1, 1, 1, 1, 1};

    /* renamed from: f */
    public static final int[][] f37364f;

    /* renamed from: g */
    public static final int[][] f37365g;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f37364f = iArr;
        int[][] iArr2 = new int[20][];
        f37365g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f37364f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f37365g[i] = iArr4;
        }
    }

    /* renamed from: u0 */
    public static boolean m28511u0(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m28512v0(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* renamed from: v0 */
    public static int m28512v0(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }
}
