package p145io.branch.referral;

/* renamed from: io.branch.referral.a */
public final class C7023a {

    /* renamed from: io.branch.referral.a$a */
    public static abstract class C7024a {

        /* renamed from: a */
        public byte[] f15625a;
    }

    /* renamed from: io.branch.referral.a$b */
    public static class C7025b extends C7024a {

        /* renamed from: b */
        public static final int[] f15626b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    /* renamed from: io.branch.referral.a$c */
    public static class C7026c extends C7024a {

        /* renamed from: h */
        public static final byte[] f15627h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: b */
        public final byte[] f15628b = new byte[2];

        /* renamed from: c */
        public int f15629c = 0;

        /* renamed from: d */
        public int f15630d = -1;

        /* renamed from: e */
        public final boolean f15631e = true;

        /* renamed from: f */
        public final boolean f15632f = false;

        /* renamed from: g */
        public final boolean f15633g = false;

        public C7026c() {
            this.f15625a = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m13619a(byte[] r17) {
        /*
            r0 = r17
            int r1 = r0.length
            io.branch.referral.a$c r2 = new io.branch.referral.a$c
            r2.<init>()
            int r3 = r1 / 3
            r4 = 4
            int r3 = r3 * r4
            int r5 = r1 % 3
            if (r5 <= 0) goto L_0x0012
            int r3 = r3 + 4
        L_0x0012:
            byte[] r3 = new byte[r3]
            r2.f15625a = r3
            byte[] r5 = p145io.branch.referral.C7023a.C7026c.f15627h
            int r6 = r2.f15630d
            r7 = 0
            int r1 = r1 + r7
            int r8 = r2.f15629c
            r9 = -1
            r10 = 2
            r11 = 1
            if (r8 == r11) goto L_0x0040
            if (r8 == r10) goto L_0x0026
            goto L_0x005a
        L_0x0026:
            if (r11 > r1) goto L_0x005a
            byte[] r8 = r2.f15628b
            byte r12 = r8[r7]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 16
            byte r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r8 = r8 | r12
            byte r12 = r0[r7]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r8 = r8 | r12
            r2.f15629c = r7
            r12 = r11
            goto L_0x005c
        L_0x0040:
            if (r10 > r1) goto L_0x005a
            byte[] r8 = r2.f15628b
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            byte r12 = r0[r7]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r8 = r8 | r12
            byte r12 = r0[r11]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r8 = r8 | r12
            r2.f15629c = r7
            r12 = r10
            goto L_0x005c
        L_0x005a:
            r12 = r7
            r8 = r9
        L_0x005c:
            r14 = 10
            if (r8 == r9) goto L_0x008e
            int r9 = r8 >> 18
            r9 = r9 & 63
            byte r9 = r5[r9]
            r3[r7] = r9
            int r9 = r8 >> 12
            r9 = r9 & 63
            byte r9 = r5[r9]
            r3[r11] = r9
            int r9 = r8 >> 6
            r9 = r9 & 63
            byte r9 = r5[r9]
            r3[r10] = r9
            r8 = r8 & 63
            byte r8 = r5[r8]
            r9 = 3
            r3[r9] = r8
            int r6 = r6 + -1
            if (r6 != 0) goto L_0x008c
            r6 = 4
            int r6 = r6 + r11
            r3[r4] = r14
            r9 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            goto L_0x00e9
        L_0x008c:
            r8 = r4
            goto L_0x008f
        L_0x008e:
            r8 = r7
        L_0x008f:
            r9 = r8
            r8 = r6
            r6 = r5
            r5 = r3
            r3 = r2
        L_0x0094:
            r15 = 13
            int r13 = r12 + 3
            if (r13 > r1) goto L_0x00f0
            byte r11 = r0[r12]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r16 = r12 + 1
            byte r10 = r0[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r10 = r10 | r11
            int r12 = r12 + 2
            byte r11 = r0[r12]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10 = r10 | r11
            int r11 = r10 >> 18
            r11 = r11 & 63
            byte r11 = r6[r11]
            r5[r9] = r11
            int r11 = r9 + 1
            int r12 = r10 >> 12
            r12 = r12 & 63
            byte r12 = r6[r12]
            r5[r11] = r12
            int r11 = r9 + 2
            int r12 = r10 >> 6
            r12 = r12 & 63
            byte r12 = r6[r12]
            r5[r11] = r12
            int r11 = r9 + 3
            r10 = r10 & 63
            byte r10 = r6[r10]
            r5[r11] = r10
            int r9 = r9 + 4
            int r8 = r8 + -1
            if (r8 != 0) goto L_0x00ec
            boolean r8 = r2.f15633g
            if (r8 == 0) goto L_0x00e3
            int r8 = r9 + 1
            r5[r9] = r15
            r9 = r8
        L_0x00e3:
            int r8 = r9 + 1
            r5[r9] = r14
            r9 = r8
            r12 = r13
        L_0x00e9:
            r8 = 19
            goto L_0x00ed
        L_0x00ec:
            r12 = r13
        L_0x00ed:
            r10 = 2
            r11 = 1
            goto L_0x0094
        L_0x00f0:
            int r10 = r2.f15629c
            int r11 = r12 - r10
            int r13 = r1 + -1
            r16 = 61
            if (r11 != r13) goto L_0x0139
            if (r10 <= 0) goto L_0x0102
            byte[] r0 = r2.f15628b
            byte r0 = r0[r7]
            r7 = 1
            goto L_0x0104
        L_0x0102:
            byte r0 = r0[r12]
        L_0x0104:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r4
            int r10 = r10 - r7
            r2.f15629c = r10
            int r1 = r9 + 1
            int r4 = r0 >> 6
            r4 = r4 & 63
            byte r4 = r6[r4]
            r5[r9] = r4
            int r4 = r1 + 1
            r0 = r0 & 63
            byte r0 = r6[r0]
            r5[r1] = r0
            boolean r0 = r2.f15631e
            if (r0 == 0) goto L_0x0128
            int r0 = r4 + 1
            r5[r4] = r16
            int r4 = r0 + 1
            r5[r0] = r16
        L_0x0128:
            boolean r0 = r2.f15632f
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r2.f15633g
            if (r0 == 0) goto L_0x0135
            int r0 = r4 + 1
            r5[r4] = r15
            r4 = r0
        L_0x0135:
            r5[r4] = r14
            goto L_0x01ac
        L_0x0139:
            r4 = 2
            int r1 = r1 - r4
            if (r11 != r1) goto L_0x0197
            r1 = 1
            if (r10 <= r1) goto L_0x0146
            byte[] r4 = r2.f15628b
            byte r4 = r4[r7]
            r7 = r1
            goto L_0x014b
        L_0x0146:
            int r1 = r12 + 1
            byte r4 = r0[r12]
            r12 = r1
        L_0x014b:
            r1 = r4 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r14
            if (r10 <= 0) goto L_0x0158
            byte[] r0 = r2.f15628b
            int r4 = r7 + 1
            byte r0 = r0[r7]
            r7 = r4
            goto L_0x015a
        L_0x0158:
            byte r0 = r0[r12]
        L_0x015a:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 2
            int r0 = r0 << r4
            r0 = r0 | r1
            int r10 = r10 - r7
            r2.f15629c = r10
            int r1 = r9 + 1
            int r4 = r0 >> 12
            r4 = r4 & 63
            byte r4 = r6[r4]
            r5[r9] = r4
            int r4 = r1 + 1
            int r7 = r0 >> 6
            r7 = r7 & 63
            byte r7 = r6[r7]
            r5[r1] = r7
            int r1 = r4 + 1
            r0 = r0 & 63
            byte r0 = r6[r0]
            r5[r4] = r0
            boolean r0 = r2.f15631e
            if (r0 == 0) goto L_0x0187
            int r0 = r1 + 1
            r5[r1] = r16
            r1 = r0
        L_0x0187:
            boolean r0 = r2.f15632f
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r2.f15633g
            if (r0 == 0) goto L_0x0194
            int r0 = r1 + 1
            r5[r1] = r15
            r1 = r0
        L_0x0194:
            r5[r1] = r14
            goto L_0x01ac
        L_0x0197:
            boolean r0 = r2.f15632f
            if (r0 == 0) goto L_0x01ac
            if (r9 <= 0) goto L_0x01ac
            r0 = 19
            if (r8 == r0) goto L_0x01ac
            boolean r0 = r2.f15633g
            if (r0 == 0) goto L_0x01aa
            int r0 = r9 + 1
            r5[r9] = r15
            r9 = r0
        L_0x01aa:
            r5[r9] = r14
        L_0x01ac:
            r2.f15630d = r8
            byte[] r0 = r3.f15625a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7023a.m13619a(byte[]):byte[]");
    }
}
