package p513bj;

import java.util.Arrays;

/* renamed from: bj.n */
public final class C14068n {

    /* renamed from: a */
    public static final byte[] f30955a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f30956b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f30957c = new Object();

    /* renamed from: d */
    public static int[] f30958d = new int[10];

    /* renamed from: bj.n$a */
    public static final class C14069a {

        /* renamed from: a */
        public final int f30959a;

        /* renamed from: b */
        public final int f30960b;

        /* renamed from: c */
        public final boolean f30961c;

        public C14069a(int i, int i2, boolean z) {
            this.f30959a = i;
            this.f30960b = i2;
            this.f30961c = z;
        }
    }

    /* renamed from: bj.n$b */
    public static final class C14070b {

        /* renamed from: a */
        public final int f30962a;

        /* renamed from: b */
        public final int f30963b;

        /* renamed from: c */
        public final int f30964c;

        /* renamed from: d */
        public final int f30965d;

        /* renamed from: e */
        public final int f30966e;

        /* renamed from: f */
        public final int f30967f;

        /* renamed from: g */
        public final float f30968g;

        /* renamed from: h */
        public final boolean f30969h;

        /* renamed from: i */
        public final boolean f30970i;

        /* renamed from: j */
        public final int f30971j;

        /* renamed from: k */
        public final int f30972k;

        /* renamed from: l */
        public final int f30973l;

        /* renamed from: m */
        public final boolean f30974m;

