package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p174m0.C7284d;

/* renamed from: androidx.compose.material.v0 */
public final class C1260v0 implements C1174c2 {

    /* renamed from: a */
    public final float f2645a;

    public C1260v0(float f) {
        this.f2645a = f;
    }

    /* renamed from: a */
    public final float mo5236a(C7282b bVar, float f, float f2) {
        C19383o.m32797g(bVar, "<this>");
        return (Math.signum(f2 - f) * bVar.mo3789B0(this.f2645a)) + f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1260v0) && C7284d.m13983a(this.f2645a, ((C1260v0) obj).f2645a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2645a);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FixedThreshold(offset=");
        h.append(C7284d.m13984c(this.f2645a));
        h.append(')');
        return h.toString();
    }
}
