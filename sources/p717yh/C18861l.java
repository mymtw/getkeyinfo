package p717yh;

import java.util.Arrays;
import p513bj.C14068n;
import p513bj.C14077r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.l */
public final class C18861l implements C18858j {

    /* renamed from: l */
    public static final float[] f41862l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final C18854f0 f41863a;

    /* renamed from: b */
    public final C14077r f41864b = new C14077r();

    /* renamed from: c */
    public final boolean[] f41865c = new boolean[4];

    /* renamed from: d */
    public final C18862a f41866d = new C18862a();

    /* renamed from: e */
    public final C18872r f41867e = new C18872r(178);

    /* renamed from: f */
    public C18863b f41868f;

    /* renamed from: g */
    public long f41869g;

    /* renamed from: h */
    public String f41870h;

    /* renamed from: i */
    public C18368v f41871i;

    /* renamed from: j */
    public boolean f41872j;

    /* renamed from: k */
    public long f41873k;

    /* renamed from: yh.l$a */
    public static final class C18862a {

        /* renamed from: f */
        public static final byte[] f41874f = {0, 0, 1};

        /* renamed from: a */
        public boolean f41875a;

        /* renamed from: b */
        public int f41876b;

        /* renamed from: c */
        public int f41877c;

        /* renamed from: d */
        public int f41878d;

        /* renamed from: e */
        public byte[] f41879e = new byte[128];

        /* renamed from: a */
        public final void mo70301a(int i, int i2, byte[] bArr) {
            if (this.f41875a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f41879e;
                int length = bArr2.length;
                int i4 = this.f41877c;
                if (length < i4 + i3) {
                    this.f41879e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f41879e, this.f41877c, i3);
                this.f41877c += i3;
            }
        }
    }

    /* renamed from: yh.l$b */
    public static final class C18863b {

        /* renamed from: a */
        public final C18368v f41880a;

        /* renamed from: b */
        public boolean f41881b;

        /* renamed from: c */
        public boolean f41882c;

        /* renamed from: d */
        public boolean f41883d;

        /* renamed from: e */
        public int f41884e;

        /* renamed from: f */
        public int f41885f;

        /* renamed from: g */
        public long f41886g;

        /* renamed from: h */
        public long f41887h;

        public C18863b(C18368v vVar) {
            this.f41880a = vVar;
        }

