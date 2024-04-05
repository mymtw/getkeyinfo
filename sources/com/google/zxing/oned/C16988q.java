package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p003a2.C0015b;
import p699vn.C18667b;

/* renamed from: com.google.zxing.oned.q */
public final class C16988q extends C16986o {
    /* renamed from: b */
    public final boolean[] mo60130b(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = C0015b.m88g(str, C16985n.m28512v0(C16987p.m28514w0(str)));
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
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = C16987p.f37366h[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int a = C16983l.m28506a(zArr, 0, C16985n.f37361c, true) + 0;
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                a += C16983l.m28506a(zArr, a, C16985n.f37365g[digit2], false);
            }
            C16983l.m28506a(zArr, a, C16985n.f37363e, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }

    /* renamed from: f */
    public final C18667b mo4160f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.mo4160f(str, barcodeFormat, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
