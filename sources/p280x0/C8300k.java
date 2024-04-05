package p280x0;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import p173m.C7279a;

/* renamed from: x0.k */
public final class C8300k {

    /* renamed from: k */
    public static final C8300k f18186k;

    /* renamed from: a */
    public final float f18187a;

    /* renamed from: b */
    public final float f18188b;

    /* renamed from: c */
    public final float f18189c;

    /* renamed from: d */
    public final float f18190d;

    /* renamed from: e */
    public final float f18191e;

    /* renamed from: f */
    public final float f18192f;

    /* renamed from: g */
    public final float[] f18193g;

    /* renamed from: h */
    public final float f18194h;

    /* renamed from: i */
    public final float f18195i;

    /* renamed from: j */
    public final float f18196j;

    static {
        float[] fArr = C7279a.f16146i;
        float m = (float) ((((double) C7279a.m13955m()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C7279a.f16144g;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr[1];
        float f3 = fArr3[1] * f2;
        float f4 = fArr[2];
        float f5 = (fArr3[2] * f4) + f3 + (fArr3[0] * f);
        float[] fArr4 = fArr2[1];
        float f6 = (fArr4[2] * f4) + (fArr4[1] * f2) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f7 = (f4 * fArr5[2]) + (f2 * fArr5[1]) + (f * fArr5[0]);
        float f8 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp((double) (((-m) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < ShadowDrawableWrapper.COS_45) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * m) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) m) * 5.0d))) + (f10 * m);
        float m2 = C7279a.m13955m() / fArr[1];
        double d2 = (double) m2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f7)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f5)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f6)) / 100.0d, 0.42d), pow2};
        float f12 = fArr7[0];
        float f13 = fArr7[1];
        f18186k = new C8300k(m2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f12 * 400.0f) / (f12 + 27.13f)) * 2.0f) + ((f13 * 400.0f) / (f13 + 27.13f))) * pow, pow, pow, f8, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public C8300k(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f18192f = f;
        this.f18187a = f2;
        this.f18188b = f3;
        this.f18189c = f4;
        this.f18190d = f5;
        this.f18191e = f6;
        this.f18193g = fArr;
        this.f18194h = f7;
        this.f18195i = f8;
        this.f18196j = f9;
    }
}
