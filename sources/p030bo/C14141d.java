package p030bo;

import com.google.zxing.WriterException;

/* renamed from: bo.d */
public final class C14141d {

    /* renamed from: a */
    public static final int[][] f31154a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    public static final int[][] f31155b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    public static final int[][] f31156c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    public static final int[][] f31157d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x022e, code lost:
        r15 = true;
        r16 = r16 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0231, code lost:
        if (r16 != 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0233, code lost:
        r16 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0236, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0238, code lost:
        if (r16 == false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023a, code lost:
        r13 = !r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020b, code lost:
        r15 = r15 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0223, code lost:
        r16 = r15;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022c, code lost:
        r16 = r15;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21891a(p699vn.C18666a r20, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r21, com.google.zxing.qrcode.decoder.C16997a r22, int r23, p030bo.C14138b r24) throws com.google.zxing.WriterException {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            byte[][] r4 = r3.f31149a
            int r5 = r4.length
            r6 = 0
            r7 = r6
        L_0x000d:
            r8 = -1
            if (r7 >= r5) goto L_0x0018
            r9 = r4[r7]
            java.util.Arrays.fill(r9, r8)
            int r7 = r7 + 1
            goto L_0x000d
        L_0x0018:
            int[][] r4 = f31154a
            r4 = r4[r6]
            int r4 = r4.length
            m21894d(r6, r6, r3)
            int r5 = r3.f31150b
            int r5 = r5 - r4
            m21894d(r5, r6, r3)
            int r5 = r3.f31150b
            int r5 = r5 - r4
            m21894d(r6, r5, r3)
            r4 = 7
            m21893c(r6, r4, r3)
            int r5 = r3.f31150b
            int r5 = r5 + -8
            m21893c(r5, r4, r3)
            int r5 = r3.f31150b
            int r5 = r5 + -8
            m21893c(r6, r5, r3)
            m21895e(r4, r6, r3)
            int r5 = r3.f31151c
            int r5 = r5 - r4
            int r5 = r5 + r8
            m21895e(r5, r6, r3)
            int r5 = r3.f31151c
            int r5 = r5 - r4
            m21895e(r4, r5, r3)
            int r5 = r3.f31151c
            r7 = 8
            int r5 = r5 - r7
            byte r5 = r3.mo47034a(r7, r5)
            if (r5 == 0) goto L_0x02b0
            int r5 = r3.f31151c
            int r5 = r5 - r7
            r9 = 1
            r3.mo47035b(r7, r5, r9)
            int r5 = r1.f37372a
            r10 = 5
            r11 = 2
            if (r5 >= r11) goto L_0x0067
            goto L_0x00c1
        L_0x0067:
            int r5 = r5 + r8
            int[][] r12 = f31156c
            r5 = r12[r5]
            int r12 = r5.length
            r13 = r6
        L_0x006e:
            if (r13 >= r12) goto L_0x00c1
            r14 = r5[r13]
            if (r14 < 0) goto L_0x00b6
            int r15 = r5.length
            r8 = r6
        L_0x0076:
            if (r8 >= r15) goto L_0x00b6
            r11 = r5[r8]
            if (r11 < 0) goto L_0x00ac
            byte r18 = r3.mo47034a(r11, r14)
            boolean r18 = m21896f(r18)
            if (r18 == 0) goto L_0x00ac
            int r11 = r11 + -2
            int r18 = r14 + -2
            r4 = r6
        L_0x008b:
            if (r4 >= r10) goto L_0x00ac
            int[][] r19 = f31155b
            r19 = r19[r4]
            r9 = r6
        L_0x0092:
            if (r9 >= r10) goto L_0x00a4
            int r6 = r11 + r9
            int r10 = r18 + r4
            r7 = r19[r9]
            r3.mo47035b(r6, r10, r7)
            int r9 = r9 + 1
            r6 = 0
            r7 = 8
            r10 = 5
            goto L_0x0092
        L_0x00a4:
            int r4 = r4 + 1
            r6 = 0
            r7 = 8
            r9 = 1
            r10 = 5
            goto L_0x008b
        L_0x00ac:
            int r8 = r8 + 1
            r4 = 7
            r6 = 0
            r7 = 8
            r9 = 1
            r10 = 5
            r11 = 2
            goto L_0x0076
        L_0x00b6:
            int r13 = r13 + 1
            r4 = 7
            r6 = 0
            r7 = 8
            r8 = -1
            r9 = 1
            r10 = 5
            r11 = 2
            goto L_0x006e
        L_0x00c1:
            r4 = 8
        L_0x00c3:
            int r5 = r3.f31150b
            r6 = 8
            int r5 = r5 - r6
            r6 = 6
            if (r4 >= r5) goto L_0x00eb
            int r5 = r4 + 1
            int r7 = r5 % 2
            byte r8 = r3.mo47034a(r4, r6)
            boolean r8 = m21896f(r8)
            if (r8 == 0) goto L_0x00dc
            r3.mo47035b(r4, r6, r7)
        L_0x00dc:
            byte r8 = r3.mo47034a(r6, r4)
            boolean r8 = m21896f(r8)
            if (r8 == 0) goto L_0x00e9
            r3.mo47035b(r6, r4, r7)
        L_0x00e9:
            r4 = r5
            goto L_0x00c3
        L_0x00eb:
            vn.a r4 = new vn.a
            r4.<init>()
            if (r2 < 0) goto L_0x00f8
            r5 = 8
            if (r2 >= r5) goto L_0x00f8
            r5 = 1
            goto L_0x00f9
        L_0x00f8:
            r5 = 0
        L_0x00f9:
            if (r5 == 0) goto L_0x02a8
            int r5 = r21.getBits()
            r7 = 3
            int r5 = r5 << r7
            r5 = r5 | r2
            r8 = 5
            r4.mo70167b(r5, r8)
            r8 = 1335(0x537, float:1.871E-42)
            int r5 = m21892b(r5, r8)
            r8 = 10
            r4.mo70167b(r5, r8)
            vn.a r5 = new vn.a
            r5.<init>()
            r8 = 21522(0x5412, float:3.0159E-41)
            r9 = 15
            r5.mo70167b(r8, r9)
            int r8 = r4.f41277c
            int r10 = r5.f41277c
            if (r8 != r10) goto L_0x02a0
            r8 = 0
        L_0x0124:
            int[] r10 = r4.f41276b
            int r11 = r10.length
            if (r8 >= r11) goto L_0x0135
            r11 = r10[r8]
            int[] r12 = r5.f41276b
            r12 = r12[r8]
            r11 = r11 ^ r12
            r10[r8] = r11
            int r8 = r8 + 1
            goto L_0x0124
        L_0x0135:
            int r5 = r4.f41277c
            java.lang.String r8 = "should not happen but we got: "
            if (r5 != r9) goto L_0x028c
            r5 = 0
        L_0x013c:
            int r9 = r4.f41277c
            if (r5 >= r9) goto L_0x016d
            int r9 = r9 + -1
            int r9 = r9 - r5
            boolean r9 = r4.mo70170d(r9)
            int[][] r10 = f31157d
            r10 = r10[r5]
            r11 = 0
            r12 = r10[r11]
            r13 = 1
            r10 = r10[r13]
            r3.mo47036c(r12, r10, r9)
            r10 = 8
            if (r5 >= r10) goto L_0x0160
            int r12 = r3.f31150b
            int r12 = r12 - r5
            int r12 = r12 - r13
            r3.mo47036c(r12, r10, r9)
            goto L_0x016a
        L_0x0160:
            int r12 = r3.f31151c
            int r12 = r12 + -7
            int r13 = r5 + -8
            int r13 = r13 + r12
            r3.mo47036c(r10, r13, r9)
        L_0x016a:
            int r5 = r5 + 1
            goto L_0x013c
        L_0x016d:
            r11 = 0
            int r4 = r1.f37372a
            r5 = 7
            if (r4 >= r5) goto L_0x0174
            goto L_0x01b5
        L_0x0174:
            vn.a r4 = new vn.a
            r4.<init>()
            int r5 = r1.f37372a
            r4.mo70167b(r5, r6)
            int r1 = r1.f37372a
            r5 = 7973(0x1f25, float:1.1173E-41)
            int r1 = m21892b(r1, r5)
            r5 = 12
            r4.mo70167b(r1, r5)
            int r1 = r4.f41277c
            r5 = 18
            if (r1 != r5) goto L_0x0278
            r1 = 17
            r5 = r11
        L_0x0194:
            if (r5 >= r6) goto L_0x01b5
            r8 = r11
        L_0x0197:
            if (r8 >= r7) goto L_0x01b2
            boolean r9 = r4.mo70170d(r1)
            int r1 = r1 + -1
            int r10 = r3.f31151c
            int r10 = r10 + -11
            int r10 = r10 + r8
            r3.mo47036c(r5, r10, r9)
            int r10 = r3.f31151c
            int r10 = r10 + -11
            int r10 = r10 + r8
            r3.mo47036c(r10, r5, r9)
            int r8 = r8 + 1
            goto L_0x0197
        L_0x01b2:
            int r5 = r5 + 1
            goto L_0x0194
        L_0x01b5:
            int r1 = r3.f31150b
            r4 = 1
            int r1 = r1 - r4
            int r5 = r3.f31151c
            int r5 = r5 - r4
            r4 = r11
            r8 = -1
        L_0x01be:
            if (r1 <= 0) goto L_0x0255
            if (r1 != r6) goto L_0x01c4
            int r1 = r1 + -1
        L_0x01c4:
            if (r5 < 0) goto L_0x024c
            int r9 = r3.f31151c
            if (r5 >= r9) goto L_0x024c
            r9 = r11
            r10 = 2
        L_0x01cc:
            if (r9 >= r10) goto L_0x0247
            int r12 = r1 - r9
            byte r13 = r3.mo47034a(r12, r5)
            boolean r13 = m21896f(r13)
            if (r13 == 0) goto L_0x0242
            int r13 = r0.f41277c
            if (r4 >= r13) goto L_0x01e5
            boolean r13 = r0.mo70170d(r4)
            int r4 = r4 + 1
            goto L_0x01e6
        L_0x01e5:
            r13 = r11
        L_0x01e6:
            r14 = -1
            if (r2 == r14) goto L_0x023d
            switch(r2) {
                case 0: goto L_0x022a;
                case 1: goto L_0x0227;
                case 2: goto L_0x0221;
                case 3: goto L_0x021d;
                case 4: goto L_0x0216;
                case 5: goto L_0x020e;
                case 6: goto L_0x0206;
                case 7: goto L_0x01fc;
                default: goto L_0x01ec;
            }
        L_0x01ec:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r2 = "Invalid mask pattern: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x01fc:
            int r15 = r5 * r12
            int r15 = r15 % r7
            int r16 = r5 + r12
            r17 = 1
            r16 = r16 & 1
            goto L_0x020b
        L_0x0206:
            int r15 = r5 * r12
            r16 = r15 & 1
            int r15 = r15 % r7
        L_0x020b:
            int r15 = r15 + r16
            goto L_0x022c
        L_0x020e:
            int r15 = r5 * r12
            r16 = r15 & 1
            int r15 = r15 % r7
            int r15 = r15 + r16
            goto L_0x0223
        L_0x0216:
            int r15 = r5 / 2
            int r16 = r12 / 3
            int r15 = r16 + r15
            goto L_0x022c
        L_0x021d:
            int r15 = r5 + r12
            int r15 = r15 % r7
            goto L_0x0223
        L_0x0221:
            int r15 = r12 % 3
        L_0x0223:
            r16 = r15
            r15 = 1
            goto L_0x0231
        L_0x0227:
            r16 = r5
            goto L_0x022e
        L_0x022a:
            int r15 = r5 + r12
        L_0x022c:
            r16 = r15
        L_0x022e:
            r15 = 1
            r16 = r16 & 1
        L_0x0231:
            if (r16 != 0) goto L_0x0236
            r16 = r15
            goto L_0x0238
        L_0x0236:
            r16 = r11
        L_0x0238:
            if (r16 == 0) goto L_0x023e
            r13 = r13 ^ 1
            goto L_0x023e
        L_0x023d:
            r15 = 1
        L_0x023e:
            r3.mo47036c(r12, r5, r13)
            goto L_0x0244
        L_0x0242:
            r14 = -1
            r15 = 1
        L_0x0244:
            int r9 = r9 + 1
            goto L_0x01cc
        L_0x0247:
            r14 = -1
            r15 = 1
            int r5 = r5 + r8
            goto L_0x01c4
        L_0x024c:
            r10 = 2
            r14 = -1
            r15 = 1
            int r8 = -r8
            int r5 = r5 + r8
            int r1 = r1 + -2
            goto L_0x01be
        L_0x0255:
            int r1 = r0.f41277c
            if (r4 != r1) goto L_0x025a
            return
        L_0x025a:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Not all bits consumed: "
            r2.<init>(r3)
            r2.append(r4)
            r3 = 47
            r2.append(r3)
            int r0 = r0.f41277c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0278:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            int r2 = r4.f41277c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x028c:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            int r2 = r4.f41277c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Sizes don't match"
            r0.<init>(r1)
            throw r0
        L_0x02a8:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Invalid mask pattern"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02b0:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.C14141d.m21891a(vn.a, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, com.google.zxing.qrcode.decoder.a, int, bo.b):void");
    }

    /* renamed from: b */
    public static int m21892b(int i, int i2) {
        if (i2 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i2);
            int i3 = i << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i3) >= numberOfLeadingZeros) {
                i3 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i3)) - numberOfLeadingZeros);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    public static void m21893c(int i, int i2, C14138b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m21896f(bVar.mo47034a(i4, i2))) {
                bVar.mo47035b(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: d */
    public static void m21894d(int i, int i2, C14138b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f31154a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo47035b(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: e */
    public static void m21895e(int i, int i2, C14138b bVar) throws WriterException {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m21896f(bVar.mo47034a(i, i4))) {
                bVar.mo47035b(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: f */
    public static boolean m21896f(int i) {
        return i == -1;
    }
}
