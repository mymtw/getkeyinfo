package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import p174m0.C7284d;

/* renamed from: androidx.compose.material.y1 */
public final class C1271y1 {

    /* renamed from: a */
    public final float f2668a;

    /* renamed from: b */
    public final float f2669b;

    public C1271y1(float f, float f2) {
        this.f2668a = f;
        this.f2669b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1271y1)) {
            return false;
        }
        C1271y1 y1Var = (C1271y1) obj;
        return C7284d.m13983a(this.f2668a, y1Var.f2668a) && C7284d.m13983a(this.f2669b, y1Var.f2669b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2669b) + (Float.hashCode(this.f2668a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TabPosition(left=");
        h.append(C7284d.m13984c(this.f2668a));
        h.append(", right=");
        h.append(C7284d.m13984c(this.f2668a + this.f2669b));
        h.append(", width=");
        h.append(C7284d.m13984c(this.f2669b));
        h.append(')');
        return h.toString();
    }
}