        /* renamed from: a */
        public final void mo70302a(int i, int i2, byte[] bArr) {
            if (this.f41882c) {
                int i3 = this.f41885f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.f41883d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f41882c = false;
                    return;
                }
                this.f41885f = (i2 - i) + i3;
            }
        }
    }

    public C18861l(C18854f0 f0Var) {
        this.f41863a = f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0276 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70281a(p513bj.C14077r r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            yh.l$b r2 = r0.f41868f
            p513bj.C14075p.m21696h(r2)
            ph.v r2 = r0.f41871i
            p513bj.C14075p.m21696h(r2)
            int r2 = r1.f30987b
            int r3 = r1.f30988c
            byte[] r4 = r1.f30986a
            long r5 = r0.f41869g
            int r7 = r3 - r2
            long r8 = (long) r7
            long r5 = r5 + r8
            r0.f41869g = r5
            ph.v r5 = r0.f41871i
            r5.mo69899d(r7, r1)
        L_0x0021:
            boolean[] r5 = r0.f41865c
            int r5 = p513bj.C14068n.m21683b(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x003f
            boolean r1 = r0.f41872j
            if (r1 != 0) goto L_0x0032
            yh.l$a r1 = r0.f41866d
            r1.mo70301a(r2, r3, r4)
        L_0x0032:
            yh.l$b r1 = r0.f41868f
            r1.mo70302a(r2, r3, r4)
            yh.r r1 = r0.f41867e
            if (r1 == 0) goto L_0x003e
            r1.mo70305a(r2, r3, r4)
        L_0x003e:
            return
        L_0x003f:
            byte[] r6 = r1.f30986a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f41872j
            r11 = 1
            if (r9 != 0) goto L_0x01e3
            if (r8 <= 0) goto L_0x0055
            yh.l$a r9 = r0.f41866d
            r9.mo70301a(r2, r5, r4)
        L_0x0055:
            if (r8 >= 0) goto L_0x0059
            int r9 = -r8
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            yh.l$a r13 = r0.f41866d
            int r14 = r13.f41876b
            java.lang.String r15 = "H263Reader"
            r10 = 2
            if (r14 == 0) goto L_0x00c6
            java.lang.String r12 = "Unexpected start code value"
            r17 = r7
            r7 = 181(0xb5, float:2.54E-43)
            if (r14 == r11) goto L_0x00b6
            if (r14 == r10) goto L_0x00a2
            r11 = 3
            if (r14 == r11) goto L_0x0089
            r11 = 4
            if (r14 != r11) goto L_0x0083
            r11 = 179(0xb3, float:2.51E-43)
            if (r6 == r11) goto L_0x0079
            if (r6 != r7) goto L_0x00d1
        L_0x0079:
            int r7 = r13.f41877c
            int r7 = r7 - r9
            r13.f41877c = r7
            r7 = 0
            r13.f41875a = r7
            r7 = 1
            goto L_0x00d9
        L_0x0083:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0089:
            r7 = 0
            r9 = r6 & 240(0xf0, float:3.36E-43)
            r11 = 32
            if (r9 == r11) goto L_0x009a
            android.util.Log.w(r15, r12)
            r13.f41875a = r7
            r13.f41877c = r7
            r13.f41876b = r7
            goto L_0x00d1
        L_0x009a:
            int r7 = r13.f41877c
            r13.f41878d = r7
            r7 = 4
            r13.f41876b = r7
            goto L_0x00d1
        L_0x00a2:
            r7 = 31
            if (r6 <= r7) goto L_0x00b1
            android.util.Log.w(r15, r12)
            r9 = 0
            r13.f41875a = r9
            r13.f41877c = r9
            r13.f41876b = r9
            goto L_0x00d1
        L_0x00b1:
            r7 = 3
            r9 = 0
            r13.f41876b = r7
            goto L_0x00d1
        L_0x00b6:
            r9 = 0
            if (r6 == r7) goto L_0x00c3
            android.util.Log.w(r15, r12)
            r13.f41875a = r9
            r13.f41877c = r9
            r13.f41876b = r9
            goto L_0x00d1
        L_0x00c3:
            r13.f41876b = r10
            goto L_0x00d1
        L_0x00c6:
            r17 = r7
            r7 = 176(0xb0, float:2.47E-43)
            if (r6 != r7) goto L_0x00d1
            r7 = 1
            r13.f41876b = r7
            r13.f41875a = r7
        L_0x00d1:
            byte[] r7 = p717yh.C18861l.C18862a.f41874f
            r9 = 3
            r11 = 0
            r13.mo70301a(r11, r9, r7)
            r7 = 0
        L_0x00d9:
            if (r7 == 0) goto L_0x01e0
            ph.v r7 = r0.f41871i
            yh.l$a r9 = r0.f41866d
            int r11 = r9.f41878d
            java.lang.String r12 = r0.f41870h
            r12.getClass()
            byte[] r13 = r9.f41879e
            int r9 = r9.f41877c
            byte[] r9 = java.util.Arrays.copyOf(r13, r9)
            bj.q r13 = new bj.q
            int r14 = r9.length
            r13.<init>((int) r14, (byte[]) r9)
            r13.mo46908o(r11)
            r11 = 4
            r13.mo46908o(r11)
            r13.mo46906m()
            r14 = 8
            r13.mo46907n(r14)
            boolean r16 = r13.mo46900g()
            if (r16 == 0) goto L_0x0110
            r13.mo46907n(r11)
            r10 = 3
            r13.mo46907n(r10)
        L_0x0110:
            int r10 = r13.mo46901h(r11)
            java.lang.String r11 = "Invalid aspect ratio"
            r18 = r3
            r3 = 15
            if (r10 != r3) goto L_0x012e
            int r10 = r13.mo46901h(r14)
            int r14 = r13.mo46901h(r14)
            if (r14 != 0) goto L_0x012a
            android.util.Log.w(r15, r11)
            goto L_0x0139
        L_0x012a:
            float r10 = (float) r10
            float r11 = (float) r14
            float r10 = r10 / r11
            goto L_0x013b
        L_0x012e:
            float[] r14 = f41862l
            r3 = 7
            if (r10 >= r3) goto L_0x0136
            r10 = r14[r10]
            goto L_0x013b
        L_0x0136:
            android.util.Log.w(r15, r11)
        L_0x0139:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x013b:
            boolean r3 = r13.mo46900g()
            if (r3 == 0) goto L_0x0175
            r3 = 2
            r13.mo46907n(r3)
            r3 = 1
            r13.mo46907n(r3)
            boolean r3 = r13.mo46900g()
            if (r3 == 0) goto L_0x0175
            r3 = 15
            r13.mo46907n(r3)
            r13.mo46906m()
            r13.mo46907n(r3)
            r13.mo46906m()
            r13.mo46907n(r3)
            r13.mo46906m()
            r11 = 3
            r13.mo46907n(r11)
            r11 = 11
            r13.mo46907n(r11)
            r13.mo46906m()
            r13.mo46907n(r3)
            r13.mo46906m()
        L_0x0175:
            r3 = 2
            int r3 = r13.mo46901h(r3)
            if (r3 == 0) goto L_0x0181
            java.lang.String r3 = "Unhandled video object layer shape"
            android.util.Log.w(r15, r3)
        L_0x0181:
            r13.mo46906m()
            r3 = 16
            int r3 = r13.mo46901h(r3)
            r13.mo46906m()
            boolean r11 = r13.mo46900g()
            if (r11 == 0) goto L_0x01a8
            if (r3 != 0) goto L_0x019b
            java.lang.String r3 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r15, r3)
            goto L_0x01a8
        L_0x019b:
            int r3 = r3 + -1
            r11 = 0
        L_0x019e:
            if (r3 <= 0) goto L_0x01a5
            int r11 = r11 + 1
            int r3 = r3 >> 1
            goto L_0x019e
        L_0x01a5:
            r13.mo46907n(r11)
        L_0x01a8:
            r13.mo46906m()
            r3 = 13
            int r11 = r13.mo46901h(r3)
            r13.mo46906m()
            int r3 = r13.mo46901h(r3)
            r13.mo46906m()
            r13.mo46906m()
            com.google.android.exoplayer2.Format$b r13 = new com.google.android.exoplayer2.Format$b
            r13.<init>()
            r13.f31293a = r12
            java.lang.String r12 = "video/mp4v-es"
            r13.f31303k = r12
            r13.f31308p = r11
            r13.f31309q = r3
            r13.f31312t = r10
            java.util.List r3 = java.util.Collections.singletonList(r9)
            r13.f31305m = r3
            com.google.android.exoplayer2.Format r3 = r13.mo47144a()
            r7.mo47752a(r3)
            r3 = 1
            r0.f41872j = r3
            goto L_0x01e7
        L_0x01e0:
            r18 = r3
            goto L_0x01e7
        L_0x01e3:
            r18 = r3
            r17 = r7
        L_0x01e7:
            yh.l$b r3 = r0.f41868f
            r3.mo70302a(r2, r5, r4)
            yh.r r3 = r0.f41867e
            if (r3 == 0) goto L_0x0231
            if (r8 <= 0) goto L_0x01f7
            r3.mo70305a(r2, r5, r4)
            r2 = 0
            goto L_0x01f8
        L_0x01f7:
            int r2 = -r8
        L_0x01f8:
            yh.r r3 = r0.f41867e
            boolean r2 = r3.mo70306b(r2)
            if (r2 == 0) goto L_0x021e
            yh.r r2 = r0.f41867e
            byte[] r3 = r2.f42006d
            int r2 = r2.f42007e
            int r2 = p513bj.C14068n.m21686e(r2, r3)
            bj.r r3 = r0.f41864b
            int r7 = p513bj.C14049b0.f30913a
            yh.r r7 = r0.f41867e
            byte[] r7 = r7.f42006d
            r3.mo46933x(r2, r7)
            yh.f0 r2 = r0.f41863a
            long r7 = r0.f41873k
            bj.r r3 = r0.f41864b
            r2.mo70296a(r3, r7)
        L_0x021e:
            r2 = 178(0xb2, float:2.5E-43)
            if (r6 != r2) goto L_0x0231
            byte[] r2 = r1.f30986a
            int r3 = r5 + 2
            byte r2 = r2[r3]
            r7 = 1
            if (r2 != r7) goto L_0x0232
            yh.r r2 = r0.f41867e
            r2.mo70308d(r6)
            goto L_0x0232
        L_0x0231:
            r7 = 1
        L_0x0232:
            int r13 = r18 - r5
            long r2 = r0.f41869g
            long r8 = (long) r13
            long r2 = r2 - r8
            yh.l$b r5 = r0.f41868f
            boolean r8 = r0.f41872j
            int r9 = r5.f41884e
            r15 = 182(0xb6, float:2.55E-43)
            if (r9 != r15) goto L_0x0257
            if (r8 == 0) goto L_0x0257
            boolean r8 = r5.f41881b
            if (r8 == 0) goto L_0x0257
            long r8 = r5.f41886g
            long r8 = r2 - r8
            int r12 = (int) r8
            boolean r11 = r5.f41883d
            ph.v r8 = r5.f41880a
            long r9 = r5.f41887h
            r14 = 0
            r8.mo47754c(r9, r11, r12, r13, r14)
        L_0x0257:
            int r8 = r5.f41884e
            r9 = 179(0xb3, float:2.51E-43)
            if (r8 == r9) goto L_0x025f
            r5.f41886g = r2
        L_0x025f:
            yh.l$b r2 = r0.f41868f
            long r10 = r0.f41873k
            r2.f41884e = r6
            r3 = 0
            r2.f41883d = r3
            if (r6 == r15) goto L_0x026f
            if (r6 != r9) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r3 = 0
            goto L_0x0270
        L_0x026f:
            r3 = r7
        L_0x0270:
            r2.f41881b = r3
            if (r6 != r15) goto L_0x0275
            goto L_0x0276
        L_0x0275:
            r7 = 0
        L_0x0276:
            r2.f41882c = r7
            r3 = 0
            r2.f41885f = r3
            r2.f41887h = r10
            r2 = r17
            r3 = r18
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18861l.mo70281a(bj.r):void");
    }

    /* renamed from: c */
    public final void mo70282c() {
        C14068n.m21682a(this.f41865c);
        C18862a aVar = this.f41866d;
        aVar.f41875a = false;
        aVar.f41877c = 0;
        aVar.f41876b = 0;
        C18863b bVar = this.f41868f;
        if (bVar != null) {
            bVar.f41881b = false;
            bVar.f41882c = false;
            bVar.f41883d = false;
            bVar.f41884e = -1;
        }
        C18872r rVar = this.f41867e;
        if (rVar != null) {
            rVar.mo70307c();
        }
        this.f41869g = 0;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41870h = dVar.f41796e;
        dVar.mo70294b();
        C18368v r = jVar.mo4164r(dVar.f41795d, 2);
        this.f41871i = r;
        this.f41868f = new C18863b(r);
        C18854f0 f0Var = this.f41863a;
        if (f0Var != null) {
            f0Var.mo70297b(jVar, dVar);
        }
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f41873k = j;
    }
}
