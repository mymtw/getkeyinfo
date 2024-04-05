package com.google.android.gms.internal.measurement;

import com.google.android.play.core.appupdate.C15562d;
import java.io.IOException;
import p001a0.C0005b;

/* renamed from: com.google.android.gms.internal.measurement.x4 */
public final class C14866x4 {
    /* renamed from: a */
    public static int m24128a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static int m24129b(byte[] bArr, int i, C14854w4 w4Var) throws zzkh {
        int k = m24138k(bArr, i, w4Var);
        int i2 = w4Var.f33145a;
        if (i2 < 0) {
            throw zzkh.zzd();
        } else if (i2 > bArr.length - k) {
            throw zzkh.zzf();
        } else if (i2 == 0) {
            w4Var.f33147c = zzix.zzb;
            return k;
        } else {
            w4Var.f33147c = zzix.zzl(bArr, k, i2);
            return k + i2;
        }
    }

    /* renamed from: c */
    public static int m24130c(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: d */
    public static int m24131d(C14602c7 c7Var, byte[] bArr, int i, int i2, int i3, C14854w4 w4Var) throws IOException {
        C14832u6 u6Var = (C14832u6) c7Var;
        Object zze = u6Var.zze();
        int w = u6Var.mo50925w(zze, bArr, i, i2, i3, w4Var);
        u6Var.mo50435a(zze);
        w4Var.f33147c = zze;
        return w;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m24132e(com.google.android.gms.internal.measurement.C14602c7 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.C14854w4 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m24139l(r8, r7, r0, r10)
            int r8 = r10.f33145a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zze()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo50437c(r1, r2, r3, r4, r5)
            r6.mo50435a(r9)
            r10.f33147c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzkh r6 = com.google.android.gms.internal.measurement.zzkh.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14866x4.m24132e(com.google.android.gms.internal.measurement.c7, byte[], int, int, com.google.android.gms.internal.measurement.w4):int");
    }

    /* renamed from: f */
    public static int m24133f(C14602c7 c7Var, int i, byte[] bArr, int i2, int i3, C14891z5 z5Var, C14854w4 w4Var) throws IOException {
        int e = m24132e(c7Var, bArr, i2, i3, w4Var);
        z5Var.add(w4Var.f33147c);
        while (e < i3) {
            int k = m24138k(bArr, e, w4Var);
            if (i != w4Var.f33145a) {
                break;
            }
            e = m24132e(c7Var, bArr, k, i3, w4Var);
            z5Var.add(w4Var.f33147c);
        }
        return e;
    }

    /* renamed from: g */
    public static int m24134g(byte[] bArr, int i, C14891z5 z5Var, C14854w4 w4Var) throws IOException {
        C14831u5 u5Var = (C14831u5) z5Var;
        int k = m24138k(bArr, i, w4Var);
        int i2 = w4Var.f33145a + k;
        while (k < i2) {
            k = m24138k(bArr, k, w4Var);
            u5Var.mo50898c(w4Var.f33145a);
        }
        if (k == i2) {
            return k;
        }
        throw zzkh.zzf();
    }

    /* renamed from: h */
    public static int m24135h(byte[] bArr, int i, C14854w4 w4Var) throws zzkh {
        int k = m24138k(bArr, i, w4Var);
        int i2 = w4Var.f33145a;
        if (i2 < 0) {
            throw zzkh.zzd();
        } else if (i2 == 0) {
            w4Var.f33147c = "";
            return k;
        } else {
            w4Var.f33147c = new String(bArr, k, i2, C14575a6.f32740a);
            return k + i2;
        }
    }

    /* renamed from: i */
    public static int m24136i(byte[] bArr, int i, C14854w4 w4Var) throws zzkh {
        int i2;
        int i3;
        int k = m24138k(bArr, i, w4Var);
        int i4 = w4Var.f33145a;
        if (i4 < 0) {
            throw zzkh.zzd();
        } else if (i4 == 0) {
            w4Var.f33147c = "";
            return k;
        } else {
            C15562d dVar = C14881y7.f33174a;
            int length = bArr.length;
            if ((k | i4 | ((length - k) - i4)) >= 0) {
                int i5 = k + i4;
                char[] cArr = new char[i4];
                int i6 = 0;
                while (i2 < i5) {
                    byte b = bArr[i2];
                    if (!(b >= 0)) {
                        break;
                    }
                    k = i2 + 1;
                    cArr[i3] = (char) b;
                    i6 = i3 + 1;
                }
                while (i2 < i5) {
                    int i7 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (b2 >= 0) {
                        int i8 = i3 + 1;
                        cArr[i3] = (char) b2;
                        i2 = i7;
                        while (true) {
                            i3 = i8;
                            if (i2 >= i5) {
                                break;
                            }
                            byte b3 = bArr[i2];
                            if (!(b3 >= 0)) {
                                break;
                            }
                            i2++;
                            i8 = i3 + 1;
                            cArr[i3] = (char) b3;
                        }
                    } else if (b2 < -32) {
                        if (i7 < i5) {
                            int i9 = i7 + 1;
                            int i10 = i3 + 1;
                            byte b4 = bArr[i7];
                            if (b2 < -62 || C0005b.m64u0(b4)) {
                                throw zzkh.zzc();
                            }
                            cArr[i3] = (char) (((b2 & 31) << 6) | (b4 & 63));
                            i2 = i9;
                            i3 = i10;
                        } else {
                            throw zzkh.zzc();
                        }
                    } else if (b2 < -16) {
                        if (i7 < i5 - 1) {
                            int i11 = i7 + 1;
                            int i12 = i11 + 1;
                            int i13 = i3 + 1;
                            byte b5 = bArr[i7];
                            byte b6 = bArr[i11];
                            if (!C0005b.m64u0(b5)) {
                                if (b2 == -32) {
                                    if (b5 >= -96) {
                                        b2 = -32;
                                    }
                                }
                                if (b2 == -19) {
                                    if (b5 < -96) {
                                        b2 = -19;
                                    }
                                }
                                if (!C0005b.m64u0(b6)) {
                                    cArr[i3] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i2 = i12;
                                    i3 = i13;
                                }
                            }
                            throw zzkh.zzc();
                        }
                        throw zzkh.zzc();
                    } else if (i7 < i5 - 2) {
                        int i14 = i7 + 1;
                        int i15 = i14 + 1;
                        int i16 = i15 + 1;
                        byte b7 = bArr[i7];
                        byte b8 = bArr[i14];
                        byte b9 = bArr[i15];
                        if (!C0005b.m64u0(b7)) {
                            if ((((b7 + 112) + (b2 << 28)) >> 30) == 0 && !C0005b.m64u0(b8) && !C0005b.m64u0(b9)) {
                                byte b10 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                                cArr[i3] = (char) ((b10 >>> 10) + 55232);
                                cArr[i3 + 1] = (char) ((b10 & 1023) + 56320);
                                i3 += 2;
                                i2 = i16;
                            }
                        }
                        throw zzkh.zzc();
                    } else {
                        throw zzkh.zzc();
                    }
                }
                w4Var.f33147c = new String(cArr, 0, i3);
                return i5;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(k), Integer.valueOf(i4)}));
        }
    }

