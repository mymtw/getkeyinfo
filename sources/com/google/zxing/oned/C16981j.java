package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p003a2.C0015b;
import p699vn.C18667b;

/* renamed from: com.google.zxing.oned.j */
public final class C16981j extends C16986o {
    /* renamed from: b */
    public final boolean[] mo60130b(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = C0015b.m88g(str, C16985n.m28512v0(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C16985n.m28511u0(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int a = C16983l.m28506a(zArr, 0, C16985n.f37361c, true) + 0;
        for (int i = 0; i <= 3; i++) {
            a += C16983l.m28506a(zArr, a, C16985n.f37364f[Character.digit(str.charAt(i), 10)], false);
        }
        int a2 = C16983l.m28506a(zArr, a, C16985n.f37362d, false) + a;
        for (int i2 = 4; i2 <= 7; i2++) {
            a2 += C16983l.m28506a(zArr, a2, C16985n.f37364f[Character.digit(str.charAt(i2), 10)], true);
        }
        C16983l.m28506a(zArr, a2, C16985n.f37361c, true);
        return zArr;
    }

    /* renamed from: f */
    public final C18667b mo4160f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.mo4160f(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
