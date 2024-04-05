package androidx.compose.p015ui.graphics;

import android.graphics.RenderEffect;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: androidx.compose.ui.graphics.l */
public final class C1531l extends C1520f0 {

    /* renamed from: b */
    public final C1520f0 f3327b = null;

    /* renamed from: c */
    public final float f3328c;

    /* renamed from: d */
    public final float f3329d;

    /* renamed from: e */
    public final int f3330e;

    public C1531l(float f, float f2, int i) {
        this.f3328c = f;
        this.f3329d = f2;
        this.f3330e = i;
    }

    /* renamed from: a */
    public final RenderEffect mo6337a() {
        return C1522g0.f3300a.mo6341a(this.f3327b, this.f3328c, this.f3329d, this.f3330e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1531l)) {
            return false;
        }
        C1531l lVar = (C1531l) obj;
        if (!(this.f3328c == lVar.f3328c)) {
            return false;
        }
        if (!(this.f3329d == lVar.f3329d)) {
            return false;
        }
        return (this.f3330e == lVar.f3330e) && C19383o.m32792b(this.f3327b, lVar.f3327b);
    }

    public final int hashCode() {
        C1520f0 f0Var = this.f3327b;
        return Integer.hashCode(this.f3330e) + C0023f.m104c(this.f3329d, C0023f.m104c(this.f3328c, (f0Var != null ? f0Var.hashCode() : 0) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder h = C0072d.m201h("BlurEffect(renderEffect=");
        h.append(this.f3327b);
        h.append(", radiusX=");
        h.append(this.f3328c);
        h.append(", radiusY=");
        h.append(this.f3329d);
        h.append(", edgeTreatment=");
        int i = this.f3330e;
        boolean z = false;
        if (i == 0) {
            str = "Clamp";
        } else {
            if (i == 1) {
                str = "Repeated";
            } else {
                if (i == 2) {
                    str = "Mirror";
                } else {
                    if (i == 3) {
                        z = true;
                    }
                    str = z ? "Decal" : "Unknown";
                }
            }
        }
        h.append(str);
        h.append(')');
        return h.toString();
    }
}
