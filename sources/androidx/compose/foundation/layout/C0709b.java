package androidx.compose.foundation.layout;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import p003a2.C0023f;

/* renamed from: androidx.compose.foundation.layout.b */
public final class C0709b {

    /* renamed from: a */
    public static final float[] f1464a = new float[101];

    /* renamed from: b */
    public static final float[] f1465b = new float[101];

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f11 = ((float) i) / ((float) 100);
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f13 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                if (((double) Math.abs(f13 - f11)) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f14 = 0.5f;
            f1464a[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f15 = 1.0f;
            while (true) {
                f5 = ((f15 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f16 = (((f6 * f14) + f5) * f7) + f8;
                if (((double) Math.abs(f16 - f11)) < 1.0E-5d) {
                    break;
                }
                if (f16 > f11) {
                    f15 = f5;
                } else {
                    f10 = f5;
                }
                f14 = 0.5f;
            }
            f1465b[i] = (((f5 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
        }
        f1465b[100] = 1.0f;
        f1464a[100] = 1.0f;
    }

    /* renamed from: a */
    public static long m1525a(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float f6 = ((float) i2) / f4;
            float[] fArr = f1464a;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = C0023f.m103b(f, f5, f3, f7);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        long floatToIntBits = (long) Float.floatToIntBits(f2);
        return (((long) Float.floatToIntBits(f3)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
    }
}
