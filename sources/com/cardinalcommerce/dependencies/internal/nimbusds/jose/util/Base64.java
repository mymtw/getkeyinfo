package com.cardinalcommerce.dependencies.internal.nimbusds.jose.util;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import p003a2.C0023f;
import p130h8.C6961b;
import p305z7.C8458a;
import p305z7.C8462e;
import p305z7.C8465g;

public class Base64 implements C8458a, Serializable {

    /* renamed from: a */
    private final String f13724a;

    public Base64(String str) {
        if (str != null) {
            this.f13724a = str;
            return;
        }
        throw new IllegalArgumentException("The Base64 value must not be null");
    }

    /* renamed from: a */
    public byte[] mo17747a() {
        String str = this.f13724a;
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(C6961b.f15443a);
        int length = bytes.length;
        long j = (((long) length) * 6) >> 3;
        int i = (int) j;
        if (((long) i) == j) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            int i3 = 0;
            while (i2 < bytes.length) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < 4 && i2 < length) {
                    int i6 = i2 + 1;
                    byte b = bytes[i2];
                    int y = C15588c1.m25357y(b, 64) & C15588c1.m25327h(b, 91);
                    int y2 = C15588c1.m25357y(b, 96) & C15588c1.m25327h(b, 123);
                    int y3 = C15588c1.m25357y(b, 47) & C15588c1.m25327h(b, 58);
                    int F = C15588c1.m25278F(b, 43) | C15588c1.m25278F(b, 45);
                    int F2 = C15588c1.m25278F(b, 47) | C15588c1.m25278F(b, 95);
                    int i7 = b + ByteSourceJsonBootstrapper.UTF8_BOM_3 + 0;
                    int i8 = (b - 97) + 26;
                    int i9 = (b - 48) + 52;
                    int i10 = (i9 ^ ((i9 ^ 0) & (y3 - 1))) | (((y - 1) & (i7 ^ 0)) ^ i7) | (((y2 - 1) & (i8 ^ 0)) ^ i8) | (((F - 1) & 62) ^ 62) | (((F2 - 1) & 63) ^ 63) | (((((((y | y2) | y3) | F) | F2) - 1) & -1) ^ 0);
                    if (i10 >= 0) {
                        i5 |= i10 << (18 - (i4 * 6));
                        i4++;
                    }
                    i2 = i6;
                }
                if (i4 >= 2) {
                    int i11 = i3 + 1;
                    bArr[i3] = (byte) (i5 >> 16);
                    if (i4 >= 3) {
                        i3 = i11 + 1;
                        bArr[i11] = (byte) (i5 >> 8);
                        if (i4 >= 4) {
                            i11 = i3 + 1;
                            bArr[i3] = (byte) i5;
                        }
                    }
                    i3 = i11;
                }
            }
            return Arrays.copyOf(bArr, i3);
        }
        throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
    }

    /* renamed from: b */
    public BigInteger mo17748b() {
        return new BigInteger(1, mo17747a());
    }

    /* renamed from: c */
    public String mo17749c() {
        return new String(mo17747a(), C6961b.f15443a);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof Base64) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f13724a.hashCode();
    }

    public String toJSONString() {
        String str;
        StringBuilder h = C0072d.m201h("\"");
        String str2 = this.f13724a;
        C8462e eVar = C8465g.f18488a;
        if (str2 == null) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            eVar.f18486d.mo21035a(sb, str2);
            str = sb.toString();
        }
        return C0023f.m110k(h, str, "\"");
    }

    public String toString() {
        return this.f13724a;
    }
}
