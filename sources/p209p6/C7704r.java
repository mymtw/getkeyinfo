package p209p6;

import androidx.work.C3436p;

/* renamed from: p6.r */
public final class C7704r extends C3436p {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p209p6.C7686e mo12959n(p209p6.C7686e r19, java.math.BigInteger r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0 instanceof p209p6.C7686e.C7688b
            if (r2 == 0) goto L_0x02a7
            p6.e$b r0 = (p209p6.C7686e.C7688b) r0
            p6.c r2 = r0.f17048a
            p6.c$a r2 = (p209p6.C7676c.C7677a) r2
            int r3 = r2.mo20072a()
            p6.d r4 = r2.f17024b
            java.math.BigInteger r4 = r4.mo20092a()
            byte r4 = r4.byteValue()
            java.math.BigInteger r5 = p209p6.C7697k.f17064a
            r5 = 1
            r6 = -1
            if (r4 != 0) goto L_0x0024
            r7 = r6
            goto L_0x0025
        L_0x0024:
            r7 = r5
        L_0x0025:
            byte r7 = (byte) r7
            monitor-enter(r2)
            java.math.BigInteger[] r8 = r2.f17031i     // Catch:{ all -> 0x02a4 }
            if (r8 != 0) goto L_0x0031
            java.math.BigInteger[] r8 = p209p6.C7697k.m14902c(r2)     // Catch:{ all -> 0x02a4 }
            r2.f17031i = r8     // Catch:{ all -> 0x02a4 }
        L_0x0031:
            java.math.BigInteger[] r8 = r2.f17031i     // Catch:{ all -> 0x02a4 }
            monitor-exit(r2)
            r2 = 0
            if (r7 != r5) goto L_0x0040
            r9 = r8[r2]
            r10 = r8[r5]
            java.math.BigInteger r9 = r9.add(r10)
            goto L_0x0048
        L_0x0040:
            r9 = r8[r2]
            r10 = r8[r5]
            java.math.BigInteger r9 = r9.subtract(r10)
        L_0x0048:
            java.math.BigInteger[] r10 = p209p6.C7697k.m14901b(r7, r3, r5)
            r10 = r10[r5]
            r11 = r8[r2]
            p6.j r11 = p209p6.C7697k.m14900a(r1, r11, r10, r4, r3)
            r12 = r8[r5]
            p6.j r3 = p209p6.C7697k.m14900a(r1, r12, r10, r4, r3)
            int r10 = r11.f17063b
            int r12 = r3.f17063b
            if (r12 != r10) goto L_0x029c
            if (r7 == r5) goto L_0x006d
            if (r7 != r6) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "mu must be 1 or -1"
            r0.<init>(r1)
            throw r0
        L_0x006d:
            java.math.BigInteger r10 = r11.mo20165d()
            java.math.BigInteger r12 = r3.mo20165d()
            p6.j r13 = new p6.j
            java.math.BigInteger r14 = r11.f17062a
            int r15 = r11.f17063b
            java.math.BigInteger r15 = r10.shiftLeft(r15)
            java.math.BigInteger r14 = r14.subtract(r15)
            int r11 = r11.f17063b
            r13.<init>(r11, r14)
            p6.j r11 = new p6.j
            java.math.BigInteger r14 = r3.f17062a
            int r15 = r3.f17063b
            java.math.BigInteger r15 = r12.shiftLeft(r15)
            java.math.BigInteger r14 = r14.subtract(r15)
            int r3 = r3.f17063b
            r11.<init>(r3, r14)
            p6.j r3 = r13.mo20162a(r13)
            if (r7 != r5) goto L_0x00a6
            p6.j r3 = r3.mo20162a(r11)
            goto L_0x00aa
        L_0x00a6:
            p6.j r3 = r3.mo20164c(r11)
        L_0x00aa:
            p6.j r14 = r11.mo20162a(r11)
            p6.j r14 = r14.mo20162a(r11)
            p6.j r11 = r14.mo20162a(r11)
            if (r7 != r5) goto L_0x00c1
            p6.j r14 = r13.mo20164c(r14)
            p6.j r11 = r13.mo20162a(r11)
            goto L_0x00c9
        L_0x00c1:
            p6.j r14 = r13.mo20162a(r14)
            p6.j r11 = r13.mo20164c(r11)
        L_0x00c9:
            java.math.BigInteger r13 = p209p6.C7675b.f17019b
            int r15 = r3.mo20163b(r13)
            if (r15 < 0) goto L_0x00de
            java.math.BigInteger r15 = p209p6.C7697k.f17064a
            int r15 = r14.mo20163b(r15)
            if (r15 >= 0) goto L_0x00da
            goto L_0x00e6
        L_0x00da:
            r16 = r2
            r15 = r5
            goto L_0x00ed
        L_0x00de:
            java.math.BigInteger r15 = p209p6.C7675b.f17020c
            int r15 = r11.mo20163b(r15)
            if (r15 < 0) goto L_0x00ea
        L_0x00e6:
            r15 = r2
            r16 = r7
            goto L_0x00ed
        L_0x00ea:
            r15 = r2
            r16 = r15
        L_0x00ed:
            java.math.BigInteger r6 = p209p6.C7697k.f17064a
            int r3 = r3.mo20163b(r6)
            if (r3 >= 0) goto L_0x0100
            int r3 = r14.mo20163b(r13)
            if (r3 < 0) goto L_0x00fc
            goto L_0x0108
        L_0x00fc:
            r3 = r16
            r15 = -1
            goto L_0x010d
        L_0x0100:
            java.math.BigInteger r3 = p209p6.C7697k.f17065b
            int r3 = r11.mo20163b(r3)
            if (r3 >= 0) goto L_0x010b
        L_0x0108:
            int r3 = -r7
            byte r3 = (byte) r3
            goto L_0x010d
        L_0x010b:
            r3 = r16
        L_0x010d:
            long r13 = (long) r15
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r13)
            java.math.BigInteger r6 = r10.add(r6)
            long r10 = (long) r3
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r10)
            java.math.BigInteger r3 = r12.add(r3)
            java.math.BigInteger r9 = r9.multiply(r6)
            java.math.BigInteger r1 = r1.subtract(r9)
            r9 = 2
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            r10 = r8[r5]
            java.math.BigInteger r9 = r9.multiply(r10)
            java.math.BigInteger r9 = r9.multiply(r3)
            java.math.BigInteger r1 = r1.subtract(r9)
            r9 = r8[r5]
            java.math.BigInteger r6 = r9.multiply(r6)
            r8 = r8[r2]
            java.math.BigInteger r3 = r8.multiply(r3)
            java.math.BigInteger r3 = r6.subtract(r3)
            if (r4 != 0) goto L_0x0150
            j3.h[] r4 = p209p6.C7697k.f17066c
            goto L_0x0152
        L_0x0150:
            j3.h[] r4 = p209p6.C7697k.f17068e
        L_0x0152:
            if (r7 != r5) goto L_0x0157
            r8 = 6
            goto L_0x0159
        L_0x0157:
            r8 = 10
        L_0x0159:
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r8)
            r8 = 16
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.lang.String r9 = "mu must be 1 or -1"
            if (r7 == r5) goto L_0x0171
            r10 = -1
            if (r7 != r10) goto L_0x016b
            goto L_0x0171
        L_0x016b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x0171:
            java.math.BigInteger r10 = r1.multiply(r1)
            java.math.BigInteger r11 = r1.multiply(r3)
            java.math.BigInteger r12 = r3.multiply(r3)
            java.math.BigInteger r12 = r12.shiftLeft(r5)
            if (r7 != r5) goto L_0x0188
            java.math.BigInteger r9 = r10.add(r11)
            goto L_0x018f
        L_0x0188:
            r13 = -1
            if (r7 != r13) goto L_0x0296
            java.math.BigInteger r9 = r10.subtract(r11)
        L_0x018f:
            java.math.BigInteger r9 = r9.add(r12)
            int r9 = r9.bitLength()
            r10 = 30
            if (r9 <= r10) goto L_0x01a0
            int r9 = r9 + 4
            int r9 = r9 + 4
            goto L_0x01a2
        L_0x01a0:
            r9 = 38
        L_0x01a2:
            r10 = r9
            byte[] r11 = new byte[r10]
            java.math.BigInteger r12 = r8.shiftRight(r5)
            r9 = r2
        L_0x01aa:
            java.math.BigInteger r13 = p209p6.C7675b.f17018a
            boolean r14 = r1.equals(r13)
            if (r14 == 0) goto L_0x021d
            boolean r13 = r3.equals(r13)
            if (r13 != 0) goto L_0x01b9
            goto L_0x021d
        L_0x01b9:
            p6.c r1 = r0.f17048a
            p6.c$a r1 = (p209p6.C7676c.C7677a) r1
            p6.d r3 = r1.f17024b
            java.math.BigInteger r3 = r3.mo20092a()
            byte r3 = r3.byteValue()
            p6.q r4 = new p6.q
            r4.<init>(r0, r3)
            java.lang.String r3 = "bc_wtnaf"
            p6.i r1 = r1.mo20083j(r0, r3, r4)
            p6.s r1 = (p209p6.C7705s) r1
            p6.e$b[] r1 = r1.f17085a
            int r3 = r1.length
            p6.e$b[] r3 = new p209p6.C7686e.C7688b[r3]
            r4 = r2
        L_0x01da:
            int r6 = r1.length
            if (r4 >= r6) goto L_0x01ea
            r6 = r1[r4]
            p6.e r6 = r6.mo20144v()
            p6.e$b r6 = (p209p6.C7686e.C7688b) r6
            r3[r4] = r6
            int r4 = r4 + 1
            goto L_0x01da
        L_0x01ea:
            p6.c r0 = r0.f17048a
            p6.e r0 = r0.mo20089p()
            p6.e$b r0 = (p209p6.C7686e.C7688b) r0
            r13 = -1
            int r10 = r10 + r13
            r4 = r2
        L_0x01f5:
            if (r10 < 0) goto L_0x0216
            int r4 = r4 + 1
            byte r6 = r11[r10]
            if (r6 == 0) goto L_0x0213
            p6.e$b r0 = r0.mo20148y(r4)
            if (r6 <= 0) goto L_0x0208
            int r4 = r6 >>> 1
            r4 = r1[r4]
            goto L_0x020c
        L_0x0208:
            int r4 = -r6
            int r4 = r4 >>> r5
            r4 = r3[r4]
        L_0x020c:
            p6.e r0 = r0.mo20131j(r4)
            p6.e$b r0 = (p209p6.C7686e.C7688b) r0
            r4 = r2
        L_0x0213:
            int r10 = r10 + -1
            goto L_0x01f5
        L_0x0216:
            if (r4 <= 0) goto L_0x021c
            p6.e$b r0 = r0.mo20148y(r4)
        L_0x021c:
            return r0
        L_0x021d:
            r13 = -1
            boolean r14 = r1.testBit(r2)
            if (r14 == 0) goto L_0x0274
            java.math.BigInteger r14 = r3.multiply(r6)
            java.math.BigInteger r14 = r1.add(r14)
            java.math.BigInteger r14 = r14.mod(r8)
            int r15 = r14.compareTo(r12)
            if (r15 < 0) goto L_0x023a
            java.math.BigInteger r14 = r14.subtract(r8)
        L_0x023a:
            int r14 = r14.intValue()
            byte r14 = (byte) r14
            r11[r9] = r14
            if (r14 >= 0) goto L_0x0247
            int r14 = -r14
            byte r14 = (byte) r14
            r15 = r2
            goto L_0x0248
        L_0x0247:
            r15 = r5
        L_0x0248:
            if (r15 == 0) goto L_0x025f
            r15 = r4[r14]
            java.lang.Object r15 = r15.f15811c
            java.math.BigInteger r15 = (java.math.BigInteger) r15
            java.math.BigInteger r1 = r1.subtract(r15)
            r14 = r4[r14]
            java.lang.Object r14 = r14.f15812d
            java.math.BigInteger r14 = (java.math.BigInteger) r14
            java.math.BigInteger r3 = r3.subtract(r14)
            goto L_0x0276
        L_0x025f:
            r15 = r4[r14]
            java.lang.Object r15 = r15.f15811c
            java.math.BigInteger r15 = (java.math.BigInteger) r15
            java.math.BigInteger r1 = r1.add(r15)
            r14 = r4[r14]
            java.lang.Object r14 = r14.f15812d
            java.math.BigInteger r14 = (java.math.BigInteger) r14
            java.math.BigInteger r3 = r3.add(r14)
            goto L_0x0276
        L_0x0274:
            r11[r9] = r2
        L_0x0276:
            java.math.BigInteger r14 = r1.shiftRight(r5)
            if (r7 != r5) goto L_0x0281
            java.math.BigInteger r3 = r3.add(r14)
            goto L_0x0285
        L_0x0281:
            java.math.BigInteger r3 = r3.subtract(r14)
        L_0x0285:
            java.math.BigInteger r1 = r1.shiftRight(r5)
            java.math.BigInteger r1 = r1.negate()
            int r9 = r9 + 1
            r17 = r3
            r3 = r1
            r1 = r17
            goto L_0x01aa
        L_0x0296:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x029c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "lambda0 and lambda1 do not have same scale"
            r0.<init>(r1)
            throw r0
        L_0x02a4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only ECPoint.AbstractF2m can be used in WTauNafMultiplier"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p6.C7704r.mo12959n(p6.e, java.math.BigInteger):p6.e");
    }
}
