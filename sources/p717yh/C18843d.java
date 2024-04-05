package p717yh;

import com.google.android.exoplayer2.Format;
import p513bj.C14076q;
import p513bj.C14077r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.d */
public final class C18843d implements C18858j {

    /* renamed from: a */
    public final C14076q f41740a;

    /* renamed from: b */
    public final C14077r f41741b;

    /* renamed from: c */
    public final String f41742c;

    /* renamed from: d */
    public String f41743d;

    /* renamed from: e */
    public C18368v f41744e;

    /* renamed from: f */
    public int f41745f = 0;

    /* renamed from: g */
    public int f41746g = 0;

    /* renamed from: h */
    public boolean f41747h = false;

    /* renamed from: i */
    public boolean f41748i = false;

    /* renamed from: j */
    public long f41749j;

    /* renamed from: k */
    public Format f41750k;

    /* renamed from: l */
    public int f41751l;

    /* renamed from: m */
    public long f41752m;

    public C18843d(String str) {
        C14076q qVar = new C14076q(16, new byte[16]);
        this.f41740a = qVar;
        this.f41741b = new C14077r((byte[]) qVar.f30985d);
        this.f41742c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70281a(p513bj.C14077r r13) {
        /*
            r12 = this;
            ph.v r0 = r12.f41744e
            p513bj.C14075p.m21696h(r0)
        L_0x0005:
            int r0 = r13.f30988c
            int r1 = r13.f30987b
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0116
            int r1 = r12.f41745f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x00c7
            if (r1 == r3) goto L_0x0043
            if (r1 == r2) goto L_0x0018
            goto L_0x0005
        L_0x0018:
            int r1 = r12.f41751l
            int r2 = r12.f41746g
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            ph.v r1 = r12.f41744e
            r1.mo69899d(r0, r13)
            int r1 = r12.f41746g
            int r1 = r1 + r0
            r12.f41746g = r1
            int r9 = r12.f41751l
            if (r1 != r9) goto L_0x0005
            ph.v r5 = r12.f41744e
            long r6 = r12.f41752m
            r8 = 1
            r10 = 0
            r11 = 0
            r5.mo47754c(r6, r8, r9, r10, r11)
            long r0 = r12.f41752m
            long r2 = r12.f41749j
            long r0 = r0 + r2
            r12.f41752m = r0
            r12.f41745f = r4
            goto L_0x0005
        L_0x0043:
            bj.r r1 = r12.f41741b
            byte[] r1 = r1.f30986a
            int r5 = r12.f41746g
            r6 = 16
            int r5 = 16 - r5
            int r0 = java.lang.Math.min(r0, r5)
            int r5 = r12.f41746g
            r13.mo46911b(r5, r0, r1)
            int r1 = r12.f41746g
            int r1 = r1 + r0
            r12.f41746g = r1
            if (r1 != r6) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r3 = r4
        L_0x005f:
            if (r3 == 0) goto L_0x0005
            bj.q r0 = r12.f41740a
            r0.mo46905l(r4)
            bj.q r0 = r12.f41740a
            lh.c$a r0 = p611lh.C18165c.m30680b(r0)
            com.google.android.exoplayer2.Format r1 = r12.f41750k
            java.lang.String r3 = "audio/ac4"
            if (r1 == 0) goto L_0x0084
            int r5 = r1.channelCount
            if (r2 != r5) goto L_0x0084
            int r5 = r0.f39735a
            int r7 = r1.sampleRate
            if (r5 != r7) goto L_0x0084
            java.lang.String r1 = r1.sampleMimeType
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x00a4
        L_0x0084:
            com.google.android.exoplayer2.Format$b r1 = new com.google.android.exoplayer2.Format$b
            r1.<init>()
            java.lang.String r5 = r12.f41743d
            r1.f31293a = r5
            r1.f31303k = r3
            r1.f31316x = r2
            int r3 = r0.f39735a
            r1.f31317y = r3
            java.lang.String r3 = r12.f41742c
            r1.f31295c = r3
            com.google.android.exoplayer2.Format r1 = r1.mo47144a()
            r12.f41750k = r1
            ph.v r3 = r12.f41744e
            r3.mo47752a(r1)
        L_0x00a4:
            int r1 = r0.f39736b
            r12.f41751l = r1
            r7 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r0.f39737c
            long r0 = (long) r0
            long r0 = r0 * r7
            com.google.android.exoplayer2.Format r3 = r12.f41750k
            int r3 = r3.sampleRate
            long r7 = (long) r3
            long r0 = r0 / r7
            r12.f41749j = r0
            bj.r r0 = r12.f41741b
            r0.mo46935z(r4)
            ph.v r0 = r12.f41744e
            bj.r r1 = r12.f41741b
            r0.mo69899d(r6, r1)
            r12.f41745f = r2
            goto L_0x0005
        L_0x00c7:
            int r0 = r13.f30988c
            int r1 = r13.f30987b
            int r0 = r0 - r1
            r1 = 65
            r5 = 64
            if (r0 <= 0) goto L_0x00fc
            boolean r0 = r12.f41747h
            r6 = 172(0xac, float:2.41E-43)
            if (r0 != 0) goto L_0x00e4
            int r0 = r13.mo46925p()
            if (r0 != r6) goto L_0x00e0
            r0 = r3
            goto L_0x00e1
        L_0x00e0:
            r0 = r4
        L_0x00e1:
            r12.f41747h = r0
            goto L_0x00c7
        L_0x00e4:
            int r0 = r13.mo46925p()
            if (r0 != r6) goto L_0x00ec
            r6 = r3
            goto L_0x00ed
        L_0x00ec:
            r6 = r4
        L_0x00ed:
            r12.f41747h = r6
            if (r0 == r5) goto L_0x00f3
            if (r0 != r1) goto L_0x00c7
        L_0x00f3:
            if (r0 != r1) goto L_0x00f7
            r0 = r3
            goto L_0x00f8
        L_0x00f7:
            r0 = r4
        L_0x00f8:
            r12.f41748i = r0
            r0 = r3
            goto L_0x00fd
        L_0x00fc:
            r0 = r4
        L_0x00fd:
            if (r0 == 0) goto L_0x0005
            r12.f41745f = r3
            bj.r r0 = r12.f41741b
            byte[] r0 = r0.f30986a
            r6 = -84
            r0[r4] = r6
            boolean r4 = r12.f41748i
            if (r4 == 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r1 = r5
        L_0x010f:
            byte r1 = (byte) r1
            r0[r3] = r1
            r12.f41746g = r2
            goto L_0x0005
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18843d.mo70281a(bj.r):void");
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41745f = 0;
        this.f41746g = 0;
        this.f41747h = false;
        this.f41748i = false;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41743d = dVar.f41796e;
        dVar.mo70294b();
        this.f41744e = jVar.mo4164r(dVar.f41795d, 1);
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f41752m = j;
    }
}
