package androidx.compose.animation.core;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;

/* renamed from: androidx.compose.animation.core.g0 */
public final class C0427g0 {

    /* renamed from: a */
    public float f1118a = 1.0f;

    /* renamed from: b */
    public double f1119b = Math.sqrt(50.0d);

    /* renamed from: c */
    public boolean f1120c;

    /* renamed from: d */
    public double f1121d;

    /* renamed from: e */
    public double f1122e;

    /* renamed from: f */
    public double f1123f;

    /* renamed from: g */
    public float f1124g = 1.0f;

    /* renamed from: a */
    public final long mo3496a(float f, long j, float f2) {
        double d;
        double d2;
        float f3 = f2;
        boolean z = false;
        if (!this.f1120c) {
            if (!(this.f1118a == Float.MAX_VALUE)) {
                float f4 = this.f1124g;
                double d3 = (double) f4;
                double d4 = d3 * d3;
                if (f4 > 1.0f) {
                    double d5 = this.f1119b;
                    double d6 = d4 - ((double) 1);
                    this.f1121d = (Math.sqrt(d6) * d5) + (((double) (-f4)) * d5);
                    double d7 = this.f1119b;
                    this.f1122e = (((double) (-this.f1124g)) * d7) - (Math.sqrt(d6) * d7);
                } else if (f4 >= 0.0f && f4 < 1.0f) {
                    this.f1123f = Math.sqrt(((double) 1) - d4) * this.f1119b;
                }
                this.f1120c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f5 = f - this.f1118a;
        double d8 = ((double) j) / 1000.0d;
        float f6 = this.f1124g;
        if (f6 > 1.0f) {
            double d9 = (double) f5;
            double d10 = this.f1122e;
            double d11 = (double) f3;
            double d12 = this.f1121d;
            double d13 = d9 - (((d10 * d9) - d11) / (d10 - d12));
            double d14 = ((d9 * d10) - d11) / (d10 - d12);
            d = (Math.exp(this.f1121d * d8) * d14) + (Math.exp(d10 * d8) * d13);
            double d15 = this.f1122e;
            double exp = Math.exp(d15 * d8) * d13 * d15;
            double d16 = this.f1121d;
            d2 = (Math.exp(d16 * d8) * d14 * d16) + exp;
        } else {
            if (f6 == 1.0f) {
                z = true;
            }
            if (z) {
                double d17 = (double) f3;
                double d18 = this.f1119b;
                double d19 = (double) f5;
                double d20 = (d18 * d19) + d17;
                double d21 = (d20 * d8) + d19;
                double exp2 = Math.exp((-d18) * d8) * d21;
                double exp3 = Math.exp((-this.f1119b) * d8) * d21;
                double d22 = this.f1119b;
                d2 = (Math.exp((-d22) * d8) * d20) + (exp3 * (-d22));
                d = exp2;
            } else {
                double d23 = ((double) 1) / this.f1123f;
                double d24 = this.f1119b;
                double d25 = (double) f5;
                double d26 = ((((double) f6) * d24 * d25) + ((double) f3)) * d23;
                double exp4 = Math.exp(((double) (-f6)) * d24 * d8) * ((Math.sin(this.f1123f * d8) * d26) + (Math.cos(this.f1123f * d8) * d25));
                double d27 = this.f1119b;
                float f7 = this.f1124g;
                double d28 = exp4;
                double d29 = (-d27) * exp4 * ((double) f7);
                double exp5 = Math.exp(((double) (-f7)) * d27 * d8);
                double d30 = this.f1123f;
                double d31 = this.f1123f;
                d2 = (((Math.cos(d31 * d8) * d26 * d31) + (Math.sin(d30 * d8) * (-d30) * d25)) * exp5) + d29;
                d = d28;
            }
        }
        return (((long) Float.floatToIntBits((float) d2)) & UnsignedInteger.INT_MASK) | (((long) Float.floatToIntBits((float) (d + ((double) this.f1118a)))) << 32);
    }
}
