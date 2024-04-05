package p594jh;

import p513bj.C14049b0;
import p513bj.C14075p;

/* renamed from: jh.y0 */
public final class C17986y0 {

    /* renamed from: d */
    public static final C17986y0 f39325d = new C17986y0(1.0f, 1.0f);

    /* renamed from: a */
    public final float f39326a;

    /* renamed from: b */
    public final float f39327b;

    /* renamed from: c */
    public final int f39328c;

    public C17986y0(float f, float f2) {
        boolean z = true;
        C14075p.m21691c(f > 0.0f);
        C14075p.m21691c(f2 <= 0.0f ? false : z);
        this.f39326a = f;
        this.f39327b = f2;
        this.f39328c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17986y0.class != obj.getClass()) {
            return false;
        }
        C17986y0 y0Var = (C17986y0) obj;
        return this.f39326a == y0Var.f39326a && this.f39327b == y0Var.f39327b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f39327b) + ((Float.floatToRawIntBits(this.f39326a) + 527) * 31);
    }

    public final String toString() {
        return C14049b0.m21640m("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f39326a), Float.valueOf(this.f39327b));
    }
}
