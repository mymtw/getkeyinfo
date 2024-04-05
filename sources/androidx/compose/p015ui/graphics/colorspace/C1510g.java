package androidx.compose.p015ui.graphics.colorspace;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;

/* renamed from: androidx.compose.ui.graphics.colorspace.g */
public final class C1510g extends C1505c {

    /* renamed from: d */
    public static final float[] f3274d;

    /* renamed from: e */
    public static final float[] f3275e;

    /* renamed from: f */
    public static final float[] f3276f;

    /* renamed from: g */
    public static final float[] f3277g;

    static {
        float[] c0 = C19543e0.m33310c0(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C19543e0.m33345z(C1502a.f3258b.f3259a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f3274d = c0;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f3275e = fArr;
        f3276f = C19543e0.m33305X(c0);
        f3277g = C19543e0.m33305X(fArr);
    }

    public C1510g() {
        super(17, C1504b.f3262c, "Oklab");
    }

    /* renamed from: a */
    public final float[] mo6293a(float[] fArr) {
        C19383o.m32797g(fArr, "v");
        C19543e0.m33312e0(f3274d, fArr);
        double d = (double) 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow((double) Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow((double) Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow((double) Math.abs(fArr[2]), d));
        C19543e0.m33312e0(f3275e, fArr);
        return fArr;
    }

    /* renamed from: b */
    public final float mo6294b(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    /* renamed from: c */
    public final float mo6295c(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    /* renamed from: e */
    public final float[] mo6297e(float[] fArr) {
        fArr[0] = C19388s.m32831L(fArr[0], 0.0f, 1.0f);
        fArr[1] = C19388s.m32831L(fArr[1], -0.5f, 0.5f);
        fArr[2] = C19388s.m32831L(fArr[2], -0.5f, 0.5f);
        C19543e0.m33312e0(f3277g, fArr);
        float f = fArr[0];
        fArr[0] = f * f * f;
        float f2 = fArr[1];
        fArr[1] = f2 * f2 * f2;
        float f3 = fArr[2];
        fArr[2] = f3 * f3 * f3;
        C19543e0.m33312e0(f3276f, fArr);
        return fArr;
    }
}
