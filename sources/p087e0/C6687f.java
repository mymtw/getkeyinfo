package p087e0;

/* renamed from: e0.f */
public final class C6687f {

    /* renamed from: a */
    public final C6683b[] f14756a;

    /* renamed from: b */
    public int f14757b;

    /* renamed from: c */
    public final boolean f14758c;

    public C6687f() {
        C6683b[] bVarArr = new C6683b[20];
        for (int i = 0; i < 20; i++) {
            bVarArr[i] = null;
        }
        this.f14756a = bVarArr;
        this.f14758c = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo18849a() {
        /*
            r25 = this;
            r0 = r25
            boolean r1 = r0.f14758c
            r3 = 20
            r5 = 1
            if (r1 == 0) goto L_0x0108
            e0.b[] r1 = r0.f14756a
            int r6 = r0.f14757b
            r1 = r1[r6]
            r7 = 0
            if (r1 != 0) goto L_0x0018
            long r1 = androidx.compose.p015ui.text.input.C1993m.m4370p(r7, r7)
            goto L_0x0107
        L_0x0018:
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = r1
            r16 = r5
            r22 = r16
            r15 = r7
            r20 = r15
            r12 = r8
            r17 = r12
            r14 = 2143289344(0x7fc00000, float:NaN)
            r19 = 2143289344(0x7fc00000, float:NaN)
            r21 = 0
        L_0x002e:
            int r6 = r6 + r5
            int r6 = r6 % r3
            e0.b[] r4 = r0.f14756a
            r4 = r4[r6]
            if (r4 != 0) goto L_0x003c
            r24 = r6
        L_0x0038:
            r2 = r21
            goto L_0x00de
        L_0x003c:
            long r2 = r1.f14746b
            r24 = r6
            long r5 = r4.f14746b
            long r2 = r2 - r5
            long r10 = r11.f14746b
            long r5 = r5 - r10
            long r5 = java.lang.Math.abs(r5)
            r10 = 100
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0052
            r11 = r1
            goto L_0x0038
        L_0x0052:
            r10 = 40
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0066
            r15 = r7
            r20 = r15
            r12 = r8
            r17 = r12
            r14 = 2143289344(0x7fc00000, float:NaN)
            r16 = 1
            r19 = 2143289344(0x7fc00000, float:NaN)
            r22 = 1
        L_0x0066:
            long r2 = -r2
            long r5 = r4.f14745a
            float r5 = p288y.C8343c.m16642c(r5)
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 981668463(0x3a83126f, float:0.001)
            if (r6 == 0) goto L_0x009a
            boolean r6 = java.lang.Float.isNaN(r14)
            if (r6 == 0) goto L_0x007d
            goto L_0x009a
        L_0x007d:
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0082
            goto L_0x009b
        L_0x0082:
            float r6 = androidx.compose.foundation.layout.C0761x.m1742s(r15)
            float r14 = r5 - r14
            long r12 = r2 - r12
            float r12 = (float) r12
            float r12 = r12 * r11
            float r14 = r14 / r12
            float r6 = r14 - r6
            float r12 = java.lang.Math.abs(r14)
            float r12 = r12 * r6
            float r15 = r15 + r12
            if (r16 == 0) goto L_0x009a
            float r15 = r15 * r10
            r16 = 0
        L_0x009a:
            r12 = r2
        L_0x009b:
            long r10 = r4.f14745a
            float r4 = p288y.C8343c.m16643d(r10)
            int r10 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x00d4
            boolean r10 = java.lang.Float.isNaN(r19)
            if (r10 == 0) goto L_0x00ac
            goto L_0x00d4
        L_0x00ac:
            int r10 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r10 != 0) goto L_0x00b1
            goto L_0x00d6
        L_0x00b1:
            float r10 = androidx.compose.foundation.layout.C0761x.m1742s(r20)
            float r11 = r4 - r19
            long r8 = r2 - r17
            float r8 = (float) r8
            r9 = 981668463(0x3a83126f, float:0.001)
            float r8 = r8 * r9
            float r11 = r11 / r8
            float r8 = r11 - r10
            float r9 = java.lang.Math.abs(r11)
            float r9 = r9 * r8
            float r9 = r9 + r20
            if (r22 == 0) goto L_0x00cf
            r6 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r6
            r22 = 0
        L_0x00cf:
            r17 = r2
            r20 = r9
            goto L_0x00d6
        L_0x00d4:
            r17 = r2
        L_0x00d6:
            int r21 = r21 + 1
            r11 = r1
            r19 = r4
            r14 = r5
            goto L_0x0038
        L_0x00de:
            int r3 = r0.f14757b
            r6 = r24
            if (r6 == r3) goto L_0x00f3
            r3 = 20
            if (r2 < r3) goto L_0x00e9
            goto L_0x00f3
        L_0x00e9:
            r21 = r2
            r5 = 1
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x002e
        L_0x00f3:
            r1 = 3
            if (r2 >= r1) goto L_0x00fb
            long r1 = androidx.compose.p015ui.text.input.C1993m.m4370p(r7, r7)
            goto L_0x0107
        L_0x00fb:
            float r1 = androidx.compose.foundation.layout.C0761x.m1742s(r15)
            float r2 = androidx.compose.foundation.layout.C0761x.m1742s(r20)
            long r1 = androidx.compose.p015ui.text.input.C1993m.m4370p(r1, r2)
        L_0x0107:
            return r1
        L_0x0108:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.f14757b
            e0.b[] r5 = r0.f14756a
            r5 = r5[r4]
            if (r5 != 0) goto L_0x0123
            e0.e r1 = p087e0.C6686e.f14751e
            goto L_0x01e3
        L_0x0123:
            r6 = r5
            r23 = 0
        L_0x0126:
            e0.b[] r7 = r0.f14756a
            r7 = r7[r4]
            if (r7 != 0) goto L_0x012d
            goto L_0x017b
        L_0x012d:
            long r8 = r5.f14746b
            long r10 = r7.f14746b
            long r8 = r8 - r10
            float r8 = (float) r8
            long r12 = r6.f14746b
            long r10 = r10 - r12
            long r9 = java.lang.Math.abs(r10)
            float r9 = (float) r9
            r10 = 1120403456(0x42c80000, float:100.0)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x017b
            r10 = 1109393408(0x42200000, float:40.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0148
            goto L_0x017b
        L_0x0148:
            long r9 = r7.f14745a
            float r6 = p288y.C8343c.m16642c(r9)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r1.add(r6)
            float r6 = p288y.C8343c.m16643d(r9)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r2.add(r6)
            float r6 = -r8
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r3.add(r6)
            if (r4 != 0) goto L_0x016c
            r4 = 20
        L_0x016c:
            r6 = 1
            int r4 = r4 - r6
            int r6 = r23 + 1
            r8 = 20
            if (r6 < r8) goto L_0x0177
            r4 = r6
            r6 = r7
            goto L_0x017d
        L_0x0177:
            r23 = r6
            r6 = r7
            goto L_0x0126
        L_0x017b:
            r4 = r23
        L_0x017d:
            r7 = 3
            if (r4 < r7) goto L_0x01c9
            e0.c r1 = androidx.compose.foundation.layout.C0761x.m1658B0(r3, r1)     // Catch:{ IllegalArgumentException -> 0x01c6 }
            e0.c r2 = androidx.compose.foundation.layout.C0761x.m1658B0(r3, r2)     // Catch:{ IllegalArgumentException -> 0x01c6 }
            java.util.List<java.lang.Float> r3 = r1.f14747a     // Catch:{ IllegalArgumentException -> 0x01c6 }
            r4 = 1
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IllegalArgumentException -> 0x01c6 }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ IllegalArgumentException -> 0x01c6 }
            float r3 = r3.floatValue()     // Catch:{ IllegalArgumentException -> 0x01c6 }
            java.util.List<java.lang.Float> r7 = r2.f14747a     // Catch:{ IllegalArgumentException -> 0x01c6 }
            java.lang.Object r4 = r7.get(r4)     // Catch:{ IllegalArgumentException -> 0x01c6 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ IllegalArgumentException -> 0x01c6 }
            float r4 = r4.floatValue()     // Catch:{ IllegalArgumentException -> 0x01c6 }
            e0.e r15 = new e0.e     // Catch:{ IllegalArgumentException -> 0x01c6 }
            r7 = 1000(0x3e8, float:1.401E-42)
            float r7 = (float) r7     // Catch:{ IllegalArgumentException -> 0x01c6 }
            float r3 = r3 * r7
            float r4 = r4 * r7
            long r8 = kotlin.reflect.C19421p.m32952q(r3, r4)     // Catch:{ IllegalArgumentException -> 0x01c6 }
            float r1 = r1.f14748b     // Catch:{ IllegalArgumentException -> 0x01c6 }
            float r2 = r2.f14748b     // Catch:{ IllegalArgumentException -> 0x01c6 }
            float r10 = r1 * r2
            long r1 = r5.f14746b     // Catch:{ IllegalArgumentException -> 0x01c6 }
            long r3 = r6.f14746b     // Catch:{ IllegalArgumentException -> 0x01c6 }
            long r11 = r1 - r3
            long r1 = r5.f14745a     // Catch:{ IllegalArgumentException -> 0x01c6 }
            long r3 = r6.f14745a     // Catch:{ IllegalArgumentException -> 0x01c6 }
            long r13 = p288y.C8343c.m16644e(r1, r3)     // Catch:{ IllegalArgumentException -> 0x01c6 }
            r7 = r15
            r7.<init>(r8, r10, r11, r13)     // Catch:{ IllegalArgumentException -> 0x01c6 }
            r1 = r15
            goto L_0x01e3
        L_0x01c6:
            e0.e r1 = p087e0.C6686e.f14751e
            goto L_0x01e3
        L_0x01c9:
            e0.e r1 = new e0.e
            long r3 = p288y.C8343c.f18295b
            r7 = 1065353216(0x3f800000, float:1.0)
            long r8 = r5.f14746b
            long r10 = r6.f14746b
            long r8 = r8 - r10
            long r10 = r5.f14745a
            long r5 = r6.f14745a
            long r10 = p288y.C8343c.m16644e(r10, r5)
            r2 = r1
            r5 = r7
            r6 = r8
            r8 = r10
            r2.<init>(r3, r5, r6, r8)
        L_0x01e3:
            long r1 = r1.f14752a
            float r3 = p288y.C8343c.m16642c(r1)
            float r1 = p288y.C8343c.m16643d(r1)
            long r1 = androidx.compose.p015ui.text.input.C1993m.m4370p(r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p087e0.C6687f.mo18849a():long");
    }
}
