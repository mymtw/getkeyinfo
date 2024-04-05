package p717yh;

import java.util.Arrays;
import p513bj.C14068n;
import p513bj.C14077r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.k */
public final class C18859k implements C18858j {

    /* renamed from: q */
    public static final double[] f41840q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f41841a;

    /* renamed from: b */
    public C18368v f41842b;

    /* renamed from: c */
    public final C18854f0 f41843c;

    /* renamed from: d */
    public final C14077r f41844d;

    /* renamed from: e */
    public final C18872r f41845e;

    /* renamed from: f */
    public final boolean[] f41846f = new boolean[4];

    /* renamed from: g */
    public final C18860a f41847g = new C18860a();

    /* renamed from: h */
    public long f41848h;

    /* renamed from: i */
    public boolean f41849i;

    /* renamed from: j */
    public boolean f41850j;

    /* renamed from: k */
    public long f41851k;

    /* renamed from: l */
    public long f41852l;

    /* renamed from: m */
    public long f41853m;

    /* renamed from: n */
    public long f41854n;

    /* renamed from: o */
    public boolean f41855o;

    /* renamed from: p */
    public boolean f41856p;

    /* renamed from: yh.k$a */
    public static final class C18860a {

        /* renamed from: e */
        public static final byte[] f41857e = {0, 0, 1};

        /* renamed from: a */
        public boolean f41858a;

        /* renamed from: b */
        public int f41859b;

        /* renamed from: c */
        public int f41860c;

        /* renamed from: d */
        public byte[] f41861d = new byte[128];

        /* renamed from: a */
        public final void mo70300a(int i, int i2, byte[] bArr) {
            if (this.f41858a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f41861d;
                int length = bArr2.length;
                int i4 = this.f41859b;
                if (length < i4 + i3) {
                    this.f41861d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f41861d, this.f41859b, i3);
                this.f41859b += i3;
            }
        }
    }

