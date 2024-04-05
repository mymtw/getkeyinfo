package androidx.compose.p015ui.graphics.colorspace;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.graphics.colorspace.i */
public final class C1512i {

    /* renamed from: a */
    public final float f3285a;

    /* renamed from: b */
    public final float f3286b;

    public C1512i(float f, float f2) {
        this.f3285a = f;
        this.f3286b = f2;
    }

    /* renamed from: a */
    public final float[] mo6315a() {
        float f = this.f3285a;
        float f2 = this.f3286b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1512i)) {
            return false;
        }
        C1512i iVar = (C1512i) obj;
        return C19383o.m32792b(Float.valueOf(this.f3285a), Float.valueOf(iVar.f3285a)) && C19383o.m32792b(Float.valueOf(this.f3286b), Float.valueOf(iVar.f3286b));
    }

    public final int hashCode() {
        return Float.hashCode(this.f3286b) + (Float.hashCode(this.f3285a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("WhitePoint(x=");
        h.append(this.f3285a);
        h.append(", y=");
        return C0388a.m1048d(h, this.f3286b, ')');
    }
}
