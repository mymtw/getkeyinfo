package com.github.scribejava.core.pkce;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.apache.commons.codec.binary.BaseNCodec;
import p485xg.C13884a;

public enum PKCECodeChallengeMethod {
    S256 {
        private final C13884a base64Encoder;

        public String transform2CodeChallenge(String str) throws NoSuchAlgorithmException {
            int i;
            int i2;
            C13884a aVar = this.base64Encoder;
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.US_ASCII));
            aVar.getClass();
            int length = digest.length;
            if (aVar.f30551d) {
                i = ((length + 2) / 3) * 4;
            } else {
                int i3 = length % 3;
                i = ((length / 3) * 4) + (i3 == 0 ? 0 : i3 + 1);
            }
            int i4 = aVar.f30549b;
            if (i4 > 0) {
                i += ((i - 1) / i4) * aVar.f30548a.length;
            }
            byte[] bArr = new byte[i];
            int length2 = digest.length;
            char[] cArr = aVar.f30550c ? C13884a.f30547f : C13884a.f30546e;
            int i5 = ((length2 + 0) / 3) * 3;
            int i6 = i5 + 0;
            if (i4 > 0 && i5 > (i2 = (i4 / 4) * 3)) {
                i5 = i2;
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6) {
                int min = Math.min(i7 + i5, i6);
                int i9 = i7;
                int i10 = i8;
                while (i9 < min) {
                    int i11 = i9 + 1;
                    int i12 = i11 + 1;
                    byte b = (digest[i12] & 255) | ((digest[i9] & 255) << 16) | ((digest[i11] & 255) << 8);
                    int i13 = i10 + 1;
                    bArr[i10] = (byte) cArr[(b >>> 18) & 63];
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) cArr[(b >>> 12) & 63];
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) cArr[(b >>> 6) & 63];
                    i10 = i15 + 1;
                    bArr[i15] = (byte) cArr[b & 63];
                    i9 = i12 + 1;
                }
                int i16 = ((min - i7) / 3) * 4;
                i8 += i16;
                if (i16 == aVar.f30549b && min < length2) {
                    byte[] bArr2 = aVar.f30548a;
                    int length3 = bArr2.length;
                    int i17 = 0;
                    while (i17 < length3) {
                        bArr[i8] = bArr2[i17];
                        i17++;
                        i8++;
                    }
                }
                i7 = min;
            }
            if (i7 < length2) {
                int i18 = i7 + 1;
                byte b2 = digest[i7] & 255;
                int i19 = i8 + 1;
                bArr[i8] = (byte) cArr[b2 >> 2];
                if (i18 == length2) {
                    i8 = i19 + 1;
                    bArr[i19] = (byte) cArr[(b2 << 4) & 63];
                    if (aVar.f30551d) {
                        int i20 = i8 + 1;
                        bArr[i8] = BaseNCodec.PAD_DEFAULT;
                        i8 = i20 + 1;
                        bArr[i20] = BaseNCodec.PAD_DEFAULT;
                    }
                } else {
                    byte b3 = digest[i18] & 255;
                    int i21 = i19 + 1;
                    bArr[i19] = (byte) cArr[((b2 << 4) & 63) | (b3 >> 4)];
                    i8 = i21 + 1;
                    bArr[i21] = (byte) cArr[(b3 << 2) & 63];
                    if (aVar.f30551d) {
                        bArr[i8] = BaseNCodec.PAD_DEFAULT;
                        i8++;
                    }
                }
            }
            if (i8 != i) {
                bArr = Arrays.copyOf(bArr, i8);
            }
            return new String(bArr, 0, 0, bArr.length);
        }
    },
    PLAIN {
        public String transform2CodeChallenge(String str) {
            return str;
        }
    };

    public abstract String transform2CodeChallenge(String str) throws NoSuchAlgorithmException;
}
