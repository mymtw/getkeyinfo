package p717yh;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p513bj.C14076q;
import p513bj.C14077r;
import p644ph.C18348g;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.f */
public final class C18853f implements C18858j {

    /* renamed from: v */
    public static final byte[] f41797v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f41798a;

    /* renamed from: b */
    public final C14076q f41799b = new C14076q(7, new byte[7]);

    /* renamed from: c */
    public final C14077r f41800c = new C14077r(Arrays.copyOf(f41797v, 10));

    /* renamed from: d */
    public final String f41801d;

    /* renamed from: e */
    public String f41802e;

    /* renamed from: f */
    public C18368v f41803f;

    /* renamed from: g */
    public C18368v f41804g;

    /* renamed from: h */
    public int f41805h = 0;

    /* renamed from: i */
    public int f41806i = 0;

    /* renamed from: j */
    public int f41807j = 256;

    /* renamed from: k */
    public boolean f41808k;

    /* renamed from: l */
    public boolean f41809l;

    /* renamed from: m */
    public int f41810m = -1;

    /* renamed from: n */
    public int f41811n = -1;

    /* renamed from: o */
    public int f41812o;

    /* renamed from: p */
    public boolean f41813p;

    /* renamed from: q */
    public long f41814q = -9223372036854775807L;

    /* renamed from: r */
    public int f41815r;

    /* renamed from: s */
    public long f41816s;

    /* renamed from: t */
    public C18368v f41817t;

    /* renamed from: u */
    public long f41818u;

