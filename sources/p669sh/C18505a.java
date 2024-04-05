package p669sh;

import androidx.core.widget.NestedScrollView;
import com.google.android.exoplayer2.extractor.flv.C14232a;
import com.google.android.exoplayer2.extractor.flv.C14233b;
import java.io.IOException;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;

/* renamed from: sh.a */
public final class C18505a implements C18349h {

    /* renamed from: a */
    public final C14077r f40749a = new C14077r(4);

    /* renamed from: b */
    public final C14077r f40750b = new C14077r(9);

    /* renamed from: c */
    public final C14077r f40751c = new C14077r(11);

    /* renamed from: d */
    public final C14077r f40752d = new C14077r();

    /* renamed from: e */
    public final C18506b f40753e = new C18506b();

    /* renamed from: f */
    public C18351j f40754f;

    /* renamed from: g */
    public int f40755g = 1;

    /* renamed from: h */
    public boolean f40756h;

    /* renamed from: i */
    public long f40757i;

    /* renamed from: j */
    public int f40758j;

    /* renamed from: k */
    public int f40759k;

    /* renamed from: l */
    public int f40760l;

    /* renamed from: m */
    public long f40761m;

    /* renamed from: n */
    public boolean f40762n;

    /* renamed from: o */
    public C14232a f40763o;

