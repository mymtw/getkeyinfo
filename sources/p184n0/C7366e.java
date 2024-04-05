package p184n0;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;

/* renamed from: n0.e */
public final class C7366e extends C7361b {

    /* renamed from: a */
    public double[] f16417a;

    /* renamed from: b */
    public double[][] f16418b;

    /* renamed from: c */
    public double[][] f16419c;

    public C7366e(double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        double[][] dArr4 = dArr2;
        int length = dArr3.length;
        int length2 = dArr4[0].length;
        int i = length - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr3[i4] - dArr3[i3];
                double[] dArr7 = dArr5[i3];
                double d2 = (dArr4[i4][i2] - dArr4[i3][i2]) / d;
                dArr7[i2] = d2;
                if (i3 == 0) {
                    dArr6[i3][i2] = d2;
                } else {
                    dArr6[i3][i2] = (dArr5[i3 - 1][i2] + d2) * 0.5d;
                }
                i3 = i4;
            }
            dArr6[i][i2] = dArr5[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d3 = dArr5[i5][i6];
                if (d3 == ShadowDrawableWrapper.COS_45) {
                    dArr6[i5][i6] = 0.0d;
                    dArr6[i5 + 1][i6] = 0.0d;
                } else {
                    double d4 = dArr6[i5][i6] / d3;
                    int i7 = i5 + 1;
                    double d5 = dArr6[i7][i6] / d3;
                    double hypot = Math.hypot(d4, d5);
                    if (hypot > 9.0d) {
                        double d6 = 3.0d / hypot;
                        double[] dArr8 = dArr6[i5];
                        double[] dArr9 = dArr5[i5];
                        dArr8[i6] = d4 * d6 * dArr9[i6];
                        dArr6[i7][i6] = d6 * d5 * dArr9[i6];
                    }
                }
            }
        }
        this.f16417a = dArr3;
        this.f16418b = dArr4;
        this.f16419c = dArr6;
    }

    /* renamed from: h */
    public static double m14193h(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 6.0d * d7 * d3;
        double d10 = 3.0d * d;
        double d11 = d10 * d5 * d7;
        return (d * d5) + (((d11 + (((d10 * d6) * d7) + ((d9 + ((d8 * d4) + ((-6.0d * d7) * d4))) - (d8 * d3)))) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2));
    }

    /* renamed from: i */
    public static double m14194i(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d9 * d4;
        double d11 = d * d6;
        double d12 = d11 * d8;
        double d13 = d * d5;
        return (d13 * d2) + ((((d8 * d13) + (d12 + (((((d8 * 2.0d) * d3) + (d10 + ((-2.0d * d8) * d4))) - (d9 * d3)) + d3))) - (d11 * d7)) - (((2.0d * d) * d5) * d7));
    }

    /* renamed from: b */
    public final double mo19647b(double d) {
        double[] dArr = this.f16417a;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return this.f16418b[0][0];
        }
        int i = length - 1;
        if (d >= dArr[i]) {
            return this.f16418b[i][0];
        }
        int i2 = 0;
        while (i2 < i) {
            double[] dArr2 = this.f16417a;
            double d2 = dArr2[i2];
            if (d == d2) {
                return this.f16418b[i2][0];
            }
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d < d3) {
                double d4 = d3 - d2;
                double d5 = (d - d2) / d4;
                double[][] dArr3 = this.f16418b;
                double d6 = dArr3[i2][0];
                double d7 = dArr3[i3][0];
                double[][] dArr4 = this.f16419c;
                return m14194i(d4, d5, d6, d7, dArr4[i2][0], dArr4[i3][0]);
            }
            i2 = i3;
        }
        return ShadowDrawableWrapper.COS_45;
    }

    /* renamed from: c */
    public final void mo19648c(double d, double[] dArr) {
        double[] dArr2 = this.f16417a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f16418b[0].length;
        if (d <= dArr2[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = this.f16418b[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr2[i3]) {
            while (i < length2) {
                dArr[i] = this.f16418b[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f16417a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f16418b[i4][i5];
                }
            }
            double[] dArr3 = this.f16417a;
            int i6 = i4 + 1;
            double d2 = dArr3[i6];
            if (d < d2) {
                double d3 = dArr3[i4];
                double d4 = d2 - d3;
                double d5 = (d - d3) / d4;
                while (i < length2) {
                    double[][] dArr4 = this.f16418b;
                    double d6 = dArr4[i4][i];
                    double d7 = dArr4[i6][i];
                    double[][] dArr5 = this.f16419c;
                    dArr[i] = m14194i(d4, d5, d6, d7, dArr5[i4][i], dArr5[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* renamed from: d */
    public final void mo19649d(double d, float[] fArr) {
        double[] dArr = this.f16417a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f16418b[0].length;
        if (d <= dArr[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) this.f16418b[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr[i3]) {
            while (i < length2) {
                fArr[i] = (float) this.f16418b[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f16417a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.f16418b[i4][i5];
                }
            }
            double[] dArr2 = this.f16417a;
            int i6 = i4 + 1;
            double d2 = dArr2[i6];
            if (d < d2) {
                double d3 = dArr2[i4];
                double d4 = d2 - d3;
                double d5 = (d - d3) / d4;
                while (i < length2) {
                    double[][] dArr3 = this.f16418b;
                    double d6 = dArr3[i4][i];
                    double d7 = dArr3[i6][i];
                    double[][] dArr4 = this.f16419c;
                    fArr[i] = (float) m14194i(d4, d5, d6, d7, dArr4[i4][i], dArr4[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* renamed from: e */
    public final double mo19650e(double d) {
        double[] dArr = this.f16417a;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr2 = this.f16417a;
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d2 <= d3) {
                double d4 = dArr2[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                double[][] dArr3 = this.f16418b;
                double d7 = dArr3[i][0];
                double d8 = dArr3[i2][0];
                double[][] dArr4 = this.f16419c;
                return m14193h(d5, d6, d7, d8, dArr4[i][0], dArr4[i2][0]) / d5;
            }
            i = i2;
        }
        return ShadowDrawableWrapper.COS_45;
    }

    /* renamed from: f */
    public final void mo19651f(double d, double[] dArr) {
        double[] dArr2 = this.f16417a;
        int length = dArr2.length;
        int length2 = this.f16418b[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.f16417a;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d2 <= d3) {
                double d4 = dArr3[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.f16418b;
                    double d7 = dArr4[i][i3];
                    double d8 = dArr4[i2][i3];
                    double[][] dArr5 = this.f16419c;
                    dArr[i3] = m14193h(d5, d6, d7, d8, dArr5[i][i3], dArr5[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    /* renamed from: g */
    public final double[] mo19652g() {
        return this.f16417a;
    }
}
