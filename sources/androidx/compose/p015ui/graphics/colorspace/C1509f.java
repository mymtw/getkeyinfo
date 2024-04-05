package androidx.compose.p015ui.graphics.colorspace;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p568fn.C17782b;

/* renamed from: androidx.compose.ui.graphics.colorspace.f */
public final class C1509f extends C1505c {
    public C1509f() {
        super(15, C1504b.f3262c, "Generic L*a*b*");
    }

    /* renamed from: a */
    public final float[] mo6293a(float[] fArr) {
        float[] fArr2 = fArr;
        C19383o.m32797g(fArr2, "v");
        float f = fArr2[0];
        float[] fArr3 = C17782b.f38636g;
        float f2 = f / fArr3[0];
        float f3 = fArr2[1] / fArr3[1];
        float f4 = fArr2[2] / fArr3[2];
        float pow = f2 > 0.008856452f ? (float) Math.pow((double) f2, (double) 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float pow2 = f3 > 0.008856452f ? (float) Math.pow((double) f3, (double) 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float pow3 = f4 > 0.008856452f ? (float) Math.pow((double) f4, (double) 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        fArr2[0] = C19388s.m32831L((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr2[1] = C19388s.m32831L((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr2[2] = C19388s.m32831L((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return fArr2;
    }

    /* renamed from: b */
    public final float mo6294b(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    /* renamed from: c */
    public final float mo6295c(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    /* renamed from: e */
    public final float[] mo6297e(float[] fArr) {
        fArr[0] = C19388s.m32831L(fArr[0], 0.0f, 100.0f);
        fArr[1] = C19388s.m32831L(fArr[1], -128.0f, 128.0f);
        float L = C19388s.m32831L(fArr[2], -128.0f, 128.0f);
        fArr[2] = L;
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (L * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = C17782b.f38636g;
        fArr[0] = f4 * fArr2[0];
        fArr[1] = f5 * fArr2[1];
        fArr[2] = f6 * fArr2[2];
        return fArr;
    }
}
