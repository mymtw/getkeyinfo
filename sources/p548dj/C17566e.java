package p548dj;

/* renamed from: dj.e */
public final class C17566e {
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c4 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<p548dj.C17563d.C17564a> m29436a(p513bj.C14077r r27) {
        /*
            r0 = r27
            int r1 = r27.mo46925p()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 7
            r0.mo46909A(r1)
            int r3 = r27.mo46912c()
            r4 = 1684433976(0x64666c38, float:1.7002196E22)
            r5 = 1
            if (r3 != r4) goto L_0x0037
            bj.r r3 = new bj.r
            r3.<init>()
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r5)
            boolean r0 = p513bj.C14049b0.m21620A(r0, r3, r4)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002c
            r4.end()
            return r2
        L_0x002c:
            r4.end()
            r0 = r3
            goto L_0x003d
        L_0x0031:
            r0 = move-exception
            r1 = r0
            r4.end()
            throw r1
        L_0x0037:
            r4 = 1918990112(0x72617720, float:4.465801E30)
            if (r3 == r4) goto L_0x003d
            return r2
        L_0x003d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.f30987b
            int r6 = r0.f30988c
        L_0x0046:
            if (r4 >= r6) goto L_0x01c6
            int r7 = r0.mo46912c()
            int r7 = r7 + r4
            if (r7 <= r4) goto L_0x01c4
            if (r7 <= r6) goto L_0x0053
            goto L_0x01c4
        L_0x0053:
            int r4 = r0.mo46912c()
            r8 = 1835365224(0x6d657368, float:4.438224E27)
            if (r4 != r8) goto L_0x01b2
            int r4 = r0.mo46912c()
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r4 <= r8) goto L_0x0065
            goto L_0x007f
        L_0x0065:
            float[] r8 = new float[r4]
            r10 = 0
        L_0x0068:
            if (r10 >= r4) goto L_0x0077
            int r11 = r0.mo46912c()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x0068
        L_0x0077:
            int r10 = r0.mo46912c()
            r11 = 32000(0x7d00, float:4.4842E-41)
            if (r10 <= r11) goto L_0x0087
        L_0x007f:
            r27 = r3
        L_0x0081:
            r20 = r5
            r19 = r6
            goto L_0x0182
        L_0x0087:
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.log(r11)
            r27 = r3
            double r2 = (double) r4
            double r2 = r2 * r11
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r13
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            bj.q r3 = new bj.q
            byte[] r9 = r0.f30986a
            int r15 = r9.length
            r3.<init>((int) r15, (byte[]) r9)
            int r9 = r0.f30987b
            r15 = 8
            int r9 = r9 * r15
            r3.mo46905l(r9)
            int r9 = r10 * 5
            float[] r9 = new float[r9]
            r11 = 5
            int[] r12 = new int[r11]
            r1 = 0
            r18 = 0
        L_0x00b5:
            if (r1 >= r10) goto L_0x00e2
            r15 = 0
        L_0x00b8:
            if (r15 >= r11) goto L_0x00dc
            r19 = r12[r15]
            int r20 = r3.mo46901h(r2)
            int r21 = r20 >> 1
            r11 = r20 & 1
            int r11 = -r11
            r11 = r11 ^ r21
            int r11 = r11 + r19
            if (r11 >= r4) goto L_0x0081
            if (r11 >= 0) goto L_0x00ce
            goto L_0x010f
        L_0x00ce:
            int r19 = r18 + 1
            r20 = r8[r11]
            r9[r18] = r20
            r12[r15] = r11
            int r15 = r15 + 1
            r18 = r19
            r11 = 5
            goto L_0x00b8
        L_0x00dc:
            int r1 = r1 + 1
            r11 = 5
            r15 = 8
            goto L_0x00b5
        L_0x00e2:
            int r1 = r3.f30982a
            r2 = 8
            int r1 = r1 * r2
            int r2 = r3.f30983b
            int r1 = r1 + r2
            r2 = 7
            int r1 = r1 + r2
            r1 = r1 & -8
            r3.mo46905l(r1)
            r1 = 32
            int r4 = r3.mo46901h(r1)
            dj.d$b[] r8 = new p548dj.C17563d.C17565b[r4]
            r11 = 0
        L_0x00fa:
            if (r11 >= r4) goto L_0x01a0
            r12 = 8
            int r15 = r3.mo46901h(r12)
            int r2 = r3.mo46901h(r12)
            int r12 = r3.mo46901h(r1)
            r1 = 128000(0x1f400, float:1.79366E-40)
            if (r12 <= r1) goto L_0x0111
        L_0x010f:
            goto L_0x0081
        L_0x0111:
            r19 = r6
            double r5 = (double) r10
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r16
            double r5 = java.lang.Math.log(r5)
            double r5 = r5 / r13
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r6 = r12 * 3
            float[] r6 = new float[r6]
            int r1 = r12 * 2
            float[] r1 = new float[r1]
            r21 = r1
            r1 = 0
            r22 = 0
        L_0x012f:
            if (r1 >= r12) goto L_0x0184
            int r23 = r3.mo46901h(r5)
            int r24 = r23 >> 1
            r25 = r3
            r20 = 1
            r3 = r23 & 1
            r23 = r4
            r4 = r21
            int r3 = -r3
            r3 = r3 ^ r24
            int r3 = r3 + r22
            if (r3 < 0) goto L_0x0180
            if (r3 < r10) goto L_0x014b
            goto L_0x0180
        L_0x014b:
            int r21 = r1 * 3
            int r22 = r3 * 5
            r24 = r9[r22]
            r6[r21] = r24
            int r24 = r21 + 1
            int r26 = r22 + 1
            r26 = r9[r26]
            r6[r24] = r26
            int r21 = r21 + 2
            int r24 = r22 + 2
            r24 = r9[r24]
            r6[r21] = r24
            int r21 = r1 * 2
            int r24 = r22 + 3
            r24 = r9[r24]
            r4[r21] = r24
            r20 = 1
            int r21 = r21 + 1
            int r22 = r22 + 4
            r22 = r9[r22]
            r4[r21] = r22
            int r1 = r1 + 1
            r22 = r3
            r21 = r4
            r4 = r23
            r3 = r25
            goto L_0x012f
        L_0x0180:
            r20 = 1
        L_0x0182:
            r1 = 0
            goto L_0x01a9
        L_0x0184:
            r25 = r3
            r23 = r4
            r4 = r21
            r20 = 1
            dj.d$b r1 = new dj.d$b
            r1.<init>(r15, r2, r6, r4)
            r8[r11] = r1
            int r11 = r11 + 1
            r6 = r19
            r5 = r20
            r4 = r23
            r1 = 32
            r2 = 7
            goto L_0x00fa
        L_0x01a0:
            r20 = r5
            r19 = r6
            dj.d$a r1 = new dj.d$a
            r1.<init>(r8)
        L_0x01a9:
            if (r1 != 0) goto L_0x01ac
            goto L_0x01c4
        L_0x01ac:
            r2 = r27
            r2.add(r1)
            goto L_0x01b7
        L_0x01b2:
            r2 = r3
            r20 = r5
            r19 = r6
        L_0x01b7:
            r0.mo46935z(r7)
            r3 = r2
            r4 = r7
            r6 = r19
            r5 = r20
            r1 = 7
            r2 = 0
            goto L_0x0046
        L_0x01c4:
            r2 = 0
            goto L_0x01c7
        L_0x01c6:
            r2 = r3
        L_0x01c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p548dj.C17566e.m29436a(bj.r):java.util.ArrayList");
    }
}
