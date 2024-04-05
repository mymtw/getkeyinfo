package com.cardinalcommerce.dependencies.internal.nimbusds.jose.util;

import com.google.android.play.core.assetpacks.C15588c1;
import p130h8.C6961b;

public class Base64URL extends Base64 {
    public Base64URL(String str) {
        super(str);
    }

    /* renamed from: a */
    public static Base64URL m12548a(String str) {
        if (str == null) {
            return null;
        }
        return new Base64URL(str);
    }

    /* renamed from: a */
    public static Base64URL m12549a(byte[] bArr) {
        String str;
        int i;
        int i2 = 0;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            str = "";
        } else {
            int i3 = length / 3;
            int i4 = i3 * 3;
            if (length == 0) {
                i = 0;
            } else {
                i = i3 << 2;
                int i5 = length % 3;
                if (i5 != 0) {
                    i = i + i5 + 1;
                }
            }
            byte[] bArr2 = new byte[i];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                int i8 = i6 + 1;
                int i9 = i8 + 1;
                byte b = ((bArr[i6] & 255) << 16) | ((bArr[i8] & 255) << 8);
                int i10 = i9 + 1;
                byte b2 = b | (bArr[i9] & 255);
                int i11 = i7 + 1;
                bArr2[i7] = C15588c1.m25355x((b2 >>> 18) & 63);
                int i12 = i11 + 1;
                bArr2[i11] = C15588c1.m25355x((b2 >>> 12) & 63);
                int i13 = i12 + 1;
                bArr2[i12] = C15588c1.m25355x((b2 >>> 6) & 63);
                i7 = i13 + 1;
                bArr2[i13] = C15588c1.m25355x(b2 & 63);
                i6 = i10;
            }
            int i14 = length - i4;
            if (i14 > 0) {
                int i15 = (bArr[i4] & 255) << 10;
                if (i14 == 2) {
                    i2 = (bArr[length - 1] & 255) << 2;
                }
                int i16 = i15 | i2;
                if (i14 == 2) {
                    bArr2[i - 3] = C15588c1.m25355x(i16 >> 12);
                    bArr2[i - 2] = C15588c1.m25355x((i16 >>> 6) & 63);
                    bArr2[i - 1] = C15588c1.m25355x(i16 & 63);
                } else {
                    bArr2[i - 2] = C15588c1.m25355x(i16 >> 12);
                    bArr2[i - 1] = C15588c1.m25355x((i16 >>> 6) & 63);
                }
            }
            str = new String(bArr2, C6961b.f15443a);
        }
        return new Base64URL(str);
    }

    /* renamed from: b */
    public static Base64URL m12550b(String str) {
        return m12549a(str.getBytes(C6961b.f15443a));
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof Base64URL) && toString().equals(obj.toString());
    }
}
