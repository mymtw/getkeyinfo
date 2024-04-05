package p717yh;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import p513bj.C14075p;
import p513bj.C14076q;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18363s;
import p644ph.C18364t;
import p717yh.C18848e0;

/* renamed from: yh.e */
public final class C18847e implements C18349h {

    /* renamed from: a */
    public final C18853f f41778a = new C18853f(true, (String) null);

    /* renamed from: b */
    public final C14077r f41779b = new C14077r((int) RecyclerView.C3084b0.FLAG_MOVED);

    /* renamed from: c */
    public final C14077r f41780c;

    /* renamed from: d */
    public final C14076q f41781d;

    /* renamed from: e */
    public C18351j f41782e;

    /* renamed from: f */
    public long f41783f;

    /* renamed from: g */
    public long f41784g = -1;

    /* renamed from: h */
    public boolean f41785h;

    /* renamed from: i */
    public boolean f41786i;

    public C18847e(int i) {
        C14077r rVar = new C14077r(10);
        this.f41780c = rVar;
        byte[] bArr = rVar.f30986a;
        this.f41781d = new C14076q(bArr.length, bArr);
    }

    /* renamed from: a */
    public final int mo47757a(C18350i iVar, C18363s sVar) throws IOException {
        C14075p.m21696h(this.f41782e);
        int read = ((C18346e) iVar).read(this.f41779b.f30986a, 0, RecyclerView.C3084b0.FLAG_MOVED);
        boolean z = read == -1;
        if (!this.f41786i) {
            this.f41782e.mo4162l(new C18364t.C18366b(-9223372036854775807L));
            this.f41786i = true;
        }
        if (z) {
            return -1;
        }
        this.f41779b.mo46935z(0);
        this.f41779b.mo46934y(read);
        if (!this.f41785h) {
            this.f41778a.f41816s = this.f41783f;
            this.f41785h = true;
        }
        this.f41778a.mo70281a(this.f41779b);
        return 0;
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f41782e = jVar;
        this.f41778a.mo70283d(jVar, new C18848e0.C18852d(0, 1));
        jVar.mo4163p();
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        this.f41785h = false;
        C18853f fVar = this.f41778a;
        fVar.f41809l = false;
        fVar.f41805h = 0;
        fVar.f41806i = 0;
        fVar.f41807j = 256;
        this.f41783f = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r9.f40296f = 0;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        if ((r2 - r1) < 8192) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        return false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47761f(p644ph.C18350i r9) throws java.io.IOException {
        /*
            r8 = this;
            ph.e r9 = (p644ph.C18346e) r9
            r0 = 0
            r1 = r0
        L_0x0004:
            bj.r r2 = r8.f41780c
            byte[] r2 = r2.f30986a
            r3 = 10
            r9.mo69872c(r2, r0, r3, r0)
            bj.r r2 = r8.f41780c
            r2.mo46935z(r0)
            bj.r r2 = r8.f41780c
            int r2 = r2.mo46927r()
            r3 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r3) goto L_0x008a
            r9.f40296f = r0
            r9.mo69880k(r1, r0)
            long r2 = r8.f41784g
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x002d
            long r2 = (long) r1
            r8.f41784g = r2
        L_0x002d:
            r2 = r1
        L_0x002e:
            r3 = r0
            r4 = r3
        L_0x0030:
            bj.r r5 = r8.f41780c
            byte[] r5 = r5.f30986a
            r6 = 2
            r9.mo69872c(r5, r0, r6, r0)
            bj.r r5 = r8.f41780c
            r5.mo46935z(r0)
            bj.r r5 = r8.f41780c
            int r5 = r5.mo46930u()
            r6 = 65526(0xfff6, float:9.1821E-41)
            r5 = r5 & r6
            r6 = 65520(0xfff0, float:9.1813E-41)
            r7 = 1
            if (r5 != r6) goto L_0x004f
            r5 = r7
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            if (r5 != 0) goto L_0x0060
            r9.f40296f = r0
            int r2 = r2 + r7
            int r3 = r2 - r1
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r3 < r4) goto L_0x005c
            return r0
        L_0x005c:
            r9.mo69880k(r2, r0)
            goto L_0x002e
        L_0x0060:
            int r3 = r3 + r7
            r5 = 4
            if (r3 < r5) goto L_0x0069
            r6 = 188(0xbc, float:2.63E-43)
            if (r4 <= r6) goto L_0x0069
            return r7
        L_0x0069:
            bj.r r6 = r8.f41780c
            byte[] r6 = r6.f30986a
            r9.mo69872c(r6, r0, r5, r0)
            bj.q r5 = r8.f41781d
            r6 = 14
            r5.mo46905l(r6)
            bj.q r5 = r8.f41781d
            r6 = 13
            int r5 = r5.mo46901h(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0083
            return r0
        L_0x0083:
            int r6 = r5 + -6
            r9.mo69880k(r6, r0)
            int r4 = r4 + r5
            goto L_0x0030
        L_0x008a:
            bj.r r2 = r8.f41780c
            r3 = 3
            r2.mo46909A(r3)
            bj.r r2 = r8.f41780c
            int r2 = r2.mo46924o()
            int r3 = r2 + 10
            int r1 = r1 + r3
            r9.mo69880k(r2, r0)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18847e.mo47761f(ph.i):boolean");
    }

    public final void release() {
    }
}
