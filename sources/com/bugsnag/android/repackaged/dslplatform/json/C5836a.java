package com.bugsnag.android.repackaged.dslplatform.json;

import com.fasterxml.jackson.core.Base64Variants;
import java.util.Arrays;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.a */
public abstract class C5836a {

    /* renamed from: a */
    public static final char[] f12496a;

    /* renamed from: b */
    public static final byte[] f12497b = new byte[f12496a.length];

    /* renamed from: c */
    public static final int[] f12498c;

    /* renamed from: d */
    public static final byte[] f12499d = new byte[0];

    static {
        char[] charArray = Base64Variants.STD_BASE64_ALPHABET.toCharArray();
        f12496a = charArray;
        int[] iArr = new int[256];
        f12498c = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            f12498c[f12496a[i]] = i;
        }
        f12498c[61] = 0;
        int i2 = 0;
        while (true) {
            char[] cArr = f12496a;
            if (i2 < cArr.length) {
                f12497b[i2] = (byte) cArr[i2];
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m11627a(int i, int i2, byte[] bArr) {
        int i3;
        int i4 = i2 - i;
        if (i4 == 0) {
            return f12499d;
        }
        int i5 = i2 - 1;
        while (i < i5 && f12498c[bArr[i] & 255] < 0) {
            i++;
        }
        while (i5 > 0 && f12498c[bArr[i5] & 255] < 0) {
            i5--;
        }
        int i6 = 0;
        int i7 = bArr[i5] == 61 ? bArr[i5 + -1] == 61 ? 2 : 1 : 0;
        int i8 = (i5 - i) + 1;
        if (i4 > 76) {
            i3 = (bArr[76] == 13 ? i8 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i9 = (((i8 - i3) * 6) >> 3) - i7;
        byte[] bArr2 = new byte[i9];
        int i10 = (i9 / 3) * 3;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int[] iArr = f12498c;
            int i13 = i + 1;
            int i14 = i13 + 1;
            int i15 = (iArr[bArr[i]] << 18) | (iArr[bArr[i13]] << 12);
            int i16 = i14 + 1;
            int i17 = i15 | (iArr[bArr[i14]] << 6);
            int i18 = i16 + 1;
            int i19 = i17 | iArr[bArr[i16]];
            int i20 = i11 + 1;
            bArr2[i11] = (byte) (i19 >> 16);
            int i21 = i20 + 1;
            bArr2[i20] = (byte) (i19 >> 8);
            int i22 = i21 + 1;
            bArr2[i21] = (byte) i19;
            if (i3 > 0 && (i12 = i12 + 1) == 19) {
                i18 += 2;
                i12 = 0;
            }
            i = i18;
            i11 = i22;
        }
        if (i11 < i9) {
            int i23 = 0;
            while (i <= i5 - i7) {
                i6 |= f12498c[bArr[i]] << (18 - (i23 * 6));
                i23++;
                i++;
            }
            int i24 = 16;
            while (i11 < i9) {
                bArr2[i11] = (byte) (i6 >> i24);
                i24 -= 8;
                i11++;
            }
        }
        return bArr2;
    }
}
