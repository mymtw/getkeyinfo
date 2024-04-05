package p166l1;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import p166l1.C7218b;

/* renamed from: l1.e */
public final class C7234e {

    /* renamed from: a */
    public double f16042a;

    /* renamed from: b */
    public double f16043b;

    /* renamed from: c */
    public boolean f16044c;

    /* renamed from: d */
    public double f16045d;

    /* renamed from: e */
    public double f16046e;

    /* renamed from: f */
    public double f16047f;

    /* renamed from: g */
    public double f16048g;

    /* renamed from: h */
    public double f16049h;

    /* renamed from: i */
    public double f16050i;

    /* renamed from: j */
    public final C7218b.C7228j f16051j;

    public C7234e() {
        this.f16042a = Math.sqrt(1500.0d);
        this.f16043b = 0.5d;
        this.f16044c = false;
        this.f16050i = Double.MAX_VALUE;
        this.f16051j = new C7218b.C7228j();
    }

    /* renamed from: a */
    public final C7218b.C7228j mo19508a(double d, double d2, long j) {
        double d3;
        double d4;
        if (!this.f16044c) {
            if (this.f16050i != Double.MAX_VALUE) {
                double d5 = this.f16043b;
                if (d5 > 1.0d) {
                    double d6 = this.f16042a;
                    this.f16047f = (Math.sqrt((d5 * d5) - 1.0d) * d6) + ((-d5) * d6);
                    double d7 = this.f16043b;
                    double d8 = this.f16042a;
                    this.f16048g = ((-d7) * d8) - (Math.sqrt((d7 * d7) - 1.0d) * d8);
                } else if (d5 >= ShadowDrawableWrapper.COS_45 && d5 < 1.0d) {
                    this.f16049h = Math.sqrt(1.0d - (d5 * d5)) * this.f16042a;
                }
                this.f16044c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d9 = ((double) j) / 1000.0d;
        double d10 = d - this.f16050i;
        double d11 = this.f16043b;
        if (d11 > 1.0d) {
            double d12 = this.f16048g;
            double d13 = this.f16047f;
            double d14 = d10 - (((d12 * d10) - d2) / (d12 - d13));
            double d15 = ((d10 * d12) - d2) / (d12 - d13);
            d3 = (Math.pow(2.718281828459045d, this.f16047f * d9) * d15) + (Math.pow(2.718281828459045d, d12 * d9) * d14);
            double d16 = this.f16048g;
            double pow = Math.pow(2.718281828459045d, d16 * d9) * d14 * d16;
            double d17 = this.f16047f;
            d4 = (Math.pow(2.718281828459045d, d17 * d9) * d15 * d17) + pow;
        } else if (d11 == 1.0d) {
            double d18 = this.f16042a;
            double d19 = (d18 * d10) + d2;
            double d20 = (d19 * d9) + d10;
            double pow2 = Math.pow(2.718281828459045d, (-d18) * d9) * d20;
            double pow3 = Math.pow(2.718281828459045d, (-this.f16042a) * d9) * d20;
            double d21 = this.f16042a;
            d4 = (Math.pow(2.718281828459045d, (-d21) * d9) * d19) + (pow3 * (-d21));
            d3 = pow2;
        } else {
            double d22 = 1.0d / this.f16049h;
            double d23 = this.f16042a;
            double d24 = ((d11 * d23 * d10) + d2) * d22;
            double sin = ((Math.sin(this.f16049h * d9) * d24) + (Math.cos(this.f16049h * d9) * d10)) * Math.pow(2.718281828459045d, (-d11) * d23 * d9);
            double d25 = this.f16042a;
            double d26 = this.f16043b;
            double d27 = (-d25) * sin * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d9);
            double d28 = this.f16049h;
            double d29 = sin;
            double d30 = (-d28) * d10;
            double d31 = this.f16049h;
            d4 = (((Math.cos(d31 * d9) * d24 * d31) + (Math.sin(d28 * d9) * d30)) * pow4) + d27;
            d3 = d29;
        }
        C7218b.C7228j jVar = this.f16051j;
        jVar.f16037a = (float) (d3 + this.f16050i);
        jVar.f16038b = (float) d4;
        return jVar;
    }

    public C7234e(float f) {
        this.f16042a = Math.sqrt(1500.0d);
        this.f16043b = 0.5d;
        this.f16044c = false;
        this.f16051j = new C7218b.C7228j();
        this.f16050i = (double) f;
    }
}
