package p611lh;

import android.support.p013v4.media.C0072d;

/* renamed from: lh.r */
public final class C18182r {

    /* renamed from: a */
    public static final String[] f39786a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    public static final int[] f39787b = {44100, 48000, 32000};

    /* renamed from: c */
    public static final int[] f39788c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    public static final int[] f39789d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    public static final int[] f39790e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    public static final int[] f39791f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    public static final int[] f39792g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: lh.r$a */
    public static final class C18183a {

        /* renamed from: a */
        public int f39793a;

        /* renamed from: b */
        public String f39794b;

        /* renamed from: c */
        public int f39795c;

        /* renamed from: d */
        public int f39796d;

        /* renamed from: e */
        public int f39797e;

        /* renamed from: f */
        public int f39798f;

        /* renamed from: g */
        public int f39799g;

        /* renamed from: a */
        public final boolean mo69725a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!((i & -2097152) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f39793a = i2;
            this.f39794b = C18182r.f39786a[3 - i3];
            int i6 = C18182r.f39787b[i5];
            this.f39796d = i6;
            int i7 = 2;
            if (i2 == 2) {
                this.f39796d = i6 / 2;
            } else if (i2 == 0) {
                this.f39796d = i6 / 4;
            }
            int i8 = (i >>> 9) & 1;
            int i9 = 1152;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i9 = 384;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else if (i2 != 3) {
                i9 = 576;
            }
            this.f39799g = i9;
            if (i3 == 3) {
                int i10 = i2 == 3 ? C18182r.f39788c[i4 - 1] : C18182r.f39789d[i4 - 1];
                this.f39798f = i10;
                this.f39795c = (((i10 * 12) / this.f39796d) + i8) * 4;
            } else {
                int i11 = 144;
                if (i2 == 3) {
                    int i12 = i3 == 2 ? C18182r.f39790e[i4 - 1] : C18182r.f39791f[i4 - 1];
                    this.f39798f = i12;
                    this.f39795c = ((i12 * 144) / this.f39796d) + i8;
                } else {
                    int i13 = C18182r.f39792g[i4 - 1];
                    this.f39798f = i13;
                    if (i3 == 1) {
                        i11 = 72;
                    }
                    this.f39795c = ((i11 * i13) / this.f39796d) + i8;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i7 = 1;
            }
            this.f39797e = i7;
            return true;
        }
    }

    /* renamed from: a */
    public static int m30684a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & -2097152) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f39787b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f39788c[i4 - 1] : f39789d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f39790e[i4 - 1] : f39791f[i4 - 1] : f39792g[i4 - 1];
        int i9 = 144;
        if (i2 == 3) {
            return C0072d.m196b(i8, 144, i6, i7);
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return C0072d.m196b(i9, i8, i6, i7);
    }

    /* renamed from: b */
    public static int m30685b(int i) {
        int i2;
        int i3;
        if (!((i & -2097152) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
