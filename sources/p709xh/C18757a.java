package p709xh;

import p513bj.C14049b0;
import p513bj.C14075p;
import p644ph.C18364t;
import p644ph.C18367u;

/* renamed from: xh.a */
public final class C18757a implements C18764f {

    /* renamed from: a */
    public final C18763e f41540a;

    /* renamed from: b */
    public final long f41541b;

    /* renamed from: c */
    public final long f41542c;

    /* renamed from: d */
    public final C18766h f41543d;

    /* renamed from: e */
    public int f41544e;

    /* renamed from: f */
    public long f41545f;

    /* renamed from: g */
    public long f41546g;

    /* renamed from: h */
    public long f41547h;

    /* renamed from: i */
    public long f41548i;

    /* renamed from: j */
    public long f41549j;

    /* renamed from: k */
    public long f41550k;

    /* renamed from: l */
    public long f41551l;

    /* renamed from: xh.a$a */
    public final class C18758a implements C18364t {
        public C18758a() {
        }

        /* renamed from: d */
        public final C18364t.C18365a mo47833d(long j) {
            C18757a aVar = C18757a.this;
            long j2 = aVar.f41541b;
            long j3 = aVar.f41542c;
            C18367u uVar = new C18367u(j, C14049b0.m21637j(((((j3 - j2) * ((((long) aVar.f41543d.f41584i) * j) / 1000000)) / aVar.f41545f) + j2) - 30000, j2, j3 - 1));
            return new C18364t.C18365a(uVar, uVar);
        }

        /* renamed from: g */
        public final boolean mo47834g() {
            return true;
        }

        /* renamed from: i */
        public final long mo47835i() {
            C18757a aVar = C18757a.this;
            return (aVar.f41545f * 1000000) / ((long) aVar.f41543d.f41584i);
        }
    }

    public C18757a(C18766h hVar, long j, long j2, long j3, long j4, boolean z) {
        C14075p.m21691c(j >= 0 && j2 > j);
        this.f41543d = hVar;
        this.f41541b = j;
        this.f41542c = j2;
        if (j3 == j2 - j || z) {
            this.f41545f = j4;
            this.f41544e = 4;
        } else {
            this.f41544e = 0;
        }
        this.f41540a = new C18763e();
    }