    public C18853f(boolean z, String str) {
        this.f41798a = z;
        this.f41801d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x029b, code lost:
        if (r10[r15] != 51) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a2, code lost:
        r0.f41812o = (r3 & 8) >> 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02aa, code lost:
        if ((r3 & 1) != 0) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ac, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02ae, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02af, code lost:
        r0.f41808k = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02b3, code lost:
        if (r0.f41809l != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b5, code lost:
        r0.f41805h = 1;
        r0.f41806i = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ba, code lost:
        r0.f41805h = 3;
        r0.f41806i = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02bf, code lost:
        r1.mo46935z(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027e, code lost:
        if (((r7 & 8) >> 3) == r6) goto L_0x029d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a2 A[EDGE_INSN: B:154:0x02a2->B:109:0x02a2 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70281a(p513bj.C14077r r24) throws com.google.android.exoplayer2.ParserException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            ph.v r2 = r0.f41803f
            r2.getClass()
            int r2 = p513bj.C14049b0.f30913a
        L_0x000b:
            int r2 = r1.f30988c
            int r3 = r1.f30987b
            int r4 = r2 - r3
            if (r4 <= 0) goto L_0x031e
            int r5 = r0.f41805h
            r6 = 7
            r7 = -1
            r8 = 13
            r9 = 256(0x100, float:3.59E-43)
            r10 = 3
            r11 = 4
            r12 = 2
            r13 = 1
            r14 = 0
            if (r5 == 0) goto L_0x01a2
            if (r5 == r13) goto L_0x0167
            r2 = 10
            if (r5 == r12) goto L_0x0139
            if (r5 == r10) goto L_0x0068
            if (r5 != r11) goto L_0x0062
            int r2 = r0.f41815r
            int r3 = r0.f41806i
            int r2 = r2 - r3
            int r2 = java.lang.Math.min(r4, r2)
            ph.v r3 = r0.f41817t
            r3.mo69899d(r2, r1)
            int r3 = r0.f41806i
            int r3 = r3 + r2
            r0.f41806i = r3
            int r2 = r0.f41815r
            if (r3 != r2) goto L_0x000b
            ph.v r15 = r0.f41817t
            long r3 = r0.f41816s
            r18 = 1
            r20 = 0
            r21 = 0
            r16 = r3
            r19 = r2
            r15.mo47754c(r16, r18, r19, r20, r21)
            long r2 = r0.f41816s
            long r4 = r0.f41818u
            long r2 = r2 + r4
            r0.f41816s = r2
            r0.f41805h = r14
            r0.f41806i = r14
            r0.f41807j = r9
            goto L_0x000b
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0068:
            boolean r3 = r0.f41808k
            r4 = 5
            if (r3 == 0) goto L_0x006f
            r3 = r6
            goto L_0x0070
        L_0x006f:
            r3 = r4
        L_0x0070:
            bj.q r5 = r0.f41799b
            java.lang.Object r5 = r5.f30985d
            byte[] r5 = (byte[]) r5
            boolean r3 = r0.mo70295b(r3, r1, r5)
            if (r3 == 0) goto L_0x000b
            bj.q r3 = r0.f41799b
            r3.mo46905l(r14)
            boolean r3 = r0.f41813p
            if (r3 != 0) goto L_0x0111
            bj.q r2 = r0.f41799b
            int r2 = r2.mo46901h(r12)
            int r2 = r2 + r13
            if (r2 == r12) goto L_0x00ac
            r3 = 61
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Detected audio object type: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = ", but assuming AAC LC."
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "AdtsReader"
            android.util.Log.w(r3, r2)
            r2 = r12
        L_0x00ac:
            bj.q r3 = r0.f41799b
            r3.mo46907n(r4)
            bj.q r3 = r0.f41799b
            int r3 = r3.mo46901h(r10)
            int r5 = r0.f41811n
            byte[] r7 = new byte[r12]
            int r2 = r2 << r10
            r2 = r2 & 248(0xf8, float:3.48E-43)
            int r9 = r5 >> 1
            r9 = r9 & r6
            r2 = r2 | r9
            byte r2 = (byte) r2
            r7[r14] = r2
            int r2 = r5 << 7
            r2 = r2 & 128(0x80, float:1.794E-43)
            int r3 = r3 << r10
            r3 = r3 & 120(0x78, float:1.68E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            r7[r13] = r2
            bj.q r2 = new bj.q
            r2.<init>((int) r12, (byte[]) r7)
            lh.a$a r2 = p611lh.C18162a.m30677c(r2, r14)
            com.google.android.exoplayer2.Format$b r3 = new com.google.android.exoplayer2.Format$b
            r3.<init>()
            java.lang.String r5 = r0.f41802e
            r3.f31293a = r5
            java.lang.String r5 = "audio/mp4a-latm"
            r3.f31303k = r5
            java.lang.String r5 = r2.f39727c
            r3.f31300h = r5
            int r5 = r2.f39726b
            r3.f31316x = r5
            int r2 = r2.f39725a
            r3.f31317y = r2
            java.util.List r2 = java.util.Collections.singletonList(r7)
            r3.f31305m = r2
            java.lang.String r2 = r0.f41801d
            r3.f31295c = r2
            com.google.android.exoplayer2.Format r2 = r3.mo47144a()
            r5 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r3 = r2.sampleRate
            long r9 = (long) r3
            long r5 = r5 / r9
            r0.f41814q = r5
            ph.v r3 = r0.f41803f
            r3.mo47752a(r2)
            r0.f41813p = r13
            goto L_0x0116
        L_0x0111:
            bj.q r3 = r0.f41799b
            r3.mo46907n(r2)
        L_0x0116:
            bj.q r2 = r0.f41799b
            r2.mo46907n(r11)
            bj.q r2 = r0.f41799b
            int r2 = r2.mo46901h(r8)
            int r2 = r2 - r12
            int r2 = r2 - r4
            boolean r3 = r0.f41808k
            if (r3 == 0) goto L_0x0129
            int r2 = r2 + -2
        L_0x0129:
            ph.v r3 = r0.f41803f
            long r4 = r0.f41814q
            r0.f41805h = r11
            r0.f41806i = r14
            r0.f41817t = r3
            r0.f41818u = r4
            r0.f41815r = r2
            goto L_0x000b
        L_0x0139:
            bj.r r3 = r0.f41800c
            byte[] r3 = r3.f30986a
            boolean r3 = r0.mo70295b(r2, r1, r3)
            if (r3 == 0) goto L_0x000b
            ph.v r3 = r0.f41804g
            bj.r r4 = r0.f41800c
            r3.mo69899d(r2, r4)
            bj.r r3 = r0.f41800c
            r4 = 6
            r3.mo46935z(r4)
            ph.v r3 = r0.f41804g
            bj.r r4 = r0.f41800c
            int r4 = r4.mo46924o()
            int r4 = r4 + r2
            r5 = 0
            r0.f41805h = r11
            r0.f41806i = r2
            r0.f41817t = r3
            r0.f41818u = r5
            r0.f41815r = r4
            goto L_0x000b
        L_0x0167:
            if (r4 != 0) goto L_0x016b
            goto L_0x000b
        L_0x016b:
            bj.q r2 = r0.f41799b
            java.lang.Object r4 = r2.f30985d
            byte[] r4 = (byte[]) r4
            byte[] r5 = r1.f30986a
            byte r3 = r5[r3]
            r4[r14] = r3
            r2.mo46905l(r12)
            bj.q r2 = r0.f41799b
            int r2 = r2.mo46901h(r11)
            int r3 = r0.f41811n
            if (r3 == r7) goto L_0x0190
            if (r2 == r3) goto L_0x0190
            r0.f41809l = r14
            r0.f41805h = r14
            r0.f41806i = r14
            r0.f41807j = r9
            goto L_0x000b
        L_0x0190:
            boolean r3 = r0.f41809l
            if (r3 != 0) goto L_0x019c
            r0.f41809l = r13
            int r3 = r0.f41812o
            r0.f41810m = r3
            r0.f41811n = r2
        L_0x019c:
            r0.f41805h = r10
            r0.f41806i = r14
            goto L_0x000b
        L_0x01a2:
            byte[] r4 = r1.f30986a
        L_0x01a4:
            if (r3 >= r2) goto L_0x0319
            int r5 = r3 + 1
            byte r3 = r4[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r15 = r0.f41807j
            r9 = 512(0x200, float:7.175E-43)
            if (r15 != r9) goto L_0x02c4
            byte r15 = (byte) r3
            r15 = r15 & 255(0xff, float:3.57E-43)
            r17 = 65280(0xff00, float:9.1477E-41)
            r15 = r15 | r17
            r18 = 65526(0xfff6, float:9.1821E-41)
            r15 = r15 & r18
            r9 = 65520(0xfff0, float:9.1813E-41)
            if (r15 != r9) goto L_0x01c6
            r15 = r13
            goto L_0x01c7
        L_0x01c6:
            r15 = r14
        L_0x01c7:
            if (r15 == 0) goto L_0x02c4
            boolean r15 = r0.f41809l
            if (r15 != 0) goto L_0x02a2
            int r15 = r5 + -2
            int r10 = r15 + 1
            r1.mo46935z(r10)
            bj.q r10 = r0.f41799b
            java.lang.Object r10 = r10.f30985d
            byte[] r10 = (byte[]) r10
            int r9 = r1.f30988c
            int r6 = r1.f30987b
            int r9 = r9 - r6
            if (r9 >= r13) goto L_0x01e3
            r6 = r14
            goto L_0x01e7
        L_0x01e3:
            r1.mo46911b(r14, r13, r10)
            r6 = r13
        L_0x01e7:
            if (r6 != 0) goto L_0x01ec
        L_0x01e9:
            r9 = r7
            goto L_0x029f
        L_0x01ec:
            bj.q r6 = r0.f41799b
            r6.mo46905l(r11)
            bj.q r6 = r0.f41799b
            int r6 = r6.mo46901h(r13)
            int r9 = r0.f41810m
            if (r9 == r7) goto L_0x01fe
            if (r6 == r9) goto L_0x01fe
            goto L_0x01e9
        L_0x01fe:
            int r9 = r0.f41811n
            if (r9 == r7) goto L_0x022d
            bj.q r9 = r0.f41799b
            java.lang.Object r9 = r9.f30985d
            byte[] r9 = (byte[]) r9
            int r10 = r1.f30988c
            int r7 = r1.f30987b
            int r10 = r10 - r7
            if (r10 >= r13) goto L_0x0211
            r7 = r14
            goto L_0x0215
        L_0x0211:
            r1.mo46911b(r14, r13, r9)
            r7 = r13
        L_0x0215:
            if (r7 != 0) goto L_0x0218
            goto L_0x0242
        L_0x0218:
            bj.q r7 = r0.f41799b
            r7.mo46905l(r12)
            bj.q r7 = r0.f41799b
            int r7 = r7.mo46901h(r11)
            int r9 = r0.f41811n
            if (r7 == r9) goto L_0x0228
            goto L_0x0254
        L_0x0228:
            int r7 = r15 + 2
            r1.mo46935z(r7)
        L_0x022d:
            bj.q r7 = r0.f41799b
            java.lang.Object r7 = r7.f30985d
            byte[] r7 = (byte[]) r7
            int r9 = r1.f30988c
            int r10 = r1.f30987b
            int r9 = r9 - r10
            if (r9 >= r11) goto L_0x023c
            r7 = r14
            goto L_0x0240
        L_0x023c:
            r1.mo46911b(r14, r11, r7)
            r7 = r13
        L_0x0240:
            if (r7 != 0) goto L_0x0244
        L_0x0242:
            r9 = -1
            goto L_0x029d
        L_0x0244:
            bj.q r7 = r0.f41799b
            r9 = 14
            r7.mo46905l(r9)
            bj.q r7 = r0.f41799b
            int r7 = r7.mo46901h(r8)
            r9 = 7
            if (r7 >= r9) goto L_0x0256
        L_0x0254:
            r9 = -1
            goto L_0x029f
        L_0x0256:
            byte[] r10 = r1.f30986a
            int r8 = r1.f30988c
            int r15 = r15 + r7
            if (r15 < r8) goto L_0x025e
            goto L_0x0242
        L_0x025e:
            byte r7 = r10[r15]
            r9 = -1
            if (r7 != r9) goto L_0x0281
            int r15 = r15 + 1
            if (r15 != r8) goto L_0x0268
            goto L_0x029d
        L_0x0268:
            byte r7 = r10[r15]
            r8 = r7 & 255(0xff, float:3.57E-43)
            r8 = r8 | r17
            r8 = r8 & r18
            r10 = 65520(0xfff0, float:9.1813E-41)
            if (r8 != r10) goto L_0x0277
            r8 = r13
            goto L_0x0278
        L_0x0277:
            r8 = r14
        L_0x0278:
            if (r8 == 0) goto L_0x029f
            r7 = r7 & 8
            r8 = 3
            int r7 = r7 >> r8
            if (r7 != r6) goto L_0x029f
            goto L_0x029d
        L_0x0281:
            r6 = 73
            if (r7 == r6) goto L_0x0286
            goto L_0x029f
        L_0x0286:
            int r6 = r15 + 1
            if (r6 != r8) goto L_0x028b
            goto L_0x029d
        L_0x028b:
            byte r6 = r10[r6]
            r7 = 68
            if (r6 == r7) goto L_0x0292
            goto L_0x029f
        L_0x0292:
            int r15 = r15 + 2
            if (r15 != r8) goto L_0x0297
            goto L_0x029d
        L_0x0297:
            byte r6 = r10[r15]
            r7 = 51
            if (r6 != r7) goto L_0x029f
        L_0x029d:
            r6 = r13
            goto L_0x02a0
        L_0x029f:
            r6 = r14
        L_0x02a0:
            if (r6 == 0) goto L_0x02c5
        L_0x02a2:
            r2 = r3 & 8
            r4 = 3
            int r2 = r2 >> r4
            r0.f41812o = r2
            r2 = r3 & 1
            if (r2 != 0) goto L_0x02ae
            r2 = r13
            goto L_0x02af
        L_0x02ae:
            r2 = r14
        L_0x02af:
            r0.f41808k = r2
            boolean r2 = r0.f41809l
            if (r2 != 0) goto L_0x02ba
            r0.f41805h = r13
            r0.f41806i = r14
            goto L_0x02bf
        L_0x02ba:
            r2 = 3
            r0.f41805h = r2
            r0.f41806i = r14
        L_0x02bf:
            r1.mo46935z(r5)
            goto L_0x000b
        L_0x02c4:
            r9 = r7
        L_0x02c5:
            int r6 = r0.f41807j
            r3 = r3 | r6
            r7 = 329(0x149, float:4.61E-43)
            if (r3 == r7) goto L_0x0306
            r7 = 511(0x1ff, float:7.16E-43)
            if (r3 == r7) goto L_0x02fe
            r7 = 836(0x344, float:1.171E-42)
            if (r3 == r7) goto L_0x02f6
            r7 = 1075(0x433, float:1.506E-42)
            if (r3 == r7) goto L_0x02e5
            r7 = 256(0x100, float:3.59E-43)
            if (r6 == r7) goto L_0x02e3
            r0.f41807j = r7
            int r5 = r5 + -1
            r3 = r5
            r6 = 3
            goto L_0x030e
        L_0x02e3:
            r6 = 3
            goto L_0x030d
        L_0x02e5:
            r0.f41805h = r12
            r6 = 3
            r0.f41806i = r6
            r0.f41815r = r14
            bj.r r2 = r0.f41800c
            r2.mo46935z(r14)
            r1.mo46935z(r5)
            goto L_0x000b
        L_0x02f6:
            r6 = 3
            r7 = 256(0x100, float:3.59E-43)
            r3 = 1024(0x400, float:1.435E-42)
            r0.f41807j = r3
            goto L_0x030d
        L_0x02fe:
            r3 = 512(0x200, float:7.175E-43)
            r6 = 3
            r7 = 256(0x100, float:3.59E-43)
            r0.f41807j = r3
            goto L_0x030d
        L_0x0306:
            r6 = 3
            r7 = 256(0x100, float:3.59E-43)
            r3 = 768(0x300, float:1.076E-42)
            r0.f41807j = r3
        L_0x030d:
            r3 = r5
        L_0x030e:
            r10 = r6
            r6 = 7
            r8 = 13
            r22 = r9
            r9 = r7
            r7 = r22
            goto L_0x01a4
        L_0x0319:
            r1.mo46935z(r3)
            goto L_0x000b
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18853f.mo70281a(bj.r):void");
    }

    /* renamed from: b */
    public final boolean mo70295b(int i, C14077r rVar, byte[] bArr) {
        int min = Math.min(rVar.f30988c - rVar.f30987b, i - this.f41806i);
        rVar.mo46911b(this.f41806i, min, bArr);
        int i2 = this.f41806i + min;
        this.f41806i = i2;
        return i2 == i;
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41809l = false;
        this.f41805h = 0;
        this.f41806i = 0;
        this.f41807j = 256;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41802e = dVar.f41796e;
        dVar.mo70294b();
        C18368v r = jVar.mo4164r(dVar.f41795d, 1);
        this.f41803f = r;
        this.f41817t = r;
        if (this.f41798a) {
            dVar.mo70293a();
            dVar.mo70294b();
            C18368v r2 = jVar.mo4164r(dVar.f41795d, 5);
            this.f41804g = r2;
            Format.C14176b bVar = new Format.C14176b();
            dVar.mo70294b();
            bVar.f31293a = dVar.f41796e;
            bVar.f31303k = "application/id3";
            r2.mo47752a(bVar.mo47144a());
            return;
        }
        this.f41804g = new C18348g();
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f41816s = j;
    }
}
