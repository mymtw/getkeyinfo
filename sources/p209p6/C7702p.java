package p209p6;

/* renamed from: p6.p */
public final class C7702p implements C7694h {

    /* renamed from: a */
    public final /* synthetic */ int f17079a;

    /* renamed from: b */
    public final /* synthetic */ boolean f17080b = true;

    /* renamed from: c */
    public final /* synthetic */ C7686e f17081c;

    /* renamed from: d */
    public final /* synthetic */ C7676c f17082d;

    public C7702p(int i, C7686e eVar, C7676c cVar) {
        this.f17079a = i;
        this.f17081c = eVar;
        this.f17082d = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        if ((r5 != null && r5.length >= r0) != false) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0038 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dd A[LOOP:0: B:61:0x00db->B:62:0x00dd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0108 A[LOOP:1: B:72:0x0106->B:73:0x0108, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p6.C7695i mo20147a(p209p6.C7695i r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof p209p6.C7700n
            r1 = 0
            if (r0 == 0) goto L_0x0008
            p6.n r12 = (p209p6.C7700n) r12
            goto L_0x0009
        L_0x0008:
            r12 = r1
        L_0x0009:
            int r0 = r11.f17079a
            r2 = 2
            int r0 = r0 - r2
            r3 = 0
            int r0 = java.lang.Math.max(r3, r0)
            r4 = 1
            int r0 = r4 << r0
            boolean r5 = r11.f17080b
            if (r12 == 0) goto L_0x0035
            p6.e[] r6 = r12.f17073a
            if (r6 == 0) goto L_0x0022
            int r6 = r6.length
            if (r6 < r0) goto L_0x0022
            r6 = r4
            goto L_0x0023
        L_0x0022:
            r6 = r3
        L_0x0023:
            if (r6 == 0) goto L_0x0035
            if (r5 == 0) goto L_0x0033
            p6.e[] r5 = r12.f17074b
            if (r5 == 0) goto L_0x0030
            int r5 = r5.length
            if (r5 < r0) goto L_0x0030
            r5 = r4
            goto L_0x0031
        L_0x0030:
            r5 = r3
        L_0x0031:
            if (r5 == 0) goto L_0x0035
        L_0x0033:
            r5 = r4
            goto L_0x0036
        L_0x0035:
            r5 = r3
        L_0x0036:
            if (r5 == 0) goto L_0x0039
            return r12
        L_0x0039:
            if (r12 == 0) goto L_0x0042
            p6.e[] r5 = r12.f17073a
            p6.e[] r6 = r12.f17074b
            p6.e r12 = r12.f17075c
            goto L_0x0045
        L_0x0042:
            r12 = r1
            r5 = r12
            r6 = r5
        L_0x0045:
            if (r5 != 0) goto L_0x004b
            p6.e[] r5 = com.google.protobuf.C16910l.f37248d
            r7 = r3
            goto L_0x004c
        L_0x004b:
            int r7 = r5.length
        L_0x004c:
            if (r7 >= r0) goto L_0x00f0
            p6.e[] r8 = new p209p6.C7686e[r0]
            int r9 = r5.length
            java.lang.System.arraycopy(r5, r3, r8, r3, r9)
            if (r0 != r4) goto L_0x0061
            p6.e r1 = r11.f17081c
            p6.e r1 = r1.mo20140s()
            r8[r3] = r1
        L_0x005e:
            r5 = r8
            goto L_0x00f0
        L_0x0061:
            if (r7 != 0) goto L_0x0069
            p6.e r5 = r11.f17081c
            r8[r3] = r5
            r5 = r4
            goto L_0x006a
        L_0x0069:
            r5 = r7
        L_0x006a:
            if (r0 != r2) goto L_0x0076
            p6.e r2 = r11.f17081c
            p6.e r2 = r2.mo20146x()
            r8[r4] = r2
            goto L_0x00e7
        L_0x0076:
            int r9 = r5 + -1
            r9 = r8[r9]
            if (r12 != 0) goto L_0x00da
            r12 = r8[r3]
            p6.e r12 = r12.mo20145w()
            boolean r10 = r12.mo20141t()
            if (r10 != 0) goto L_0x00da
            p6.c r10 = r11.f17082d
            w6.a r10 = r10.f17023a
            int r10 = r10.mo20858b()
            if (r10 != r4) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r4 = r3
        L_0x0094:
            if (r4 == 0) goto L_0x00da
            p6.c r4 = r11.f17082d
            int r4 = r4.mo20072a()
            r10 = 64
            if (r4 < r10) goto L_0x00da
            p6.c r4 = r11.f17082d
            int r4 = r4.f17028f
            if (r4 == r2) goto L_0x00ad
            r2 = 3
            if (r4 == r2) goto L_0x00ad
            r2 = 4
            if (r4 == r2) goto L_0x00ad
            goto L_0x00da
        L_0x00ad:
            p6.d r1 = r12.mo20120a()
            p6.c r2 = r11.f17082d
            p6.d r4 = r12.f17049b
            java.math.BigInteger r4 = r4.mo20092a()
            p6.d r10 = r12.mo20138q()
            java.math.BigInteger r10 = r10.mo20092a()
            p6.e r2 = r2.mo20076e(r4, r10, r3)
            p6.d r4 = r1.mo20104m()
            p6.d r10 = r4.mo20101j(r1)
            p6.e r4 = r9.mo20130i(r4)
            p6.e r9 = r4.mo20133l(r10)
            if (r7 != 0) goto L_0x00db
            r8[r3] = r9
            goto L_0x00db
        L_0x00da:
            r2 = r12
        L_0x00db:
            if (r5 >= r0) goto L_0x00e7
            int r4 = r5 + 1
            p6.e r9 = r9.mo20131j(r2)
            r8[r5] = r9
            r5 = r4
            goto L_0x00db
        L_0x00e7:
            p6.c r2 = r11.f17082d
            int r4 = r0 - r7
            r2.mo20084k(r8, r7, r4, r1)
            goto L_0x005e
        L_0x00f0:
            boolean r1 = r11.f17080b
            if (r1 == 0) goto L_0x0113
            if (r6 != 0) goto L_0x00f9
            p6.e[] r1 = new p209p6.C7686e[r0]
            goto L_0x0104
        L_0x00f9:
            int r1 = r6.length
            if (r1 >= r0) goto L_0x0106
            p6.e[] r2 = new p209p6.C7686e[r0]
            int r4 = r6.length
            java.lang.System.arraycopy(r6, r3, r2, r3, r4)
            r3 = r1
            r1 = r2
        L_0x0104:
            r6 = r1
            r1 = r3
        L_0x0106:
            if (r1 >= r0) goto L_0x0113
            r2 = r5[r1]
            p6.e r2 = r2.mo20144v()
            r6[r1] = r2
            int r1 = r1 + 1
            goto L_0x0106
        L_0x0113:
            p6.n r0 = new p6.n
            r0.<init>()
            r0.f17073a = r5
            r0.f17074b = r6
            r0.f17075c = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p6.C7702p.mo20147a(p6.i):p6.i");
    }
}