    /* renamed from: a */
    public final C18364t mo70246a() {
        if (this.f41545f != 0) {
            return new C18758a();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo70247b(p644ph.C18346e r24) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f41544e
            r3 = 0
            r5 = 4
            r6 = -1
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x00f2
            if (r2 == r9) goto L_0x0103
            r9 = 2
            r10 = 3
            if (r2 == r9) goto L_0x0023
            if (r2 == r10) goto L_0x0020
            if (r2 != r5) goto L_0x001a
            return r6
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0020:
            r5 = r6
            goto L_0x00ba
        L_0x0023:
            long r13 = r0.f41548i
            long r11 = r0.f41549j
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x002c
            goto L_0x0065
        L_0x002c:
            long r13 = r1.f40294d
            xh.e r2 = r0.f41540a
            boolean r2 = r2.mo70255b(r1, r11)
            if (r2 != 0) goto L_0x0047
            long r2 = r0.f41548i
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x003f
            r5 = r6
            goto L_0x00b3
        L_0x003f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0047:
            xh.e r2 = r0.f41540a
            r2.mo70254a(r1, r8)
            r1.f40296f = r8
            long r11 = r0.f41547h
            xh.e r2 = r0.f41540a
            long r8 = r2.f41568b
            long r11 = r11 - r8
            int r15 = r2.f41570d
            int r2 = r2.f41571e
            int r15 = r15 + r2
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x0068
            r17 = 72000(0x11940, double:3.55727E-319)
            int r2 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
        L_0x0065:
            r2 = r6
            r5 = r2
            goto L_0x00b3
        L_0x0068:
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0071
            r0.f41549j = r13
            r0.f41551l = r8
            goto L_0x0079
        L_0x0071:
            long r3 = r1.f40294d
            long r13 = (long) r15
            long r3 = r3 + r13
            r0.f41548i = r3
            r0.f41550k = r8
        L_0x0079:
            long r3 = r0.f41549j
            long r8 = r0.f41548i
            long r13 = r3 - r8
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x008b
            r0.f41549j = r8
            r5 = r6
            r2 = r8
            goto L_0x00b3
        L_0x008b:
            long r13 = (long) r15
            r15 = 1
            if (r2 > 0) goto L_0x0093
            r17 = 2
            goto L_0x0095
        L_0x0093:
            r17 = r15
        L_0x0095:
            long r13 = r13 * r17
            long r5 = r1.f40294d
            long r5 = r5 - r13
            long r13 = r3 - r8
            long r13 = r13 * r11
            long r11 = r0.f41551l
            r17 = r3
            long r2 = r0.f41550k
            long r11 = r11 - r2
            long r13 = r13 / r11
            long r2 = r13 + r5
            long r21 = r17 - r15
            r17 = r2
            r19 = r8
            long r2 = p513bj.C14049b0.m21637j(r17, r19, r21)
            r5 = -1
        L_0x00b3:
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            return r2
        L_0x00b8:
            r0.f41544e = r10
        L_0x00ba:
            xh.e r2 = r0.f41540a
            r2.mo70255b(r1, r5)
            xh.e r2 = r0.f41540a
            r3 = 0
            r2.mo70254a(r1, r3)
            xh.e r5 = r0.f41540a
            long r6 = r5.f41568b
            long r8 = r0.f41547h
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x00db
            r1.f40296f = r3
            r1 = 4
            r0.f41544e = r1
            long r1 = r0.f41550k
            r6 = 2
            long r1 = r1 + r6
            long r1 = -r1
            return r1
        L_0x00db:
            r6 = 2
            int r3 = r5.f41570d
            int r4 = r5.f41571e
            int r3 = r3 + r4
            r1.mo69879j(r3)
            long r3 = r1.f40294d
            r0.f41548i = r3
            xh.e r3 = r0.f41540a
            long r3 = r3.f41568b
            r0.f41550k = r3
            r5 = -1
            goto L_0x00ba
        L_0x00f2:
            long r5 = r1.f40294d
            r0.f41546g = r5
            r0.f41544e = r9
            long r7 = r0.f41542c
            r9 = 65307(0xff1b, double:3.2266E-319)
            long r7 = r7 - r9
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0103
            return r7
        L_0x0103:
            xh.e r5 = r0.f41540a
            r6 = 0
            r5.f41567a = r6
            r5.f41568b = r3
            r5.f41569c = r6
            r5.f41570d = r6
            r5.f41571e = r6
            r3 = -1
            boolean r5 = r5.mo70255b(r1, r3)
            if (r5 == 0) goto L_0x014b
        L_0x0118:
            xh.e r3 = r0.f41540a
            r3.mo70254a(r1, r6)
            xh.e r3 = r0.f41540a
            int r4 = r3.f41570d
            int r3 = r3.f41571e
            int r4 = r4 + r3
            r1.mo69879j(r4)
            xh.e r3 = r0.f41540a
            int r4 = r3.f41567a
            r2 = 4
            r4 = r4 & r2
            if (r4 == r2) goto L_0x013f
            r4 = -1
            boolean r3 = r3.mo70255b(r1, r4)
            if (r3 == 0) goto L_0x013f
            long r7 = r1.f40294d
            long r9 = r0.f41542c
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x0118
        L_0x013f:
            xh.e r1 = r0.f41540a
            long r3 = r1.f41568b
            r0.f41545f = r3
            r1 = 4
            r0.f41544e = r1
            long r1 = r0.f41546g
            return r1
        L_0x014b:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p709xh.C18757a.mo70247b(ph.e):long");
    }

    /* renamed from: c */
    public final void mo70248c(long j) {
        this.f41547h = C14049b0.m21637j(j, 0, this.f41545f - 1);
        this.f41544e = 2;
        this.f41548i = this.f41541b;
        this.f41549j = this.f41542c;
        this.f41550k = 0;
        this.f41551l = this.f41545f;
    }
}
