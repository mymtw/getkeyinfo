package androidx.compose.animation.core;

import p003a2.C0023f;

/* renamed from: androidx.compose.animation.core.m */
public final class C0438m implements C0448r {

    /* renamed from: a */
    public final float f1152a;

    /* renamed from: b */
    public final float f1153b = 0.0f;

    /* renamed from: c */
    public final float f1154c;

    /* renamed from: d */
    public final float f1155d;

    public C0438m(float f, float f2) {
        this.f1152a = f;
        this.f1154c = f2;
        this.f1155d = 1.0f;
    }

    /* renamed from: a */
    public final float mo3514a(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / ((float) 2);
                    float f5 = this.f1152a;
                    float f6 = (float) 3;
                    float f7 = ((float) 1) - f4;
                    float f8 = (this.f1154c * f6 * f7 * f4 * f4) + (f5 * f6 * f7 * f7 * f4);
                    float f9 = f4 * f4 * f4;
                    float f10 = f8 + f9;
                    if (Math.abs(f - f10) < 0.001f) {
                        float f11 = this.f1153b;
                        return (f6 * this.f1155d * f7 * f4 * f4) + (f11 * f6 * f7 * f7 * f4) + f9;
                    } else if (f10 < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0438m) {
            C0438m mVar = (C0438m) obj;
            if (this.f1152a == mVar.f1152a) {
                if (this.f1153b == mVar.f1153b) {
                    if (this.f1154c == mVar.f1154c) {
                        if (this.f1155d == mVar.f1155d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1155d) + C0023f.m104c(this.f1154c, C0023f.m104c(this.f1153b, Float.hashCode(this.f1152a) * 31, 31), 31);
    }
}
