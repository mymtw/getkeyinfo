package p174m0;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;

/* renamed from: m0.c */
public final class C7283c implements C7282b {

    /* renamed from: b */
    public final float f16153b;

    /* renamed from: c */
    public final float f16154c;

    public C7283c(float f, float f2) {
        this.f16153b = f;
        this.f16154c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7283c)) {
            return false;
        }
        C7283c cVar = (C7283c) obj;
        return C19383o.m32792b(Float.valueOf(this.f16153b), Float.valueOf(cVar.f16153b)) && C19383o.m32792b(Float.valueOf(this.f16154c), Float.valueOf(cVar.f16154c));
    }

    public final float getDensity() {
        return this.f16153b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16154c) + (Float.hashCode(this.f16153b) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DensityImpl(density=");
        h.append(this.f16153b);
        h.append(", fontScale=");
        return C0388a.m1048d(h, this.f16154c, ')');
    }

    /* renamed from: w0 */
    public final float mo3800w0() {
        return this.f16154c;
    }
}
