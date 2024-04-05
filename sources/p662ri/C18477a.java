package p662ri;

import java.util.zip.Inflater;
import p513bj.C14077r;
import p636oi.C18298b;

/* renamed from: ri.a */
public final class C18477a extends C18298b {

    /* renamed from: m */
    public final C14077r f40697m = new C14077r();

    /* renamed from: n */
    public final C14077r f40698n = new C14077r();

    /* renamed from: o */
    public final C18478a f40699o = new C18478a();

    /* renamed from: p */
    public Inflater f40700p;

    /* renamed from: ri.a$a */
    public static final class C18478a {

        /* renamed from: a */
        public final C14077r f40701a = new C14077r();

        /* renamed from: b */
        public final int[] f40702b = new int[256];

        /* renamed from: c */
        public boolean f40703c;

        /* renamed from: d */
        public int f40704d;

        /* renamed from: e */
        public int f40705e;

        /* renamed from: f */
        public int f40706f;

        /* renamed from: g */
        public int f40707g;

        /* renamed from: h */
        public int f40708h;

        /* renamed from: i */
        public int f40709i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0182, code lost:
        r2 = 0;
        r11 = null;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p636oi.C18300d mo69840g(int r22, boolean r23, byte[] r24) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r21 = this;
            r0 = r21
            bj.r r1 = r0.f40697m
            r2 = r22
            r3 = r24
            r1.mo46933x(r2, r3)
            bj.r r1 = r0.f40697m
            int r2 = r1.f30988c
            int r3 = r1.f30987b
            int r2 = r2 - r3
            r4 = 255(0xff, float:3.57E-43)
            if (r2 <= 0) goto L_0x003d
            byte[] r2 = r1.f30986a
            byte r2 = r2[r3]
            r2 = r2 & r4
            r3 = 120(0x78, float:1.68E-43)
            if (r2 != r3) goto L_0x003d
            java.util.zip.Inflater r2 = r0.f40700p
            if (r2 != 0) goto L_0x002a
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>()
            r0.f40700p = r2
        L_0x002a:
            bj.r r2 = r0.f40698n
            java.util.zip.Inflater r3 = r0.f40700p
            boolean r2 = p513bj.C14049b0.m21620A(r1, r2, r3)
            if (r2 == 0) goto L_0x003d
            bj.r r2 = r0.f40698n
            byte[] r3 = r2.f30986a
            int r2 = r2.f30988c
            r1.mo46933x(r2, r3)
        L_0x003d:
            ri.a$a r1 = r0.f40699o
            r2 = 0
            r1.f40704d = r2
            r1.f40705e = r2
            r1.f40706f = r2
            r1.f40707g = r2
            r1.f40708h = r2
            r1.f40709i = r2
            bj.r r3 = r1.f40701a
            r3.mo46932w(r2)
            r1.f40703c = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0058:
            bj.r r3 = r0.f40697m
            int r5 = r3.f30988c
            int r6 = r3.f30987b
            int r6 = r5 - r6
            r7 = 3
            if (r6 < r7) goto L_0x0252
            ri.a$a r6 = r0.f40699o
            int r8 = r3.mo46925p()
            int r9 = r3.mo46930u()
            int r10 = r3.f30987b
            int r10 = r10 + r9
            if (r10 <= r5) goto L_0x0079
            r3.mo46935z(r5)
            r5 = r4
            r11 = 0
            goto L_0x024a
        L_0x0079:
            r5 = 128(0x80, float:1.794E-43)
            if (r8 == r5) goto L_0x0186
            switch(r8) {
                case 20: goto L_0x00ff;
                case 21: goto L_0x00aa;
                case 22: goto L_0x0084;
                default: goto L_0x0080;
            }
        L_0x0080:
            r8 = r3
            r5 = r4
            goto L_0x0182
        L_0x0084:
            r6.getClass()
            r5 = 19
            if (r9 >= r5) goto L_0x008c
            goto L_0x0080
        L_0x008c:
            int r5 = r3.mo46930u()
            r6.f40704d = r5
            int r5 = r3.mo46930u()
            r6.f40705e = r5
            r5 = 11
            r3.mo46909A(r5)
            int r5 = r3.mo46930u()
            r6.f40706f = r5
            int r5 = r3.mo46930u()
            r6.f40707g = r5
            goto L_0x0080
        L_0x00aa:
            r6.getClass()
            r8 = 4
            if (r9 >= r8) goto L_0x00b1
            goto L_0x0080
        L_0x00b1:
            r3.mo46909A(r7)
            int r7 = r3.mo46925p()
            r5 = r5 & r7
            if (r5 == 0) goto L_0x00bd
            r12 = 1
            goto L_0x00be
        L_0x00bd:
            r12 = r2
        L_0x00be:
            int r9 = r9 + -4
            if (r12 == 0) goto L_0x00e2
            r5 = 7
            if (r9 >= r5) goto L_0x00c6
            goto L_0x0080
        L_0x00c6:
            int r5 = r3.mo46927r()
            if (r5 >= r8) goto L_0x00cd
            goto L_0x0080
        L_0x00cd:
            int r7 = r3.mo46930u()
            r6.f40708h = r7
            int r7 = r3.mo46930u()
            r6.f40709i = r7
            bj.r r7 = r6.f40701a
            int r5 = r5 + -4
            r7.mo46932w(r5)
            int r9 = r9 + -7
        L_0x00e2:
            bj.r r5 = r6.f40701a
            int r7 = r5.f30987b
            int r5 = r5.f30988c
            if (r7 >= r5) goto L_0x0080
            if (r9 <= 0) goto L_0x0080
            int r5 = r5 - r7
            int r5 = java.lang.Math.min(r9, r5)
            bj.r r8 = r6.f40701a
            byte[] r8 = r8.f30986a
            r3.mo46911b(r7, r5, r8)
            bj.r r6 = r6.f40701a
            int r7 = r7 + r5
            r6.mo46935z(r7)
            goto L_0x0080
        L_0x00ff:
            r6.getClass()
            int r5 = r9 % 5
            r7 = 2
            if (r5 == r7) goto L_0x0109
            goto L_0x0080
        L_0x0109:
            r3.mo46909A(r7)
            int[] r5 = r6.f40702b
            java.util.Arrays.fill(r5, r2)
            int r9 = r9 / 5
            r5 = r2
        L_0x0114:
            if (r5 >= r9) goto L_0x017d
            int r7 = r3.mo46925p()
            int r8 = r3.mo46925p()
            int r13 = r3.mo46925p()
            int r14 = r3.mo46925p()
            int r15 = r3.mo46925p()
            double r11 = (double) r8
            r16 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r13 = r13 + -128
            r8 = r3
            double r2 = (double) r13
            double r16 = r16 * r2
            r18 = r5
            double r4 = r16 + r11
            int r4 = (int) r4
            r16 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r14 = r14 + -128
            double r13 = (double) r14
            double r16 = r16 * r13
            double r16 = r11 - r16
            r19 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r2 = r2 * r19
            double r2 = r16 - r2
            int r2 = (int) r2
            r16 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r13 = r13 * r16
            double r13 = r13 + r11
            int r3 = (int) r13
            int[] r11 = r6.f40702b
            int r12 = r15 << 24
            r5 = 255(0xff, float:3.57E-43)
            r13 = 0
            int r4 = p513bj.C14049b0.m21636i(r4, r13, r5)
            int r4 = r4 << 16
            r4 = r4 | r12
            int r2 = p513bj.C14049b0.m21636i(r2, r13, r5)
            int r2 = r2 << 8
            r2 = r2 | r4
            int r3 = p513bj.C14049b0.m21636i(r3, r13, r5)
            r2 = r2 | r3
            r11[r7] = r2
            int r2 = r18 + 1
            r4 = r5
            r3 = r8
            r5 = r2
            r2 = 0
            goto L_0x0114
        L_0x017d:
            r8 = r3
            r5 = r4
            r2 = 1
            r6.f40703c = r2
        L_0x0182:
            r2 = 0
            r11 = 0
            goto L_0x0247
        L_0x0186:
            r8 = r3
            r5 = r4
            int r2 = r6.f40704d
            if (r2 == 0) goto L_0x0232
            int r2 = r6.f40705e
            if (r2 == 0) goto L_0x0232
            int r2 = r6.f40708h
            if (r2 == 0) goto L_0x0232
            int r2 = r6.f40709i
            if (r2 == 0) goto L_0x0232
            bj.r r2 = r6.f40701a
            int r3 = r2.f30988c
            if (r3 == 0) goto L_0x0232
            int r4 = r2.f30987b
            if (r4 != r3) goto L_0x0232
            boolean r3 = r6.f40703c
            if (r3 != 0) goto L_0x01a8
            goto L_0x0232
        L_0x01a8:
            r3 = 0
            r2.mo46935z(r3)
            int r2 = r6.f40708h
            int r3 = r6.f40709i
            int r2 = r2 * r3
            int[] r3 = new int[r2]
            r4 = 0
        L_0x01b4:
            if (r4 >= r2) goto L_0x01f7
            bj.r r7 = r6.f40701a
            int r7 = r7.mo46925p()
            if (r7 == 0) goto L_0x01c8
            int r9 = r4 + 1
            int[] r11 = r6.f40702b
            r7 = r11[r7]
            r3[r4] = r7
        L_0x01c6:
            r4 = r9
            goto L_0x01b4
        L_0x01c8:
            bj.r r7 = r6.f40701a
            int r7 = r7.mo46925p()
            if (r7 == 0) goto L_0x01b4
            r9 = r7 & 64
            if (r9 != 0) goto L_0x01d7
            r9 = r7 & 63
            goto L_0x01e2
        L_0x01d7:
            r9 = r7 & 63
            int r9 = r9 << 8
            bj.r r11 = r6.f40701a
            int r11 = r11.mo46925p()
            r9 = r9 | r11
        L_0x01e2:
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x01e8
            r7 = 0
            goto L_0x01f2
        L_0x01e8:
            int[] r7 = r6.f40702b
            bj.r r11 = r6.f40701a
            int r11 = r11.mo46925p()
            r7 = r7[r11]
        L_0x01f2:
            int r9 = r9 + r4
            java.util.Arrays.fill(r3, r4, r9, r7)
            goto L_0x01c6
        L_0x01f7:
            int r2 = r6.f40708h
            int r4 = r6.f40709i
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r3, r2, r4, r7)
            oi.a$a r3 = new oi.a$a
            r3.<init>()
            r3.f40165b = r2
            int r2 = r6.f40706f
            float r2 = (float) r2
            int r4 = r6.f40704d
            float r4 = (float) r4
            float r2 = r2 / r4
            r3.f40171h = r2
            r2 = 0
            r3.f40172i = r2
            int r7 = r6.f40707g
            float r7 = (float) r7
            int r9 = r6.f40705e
            float r9 = (float) r9
            float r7 = r7 / r9
            r3.f40168e = r7
            r3.f40169f = r2
            r3.f40170g = r2
            int r2 = r6.f40708h
            float r2 = (float) r2
            float r2 = r2 / r4
            r3.f40175l = r2
            int r2 = r6.f40709i
            float r2 = (float) r2
            float r2 = r2 / r9
            r3.f40176m = r2
            oi.a r11 = r3.mo69838a()
            goto L_0x0233
        L_0x0232:
            r11 = 0
        L_0x0233:
            r2 = 0
            r6.f40704d = r2
            r6.f40705e = r2
            r6.f40706f = r2
            r6.f40707g = r2
            r6.f40708h = r2
            r6.f40709i = r2
            bj.r r3 = r6.f40701a
            r3.mo46932w(r2)
            r6.f40703c = r2
        L_0x0247:
            r8.mo46935z(r10)
        L_0x024a:
            if (r11 == 0) goto L_0x024f
            r1.add(r11)
        L_0x024f:
            r4 = r5
            goto L_0x0058
        L_0x0252:
            ri.b r2 = new ri.b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p662ri.C18477a.mo69840g(int, boolean, byte[]):oi.d");
    }
}
