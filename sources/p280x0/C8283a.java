package p280x0;

import android.graphics.Color;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import p173m.C7279a;
import p289y0.C8351c;

/* renamed from: x0.a */
public final class C8283a {

    /* renamed from: a */
    public final float f18149a;

    /* renamed from: b */
    public final float f18150b;

    /* renamed from: c */
    public final float f18151c;

    /* renamed from: d */
    public final float f18152d;

    /* renamed from: e */
    public final float f18153e;

    /* renamed from: f */
    public final float f18154f;

    public C8283a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f18149a = f;
        this.f18150b = f2;
        this.f18151c = f3;
        this.f18152d = f4;
        this.f18153e = f5;
        this.f18154f = f6;
    }

    /* renamed from: a */
    public static C8283a m16572a(int i) {
        C8300k kVar = C8300k.f18186k;
        float k = C7279a.m13953k(Color.red(i));
        float k2 = C7279a.m13953k(Color.green(i));
        float k3 = C7279a.m13953k(Color.blue(i));
        float[][] fArr = C7279a.f16147j;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * k3) + (fArr2[1] * k2) + (fArr2[0] * k);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * k3) + (fArr3[1] * k2) + (fArr3[0] * k);
        float[] fArr4 = fArr[2];
        float f3 = (k3 * fArr4[2]) + (k2 * fArr4[1]) + (k * fArr4[0]);
        float[][] fArr5 = C7279a.f16144g;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = fArr7[1] * f2;
        float f6 = fArr7[2] * f3;
        float[] fArr8 = fArr5[2];
        float f7 = f * fArr8[0];
        float f8 = f3 * fArr8[2];
        float[] fArr9 = kVar.f18193g;
        float f9 = fArr9[0] * f4;
        float f10 = fArr9[1] * (f6 + f5 + (fArr7[0] * f));
        float f11 = fArr9[2] * (f8 + (f2 * fArr8[1]) + f7);
        float pow = (float) Math.pow(((double) (Math.abs(f9) * kVar.f18194h)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f10) * kVar.f18194h)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f11) * kVar.f18194h)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f12 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d)) / 11.0f;
        float f13 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = ((21.0f * signum3) + ((signum * 20.0f) + f14)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f13, (double) f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = atan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f16 * kVar.f18188b) / kVar.f18187a), (double) (kVar.f18190d * kVar.f18196j))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) kVar.f18192f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f17) < 20.14d ? 360.0f + f17 : f17)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f18191e) * kVar.f18189c) * ((float) Math.sqrt((double) ((f13 * f13) + (f12 * f12))))) / (f15 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * kVar.f18190d) / (kVar.f18187a + 4.0f)));
        float f19 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((kVar.f18195i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d2 = (double) f18;
        return new C8283a(f17, sqrt, pow4, f19, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: b */
    public static C8283a m16573b(float f, float f2, float f3) {
        C8300k kVar = C8300k.f18186k;
        float f4 = kVar.f18190d;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * kVar.f18190d) / (kVar.f18187a + 4.0f)));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((((double) (kVar.f18195i * f2)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (double) ((3.1415927f * f3) / 180.0f);
        return new C8283a(f3, f2, f, f5, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: c */
    public final int mo20889c(C8300k kVar) {
        float f;
        C8300k kVar2 = kVar;
        float f2 = this.f18150b;
        if (((double) f2) != ShadowDrawableWrapper.COS_45) {
            double d = (double) this.f18151c;
            if (d != ShadowDrawableWrapper.COS_45) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) kVar2.f18192f), 0.73d), 1.1111111111111112d);
                double d2 = (double) ((this.f18149a * 3.1415927f) / 180.0f);
                float pow2 = kVar2.f18187a * ((float) Math.pow(((double) this.f18151c) / 100.0d, (1.0d / ((double) kVar2.f18190d)) / ((double) kVar2.f18196j)));
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * kVar2.f18191e * kVar2.f18189c;
                float f3 = pow2 / kVar2.f18188b;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f4 = 11.0f * pow * cos2;
                float f5 = (((0.305f + f3) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f4 + (cos * 23.0f)));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f3 * 460.0f;
                float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
                float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(ShadowDrawableWrapper.COS_45, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))));
                float signum = (100.0f / kVar2.f18194h) * Math.signum(f9) * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = (100.0f / kVar2.f18194h) * Math.signum(f10) * ((float) Math.pow((double) ((float) Math.max(ShadowDrawableWrapper.COS_45, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10))))), 2.380952380952381d));
                float signum3 = Math.signum(f11);
                float[] fArr = kVar2.f18193g;
                float f12 = signum / fArr[0];
                float f13 = signum2 / fArr[1];
                float pow3 = (((100.0f / kVar2.f18194h) * signum3) * ((float) Math.pow((double) ((float) Math.max(ShadowDrawableWrapper.COS_45, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = C7279a.f16145h;
                float[] fArr3 = fArr2[0];
                float f14 = fArr3[1] * f13;
                float f15 = (fArr3[2] * pow3) + f14 + (fArr3[0] * f12);
                float[] fArr4 = fArr2[1];
                float f16 = fArr4[1] * f13;
                float f17 = fArr4[2] * pow3;
                float[] fArr5 = fArr2[2];
                float f18 = f12 * fArr5[0];
                return C8351c.m16660b((double) f15, (double) (f17 + f16 + (fArr4[0] * f12)), (double) ((pow3 * fArr5[2]) + (f13 * fArr5[1]) + f18));
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) kVar2.f18192f), 0.73d), 1.1111111111111112d);
        double d22 = (double) ((this.f18149a * 3.1415927f) / 180.0f);
        float pow22 = kVar2.f18187a * ((float) Math.pow(((double) this.f18151c) / 100.0d, (1.0d / ((double) kVar2.f18190d)) / ((double) kVar2.f18196j)));
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f * 3846.1538f * kVar2.f18191e * kVar2.f18189c;
        float f32 = pow22 / kVar2.f18188b;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f42 = 11.0f * pow4 * cos22;
        float f52 = (((0.305f + f32) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f42 + (cos3 * 23.0f)));
        float f62 = cos22 * f52;
        float f72 = f52 * sin2;
        float f82 = f32 * 460.0f;
        float f92 = ((288.0f * f72) + ((451.0f * f62) + f82)) / 1403.0f;
        float f102 = ((f82 - (891.0f * f62)) - (261.0f * f72)) / 1403.0f;
        float f112 = ((f82 - (f62 * 220.0f)) - (f72 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(ShadowDrawableWrapper.COS_45, (((double) Math.abs(f92)) * 27.13d) / (400.0d - ((double) Math.abs(f92))));
        float signum4 = (100.0f / kVar2.f18194h) * Math.signum(f92) * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = (100.0f / kVar2.f18194h) * Math.signum(f102) * ((float) Math.pow((double) ((float) Math.max(ShadowDrawableWrapper.COS_45, (((double) Math.abs(f102)) * 27.13d) / (400.0d - ((double) Math.abs(f102))))), 2.380952380952381d));
        float signum32 = Math.signum(f112);
        float[] fArr6 = kVar2.f18193g;
        float f122 = signum4 / fArr6[0];
        float f132 = signum22 / fArr6[1];
        float pow32 = (((100.0f / kVar2.f18194h) * signum32) * ((float) Math.pow((double) ((float) Math.max(ShadowDrawableWrapper.COS_45, (((double) Math.abs(f112)) * 27.13d) / (400.0d - ((double) Math.abs(f112))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = C7279a.f16145h;
        float[] fArr32 = fArr22[0];
        float f142 = fArr32[1] * f132;
        float f152 = (fArr32[2] * pow32) + f142 + (fArr32[0] * f122);
        float[] fArr42 = fArr22[1];
        float f162 = fArr42[1] * f132;
        float f172 = fArr42[2] * pow32;
        float[] fArr52 = fArr22[2];
        float f182 = f122 * fArr52[0];
        return C8351c.m16660b((double) f152, (double) (f172 + f162 + (fArr42[0] * f122)), (double) ((pow32 * fArr52[2]) + (f132 * fArr52[1]) + f182));
    }
}
