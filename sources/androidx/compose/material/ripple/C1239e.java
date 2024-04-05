package androidx.compose.material.ripple;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import p003a2.C0023f;

/* renamed from: androidx.compose.material.ripple.e */
public final class C1239e {

    /* renamed from: a */
    public final float f2591a;

    /* renamed from: b */
    public final float f2592b;

    /* renamed from: c */
    public final float f2593c;

    /* renamed from: d */
    public final float f2594d;

    public C1239e(float f, float f2, float f3, float f4) {
        this.f2591a = f;
        this.f2592b = f2;
        this.f2593c = f3;
        this.f2594d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1239e)) {
            return false;
        }
        C1239e eVar = (C1239e) obj;
        if (!(this.f2591a == eVar.f2591a)) {
            return false;
        }
        if (!(this.f2592b == eVar.f2592b)) {
            return false;
        }
        if (!(this.f2593c == eVar.f2593c)) {
            return false;
        }
        return (this.f2594d > eVar.f2594d ? 1 : (this.f2594d == eVar.f2594d ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2594d) + C0023f.m104c(this.f2593c, C0023f.m104c(this.f2592b, Float.hashCode(this.f2591a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("RippleAlpha(draggedAlpha=");
        h.append(this.f2591a);
        h.append(", focusedAlpha=");
        h.append(this.f2592b);
        h.append(", hoveredAlpha=");
        h.append(this.f2593c);
        h.append(", pressedAlpha=");
        return C0388a.m1048d(h, this.f2594d, ')');
    }
}