        public C14070b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f30962a = i;
            this.f30963b = i2;
            this.f30964c = i3;
            this.f30965d = i4;
            this.f30966e = i5;
            this.f30967f = i6;
            this.f30968g = f;
            this.f30969h = z;
            this.f30970i = z2;
            this.f30971j = i7;
            this.f30972k = i8;
            this.f30973l = i9;
            this.f30974m = z3;
        }
    }

    /* renamed from: a */
    public static void m21682a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static int m21683b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        C14075p.m21694f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m21682a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m21682a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m21682a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + -2] == 0 && bArr[i4] == 1)) : bArr[i2 + -3] == 0 && bArr[i2 + -2] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i2;
        } else {
            m21682a(zArr);
            return i - 1;
        }
    }

    /* renamed from: c */
    public static C14069a m21684c(int i, byte[] bArr) {
        C14078s sVar = new C14078s(bArr, 3, i);
        sVar.mo46945j(8);
        int f = sVar.mo46941f();
        int f2 = sVar.mo46941f();
        sVar.mo46944i();
        return new C14069a(f, f2, sVar.mo46939d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0159  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p513bj.C14068n.C14070b m21685d(int r19, int r20, byte[] r21) {
        /*
            bj.s r0 = new bj.s
            r1 = r19
            r2 = r20
            r3 = r21
            r0.<init>(r3, r1, r2)
            r1 = 8
            r0.mo46945j(r1)
            int r3 = r0.mo46940e(r1)
            int r4 = r0.mo46940e(r1)
            int r5 = r0.mo46940e(r1)
            int r6 = r0.mo46941f()
            r2 = 100
            r7 = 3
            r8 = 1
            if (r3 == r2) goto L_0x004f
            r2 = 110(0x6e, float:1.54E-43)
            if (r3 == r2) goto L_0x004f
            r2 = 122(0x7a, float:1.71E-43)
            if (r3 == r2) goto L_0x004f
            r2 = 244(0xf4, float:3.42E-43)
            if (r3 == r2) goto L_0x004f
            r2 = 44
            if (r3 == r2) goto L_0x004f
            r2 = 83
            if (r3 == r2) goto L_0x004f
            r2 = 86
            if (r3 == r2) goto L_0x004f
            r2 = 118(0x76, float:1.65E-43)
            if (r3 == r2) goto L_0x004f
            r2 = 128(0x80, float:1.794E-43)
            if (r3 == r2) goto L_0x004f
            r2 = 138(0x8a, float:1.93E-43)
            if (r3 != r2) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            r1 = 0
            r10 = r1
            r2 = r8
            goto L_0x009c
        L_0x004f:
            int r2 = r0.mo46941f()
            if (r2 != r7) goto L_0x005a
            boolean r9 = r0.mo46939d()
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            r0.mo46941f()
            r0.mo46941f()
            r0.mo46944i()
            boolean r10 = r0.mo46939d()
            if (r10 == 0) goto L_0x009b
            if (r2 == r7) goto L_0x006e
            r7 = r1
            goto L_0x0070
        L_0x006e:
            r7 = 12
        L_0x0070:
            r10 = 0
        L_0x0071:
            if (r10 >= r7) goto L_0x009b
            boolean r11 = r0.mo46939d()
            if (r11 == 0) goto L_0x0098
            r11 = 6
            if (r10 >= r11) goto L_0x007f
            r11 = 16
            goto L_0x0081
        L_0x007f:
            r11 = 64
        L_0x0081:
            r12 = 0
            r13 = r1
            r14 = r13
        L_0x0084:
            if (r12 >= r11) goto L_0x0098
            if (r13 == 0) goto L_0x0091
            int r13 = r0.mo46942g()
            int r13 = r13 + r14
            int r13 = r13 + 256
            int r13 = r13 % 256
        L_0x0091:
            if (r13 != 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r14 = r13
        L_0x0095:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0098:
            int r10 = r10 + 1
            goto L_0x0071
        L_0x009b:
            r10 = r9
        L_0x009c:
            int r1 = r0.mo46941f()
            int r12 = r1 + 4
            int r13 = r0.mo46941f()
            if (r13 != 0) goto L_0x00af
            int r1 = r0.mo46941f()
            int r1 = r1 + 4
            goto L_0x00d1
        L_0x00af:
            if (r13 != r8) goto L_0x00d0
            boolean r1 = r0.mo46939d()
            r0.mo46942g()
            r0.mo46942g()
            int r7 = r0.mo46941f()
            long r14 = (long) r7
            r7 = 0
        L_0x00c1:
            long r8 = (long) r7
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x00cc
            r0.mo46941f()
            int r7 = r7 + 1
            goto L_0x00c1
        L_0x00cc:
            r7 = 0
            r15 = r1
            r14 = r7
            goto L_0x00d4
        L_0x00d0:
            r1 = 0
        L_0x00d1:
            r7 = 0
            r14 = r1
            r15 = r7
        L_0x00d4:
            r0.mo46941f()
            r0.mo46944i()
            int r1 = r0.mo46941f()
            r7 = 1
            int r1 = r1 + r7
            int r8 = r0.mo46941f()
            int r8 = r8 + r7
            boolean r11 = r0.mo46939d()
            int r9 = 2 - r11
            int r9 = r9 * r8
            if (r11 != 0) goto L_0x00f1
            r0.mo46944i()
        L_0x00f1:
            r0.mo46944i()
            int r1 = r1 * 16
            int r9 = r9 * 16
            boolean r8 = r0.mo46939d()
            if (r8 == 0) goto L_0x012f
            int r8 = r0.mo46941f()
            int r16 = r0.mo46941f()
            int r17 = r0.mo46941f()
            int r18 = r0.mo46941f()
            if (r2 != 0) goto L_0x0113
            int r2 = 2 - r11
            goto L_0x0125
        L_0x0113:
            r7 = 3
            if (r2 != r7) goto L_0x011a
            r7 = 1
            r20 = r7
            goto L_0x011c
        L_0x011a:
            r20 = 2
        L_0x011c:
            r7 = 1
            if (r2 != r7) goto L_0x0120
            r7 = 2
        L_0x0120:
            int r2 = 2 - r11
            int r2 = r2 * r7
            r7 = r20
        L_0x0125:
            int r8 = r8 + r16
            int r8 = r8 * r7
            int r1 = r1 - r8
            int r17 = r17 + r18
            int r17 = r17 * r2
            int r9 = r9 - r17
        L_0x012f:
            r7 = r1
            r8 = r9
            boolean r2 = r0.mo46939d()
            if (r2 == 0) goto L_0x016c
            boolean r2 = r0.mo46939d()
            if (r2 == 0) goto L_0x016c
            r2 = 8
            int r2 = r0.mo46940e(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0159
            r2 = 16
            int r9 = r0.mo46940e(r2)
            int r0 = r0.mo46940e(r2)
            if (r9 == 0) goto L_0x016c
            if (r0 == 0) goto L_0x016c
            float r1 = (float) r9
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x016e
        L_0x0159:
            float[] r0 = f30956b
            r9 = 17
            if (r2 >= r9) goto L_0x0163
            r0 = r0[r2]
            r9 = r0
            goto L_0x016f
        L_0x0163:
            r0 = 46
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r1 = "NalUnitUtil"
            p003a2.C0023f.m112m(r0, r9, r2, r1)
        L_0x016c:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x016e:
            r9 = r1
        L_0x016f:
            bj.n$b r0 = new bj.n$b
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p513bj.C14068n.m21685d(int, int, byte[]):bj.n$b");
    }

    /* renamed from: e */
    public static int m21686e(int i, byte[] bArr) {
        int i2;
        synchronized (f30957c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f30958d;
                    if (iArr.length <= i4) {
                        f30958d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f30958d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f30958d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
