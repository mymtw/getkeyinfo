package p184n0;

import com.google.android.material.shadow.ShadowDrawableWrapper;

/* renamed from: n0.d */
public final class C7365d extends C7361b {

    /* renamed from: a */
    public double[] f16415a;

    /* renamed from: b */
    public double[][] f16416b;

    public C7365d(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f16415a = dArr;
        this.f16416b = dArr2;
        if (length2 > 2) {
            double d = ShadowDrawableWrapper.COS_45;
            int i = 0;
            while (true) {
                double d2 = d;
                if (i < dArr.length) {
                    double d3 = dArr2[i][0];
                    if (i > 0) {
                        Math.hypot(d3 - d, d3 - d2);
                    }
                    i++;
                    d = d3;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final double mo19647b(double d) {
        double[] dArr = this.f16415a;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return this.f16416b[0][0];
        }
        int i = length - 1;
        if (d >= dArr[i]) {
            return this.f16416b[i][0];
        }
        int i2 = 0;
        while (i2 < i) {
            double[] dArr2 = this.f16415a;
            double d2 = dArr2[i2];
            if (d == d2) {
                return this.f16416b[i2][0];
            }
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d < d3) {
                double d4 = (d - d2) / (d3 - d2);
                double[][] dArr3 = this.f16416b;
                return (dArr3[i3][0] * d4) + ((1.0d - d4) * dArr3[i2][0]);
            }
            i2 = i3;
        }
        return ShadowDrawableWrapper.COS_45;
    }

    /* renamed from: c */
    public final void mo19648c(double d, double[] dArr) {
        double[] dArr2 = this.f16415a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f16416b[0].length;
        if (d <= dArr2[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = this.f16416b[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr2[i3]) {
            while (i < length2) {
                dArr[i] = this.f16416b[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f16415a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f16416b[i4][i5];
                }
            }
            double[] dArr3 = this.f16415a;
            int i6 = i4 + 1;
            double d2 = dArr3[i6];
            if (d < d2) {
                double d3 = dArr3[i4];
                double d4 = (d - d3) / (d2 - d3);
                while (i < length2) {
                    double[][] dArr4 = this.f16416b;
                    dArr[i] = (dArr4[i6][i] * d4) + ((1.0d - d4) * dArr4[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* renamed from: d */
    public final void mo19649d(double d, float[] fArr) {
        double[] dArr = this.f16415a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f16416b[0].length;
        if (d <= dArr[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) this.f16416b[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr[i3]) {
            while (i < length2) {
                fArr[i] = (float) this.f16416b[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f16415a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.f16416b[i4][i5];
                }
            }
            double[] dArr2 = this.f16415a;
            int i6 = i4 + 1;
            double d2 = dArr2[i6];
            if (d < d2) {
                double d3 = dArr2[i4];
                double d4 = (d - d3) / (d2 - d3);
                while (i < length2) {
                    double[][] dArr3 = this.f16416b;
                    fArr[i] = (float) ((dArr3[i6][i] * d4) + ((1.0d - d4) * dArr3[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r9 >= r3) goto L_0x000a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo19650e(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.f16415a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x000c
        L_0x000a:
            r9 = r3
            goto L_0x0015
        L_0x000c:
            int r3 = r1 + -1
            r3 = r0[r3]
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            r0 = r2
        L_0x0016:
            int r3 = r1 + -1
            if (r0 >= r3) goto L_0x0036
            double[] r3 = r8.f16415a
            int r4 = r0 + 1
            r5 = r3[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0034
            r9 = r3[r0]
            double r5 = r5 - r9
            double[][] r9 = r8.f16416b
            r10 = r9[r0]
            r0 = r10[r2]
            r9 = r9[r4]
            r2 = r9[r2]
            double r2 = r2 - r0
            double r2 = r2 / r5
            return r2
        L_0x0034:
            r0 = r4
            goto L_0x0016
        L_0x0036:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p184n0.C7365d.mo19650e(double):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r13 >= r4) goto L_0x000f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19651f(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f16415a
            int r1 = r0.length
            double[][] r2 = r12.f16416b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0011
        L_0x000f:
            r13 = r4
            goto L_0x001a
        L_0x0011:
            int r4 = r1 + -1
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r0 = r3
        L_0x001b:
            int r4 = r1 + -1
            if (r0 >= r4) goto L_0x0041
            double[] r4 = r12.f16415a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x003f
            r13 = r4[r0]
            double r6 = r6 - r13
        L_0x002c:
            if (r3 >= r2) goto L_0x0041
            double[][] r13 = r12.f16416b
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L_0x002c
        L_0x003f:
            r0 = r5
            goto L_0x001b
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p184n0.C7365d.mo19651f(double, double[]):void");
    }

    /* renamed from: g */
    public final double[] mo19652g() {
        return this.f16415a;
    }
}