    /* renamed from: j */
    public static int m24137j(int i, byte[] bArr, int i2, int i3, C14758o7 o7Var, C14854w4 w4Var) throws zzkh {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int n = m24141n(bArr, i2, w4Var);
                o7Var.mo50762c(i, Long.valueOf(w4Var.f33146b));
                return n;
            } else if (i4 == 1) {
                o7Var.mo50762c(i, Long.valueOf(m24142o(i2, bArr)));
                return i2 + 8;
            } else if (i4 == 2) {
                int k = m24138k(bArr, i2, w4Var);
                int i5 = w4Var.f33145a;
                if (i5 < 0) {
                    throw zzkh.zzd();
                } else if (i5 <= bArr.length - k) {
                    if (i5 == 0) {
                        o7Var.mo50762c(i, zzix.zzb);
                    } else {
                        o7Var.mo50762c(i, zzix.zzl(bArr, k, i5));
                    }
                    return k + i5;
                } else {
                    throw zzkh.zzf();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C14758o7 b = C14758o7.m23822b();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int k2 = m24138k(bArr, i2, w4Var);
                    int i8 = w4Var.f33145a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = k2;
                        break;
                    }
                    i7 = i8;
                    i2 = m24137j(i8, bArr, k2, i3, b, w4Var);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzkh.zze();
                }
                o7Var.mo50762c(i, b);
                return i2;
            } else if (i4 == 5) {
                o7Var.mo50762c(i, Integer.valueOf(m24130c(i2, bArr)));
                return i2 + 4;
            } else {
                throw zzkh.zzb();
            }
        } else {
            throw zzkh.zzb();
        }
    }

    /* renamed from: k */
    public static int m24138k(byte[] bArr, int i, C14854w4 w4Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m24139l(b, bArr, i2, w4Var);
        }
        w4Var.f33145a = b;
        return i2;
    }

    /* renamed from: l */
    public static int m24139l(int i, byte[] bArr, int i2, C14854w4 w4Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            w4Var.f33145a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            w4Var.f33145a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            w4Var.f33145a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            w4Var.f33145a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                w4Var.f33145a = i11;
                return i12;
            }
        }
    }

    /* renamed from: m */
    public static int m24140m(int i, byte[] bArr, int i2, int i3, C14891z5 z5Var, C14854w4 w4Var) {
        C14831u5 u5Var = (C14831u5) z5Var;
        int k = m24138k(bArr, i2, w4Var);
        u5Var.mo50898c(w4Var.f33145a);
        while (k < i3) {
            int k2 = m24138k(bArr, k, w4Var);
            if (i != w4Var.f33145a) {
                break;
            }
            k = m24138k(bArr, k2, w4Var);
            u5Var.mo50898c(w4Var.f33145a);
        }
        return k;
    }

    /* renamed from: n */
    public static int m24141n(byte[] bArr, int i, C14854w4 w4Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            w4Var.f33146b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        w4Var.f33146b = j2;
        return i3;
    }

    /* renamed from: o */
    public static long m24142o(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
