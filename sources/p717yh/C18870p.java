package p717yh;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import p513bj.C14076q;
import p513bj.C14077r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.p */
public final class C18870p implements C18858j {

    /* renamed from: a */
    public final String f41970a;

    /* renamed from: b */
    public final C14077r f41971b;

    /* renamed from: c */
    public final C14076q f41972c;

    /* renamed from: d */
    public C18368v f41973d;

    /* renamed from: e */
    public String f41974e;

    /* renamed from: f */
    public Format f41975f;

    /* renamed from: g */
    public int f41976g;

    /* renamed from: h */
    public int f41977h;

    /* renamed from: i */
    public int f41978i;

    /* renamed from: j */
    public int f41979j;

    /* renamed from: k */
    public long f41980k;

    /* renamed from: l */
    public boolean f41981l;

    /* renamed from: m */
    public int f41982m;

    /* renamed from: n */
    public int f41983n;

    /* renamed from: o */
    public int f41984o;

    /* renamed from: p */
    public boolean f41985p;

    /* renamed from: q */
    public long f41986q;

    /* renamed from: r */
    public int f41987r;

    /* renamed from: s */
    public long f41988s;

    /* renamed from: t */
    public int f41989t;

    /* renamed from: u */
    public String f41990u;

    public C18870p(String str) {
        this.f41970a = str;
        C14077r rVar = new C14077r((int) RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
        this.f41971b = rVar;
        byte[] bArr = rVar.f30986a;
        this.f41972c = new C14076q(bArr.length, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018d, code lost:
        if (r14.f41981l == false) goto L_0x01e9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70281a(p513bj.C14077r r15) throws com.google.android.exoplayer2.ParserException {
        /*
            r14 = this;
            ph.v r0 = r14.f41973d
            p513bj.C14075p.m21696h(r0)
        L_0x0005:
            int r0 = r15.f30988c
            int r1 = r15.f30987b
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0250
            int r1 = r14.f41976g
            r2 = 86
            r3 = 1
            if (r1 == 0) goto L_0x0246
            r4 = 0
            r5 = 2
            if (r1 == r3) goto L_0x0230
            r2 = 3
            r6 = 8
            if (r1 == r5) goto L_0x0207
            if (r1 != r2) goto L_0x0201
            int r1 = r14.f41978i
            int r7 = r14.f41977h
            int r1 = r1 - r7
            int r0 = java.lang.Math.min(r0, r1)
            bj.q r1 = r14.f41972c
            java.lang.Object r1 = r1.f30985d
            byte[] r1 = (byte[]) r1
            int r7 = r14.f41977h
            r15.mo46911b(r7, r0, r1)
            int r1 = r14.f41977h
            int r1 = r1 + r0
            r14.f41977h = r1
            int r0 = r14.f41978i
            if (r1 != r0) goto L_0x0005
            bj.q r0 = r14.f41972c
            r0.mo46905l(r4)
            bj.q r0 = r14.f41972c
            boolean r1 = r0.mo46900g()
            if (r1 != 0) goto L_0x018b
            r14.f41981l = r3
            int r1 = r0.mo46901h(r3)
            if (r1 != r3) goto L_0x0055
            int r7 = r0.mo46901h(r3)
            goto L_0x0056
        L_0x0055:
            r7 = r4
        L_0x0056:
            r14.f41982m = r7
            if (r7 != 0) goto L_0x0185
            if (r1 != r3) goto L_0x0065
            int r7 = r0.mo46901h(r5)
            int r7 = r7 + r3
            int r7 = r7 * r6
            r0.mo46901h(r7)
        L_0x0065:
            boolean r7 = r0.mo46900g()
            if (r7 == 0) goto L_0x017f
            r7 = 6
            int r8 = r0.mo46901h(r7)
            r14.f41983n = r8
            r8 = 4
            int r9 = r0.mo46901h(r8)
            int r10 = r0.mo46901h(r2)
            if (r9 != 0) goto L_0x0179
            if (r10 != 0) goto L_0x0179
            if (r1 != 0) goto L_0x00eb
            int r9 = r0.f30982a
            int r9 = r9 * r6
            int r10 = r0.f30983b
            int r9 = r9 + r10
            int r10 = r0.mo46895b()
            lh.a$a r11 = p611lh.C18162a.m30677c(r0, r3)
            java.lang.String r12 = r11.f39727c
            r14.f41990u = r12
            int r12 = r11.f39725a
            r14.f41987r = r12
            int r11 = r11.f39726b
            r14.f41989t = r11
            int r11 = r0.mo46895b()
            int r10 = r10 - r11
            r0.mo46905l(r9)
            int r9 = r10 + 7
            int r9 = r9 / r6
            byte[] r9 = new byte[r9]
            r0.mo46902i(r10, r9)
            com.google.android.exoplayer2.Format$b r10 = new com.google.android.exoplayer2.Format$b
            r10.<init>()
            java.lang.String r11 = r14.f41974e
            r10.f31293a = r11
            java.lang.String r11 = "audio/mp4a-latm"
            r10.f31303k = r11
            java.lang.String r11 = r14.f41990u
            r10.f31300h = r11
            int r11 = r14.f41989t
            r10.f31316x = r11
            int r11 = r14.f41987r
            r10.f31317y = r11
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.f31305m = r9
            java.lang.String r9 = r14.f41970a
            r10.f31295c = r9
            com.google.android.exoplayer2.Format r9 = r10.mo47144a()
            com.google.android.exoplayer2.Format r10 = r14.f41975f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x0114
            r14.f41975f = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.sampleRate
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.f41988s = r10
            ph.v r10 = r14.f41973d
            r10.mo47752a(r9)
            goto L_0x0114
        L_0x00eb:
            int r9 = r0.mo46901h(r5)
            int r9 = r9 + r3
            int r9 = r9 * r6
            int r9 = r0.mo46901h(r9)
            long r9 = (long) r9
            int r9 = (int) r9
            int r10 = r0.mo46895b()
            lh.a$a r11 = p611lh.C18162a.m30677c(r0, r3)
            java.lang.String r12 = r11.f39727c
            r14.f41990u = r12
            int r12 = r11.f39725a
            r14.f41987r = r12
            int r11 = r11.f39726b
            r14.f41989t = r11
            int r11 = r0.mo46895b()
            int r10 = r10 - r11
            int r9 = r9 - r10
            r0.mo46907n(r9)
        L_0x0114:
            int r9 = r0.mo46901h(r2)
            r14.f41984o = r9
            if (r9 == 0) goto L_0x013f
            if (r9 == r3) goto L_0x0139
            if (r9 == r2) goto L_0x0135
            if (r9 == r8) goto L_0x0135
            r2 = 5
            if (r9 == r2) goto L_0x0135
            if (r9 == r7) goto L_0x0131
            r2 = 7
            if (r9 != r2) goto L_0x012b
            goto L_0x0131
        L_0x012b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0131:
            r0.mo46907n(r3)
            goto L_0x0142
        L_0x0135:
            r0.mo46907n(r7)
            goto L_0x0142
        L_0x0139:
            r2 = 9
            r0.mo46907n(r2)
            goto L_0x0142
        L_0x013f:
            r0.mo46907n(r6)
        L_0x0142:
            boolean r2 = r0.mo46900g()
            r14.f41985p = r2
            r7 = 0
            r14.f41986q = r7
            if (r2 == 0) goto L_0x016f
            if (r1 != r3) goto L_0x015e
            int r1 = r0.mo46901h(r5)
            int r1 = r1 + r3
            int r1 = r1 * r6
            int r1 = r0.mo46901h(r1)
            long r1 = (long) r1
            r14.f41986q = r1
            goto L_0x016f
        L_0x015e:
            boolean r1 = r0.mo46900g()
            long r2 = r14.f41986q
            long r2 = r2 << r6
            int r5 = r0.mo46901h(r6)
            long r7 = (long) r5
            long r2 = r2 + r7
            r14.f41986q = r2
            if (r1 != 0) goto L_0x015e
        L_0x016f:
            boolean r1 = r0.mo46900g()
            if (r1 == 0) goto L_0x0190
            r0.mo46907n(r6)
            goto L_0x0190
        L_0x0179:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x017f:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x0185:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x018b:
            boolean r1 = r14.f41981l
            if (r1 != 0) goto L_0x0190
            goto L_0x01e9
        L_0x0190:
            int r1 = r14.f41982m
            if (r1 != 0) goto L_0x01fb
            int r1 = r14.f41983n
            if (r1 != 0) goto L_0x01f5
            int r1 = r14.f41984o
            if (r1 != 0) goto L_0x01ef
            r1 = r4
        L_0x019d:
            int r2 = r0.mo46901h(r6)
            int r11 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01ed
            int r1 = r0.f30982a
            int r1 = r1 * r6
            int r2 = r0.f30983b
            int r1 = r1 + r2
            r2 = r1 & 7
            if (r2 != 0) goto L_0x01b9
            bj.r r2 = r14.f41971b
            int r1 = r1 >> 3
            r2.mo46935z(r1)
            goto L_0x01c7
        L_0x01b9:
            bj.r r1 = r14.f41971b
            byte[] r1 = r1.f30986a
            int r2 = r11 * 8
            r0.mo46902i(r2, r1)
            bj.r r1 = r14.f41971b
            r1.mo46935z(r4)
        L_0x01c7:
            ph.v r1 = r14.f41973d
            bj.r r2 = r14.f41971b
            r1.mo69899d(r11, r2)
            ph.v r7 = r14.f41973d
            long r8 = r14.f41980k
            r10 = 1
            r12 = 0
            r13 = 0
            r7.mo47754c(r8, r10, r11, r12, r13)
            long r1 = r14.f41980k
            long r5 = r14.f41988s
            long r1 = r1 + r5
            r14.f41980k = r1
            boolean r1 = r14.f41985p
            if (r1 == 0) goto L_0x01e9
            long r1 = r14.f41986q
            int r1 = (int) r1
            r0.mo46907n(r1)
        L_0x01e9:
            r14.f41976g = r4
            goto L_0x0005
        L_0x01ed:
            r1 = r11
            goto L_0x019d
        L_0x01ef:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x01f5:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x01fb:
            com.google.android.exoplayer2.ParserException r15 = new com.google.android.exoplayer2.ParserException
            r15.<init>()
            throw r15
        L_0x0201:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0207:
            int r0 = r14.f41979j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r6
            int r1 = r15.mo46925p()
            r0 = r0 | r1
            r14.f41978i = r0
            bj.r r1 = r14.f41971b
            byte[] r3 = r1.f30986a
            int r3 = r3.length
            if (r0 <= r3) goto L_0x022a
            r1.mo46932w(r0)
            bj.q r0 = r14.f41972c
            bj.r r1 = r14.f41971b
            byte[] r1 = r1.f30986a
            r0.getClass()
            int r3 = r1.length
            r0.mo46904k(r3, r1)
        L_0x022a:
            r14.f41977h = r4
            r14.f41976g = r2
            goto L_0x0005
        L_0x0230:
            int r0 = r15.mo46925p()
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r1 != r3) goto L_0x0240
            r14.f41979j = r0
            r14.f41976g = r5
            goto L_0x0005
        L_0x0240:
            if (r0 == r2) goto L_0x0005
            r14.f41976g = r4
            goto L_0x0005
        L_0x0246:
            int r0 = r15.mo46925p()
            if (r0 != r2) goto L_0x0005
            r14.f41976g = r3
            goto L_0x0005
        L_0x0250:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18870p.mo70281a(bj.r):void");
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41976g = 0;
        this.f41981l = false;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41973d = jVar.mo4164r(dVar.f41795d, 1);
        dVar.mo70294b();
        this.f41974e = dVar.f41796e;
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f41980k = j;
    }
}
