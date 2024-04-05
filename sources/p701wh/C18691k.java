package p701wh;

/* renamed from: wh.k */
public final class C18691k {

    /* renamed from: a */
    public static final int[] f41400a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: Removed duplicated region for block: B:89:0x00eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00ed A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m31544a(p644ph.C18350i r22, boolean r23, boolean r24) throws java.io.IOException {
        /*
            r0 = r22
            long r1 = r22.getLength()
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 4096(0x1000, double:2.0237E-320)
            if (r5 == 0) goto L_0x0014
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r6 = r1
        L_0x0014:
            int r6 = (int) r6
            bj.r r7 = new bj.r
            r8 = 64
            r7.<init>((int) r8)
            r8 = 0
            r9 = r8
            r10 = r9
        L_0x001f:
            r11 = 1
            if (r9 >= r6) goto L_0x0105
            r12 = 8
            r7.mo46932w(r12)
            byte[] r13 = r7.f30986a
            boolean r13 = r0.mo69872c(r13, r8, r12, r11)
            if (r13 != 0) goto L_0x0031
            goto L_0x0105
        L_0x0031:
            long r13 = r7.mo46926q()
            int r15 = r7.mo46912c()
            r16 = 1
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            r11 = 16
            if (r16 != 0) goto L_0x004e
            byte[] r13 = r7.f30986a
            r0.mo69871a(r12, r12, r13)
            r7.mo46934y(r11)
            long r13 = r7.mo46919j()
            goto L_0x0066
        L_0x004e:
            r18 = 0
            int r11 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r11 != 0) goto L_0x0065
            long r18 = r22.getLength()
            int r11 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0065
            long r13 = r22.mo69877h()
            long r18 = r18 - r13
            long r13 = (long) r12
            long r13 = r18 + r13
        L_0x0065:
            r11 = r12
        L_0x0066:
            long r3 = (long) r11
            int r16 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r16 >= 0) goto L_0x006c
            return r8
        L_0x006c:
            int r9 = r9 + r11
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r11) goto L_0x0085
            int r3 = (int) r13
            int r6 = r6 + r3
            if (r5 == 0) goto L_0x0080
            long r3 = (long) r6
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0080
            int r3 = (int) r1
            r20 = r1
            r6 = r3
            goto L_0x0082
        L_0x0080:
            r20 = r1
        L_0x0082:
            r2 = r8
            goto L_0x00fa
        L_0x0085:
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r11) goto L_0x0101
            r11 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r11) goto L_0x0091
            goto L_0x0101
        L_0x0091:
            r20 = r1
            long r1 = (long) r9
            long r1 = r1 + r13
            long r1 = r1 - r3
            r16 = r9
            long r8 = (long) r6
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x00a1
            r2 = 0
            r3 = 1
            goto L_0x0107
        L_0x00a1:
            long r13 = r13 - r3
            int r1 = (int) r13
            int r9 = r16 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r2) goto L_0x00f4
            if (r1 >= r12) goto L_0x00ae
            r2 = 0
            return r2
        L_0x00ae:
            r2 = 0
            r7.mo46932w(r1)
            byte[] r3 = r7.f30986a
            r0.mo69871a(r2, r1, r3)
            int r1 = r1 / 4
            r2 = 0
        L_0x00ba:
            if (r2 >= r1) goto L_0x00f0
            r3 = 1
            if (r2 != r3) goto L_0x00c4
            r4 = 4
            r7.mo46909A(r4)
            goto L_0x00ed
        L_0x00c4:
            int r4 = r7.mo46912c()
            int r8 = r4 >>> 8
            r12 = 3368816(0x336770, float:4.720717E-39)
            if (r8 != r12) goto L_0x00d0
            goto L_0x00e3
        L_0x00d0:
            r8 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 != r8) goto L_0x00d8
            if (r24 == 0) goto L_0x00d8
            goto L_0x00e3
        L_0x00d8:
            int[] r8 = f41400a
            r12 = 29
            r13 = 0
        L_0x00dd:
            if (r13 >= r12) goto L_0x00e8
            r14 = r8[r13]
            if (r14 != r4) goto L_0x00e5
        L_0x00e3:
            r4 = r3
            goto L_0x00e9
        L_0x00e5:
            int r13 = r13 + 1
            goto L_0x00dd
        L_0x00e8:
            r4 = 0
        L_0x00e9:
            if (r4 == 0) goto L_0x00ed
            r10 = r3
            goto L_0x00f0
        L_0x00ed:
            int r2 = r2 + 1
            goto L_0x00ba
        L_0x00f0:
            r2 = 0
            if (r10 != 0) goto L_0x00fa
            return r2
        L_0x00f4:
            r2 = 0
            if (r1 == 0) goto L_0x00fa
            r0.mo69878i(r1)
        L_0x00fa:
            r8 = r2
            r1 = r20
            r3 = -1
            goto L_0x001f
        L_0x0101:
            r2 = r8
            r3 = 1
            r0 = r3
            goto L_0x0108
        L_0x0105:
            r2 = r8
            r3 = r11
        L_0x0107:
            r0 = r2
        L_0x0108:
            if (r10 == 0) goto L_0x0110
            r1 = r23
            if (r1 != r0) goto L_0x0110
            r8 = r3
            goto L_0x0111
        L_0x0110:
            r8 = r2
        L_0x0111:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p701wh.C18691k.m31544a(ph.i, boolean, boolean):boolean");
    }
}
