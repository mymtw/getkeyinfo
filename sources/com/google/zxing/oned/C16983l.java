package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p683tn.C18567f;
import p699vn.C18667b;

/* renamed from: com.google.zxing.oned.l */
public abstract class C16983l implements C18567f {
    /* renamed from: a */
    public static int m28506a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: b */
    public abstract boolean[] mo60130b(String str);

    /* renamed from: c */
    public int mo60131c() {
        return 10;
    }

    /* renamed from: f */
    public C18667b mo4160f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (!str.isEmpty()) {
            int c = mo60131c();
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (enumMap.containsKey(encodeHintType)) {
                c = Integer.parseInt(enumMap.get(encodeHintType).toString());
            }
            boolean[] b = mo60130b(str);
            int length = b.length;
            int i = c + length;
            int max = Math.max(200, i);
            int max2 = Math.max(1, 200);
            int i2 = max / i;
            int i3 = (max - (length * i2)) / 2;
            C18667b bVar = new C18667b(max, max2);
            int i4 = 0;
            while (i4 < length) {
                if (b[i4]) {
                    bVar.mo70176c(i3, 0, i2, max2);
                }
                i4++;
                i3 += i2;
            }
            return bVar;
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
