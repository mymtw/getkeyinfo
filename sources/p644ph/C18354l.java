package p644ph;

import p513bj.C14077r;

/* renamed from: ph.l */
public final class C18354l {

    /* renamed from: ph.l$a */
    public static final class C18355a {

        /* renamed from: a */
        public long f40302a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0098, code lost:
        if (r7 == r1.f40310f) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a5, code lost:
        if ((r17.mo46925p() * 1000) == r3) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b4, code lost:
        if (r4 == r3) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m31023a(p513bj.C14077r r17, p644ph.C18358o r18, int r19, p644ph.C18354l.C18355a r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r0.f30987b
            long r3 = r17.mo46926q()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L_0x0017
            return r8
        L_0x0017:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L_0x0021
            r5 = r6
            goto L_0x0022
        L_0x0021:
            r5 = r8
        L_0x0022:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 15
            long r11 = r11 & r13
            int r11 = (int) r11
            r12 = 8
            long r15 = r3 >> r12
            long r7 = r15 & r13
            int r7 = (int) r7
            r8 = 4
            long r15 = r3 >> r8
            long r13 = r13 & r15
            int r8 = (int) r13
            long r13 = r3 >> r6
            r15 = 7
            long r13 = r13 & r15
            int r13 = (int) r13
            long r3 = r3 & r9
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0043
            r3 = r6
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            r4 = 7
            if (r8 > r4) goto L_0x004d
            int r4 = r1.f40311g
            int r4 = r4 - r6
            if (r8 != r4) goto L_0x0058
            goto L_0x0056
        L_0x004d:
            r4 = 10
            if (r8 > r4) goto L_0x0058
            int r4 = r1.f40311g
            r8 = 2
            if (r4 != r8) goto L_0x0058
        L_0x0056:
            r4 = r6
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r4 == 0) goto L_0x00de
            if (r13 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            int r4 = r1.f40313i
            if (r13 != r4) goto L_0x0064
        L_0x0062:
            r4 = r6
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            if (r4 == 0) goto L_0x00de
            if (r3 != 0) goto L_0x00de
            long r3 = r17.mo46931v()     // Catch:{ NumberFormatException -> 0x007a }
            if (r5 == 0) goto L_0x0070
            goto L_0x0074
        L_0x0070:
            int r5 = r1.f40306b
            long r8 = (long) r5
            long r3 = r3 * r8
        L_0x0074:
            r5 = r20
            r5.f40302a = r3
            r3 = r6
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            if (r3 == 0) goto L_0x00de
            int r3 = m31024b(r11, r0)
            r4 = -1
            if (r3 == r4) goto L_0x008a
            int r4 = r1.f40306b
            if (r3 > r4) goto L_0x008a
            r3 = r6
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            if (r3 == 0) goto L_0x00de
            int r3 = r1.f40309e
            if (r7 != 0) goto L_0x0092
            goto L_0x00b6
        L_0x0092:
            r4 = 11
            if (r7 > r4) goto L_0x009b
            int r1 = r1.f40310f
            if (r7 != r1) goto L_0x00b8
            goto L_0x00b6
        L_0x009b:
            r1 = 12
            if (r7 != r1) goto L_0x00a8
            int r1 = r17.mo46925p()
            int r1 = r1 * 1000
            if (r1 != r3) goto L_0x00b8
            goto L_0x00b6
        L_0x00a8:
            r1 = 14
            if (r7 > r1) goto L_0x00b8
            int r4 = r17.mo46930u()
            if (r7 != r1) goto L_0x00b4
            int r4 = r4 * 10
        L_0x00b4:
            if (r4 != r3) goto L_0x00b8
        L_0x00b6:
            r1 = r6
            goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            if (r1 == 0) goto L_0x00de
            int r1 = r17.mo46925p()
            int r3 = r0.f30987b
            byte[] r0 = r0.f30986a
            int r3 = r3 - r6
            r4 = 0
        L_0x00c5:
            if (r2 >= r3) goto L_0x00d3
            int[] r5 = p513bj.C14049b0.f30925m
            byte r7 = r0[r2]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r7
            r4 = r5[r4]
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00d3:
            int r0 = p513bj.C14049b0.f30913a
            if (r1 != r4) goto L_0x00d9
            r0 = r6
            goto L_0x00da
        L_0x00d9:
            r0 = 0
        L_0x00da:
            if (r0 == 0) goto L_0x00de
            r8 = r6
            goto L_0x00df
        L_0x00de:
            r8 = 0
        L_0x00df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p644ph.C18354l.m31023a(bj.r, ph.o, int, ph.l$a):boolean");
    }

    /* renamed from: b */
    public static int m31024b(int i, C14077r rVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return rVar.mo46925p() + 1;
            case 7:
                return rVar.mo46930u() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
