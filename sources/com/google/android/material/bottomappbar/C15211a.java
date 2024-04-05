package com.google.android.material.bottomappbar;

import com.google.android.material.shape.C15408d;
import p003a2.C0023f;
import p550dl.C17579e;

/* renamed from: com.google.android.material.bottomappbar.a */
public final class C15211a extends C17579e implements Cloneable {

    /* renamed from: b */
    public float f34135b;

    /* renamed from: c */
    public float f34136c;

    /* renamed from: d */
    public float f34137d;

    /* renamed from: e */
    public float f34138e;

    /* renamed from: f */
    public float f34139f;

    /* renamed from: g */
    public float f34140g = -1.0f;

    public C15211a(float f, float f2, float f3) {
        this.f34136c = f;
        this.f34135b = f2;
        if (f3 >= 0.0f) {
            this.f34138e = f3;
            this.f34139f = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: b */
    public final void mo53159b(float f, float f2, float f3, C15408d dVar) {
        float f4;
        float f5;
        float f6 = f;
        float f7 = f3;
        C15408d dVar2 = dVar;
        float f8 = this.f34137d;
        if (f8 == 0.0f) {
            dVar2.mo54629d(f6, 0.0f);
            return;
        }
        float f9 = ((this.f34136c * 2.0f) + f8) / 2.0f;
        float f10 = f7 * this.f34135b;
        float f11 = f2 + this.f34139f;
        float b = C0023f.m103b(1.0f, f7, f9, this.f34138e * f7);
        if (b / f9 >= 1.0f) {
            dVar2.mo54629d(f6, 0.0f);
            return;
        }
        float f12 = this.f34140g;
        float f13 = f12 * f7;
        boolean z = f12 == -1.0f || Math.abs((f12 * 2.0f) - f8) < 0.1f;
        if (!z) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = b;
            f5 = 0.0f;
        }
        float f14 = f9 + f10;
        float f15 = f4 + f10;
        float sqrt = (float) Math.sqrt((double) ((f14 * f14) - (f15 * f15)));
        float f16 = f11 - sqrt;
        float f17 = f11 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f15)));
        float f18 = (90.0f - degrees) + f5;
        dVar2.mo54629d(f16, 0.0f);
        float f19 = f10 * 2.0f;
        float f20 = degrees;
        dVar.mo54626a(f16 - f10, 0.0f, f16 + f10, f19, 270.0f, degrees);
        if (z) {
            dVar.mo54626a(f11 - f9, (-f9) - f4, f11 + f9, f9 - f4, 180.0f - f18, (f18 * 2.0f) - 180.0f);
        } else {
            float f21 = this.f34136c;
            float f22 = f13 * 2.0f;
            float f23 = f11 - f9;
            float f24 = f13 + f21;
            dVar.mo54626a(f23, -f24, f23 + f21 + f22, f24, 180.0f - f18, ((f18 * 2.0f) - 180.0f) / 2.0f);
            float f25 = f11 + f9;
            float f26 = this.f34136c;
            dVar2.mo54629d(f25 - ((f26 / 2.0f) + f13), f26 + f13);
            float f27 = this.f34136c;
            float f28 = f13 + f27;
            dVar.mo54626a(f25 - (f22 + f27), -f28, f25, f28, 90.0f, f18 - 0.049804688f);
        }
        dVar.mo54626a(f17 - f10, 0.0f, f17 + f10, f19, 270.0f - f20, f20);
        dVar2.mo54629d(f6, 0.0f);
    }
}