    public C18859k(C18854f0 f0Var) {
        this.f41843c = f0Var;
        if (f0Var != null) {
            this.f41845e = new C18872r(178);
            this.f41844d = new C14077r();
            return;
        }
        this.f41845e = null;
        this.f41844d = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70281a(p513bj.C14077r r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            ph.v r2 = r0.f41842b
            p513bj.C14075p.m21696h(r2)
            int r2 = r1.f30987b
            int r3 = r1.f30988c
            byte[] r4 = r1.f30986a
            long r5 = r0.f41848h
            int r7 = r3 - r2
            long r8 = (long) r7
            long r5 = r5 + r8
            r0.f41848h = r5
            ph.v r5 = r0.f41842b
            r5.mo69899d(r7, r1)
        L_0x001c:
            boolean[] r5 = r0.f41846f
            int r5 = p513bj.C14068n.m21683b(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0035
            boolean r1 = r0.f41850j
            if (r1 != 0) goto L_0x002d
            yh.k$a r1 = r0.f41847g
            r1.mo70300a(r2, r3, r4)
        L_0x002d:
            yh.r r1 = r0.f41845e
            if (r1 == 0) goto L_0x0034
            r1.mo70305a(r2, r3, r4)
        L_0x0034:
            return
        L_0x0035:
            byte[] r6 = r1.f30986a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f41850j
            r12 = 179(0xb3, float:2.51E-43)
            r13 = 0
            r14 = 1
            if (r9 != 0) goto L_0x0142
            if (r8 <= 0) goto L_0x004e
            yh.k$a r9 = r0.f41847g
            r9.mo70300a(r2, r5, r4)
        L_0x004e:
            if (r8 >= 0) goto L_0x0052
            int r9 = -r8
            goto L_0x0053
        L_0x0052:
            r9 = r13
        L_0x0053:
            yh.k$a r15 = r0.f41847g
            boolean r10 = r15.f41858a
            r11 = 3
            if (r10 == 0) goto L_0x006e
            int r10 = r15.f41859b
            int r10 = r10 - r9
            r15.f41859b = r10
            int r9 = r15.f41860c
            if (r9 != 0) goto L_0x006a
            r9 = 181(0xb5, float:2.54E-43)
            if (r6 != r9) goto L_0x006a
            r15.f41860c = r10
            goto L_0x0072
        L_0x006a:
            r15.f41858a = r13
            r9 = r14
            goto L_0x0078
        L_0x006e:
            if (r6 != r12) goto L_0x0072
            r15.f41858a = r14
        L_0x0072:
            byte[] r9 = p717yh.C18859k.C18860a.f41857e
            r15.mo70300a(r13, r11, r9)
            r9 = r13
        L_0x0078:
            if (r9 == 0) goto L_0x0142
            yh.k$a r9 = r0.f41847g
            java.lang.String r10 = r0.f41841a
            r10.getClass()
            byte[] r15 = r9.f41861d
            int r13 = r9.f41859b
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r15 = 4
            byte r12 = r13[r15]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r16 = 5
            byte r14 = r13[r16]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r17 = 6
            byte r11 = r13[r17]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r12 = r12 << r15
            int r17 = r14 >> 4
            r12 = r12 | r17
            r14 = r14 & 15
            r15 = 8
            int r14 = r14 << r15
            r11 = r11 | r14
            r14 = 7
            byte r15 = r13[r14]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            r14 = 4
            int r15 = r15 >> r14
            r14 = 2
            if (r15 == r14) goto L_0x00c4
            r14 = 3
            if (r15 == r14) goto L_0x00be
            r14 = 4
            if (r15 == r14) goto L_0x00b8
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00cb
        L_0x00b8:
            int r14 = r11 * 121
            float r14 = (float) r14
            int r15 = r12 * 100
            goto L_0x00c9
        L_0x00be:
            int r14 = r11 * 16
            float r14 = (float) r14
            int r15 = r12 * 9
            goto L_0x00c9
        L_0x00c4:
            int r14 = r11 * 4
            float r14 = (float) r14
            int r15 = r12 * 3
        L_0x00c9:
            float r15 = (float) r15
            float r14 = r14 / r15
        L_0x00cb:
            com.google.android.exoplayer2.Format$b r15 = new com.google.android.exoplayer2.Format$b
            r15.<init>()
            r15.f31293a = r10
            java.lang.String r10 = "video/mpeg2"
            r15.f31303k = r10
            r15.f31308p = r12
            r15.f31309q = r11
            r15.f31312t = r14
            java.util.List r10 = java.util.Collections.singletonList(r13)
            r15.f31305m = r10
            com.google.android.exoplayer2.Format r10 = r15.mo47144a()
            r11 = 7
            byte r11 = r13[r11]
            r11 = r11 & 15
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x011e
            double[] r12 = f41840q
            r14 = 8
            if (r11 >= r14) goto L_0x011e
            r11 = r12[r11]
            int r9 = r9.f41860c
            int r9 = r9 + 9
            byte r9 = r13[r9]
            r13 = r9 & 96
            int r13 = r13 >> 5
            r9 = r9 & 31
            if (r13 == r9) goto L_0x0113
            double r13 = (double) r13
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 + r17
            int r9 = r9 + 1
            r16 = r6
            r15 = r7
            double r6 = (double) r9
            double r13 = r13 / r6
            double r11 = r11 * r13
            goto L_0x0116
        L_0x0113:
            r16 = r6
            r15 = r7
        L_0x0116:
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 / r11
            long r6 = (long) r6
            goto L_0x0123
        L_0x011e:
            r16 = r6
            r15 = r7
            r6 = 0
        L_0x0123:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            android.util.Pair r6 = android.util.Pair.create(r10, r6)
            ph.v r7 = r0.f41842b
            java.lang.Object r9 = r6.first
            com.google.android.exoplayer2.Format r9 = (com.google.android.exoplayer2.Format) r9
            r7.mo47752a(r9)
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r0.f41851k = r6
            r6 = 1
            r0.f41850j = r6
            goto L_0x0145
        L_0x0142:
            r16 = r6
            r15 = r7
        L_0x0145:
            yh.r r6 = r0.f41845e
            if (r6 == 0) goto L_0x018c
            if (r8 <= 0) goto L_0x0150
            r6.mo70305a(r2, r5, r4)
            r2 = 0
            goto L_0x0151
        L_0x0150:
            int r2 = -r8
        L_0x0151:
            yh.r r6 = r0.f41845e
            boolean r2 = r6.mo70306b(r2)
            if (r2 == 0) goto L_0x0177
            yh.r r2 = r0.f41845e
            byte[] r6 = r2.f42006d
            int r2 = r2.f42007e
            int r2 = p513bj.C14068n.m21686e(r2, r6)
            bj.r r6 = r0.f41844d
            int r7 = p513bj.C14049b0.f30913a
            yh.r r7 = r0.f41845e
            byte[] r7 = r7.f42006d
            r6.mo46933x(r2, r7)
            yh.f0 r2 = r0.f41843c
            long r6 = r0.f41854n
            bj.r r8 = r0.f41844d
            r2.mo70296a(r8, r6)
        L_0x0177:
            r2 = 178(0xb2, float:2.5E-43)
            r6 = r16
            if (r6 != r2) goto L_0x018e
            byte[] r2 = r1.f30986a
            int r7 = r5 + 2
            byte r2 = r2[r7]
            r7 = 1
            if (r2 != r7) goto L_0x018e
            yh.r r2 = r0.f41845e
            r2.mo70308d(r6)
            goto L_0x018e
        L_0x018c:
            r6 = r16
        L_0x018e:
            if (r6 == 0) goto L_0x019d
            r2 = 179(0xb3, float:2.51E-43)
            if (r6 != r2) goto L_0x0195
            goto L_0x019d
        L_0x0195:
            r2 = 184(0xb8, float:2.58E-43)
            if (r6 != r2) goto L_0x01f7
            r2 = 1
            r0.f41855o = r2
            goto L_0x01f7
        L_0x019d:
            int r2 = r3 - r5
            boolean r5 = r0.f41849i
            if (r5 == 0) goto L_0x01be
            boolean r5 = r0.f41856p
            if (r5 == 0) goto L_0x01be
            boolean r5 = r0.f41850j
            if (r5 == 0) goto L_0x01be
            boolean r10 = r0.f41855o
            long r7 = r0.f41848h
            long r11 = r0.f41853m
            long r7 = r7 - r11
            int r5 = (int) r7
            int r11 = r5 - r2
            ph.v r7 = r0.f41842b
            long r8 = r0.f41854n
            r13 = 0
            r12 = r2
            r7.mo47754c(r8, r10, r11, r12, r13)
        L_0x01be:
            boolean r5 = r0.f41849i
            if (r5 == 0) goto L_0x01ca
            boolean r7 = r0.f41856p
            if (r7 == 0) goto L_0x01c7
            goto L_0x01ca
        L_0x01c7:
            r2 = 0
            r5 = 1
            goto L_0x01f0
        L_0x01ca:
            long r7 = r0.f41848h
            long r9 = (long) r2
            long r7 = r7 - r9
            r0.f41853m = r7
            long r7 = r0.f41852l
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01dc
            goto L_0x01e6
        L_0x01dc:
            if (r5 == 0) goto L_0x01e4
            long r7 = r0.f41854n
            long r11 = r0.f41851k
            long r7 = r7 + r11
            goto L_0x01e6
        L_0x01e4:
            r7 = 0
        L_0x01e6:
            r0.f41854n = r7
            r2 = 0
            r0.f41855o = r2
            r0.f41852l = r9
            r5 = 1
            r0.f41849i = r5
        L_0x01f0:
            if (r6 != 0) goto L_0x01f4
            r13 = r5
            goto L_0x01f5
        L_0x01f4:
            r13 = r2
        L_0x01f5:
            r0.f41856p = r13
        L_0x01f7:
            r2 = r15
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18859k.mo70281a(bj.r):void");
    }

    /* renamed from: c */
    public final void mo70282c() {
        C14068n.m21682a(this.f41846f);
        C18860a aVar = this.f41847g;
        aVar.f41858a = false;
        aVar.f41859b = 0;
        aVar.f41860c = 0;
        C18872r rVar = this.f41845e;
        if (rVar != null) {
            rVar.mo70307c();
        }
        this.f41848h = 0;
        this.f41849i = false;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41841a = dVar.f41796e;
        dVar.mo70294b();
        this.f41842b = jVar.mo4164r(dVar.f41795d, 2);
        C18854f0 f0Var = this.f41843c;
        if (f0Var != null) {
            f0Var.mo70297b(jVar, dVar);
        }
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f41852l = j;
    }
}
