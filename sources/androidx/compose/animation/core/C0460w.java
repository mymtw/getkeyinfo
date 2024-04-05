package androidx.compose.animation.core;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;

/* renamed from: androidx.compose.animation.core.w */
public final class C0460w implements C0456u {

    /* renamed from: a */
    public final float f1189a;

    /* renamed from: b */
    public final C0427g0 f1190b;

    public C0460w() {
        this(0.0f, 0.0f, 7);
    }

    public C0460w(float f, float f2, float f3) {
        this.f1189a = f3;
        C0427g0 g0Var = new C0427g0();
        if (f >= 0.0f) {
            g0Var.f1124g = f;
            g0Var.f1120c = false;
            double d = g0Var.f1119b;
            if (((float) (d * d)) > 0.0f) {
                g0Var.f1119b = Math.sqrt((double) f2);
                g0Var.f1120c = false;
                this.f1190b = g0Var;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: b */
    public final float mo3530b(float f, float f2, float f3) {
        return 0.0f;
    }

    /* renamed from: c */
    public final float mo3531c(long j, float f, float f2, float f3) {
        C0427g0 g0Var = this.f1190b;
        g0Var.f1118a = f2;
        return Float.intBitsToFloat((int) (g0Var.mo3496a(f, j / 1000000, f3) >> 32));
    }

    /* renamed from: d */
    public final float mo3532d(long j, float f, float f2, float f3) {
        C0427g0 g0Var = this.f1190b;
        g0Var.f1118a = f2;
        return Float.intBitsToFloat((int) (g0Var.mo3496a(f, j / 1000000, f3) & UnsignedInteger.INT_MASK));
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0177  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo3533e(float r36, float r37, float r38) {
        /*
            r35 = this;
            r0 = r35
            androidx.compose.animation.core.g0 r1 = r0.f1190b
            double r2 = r1.f1119b
            double r2 = r2 * r2
            float r2 = (float) r2
            float r1 = r1.f1124g
            float r3 = r36 - r37
            float r4 = r0.f1189a
            float r3 = r3 / r4
            float r4 = r38 / r4
            r5 = 1065353216(0x3f800000, float:1.0)
            double r6 = (double) r2
            double r1 = (double) r1
            double r8 = (double) r4
            double r3 = (double) r3
            double r10 = (double) r5
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r1 * r12
            double r16 = java.lang.Math.sqrt(r6)
            double r14 = r14 * r16
            double r12 = -r14
            double r14 = r14 * r14
            r16 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r6 = r6 * r16
            double r14 = r14 - r6
            androidx.compose.animation.core.l r5 = com.google.android.play.core.assetpacks.C15588c1.m25300Q(r14)
            double r6 = r5.f1148a
            double r6 = r6 + r12
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r16
            r5.f1148a = r6
            double r6 = r5.f1149b
            double r6 = r6 / r16
            r5.f1149b = r6
            androidx.compose.animation.core.l r6 = com.google.android.play.core.assetpacks.C15588c1.m25300Q(r14)
            double r14 = r6.f1148a
            r7 = -1
            r18 = r10
            double r10 = (double) r7
            double r14 = r14 * r10
            r20 = r1
            double r0 = r6.f1149b
            double r0 = r0 * r10
            double r14 = r14 + r12
            double r14 = r14 / r16
            r6.f1148a = r14
            double r0 = r0 / r16
            r6.f1149b = r0
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r6)
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L_0x0063
            r10 = r6
            goto L_0x0064
        L_0x0063:
            r10 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0073
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 != 0) goto L_0x006c
            r10 = r6
            goto L_0x006d
        L_0x006c:
            r10 = 0
        L_0x006d:
            if (r10 == 0) goto L_0x0073
            r0 = 0
            goto L_0x02d1
        L_0x0073:
            if (r5 >= 0) goto L_0x0076
            double r8 = -r8
        L_0x0076:
            double r15 = java.lang.Math.abs(r3)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            r31 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r33 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r5 <= 0) goto L_0x01a8
            java.lang.Object r3 = r0.getFirst()
            androidx.compose.animation.core.l r3 = (androidx.compose.animation.core.C0436l) r3
            double r3 = r3.f1148a
            java.lang.Object r0 = r0.getSecond()
            androidx.compose.animation.core.l r0 = (androidx.compose.animation.core.C0436l) r0
            double r10 = r0.f1148a
            double r20 = r3 * r15
            double r20 = r20 - r8
            double r8 = r3 - r10
            double r13 = r20 / r8
            double r15 = r15 - r13
            double r20 = r18 / r15
            double r20 = java.lang.Math.abs(r20)
            double r20 = java.lang.Math.log(r20)
            r36 = r8
            double r7 = r20 / r3
            double r20 = r18 / r13
            double r20 = java.lang.Math.abs(r20)
            double r20 = java.lang.Math.log(r20)
            double r1 = r20 / r10
            boolean r0 = java.lang.Double.isInfinite(r7)
            if (r0 != 0) goto L_0x00cb
            boolean r0 = java.lang.Double.isNaN(r7)
            if (r0 != 0) goto L_0x00cb
            r0 = r6
            goto L_0x00cc
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x00d1
            r7 = r1
            goto L_0x00e8
        L_0x00d1:
            boolean r0 = java.lang.Double.isInfinite(r1)
            if (r0 != 0) goto L_0x00df
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto L_0x00df
            r0 = r6
            goto L_0x00e0
        L_0x00df:
            r0 = 0
        L_0x00e0:
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x00e4
            goto L_0x00e8
        L_0x00e4:
            double r7 = java.lang.Math.max(r7, r1)
        L_0x00e8:
            double r0 = r15 * r3
            double r5 = -r13
            double r5 = r5 * r10
            double r5 = r0 / r5
            double r5 = java.lang.Math.log(r5)
            double r20 = r10 - r3
            double r5 = r5 / r20
            boolean r9 = java.lang.Double.isNaN(r5)
            if (r9 != 0) goto L_0x013b
            r20 = 0
            int r9 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r9 > 0) goto L_0x0103
            goto L_0x013b
        L_0x0103:
            int r9 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x012b
            double r20 = r3 * r5
            double r20 = java.lang.Math.exp(r20)
            double r20 = r20 * r15
            double r5 = r5 * r10
            double r5 = java.lang.Math.exp(r5)
            double r5 = r5 * r13
            double r5 = r5 + r20
            double r5 = -r5
            int r5 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x012b
            r5 = 0
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x013b
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x013b
            r0 = r18
            r22 = 0
            goto L_0x013f
        L_0x012b:
            double r5 = r13 * r10
            double r5 = r5 * r10
            double r5 = -r5
            double r0 = r0 * r3
            double r5 = r5 / r0
            double r0 = java.lang.Math.log(r5)
            r5 = r36
            double r0 = r0 / r5
            r29 = r18
            goto L_0x0144
        L_0x013b:
            r22 = r7
            r0 = r18
        L_0x013f:
            double r0 = -r0
            r29 = r0
            r0 = r22
        L_0x0144:
            androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1 r5 = new androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
            r20 = r5
            r21 = r15
            r23 = r3
            r25 = r13
            r27 = r10
            r20.<init>(r21, r23, r25, r27, r29)
            androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1 r6 = new androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
            r20 = r6
            r20.<init>(r21, r23, r25, r27)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            java.lang.Object r3 = r5.invoke(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            double r3 = r3.doubleValue()
            double r3 = java.lang.Math.abs(r3)
            r7 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0177
            goto L_0x02ca
        L_0x0177:
            r7 = 0
        L_0x0178:
            int r2 = (r33 > r31 ? 1 : (r33 == r31 ? 0 : -1))
            if (r2 <= 0) goto L_0x02ca
            r13 = 100
            if (r7 >= r13) goto L_0x02ca
            int r7 = r7 + 1
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            double r8 = r4.doubleValue()
            double r2 = r2 / r8
            double r2 = r0 - r2
            double r0 = r0 - r2
            double r33 = java.lang.Math.abs(r0)
            r0 = r2
            goto L_0x0178
        L_0x01a8:
            r10 = r18
            r13 = 100
            int r1 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x01d4
            java.lang.Object r1 = r0.getFirst()
            androidx.compose.animation.core.l r1 = (androidx.compose.animation.core.C0436l) r1
            double r1 = r1.f1148a
            double r3 = r1 * r15
            double r8 = r8 - r3
            java.lang.Object r0 = r0.getFirst()
            androidx.compose.animation.core.l r0 = (androidx.compose.animation.core.C0436l) r0
            double r3 = r0.f1149b
            double r8 = r8 / r3
            double r15 = r15 * r15
            double r8 = r8 * r8
            double r8 = r8 + r15
            double r3 = java.lang.Math.sqrt(r8)
            double r10 = r10 / r3
            double r3 = java.lang.Math.log(r10)
            double r0 = r3 / r1
            goto L_0x02ca
        L_0x01d4:
            java.lang.Object r0 = r0.getFirst()
            androidx.compose.animation.core.l r0 = (androidx.compose.animation.core.C0436l) r0
            double r0 = r0.f1148a
            double r3 = r0 * r15
            double r7 = r8 - r3
            double r17 = r10 / r15
            double r17 = java.lang.Math.abs(r17)
            double r17 = java.lang.Math.log(r17)
            double r13 = r17 / r0
            double r17 = r10 / r7
            double r17 = java.lang.Math.abs(r17)
            double r17 = java.lang.Math.log(r17)
            r19 = r17
            r5 = 0
        L_0x01f9:
            r9 = 6
            if (r5 >= r9) goto L_0x020b
            double r19 = r19 / r0
            double r19 = java.lang.Math.abs(r19)
            double r19 = java.lang.Math.log(r19)
            double r19 = r17 - r19
            int r5 = r5 + 1
            goto L_0x01f9
        L_0x020b:
            r24 = r3
            double r2 = r19 / r0
            boolean r4 = java.lang.Double.isInfinite(r13)
            if (r4 != 0) goto L_0x021d
            boolean r4 = java.lang.Double.isNaN(r13)
            if (r4 != 0) goto L_0x021d
            r4 = r6
            goto L_0x021e
        L_0x021d:
            r4 = 0
        L_0x021e:
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x0223
            r13 = r2
            goto L_0x023a
        L_0x0223:
            boolean r4 = java.lang.Double.isInfinite(r2)
            if (r4 != 0) goto L_0x0231
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L_0x0231
            r4 = r6
            goto L_0x0232
        L_0x0231:
            r4 = 0
        L_0x0232:
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x0236
            goto L_0x023a
        L_0x0236:
            double r13 = java.lang.Math.max(r13, r2)
        L_0x023a:
            double r3 = r24 + r7
            double r2 = -r3
            double r17 = r0 * r7
            double r2 = r2 / r17
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L_0x027f
            r17 = 0
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 > 0) goto L_0x024e
            goto L_0x027f
        L_0x024e:
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x0274
            double r17 = r0 * r2
            double r19 = java.lang.Math.exp(r17)
            double r19 = r19 * r15
            double r2 = r2 * r7
            double r17 = java.lang.Math.exp(r17)
            double r17 = r17 * r2
            double r2 = r17 + r19
            double r2 = -r2
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0274
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x027f
            int r4 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x027f
            r13 = r2
            goto L_0x027f
        L_0x0274:
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r2 / r0
            double r2 = -r12
            double r12 = r15 / r7
            double r2 = r2 - r12
            r29 = r10
            goto L_0x0283
        L_0x027f:
            double r10 = -r10
            r29 = r10
            r2 = r13
        L_0x0283:
            androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1 r4 = new androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            r22 = r4
            r23 = r15
            r25 = r7
            r27 = r0
            r22.<init>(r23, r25, r27, r29)
            androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 r6 = new androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            r10 = r6
            r11 = r7
            r7 = 100
            r13 = r0
            r10.<init>(r11, r13, r15)
            r0 = r2
            r5 = 0
        L_0x029c:
            int r2 = (r33 > r31 ? 1 : (r33 == r31 ? 0 : -1))
            if (r2 <= 0) goto L_0x02ca
            if (r5 >= r7) goto L_0x02ca
            int r5 = r5 + 1
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
            java.lang.Object r8 = r6.invoke(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            double r8 = r8.doubleValue()
            double r2 = r2 / r8
            double r2 = r0 - r2
            double r0 = r0 - r2
            double r33 = java.lang.Math.abs(r0)
            r0 = r2
            goto L_0x029c
        L_0x02ca:
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            long r0 = (long) r0
        L_0x02d1:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.C0460w.mo3533e(float, float, float):long");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0460w(float f, float f2, int i) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : 0.0f);
    }
}
