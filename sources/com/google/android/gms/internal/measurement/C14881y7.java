package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0069a;
import com.google.android.play.core.appupdate.C15562d;

/* renamed from: com.google.android.gms.internal.measurement.y7 */
public final class C14881y7 {

    /* renamed from: a */
    public static final C15562d f33174a = new C15562d();

    static {
        if (C14869x7.f33160e && C14869x7.f33159d) {
            int i = C14842v4.f33131a;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m24177a(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b <= -12 && b2 <= -65) {
                    return b ^ (b2 << 8);
                }
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b <= -12 && b3 <= -65 && b4 <= -65) {
                    return ((b3 << 8) ^ b) ^ (b4 << 16);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b <= -12) {
            return b;
        }
        return -1;
    }

    /* renamed from: b */
    public static int m24178b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & RFC1522Codec.SEP) | 128);
                i7++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & RFC1522Codec.SEP) | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                throw new zzmp(i7 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i8);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new zzmp(i7, length);
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    /* renamed from: c */
    public static int m24179c(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzmp(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder g = C0069a.m176g(54, "UTF-8 length does not fit in int: ");
        g.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(g.toString());
    }

    /* renamed from: d */
    public static boolean m24180d(int i, int i2, byte[] bArr) {
        f33174a.getClass();
        return C15562d.m25191b0(i, i2, bArr);
    }
}
