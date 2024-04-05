package p611lh;

import com.google.logging.type.LogSeverity;
import java.util.Arrays;
import p513bj.C14075p;

/* renamed from: lh.s */
public final class C18184s {

    /* renamed from: a */
    public final int f39800a;

    /* renamed from: b */
    public final int f39801b;

    /* renamed from: c */
    public final float f39802c;

    /* renamed from: d */
    public final float f39803d;

    /* renamed from: e */
    public final float f39804e;

    /* renamed from: f */
    public final int f39805f;

    /* renamed from: g */
    public final int f39806g;

    /* renamed from: h */
    public final int f39807h;

    /* renamed from: i */
    public final short[] f39808i;

    /* renamed from: j */
    public short[] f39809j;

    /* renamed from: k */
    public int f39810k;

    /* renamed from: l */
    public short[] f39811l;

    /* renamed from: m */
    public int f39812m;

    /* renamed from: n */
    public short[] f39813n;

    /* renamed from: o */
    public int f39814o;

    /* renamed from: p */
    public int f39815p;

    /* renamed from: q */
    public int f39816q;

    /* renamed from: r */
    public int f39817r;

    /* renamed from: s */
    public int f39818s;

    /* renamed from: t */
    public int f39819t;

    /* renamed from: u */
    public int f39820u;

    /* renamed from: v */
    public int f39821v;

    public C18184s(int i, int i2, float f, float f2, int i3) {
        this.f39800a = i;
        this.f39801b = i2;
        this.f39802c = f;
        this.f39803d = f2;
        this.f39804e = ((float) i) / ((float) i3);
        this.f39805f = i / LogSeverity.WARNING_VALUE;
        int i4 = i / 65;
        this.f39806g = i4;
        int i5 = i4 * 2;
        this.f39807h = i5;
        this.f39808i = new short[i5];
        this.f39809j = new short[(i5 * i2)];
        this.f39811l = new short[(i5 * i2)];
        this.f39813n = new short[(i5 * i2)];
    }

