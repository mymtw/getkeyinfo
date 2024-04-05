package androidx.compose.p015ui.graphics.colorspace;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.ui.graphics.colorspace.j */
public final class C1513j extends C1505c {
    public C1513j() {
        super(14, C1504b.f3261b, "Generic XYZ");
    }

    /* renamed from: f */
    public static float m3234f(float f) {
        return C19388s.m32831L(f, -2.0f, 2.0f);
    }

    /* renamed from: a */
    public final float[] mo6293a(float[] fArr) {
        C19383o.m32797g(fArr, "v");
        fArr[0] = m3234f(fArr[0]);
        fArr[1] = m3234f(fArr[1]);
        fArr[2] = m3234f(fArr[2]);
        return fArr;
    }

    /* renamed from: b */
    public final float mo6294b(int i) {
        return 2.0f;
    }

    /* renamed from: c */
    public final float mo6295c(int i) {
        return -2.0f;
    }

    /* renamed from: e */
    public final float[] mo6297e(float[] fArr) {
        fArr[0] = m3234f(fArr[0]);
        fArr[1] = m3234f(fArr[1]);
        fArr[2] = m3234f(fArr[2]);
        return fArr;
    }
}
