package com.paypal.android.platform.authsdk.authcommon.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import org.apache.commons.codec.binary.BaseNCodec;

public final class Base64 {
    public static final Base64 INSTANCE = new Base64();
    private static final byte[] table;

    static {
        byte[] bytes = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        table = bytes;
    }

    private Base64() {
    }

    public final String encode(String str) {
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            C19383o.m32796f(decode, "{\n            URLDecoder…ncode, \"UTF-8\")\n        }");
            byte[] bytes = decode.getBytes(C19446a.f43373b);
            C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            byte[] bArr = new byte[(((length + 2) / 3) * 4)];
            int i = 0;
            while (i < length) {
                int i2 = i + 3;
                int i3 = 0;
                int i4 = i;
                while (i4 < i2) {
                    int i5 = i4 + 1;
                    i3 <<= 8;
                    if (i4 < length) {
                        i3 |= bytes[i4] & 255;
                    }
                    i4 = i5;
                }
                int i6 = (i / 3) * 4;
                byte[] bArr2 = table;
                bArr[i6 + 0] = bArr2[(i3 >> 18) & 63];
                bArr[i6 + 1] = bArr2[(i3 >> 12) & 63];
                int i7 = i6 + 2;
                int i8 = i + 1;
                byte b = BaseNCodec.PAD_DEFAULT;
                bArr[i7] = i8 < length ? bArr2[(i3 >> 6) & 63] : 61;
                int i9 = i6 + 3;
                if (i + 2 < length) {
                    b = bArr2[(i3 >> 0) & 63];
                }
                bArr[i9] = b;
                i = i2;
            }
            return new String(bArr, C19446a.f43373b);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public final String encode(byte[] bArr) {
        C19383o.m32797g(bArr, "toEncode");
        int length = bArr.length;
        byte[] bArr2 = new byte[(((length + 2) / 3) * 4)];
        int i = 0;
        while (i < length) {
            int i2 = i + 3;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                int i5 = i4 + 1;
                i3 <<= 8;
                if (i4 < length) {
                    i3 |= bArr[i4] & 255;
                }
                i4 = i5;
            }
            int i6 = (i / 3) * 4;
            byte[] bArr3 = table;
            bArr2[i6 + 0] = bArr3[(i3 >> 18) & 63];
            bArr2[i6 + 1] = bArr3[(i3 >> 12) & 63];
            int i7 = i6 + 2;
            int i8 = i + 1;
            byte b = BaseNCodec.PAD_DEFAULT;
            bArr2[i7] = i8 < length ? bArr3[(i3 >> 6) & 63] : 61;
            int i9 = i6 + 3;
            if (i + 2 < length) {
                b = bArr3[(i3 >> 0) & 63];
            }
            bArr2[i9] = b;
            i = i2;
        }
        return new String(bArr2, C19446a.f43373b);
    }
}