    /* renamed from: d */
    public static void m30687d(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo69726a(short[] sArr, int i, int i2) {
        int i3 = this.f39807h / i2;
        int i4 = this.f39801b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f39808i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: b */
    public final short[] mo69727b(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f39801b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: c */
    public final int mo69728c(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f39801b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f39820u = i5 / i7;
        this.f39821v = i8 / i6;
        return i7;
    }

    /* renamed from: e */
    public final void mo69729e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f39812m;
        float f = this.f39802c;
        float f2 = this.f39803d;
        float f3 = f / f2;
        float f4 = this.f39804e * f2;
        double d = (double) f3;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.f39810k;
            if (i10 >= this.f39807h) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f39817r;
                    if (i12 > 0) {
                        int min = Math.min(this.f39807h, i12);
                        short[] sArr = this.f39809j;
                        short[] b = mo69727b(this.f39811l, this.f39812m, min);
                        this.f39811l = b;
                        int i13 = this.f39801b;
                        System.arraycopy(sArr, i11 * i13, b, this.f39812m * i13, i13 * min);
                        this.f39812m += min;
                        this.f39817r -= min;
                        i11 += min;
                    } else {
                        short[] sArr2 = this.f39809j;
                        int i14 = this.f39800a;
                        int i15 = i14 > 4000 ? i14 / 4000 : i9;
                        if (this.f39801b == i9 && i15 == i9) {
                            i = mo69728c(sArr2, i11, this.f39805f, this.f39806g);
                        } else {
                            mo69726a(sArr2, i11, i15);
                            int c = mo69728c(this.f39808i, 0, this.f39805f / i15, this.f39806g / i15);
                            if (i15 != i9) {
                                int i16 = c * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f39805f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f39806g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f39801b == i9) {
                                    i = mo69728c(sArr2, i11, i18, i19);
                                } else {
                                    mo69726a(sArr2, i11, i9);
                                    i = mo69728c(this.f39808i, 0, i18, i19);
                                }
                            } else {
                                i = c;
                            }
                        }
                        int i22 = this.f39820u;
                        int i23 = ((i22 == 0 || this.f39818s == 0 || this.f39821v > i22 * 3 || i22 * 2 <= this.f39819t * 3) ? 0 : i9) != 0 ? this.f39818s : i;
                        this.f39819t = i22;
                        this.f39818s = i;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f39809j;
                            if (f3 >= 2.0f) {
                                i3 = (int) (((float) i23) / (f3 - 1.0f));
                            } else {
                                this.f39817r = (int) (((2.0f - f3) * ((float) i23)) / (f3 - 1.0f));
                                i3 = i23;
                            }
                            short[] b2 = mo69727b(this.f39811l, this.f39812m, i3);
                            this.f39811l = b2;
                            int i24 = i3;
                            m30687d(i3, this.f39801b, b2, this.f39812m, sArr3, i11, sArr3, i11 + i23);
                            this.f39812m += i24;
                            i11 = i23 + i24 + i11;
                        } else {
                            int i25 = i23;
                            short[] sArr4 = this.f39809j;
                            if (f3 < 0.5f) {
                                i2 = (int) ((((float) i25) * f3) / (1.0f - f3));
                            } else {
                                this.f39817r = (int) ((((2.0f * f3) - 1.0f) * ((float) i25)) / (1.0f - f3));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            short[] b3 = mo69727b(this.f39811l, this.f39812m, i26);
                            this.f39811l = b3;
                            int i27 = this.f39801b;
                            System.arraycopy(sArr4, i11 * i27, b3, this.f39812m * i27, i27 * i25);
                            m30687d(i2, this.f39801b, this.f39811l, this.f39812m + i25, sArr4, i11 + i25, sArr4, i11);
                            this.f39812m += i26;
                            i11 += i2;
                        }
                    }
                    if (this.f39807h + i11 > i10) {
                        break;
                    }
                    i9 = 1;
                }
                int i28 = this.f39810k - i11;
                short[] sArr5 = this.f39809j;
                int i29 = this.f39801b;
                System.arraycopy(sArr5, i11 * i29, sArr5, 0, i29 * i28);
                this.f39810k = i28;
            }
        } else {
            short[] sArr6 = this.f39809j;
            int i30 = this.f39810k;
            short[] b4 = mo69727b(this.f39811l, i8, i30);
            this.f39811l = b4;
            int i31 = this.f39801b;
            System.arraycopy(sArr6, 0 * i31, b4, this.f39812m * i31, i31 * i30);
            this.f39812m += i30;
            this.f39810k = 0;
        }
        if (f4 != 1.0f && this.f39812m != i8) {
            int i32 = this.f39800a;
            int i33 = (int) (((float) i32) / f4);
            while (true) {
                if (i33 <= 16384 && i32 <= 16384) {
                    break;
                }
                i33 /= 2;
                i32 /= 2;
            }
            int i34 = this.f39812m - i8;
            short[] b5 = mo69727b(this.f39813n, this.f39814o, i34);
            this.f39813n = b5;
            short[] sArr7 = this.f39811l;
            int i35 = this.f39801b;
            System.arraycopy(sArr7, i8 * i35, b5, this.f39814o * i35, i35 * i34);
            this.f39812m = i8;
            this.f39814o += i34;
            int i36 = 0;
            while (true) {
                i4 = this.f39814o;
                i5 = i4 - 1;
                if (i36 >= i5) {
                    break;
                }
                while (true) {
                    i6 = this.f39815p + 1;
                    int i37 = i6 * i33;
                    i7 = this.f39816q;
                    if (i37 <= i7 * i32) {
                        break;
                    }
                    this.f39811l = mo69727b(this.f39811l, this.f39812m, 1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f39801b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr8 = this.f39813n;
                        int i40 = (i36 * i39) + i38;
                        short s = sArr8[i40];
                        short s2 = sArr8[i40 + i39];
                        int i41 = this.f39815p;
                        int i42 = i41 * i33;
                        int i43 = (i41 + 1) * i33;
                        int i44 = i43 - (this.f39816q * i32);
                        int i45 = i43 - i42;
                        this.f39811l[(this.f39812m * i39) + i38] = (short) ((((i45 - i44) * s2) + (s * i44)) / i45);
                        i38++;
                    }
                    this.f39816q++;
                    this.f39812m++;
                }
                this.f39815p = i6;
                if (i6 == i32) {
                    this.f39815p = 0;
                    C14075p.m21694f(i7 == i33);
                    this.f39816q = 0;
                }
                i36++;
            }
            if (i5 != 0) {
                short[] sArr9 = this.f39813n;
                int i46 = this.f39801b;
                System.arraycopy(sArr9, i5 * i46, sArr9, 0, (i4 - i5) * i46);
                this.f39814o -= i5;
            }
        }
    }
}
