package p184n0;

import com.google.android.material.shadow.ShadowDrawableWrapper;

/* renamed from: n0.b */
public abstract class C7361b {

    /* renamed from: n0.b$a */
    public static class C7362a extends C7361b {

        /* renamed from: a */
        public double f16406a;

        /* renamed from: b */
        public double[] f16407b;

        public C7362a(double d, double[] dArr) {
            this.f16406a = d;
            this.f16407b = dArr;
        }

        /* renamed from: b */
        public final double mo19647b(double d) {
            return this.f16407b[0];
        }

        /* renamed from: c */
        public final void mo19648c(double d, double[] dArr) {
            double[] dArr2 = this.f16407b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: d */
        public final void mo19649d(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f16407b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: e */
        public final double mo19650e(double d) {
            return ShadowDrawableWrapper.COS_45;
        }

        /* renamed from: f */
        public final void mo19651f(double d, double[] dArr) {
            for (int i = 0; i < this.f16407b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: g */
        public final double[] mo19652g() {
            return new double[]{this.f16406a};
        }
    }

    /* renamed from: a */
    public static C7361b m14167a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new C7365d(dArr, dArr2) : new C7362a(dArr[0], dArr2[0]) : new C7366e(dArr, dArr2);
    }

    /* renamed from: b */
    public abstract double mo19647b(double d);

    /* renamed from: c */
    public abstract void mo19648c(double d, double[] dArr);

    /* renamed from: d */
    public abstract void mo19649d(double d, float[] fArr);

    /* renamed from: e */
    public abstract double mo19650e(double d);

    /* renamed from: f */
    public abstract void mo19651f(double d, double[] dArr);

    /* renamed from: g */
    public abstract double[] mo19652g();
}
