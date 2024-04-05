package com.google.zxing.oned;

import android.support.p013v4.media.C0072d;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p699vn.C18667b;

/* renamed from: com.google.zxing.oned.g */
public final class C16978g extends C16983l {
    /* renamed from: d */
    public static void m28495d(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    /* renamed from: e */
    public static int m28496e(int i, String str) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: g */
    public static void m28497g(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: b */
    public final boolean[] mo60130b(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            m28497g(C16977f.f37355c[47], iArr);
            boolean[] zArr = new boolean[(((str.length() + 2 + 2) * 9) + 1)];
            m28495d(zArr, 0, iArr);
            int i = 9;
            for (int i2 = 0; i2 < length; i2++) {
                m28497g(C16977f.f37355c["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i2))], iArr);
                m28495d(zArr, i, iArr);
                i += 9;
            }
            int e = m28496e(20, str);
            int[] iArr2 = C16977f.f37355c;
            m28497g(iArr2[e], iArr);
            m28495d(zArr, i, iArr);
            int i3 = i + 9;
            StringBuilder h = C0072d.m201h(str);
            h.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(e));
            m28497g(iArr2[m28496e(15, h.toString())], iArr);
            m28495d(zArr, i3, iArr);
            int i4 = i3 + 9;
            m28497g(iArr2[47], iArr);
            m28495d(zArr, i4, iArr);
            zArr[i4 + 9] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    /* renamed from: f */
    public final C18667b mo4160f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.mo4160f(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