    /* renamed from: p */
    public C14233b f40764p;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r3.mo47350b(r4, r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (r3.mo47352b(r4, r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0006 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r16, p644ph.C18363s r17) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            ph.j r1 = r0.f40754f
            p513bj.C14075p.m21696h(r1)
        L_0x0006:
            int r1 = r0.f40755g
            r2 = -1
            r3 = 8
            r4 = 9
            r5 = 2
            r6 = 4
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L_0x014b
            r9 = 3
            if (r1 == r5) goto L_0x013c
            if (r1 == r9) goto L_0x00f1
            if (r1 != r6) goto L_0x00eb
            boolean r1 = r0.f40756h
            r9 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x002b
            long r1 = r0.f40757i
            long r13 = r0.f40761m
            long r1 = r1 + r13
            goto L_0x0037
        L_0x002b:
            sh.b r1 = r0.f40753e
            long r1 = r1.f40765b
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0035
            r1 = r9
            goto L_0x0037
        L_0x0035:
            long r1 = r0.f40761m
        L_0x0037:
            int r13 = r0.f40759k
            if (r13 != r3) goto L_0x0064
            com.google.android.exoplayer2.extractor.flv.a r3 = r0.f40763o
            if (r3 == 0) goto L_0x0064
            boolean r3 = r0.f40762n
            if (r3 != 0) goto L_0x004f
            ph.j r3 = r0.f40754f
            ph.t$b r4 = new ph.t$b
            r4.<init>(r11)
            r3.mo4162l(r4)
            r0.f40762n = r8
        L_0x004f:
            com.google.android.exoplayer2.extractor.flv.a r3 = r0.f40763o
            r4 = r16
            ph.e r4 = (p644ph.C18346e) r4
            bj.r r4 = r15.mo70012d(r4)
            r3.mo47349a(r4)
            boolean r1 = r3.mo47350b(r4, r1)
            if (r1 == 0) goto L_0x00c1
        L_0x0062:
            r1 = r8
            goto L_0x00c2
        L_0x0064:
            if (r13 != r4) goto L_0x0091
            com.google.android.exoplayer2.extractor.flv.b r3 = r0.f40764p
            if (r3 == 0) goto L_0x0091
            boolean r3 = r0.f40762n
            if (r3 != 0) goto L_0x007a
            ph.j r3 = r0.f40754f
            ph.t$b r4 = new ph.t$b
            r4.<init>(r11)
            r3.mo4162l(r4)
            r0.f40762n = r8
        L_0x007a:
            com.google.android.exoplayer2.extractor.flv.b r3 = r0.f40764p
            r4 = r16
            ph.e r4 = (p644ph.C18346e) r4
            bj.r r4 = r15.mo70012d(r4)
            boolean r13 = r3.mo47351a(r4)
            if (r13 == 0) goto L_0x00c1
            boolean r1 = r3.mo47352b(r4, r1)
            if (r1 == 0) goto L_0x00c1
            goto L_0x0062
        L_0x0091:
            r3 = 18
            if (r13 != r3) goto L_0x00c4
            boolean r3 = r0.f40762n
            if (r3 != 0) goto L_0x00c4
            sh.b r3 = r0.f40753e
            r4 = r16
            ph.e r4 = (p644ph.C18346e) r4
            bj.r r4 = r15.mo70012d(r4)
            r3.getClass()
            r3.mo70013a(r4, r1)
            sh.b r1 = r0.f40753e
            long r2 = r1.f40765b
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x00c1
            ph.j r4 = r0.f40754f
            ph.r r13 = new ph.r
            long[] r14 = r1.f40767d
            long[] r1 = r1.f40766c
            r13.<init>(r2, r14, r1)
            r4.mo4162l(r13)
            r0.f40762n = r8
        L_0x00c1:
            r1 = r7
        L_0x00c2:
            r2 = r8
            goto L_0x00cf
        L_0x00c4:
            int r1 = r0.f40760l
            r2 = r16
            ph.e r2 = (p644ph.C18346e) r2
            r2.mo69879j(r1)
            r1 = r7
            r2 = r1
        L_0x00cf:
            boolean r3 = r0.f40756h
            if (r3 != 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00e4
            r0.f40756h = r8
            sh.b r1 = r0.f40753e
            long r3 = r1.f40765b
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x00e2
            long r3 = r0.f40761m
            long r9 = -r3
        L_0x00e2:
            r0.f40757i = r9
        L_0x00e4:
            r0.f40758j = r6
            r0.f40755g = r5
            if (r2 == 0) goto L_0x0006
            return r7
        L_0x00eb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00f1:
            bj.r r1 = r0.f40751c
            byte[] r1 = r1.f30986a
            r3 = 11
            r4 = r16
            ph.e r4 = (p644ph.C18346e) r4
            boolean r1 = r4.mo69874g(r1, r7, r3, r8)
            if (r1 != 0) goto L_0x0102
            goto L_0x0139
        L_0x0102:
            bj.r r1 = r0.f40751c
            r1.mo46935z(r7)
            bj.r r1 = r0.f40751c
            int r1 = r1.mo46925p()
            r0.f40759k = r1
            bj.r r1 = r0.f40751c
            int r1 = r1.mo46927r()
            r0.f40760l = r1
            bj.r r1 = r0.f40751c
            int r1 = r1.mo46927r()
            long r3 = (long) r1
            r0.f40761m = r3
            bj.r r1 = r0.f40751c
            int r1 = r1.mo46925p()
            int r1 = r1 << 24
            long r3 = (long) r1
            long r10 = r0.f40761m
            long r3 = r3 | r10
            r10 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r10
            r0.f40761m = r3
            bj.r r1 = r0.f40751c
            r1.mo46909A(r9)
            r0.f40755g = r6
            r7 = r8
        L_0x0139:
            if (r7 != 0) goto L_0x0006
            return r2
        L_0x013c:
            int r1 = r0.f40758j
            r2 = r16
            ph.e r2 = (p644ph.C18346e) r2
            r2.mo69879j(r1)
            r0.f40758j = r7
            r0.f40755g = r9
            goto L_0x0006
        L_0x014b:
            bj.r r1 = r0.f40750b
            byte[] r1 = r1.f30986a
            r9 = r16
            ph.e r9 = (p644ph.C18346e) r9
            boolean r1 = r9.mo69874g(r1, r7, r4, r8)
            if (r1 != 0) goto L_0x015a
            goto L_0x01ae
        L_0x015a:
            bj.r r1 = r0.f40750b
            r1.mo46935z(r7)
            bj.r r1 = r0.f40750b
            r1.mo46909A(r6)
            bj.r r1 = r0.f40750b
            int r1 = r1.mo46925p()
            r9 = r1 & 4
            if (r9 == 0) goto L_0x0170
            r9 = r8
            goto L_0x0171
        L_0x0170:
            r9 = r7
        L_0x0171:
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0176
            r7 = r8
        L_0x0176:
            if (r9 == 0) goto L_0x0189
            com.google.android.exoplayer2.extractor.flv.a r1 = r0.f40763o
            if (r1 != 0) goto L_0x0189
            com.google.android.exoplayer2.extractor.flv.a r1 = new com.google.android.exoplayer2.extractor.flv.a
            ph.j r9 = r0.f40754f
            ph.v r3 = r9.mo4164r(r3, r8)
            r1.<init>(r3)
            r0.f40763o = r1
        L_0x0189:
            if (r7 == 0) goto L_0x019c
            com.google.android.exoplayer2.extractor.flv.b r1 = r0.f40764p
            if (r1 != 0) goto L_0x019c
            com.google.android.exoplayer2.extractor.flv.b r1 = new com.google.android.exoplayer2.extractor.flv.b
            ph.j r3 = r0.f40754f
            ph.v r3 = r3.mo4164r(r4, r5)
            r1.<init>(r3)
            r0.f40764p = r1
        L_0x019c:
            ph.j r1 = r0.f40754f
            r1.mo4163p()
            bj.r r1 = r0.f40750b
            int r1 = r1.mo46912c()
            int r1 = r1 - r4
            int r1 = r1 + r6
            r0.f40758j = r1
            r0.f40755g = r5
            r7 = r8
        L_0x01ae:
            if (r7 != 0) goto L_0x0006
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p669sh.C18505a.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f40754f = jVar;
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        if (j == 0) {
            this.f40755g = 1;
            this.f40756h = false;
        } else {
            this.f40755g = 3;
        }
        this.f40758j = 0;
    }

    /* renamed from: d */
    public final C14077r mo70012d(C18346e eVar) throws IOException {
        int i = this.f40760l;
        C14077r rVar = this.f40752d;
        byte[] bArr = rVar.f30986a;
        if (i > bArr.length) {
            rVar.mo46933x(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            rVar.mo46935z(0);
        }
        this.f40752d.mo46934y(this.f40760l);
        eVar.mo69874g(this.f40752d.f30986a, 0, this.f40760l, false);
        return this.f40752d;
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        C18346e eVar = (C18346e) iVar;
        eVar.mo69872c(this.f40749a.f30986a, 0, 3, false);
        this.f40749a.mo46935z(0);
        if (this.f40749a.mo46927r() != 4607062) {
            return false;
        }
        eVar.mo69872c(this.f40749a.f30986a, 0, 2, false);
        this.f40749a.mo46935z(0);
        if ((this.f40749a.mo46930u() & NestedScrollView.ANIMATED_SCROLL_GAP) != 0) {
            return false;
        }
        eVar.mo69872c(this.f40749a.f30986a, 0, 4, false);
        this.f40749a.mo46935z(0);
        int c = this.f40749a.mo46912c();
        eVar.f40296f = 0;
        eVar.mo69880k(c, false);
        eVar.mo69872c(this.f40749a.f30986a, 0, 4, false);
        this.f40749a.mo46935z(0);
        return this.f40749a.mo46912c() == 0;
    }

    public final void release() {
    }
}
