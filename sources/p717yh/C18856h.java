package p717yh;

import com.google.android.exoplayer2.Format;
import p513bj.C14077r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.h */
public final class C18856h implements C18858j {

    /* renamed from: a */
    public final C14077r f41823a = new C14077r(new byte[18]);

    /* renamed from: b */
    public final String f41824b;

    /* renamed from: c */
    public String f41825c;

    /* renamed from: d */
    public C18368v f41826d;

    /* renamed from: e */
    public int f41827e = 0;

    /* renamed from: f */
    public int f41828f;

    /* renamed from: g */
    public int f41829g;

    /* renamed from: h */
    public long f41830h;

    /* renamed from: i */
    public Format f41831i;

    /* renamed from: j */
    public int f41832j;

    /* renamed from: k */
    public long f41833k;

    public C18856h(String str) {
        this.f41824b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70281a(p513bj.C14077r r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            ph.v r2 = r0.f41826d
            p513bj.C14075p.m21696h(r2)
        L_0x0009:
            int r2 = r1.f30988c
            int r3 = r1.f30987b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x02cb
            int r3 = r0.f41827e
            r4 = 1
            r6 = 8
            r7 = 2
            r8 = 0
            if (r3 == 0) goto L_0x026b
            if (r3 == r4) goto L_0x004e
            if (r3 != r7) goto L_0x0048
            int r3 = r0.f41832j
            int r4 = r0.f41828f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            ph.v r3 = r0.f41826d
            r3.mo69899d(r2, r1)
            int r3 = r0.f41828f
            int r3 = r3 + r2
            r0.f41828f = r3
            int r13 = r0.f41832j
            if (r3 != r13) goto L_0x0009
            ph.v r9 = r0.f41826d
            long r10 = r0.f41833k
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo47754c(r10, r12, r13, r14, r15)
            long r2 = r0.f41833k
            long r4 = r0.f41830h
            long r2 = r2 + r4
            r0.f41833k = r2
            r0.f41827e = r8
            goto L_0x0009
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x004e:
            bj.r r3 = r0.f41823a
            byte[] r3 = r3.f30986a
            int r10 = r0.f41828f
            r11 = 18
            int r10 = 18 - r10
            int r2 = java.lang.Math.min(r2, r10)
            int r10 = r0.f41828f
            r1.mo46911b(r10, r2, r3)
            int r3 = r0.f41828f
            int r3 = r3 + r2
            r0.f41828f = r3
            if (r3 != r11) goto L_0x006a
            r2 = r4
            goto L_0x006b
        L_0x006a:
            r2 = r8
        L_0x006b:
            if (r2 == 0) goto L_0x0009
            bj.r r2 = r0.f41823a
            byte[] r2 = r2.f30986a
            com.google.android.exoplayer2.Format r3 = r0.f41831i
            r10 = 14
            r13 = 31
            r14 = -2
            r11 = -1
            if (r3 != 0) goto L_0x01a1
            java.lang.String r3 = r0.f41825c
            java.lang.String r15 = r0.f41824b
            byte r9 = r2[r8]
            r5 = 127(0x7f, float:1.78E-43)
            if (r9 != r5) goto L_0x008d
            bj.q r5 = new bj.q
            int r9 = r2.length
            r5.<init>((int) r9, (byte[]) r2)
            goto L_0x0144
        L_0x008d:
            int r5 = r2.length
            byte[] r5 = java.util.Arrays.copyOf(r2, r5)
            byte r9 = r5[r8]
            if (r9 == r14) goto L_0x009b
            if (r9 != r11) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r9 = r8
            goto L_0x009c
        L_0x009b:
            r9 = r4
        L_0x009c:
            if (r9 == 0) goto L_0x00b0
            r9 = r8
        L_0x009f:
            int r14 = r5.length
            int r14 = r14 - r4
            if (r9 >= r14) goto L_0x00b0
            byte r14 = r5[r9]
            int r16 = r9 + 1
            byte r17 = r5[r16]
            r5[r9] = r17
            r5[r16] = r14
            int r9 = r9 + 2
            goto L_0x009f
        L_0x00b0:
            bj.q r9 = new bj.q
            int r14 = r5.length
            r9.<init>((int) r14, (byte[]) r5)
            byte r14 = r5[r8]
            if (r14 != r13) goto L_0x013f
            bj.q r14 = new bj.q
            int r13 = r5.length
            r14.<init>((int) r13, (byte[]) r5)
        L_0x00c0:
            int r13 = r14.mo46895b()
            r8 = 16
            if (r13 < r8) goto L_0x013f
            r14.mo46907n(r7)
            int r8 = r14.mo46901h(r10)
            r8 = r8 & 16383(0x3fff, float:2.2957E-41)
            int r13 = r9.f30983b
            int r13 = 8 - r13
            int r13 = java.lang.Math.min(r13, r10)
            int r7 = r9.f30983b
            int r18 = 8 - r7
            int r18 = r18 - r13
            r19 = 65280(0xff00, float:9.1477E-41)
            int r7 = r19 >> r7
            int r19 = r4 << r18
            int r19 = r19 + -1
            r7 = r7 | r19
            java.lang.Object r12 = r9.f30985d
            byte[] r12 = (byte[]) r12
            int r11 = r9.f30982a
            byte r21 = r12[r11]
            r7 = r7 & r21
            byte r7 = (byte) r7
            r12[r11] = r7
            int r13 = 14 - r13
            int r21 = r8 >>> r13
            int r18 = r21 << r18
            r7 = r7 | r18
            byte r7 = (byte) r7
            r12[r11] = r7
            int r11 = r11 + r4
        L_0x0103:
            if (r13 <= r6) goto L_0x0116
            java.lang.Object r7 = r9.f30985d
            byte[] r7 = (byte[]) r7
            int r12 = r11 + 1
            int r13 = r13 + -8
            int r6 = r8 >>> r13
            byte r6 = (byte) r6
            r7[r11] = r6
            r11 = r12
            r6 = 8
            goto L_0x0103
        L_0x0116:
            int r6 = 8 - r13
            java.lang.Object r7 = r9.f30985d
            byte[] r7 = (byte[]) r7
            byte r12 = r7[r11]
            int r21 = r4 << r6
            r20 = -1
            int r21 = r21 + -1
            r12 = r12 & r21
            byte r12 = (byte) r12
            r7[r11] = r12
            int r13 = r4 << r13
            int r13 = r13 - r4
            r8 = r8 & r13
            int r6 = r8 << r6
            r6 = r6 | r12
            byte r6 = (byte) r6
            r7[r11] = r6
            r9.mo46907n(r10)
            r9.mo46894a()
            r6 = 8
            r7 = 2
            r8 = 0
            r11 = -1
            goto L_0x00c0
        L_0x013f:
            int r6 = r5.length
            r9.mo46904k(r6, r5)
            r5 = r9
        L_0x0144:
            r6 = 60
            r5.mo46907n(r6)
            r6 = 6
            int r7 = r5.mo46901h(r6)
            int[] r6 = p611lh.C18181q.f39783a
            r6 = r6[r7]
            r7 = 4
            int r8 = r5.mo46901h(r7)
            int[] r7 = p611lh.C18181q.f39784b
            r7 = r7[r8]
            r8 = 5
            int r9 = r5.mo46901h(r8)
            int[] r8 = p611lh.C18181q.f39785c
            r11 = 29
            if (r9 < r11) goto L_0x0169
            r8 = -1
            r9 = 2
            goto L_0x016f
        L_0x0169:
            r8 = r8[r9]
            int r8 = r8 * 1000
            r9 = 2
            int r8 = r8 / r9
        L_0x016f:
            r11 = 10
            r5.mo46907n(r11)
            int r5 = r5.mo46901h(r9)
            if (r5 <= 0) goto L_0x017c
            r5 = r4
            goto L_0x017d
        L_0x017c:
            r5 = 0
        L_0x017d:
            int r6 = r6 + r5
            com.google.android.exoplayer2.Format$b r5 = new com.google.android.exoplayer2.Format$b
            r5.<init>()
            r5.f31293a = r3
            java.lang.String r3 = "audio/vnd.dts"
            r5.f31303k = r3
            r5.f31298f = r8
            r5.f31316x = r6
            r5.f31317y = r7
            r3 = 0
            r5.f31306n = r3
            r5.f31295c = r15
            com.google.android.exoplayer2.Format r3 = r5.mo47144a()
            r0.f41831i = r3
            ph.v r5 = r0.f41826d
            r5.mo47752a(r3)
            r3 = 0
            goto L_0x01a2
        L_0x01a1:
            r3 = r8
        L_0x01a2:
            byte r5 = r2[r3]
            r3 = 7
            r6 = -2
            if (r5 == r6) goto L_0x01ef
            r6 = -1
            if (r5 == r6) goto L_0x01d4
            r6 = 31
            if (r5 == r6) goto L_0x01c1
            r6 = 5
            byte r7 = r2[r6]
            r6 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            r7 = 6
            byte r8 = r2[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 4
            int r8 = r8 << r9
            r6 = r6 | r8
            byte r8 = r2[r3]
            goto L_0x01ff
        L_0x01c1:
            r6 = 3
            r7 = 6
            r9 = 4
            byte r8 = r2[r7]
            r6 = r6 & r8
            int r6 = r6 << 12
            byte r7 = r2[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r9
            r6 = r6 | r7
            r7 = 8
            byte r7 = r2[r7]
            goto L_0x01e6
        L_0x01d4:
            r6 = 3
            r9 = 4
            byte r7 = r2[r3]
            r6 = r6 & r7
            int r6 = r6 << 12
            r7 = 6
            byte r8 = r2[r7]
            r7 = r8 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r9
            r6 = r6 | r7
            r7 = 9
            byte r7 = r2[r7]
        L_0x01e6:
            r8 = 60
            r7 = r7 & r8
            r8 = 2
            int r7 = r7 >> r8
            r6 = r6 | r7
            int r6 = r6 + r4
            r7 = r4
            goto L_0x0205
        L_0x01ef:
            r9 = 4
            byte r6 = r2[r9]
            r7 = 3
            r6 = r6 & r7
            int r6 = r6 << 12
            byte r7 = r2[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << r9
            r6 = r6 | r7
            r7 = 6
            byte r8 = r2[r7]
        L_0x01ff:
            r7 = r8 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r9
            r6 = r6 | r7
            int r6 = r6 + r4
            r7 = 0
        L_0x0205:
            if (r7 == 0) goto L_0x020a
            int r6 = r6 * 16
            int r6 = r6 / r10
        L_0x020a:
            r0.f41832j = r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            r8 = -2
            if (r5 == r8) goto L_0x023a
            r8 = -1
            if (r5 == r8) goto L_0x022d
            r8 = 31
            if (r5 == r8) goto L_0x0223
            r5 = 4
            byte r3 = r2[r5]
            r3 = r3 & r4
            r8 = 6
            int r3 = r3 << r8
            r9 = 5
            byte r2 = r2[r9]
            goto L_0x0243
        L_0x0223:
            r5 = 4
            r8 = 6
            r9 = 5
            byte r9 = r2[r9]
            r3 = r3 & r9
            int r3 = r3 << r5
            byte r2 = r2[r8]
            goto L_0x0236
        L_0x022d:
            r5 = 4
            byte r8 = r2[r5]
            r8 = r8 & r3
            int r5 = r8 << 4
            byte r2 = r2[r3]
            r3 = r5
        L_0x0236:
            r5 = 60
            r2 = r2 & r5
            goto L_0x0245
        L_0x023a:
            r3 = 5
            r5 = 4
            r8 = 6
            byte r3 = r2[r3]
            r3 = r3 & r4
            int r3 = r3 << r8
            byte r2 = r2[r5]
        L_0x0243:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x0245:
            r5 = 2
            int r2 = r2 >> r5
            r2 = r2 | r3
            int r2 = r2 + r4
            int r2 = r2 * 32
            long r2 = (long) r2
            long r2 = r2 * r6
            com.google.android.exoplayer2.Format r4 = r0.f41831i
            int r4 = r4.sampleRate
            long r4 = (long) r4
            long r2 = r2 / r4
            int r2 = (int) r2
            long r2 = (long) r2
            r0.f41830h = r2
            bj.r r2 = r0.f41823a
            r3 = 0
            r2.mo46935z(r3)
            ph.v r2 = r0.f41826d
            bj.r r3 = r0.f41823a
            r4 = 18
            r2.mo69899d(r4, r3)
            r2 = 2
            r0.f41827e = r2
            goto L_0x0009
        L_0x026b:
            int r2 = r1.f30988c
            int r3 = r1.f30987b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x02c3
            int r2 = r0.f41829g
            r3 = 8
            int r2 = r2 << r3
            r0.f41829g = r2
            int r5 = r23.mo46925p()
            r2 = r2 | r5
            r0.f41829g = r2
            r5 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r5) goto L_0x0297
            r5 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r5) goto L_0x0297
            r5 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r5) goto L_0x0297
            r5 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r5) goto L_0x0295
            goto L_0x0297
        L_0x0295:
            r5 = 0
            goto L_0x0298
        L_0x0297:
            r5 = r4
        L_0x0298:
            if (r5 == 0) goto L_0x026b
            bj.r r3 = r0.f41823a
            byte[] r3 = r3.f30986a
            int r5 = r2 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6 = 0
            r3[r6] = r5
            int r5 = r2 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r5 = r2 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6 = 2
            r3[r6] = r5
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r5 = 3
            r3[r5] = r2
            r2 = 4
            r0.f41828f = r2
            r7 = 0
            r0.f41829g = r7
            r8 = r4
            goto L_0x02c5
        L_0x02c3:
            r7 = 0
            r8 = r7
        L_0x02c5:
            if (r8 == 0) goto L_0x0009
            r0.f41827e = r4
            goto L_0x0009
        L_0x02cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18856h.mo70281a(bj.r):void");
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41827e = 0;
        this.f41828f = 0;
        this.f41829g = 0;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41825c = dVar.f41796e;
        dVar.mo70294b();
        this.f41826d = jVar.mo4164r(dVar.f41795d, 1);
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f41833k = j;
    }
}
