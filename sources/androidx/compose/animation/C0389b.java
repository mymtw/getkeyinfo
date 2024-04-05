package androidx.compose.animation;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: androidx.compose.animation.b */
public final class C0389b {

    /* renamed from: a */
    public static final float[] f1003a;

    /* renamed from: androidx.compose.animation.b$a */
    public static final class C0390a {

        /* renamed from: a */
        public final float f1004a;

        /* renamed from: b */
        public final float f1005b;

        public C0390a(float f, float f2) {
            this.f1004a = f;
            this.f1005b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0390a)) {
                return false;
            }
            C0390a aVar = (C0390a) obj;
            return C19383o.m32792b(Float.valueOf(this.f1004a), Float.valueOf(aVar.f1004a)) && C19383o.m32792b(Float.valueOf(this.f1005b), Float.valueOf(aVar.f1005b));
        }

        public final int hashCode() {
            return Float.hashCode(this.f1005b) + (Float.hashCode(this.f1004a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FlingResult(distanceCoefficient=");
            h.append(this.f1004a);
            h.append(", velocityCoefficient=");
            return C0388a.m1048d(h, this.f1005b, ')');
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        f1003a = fArr;
        float[] fArr2 = new float[101];
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
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
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
            fArr2[i] = (((f5 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
        }
        fArr[100] = 1.0f;
    }

    /* renamed from: a */
    public static C0390a m1054a(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float f6 = ((float) i2) / f4;
            float[] fArr = f1003a;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = C0023f.m103b(f, f5, f3, f7);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new C0390a(f2, f3);
    }
}
