package androidx.compose.foundation;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.graphics.C1532l0;
import androidx.compose.p015ui.graphics.C1533m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7284d;

/* renamed from: androidx.compose.foundation.g */
public final class C0556g {

    /* renamed from: a */
    public final float f1304a;

    /* renamed from: b */
    public final C1533m f1305b;

    public C0556g(float f, C1532l0 l0Var) {
        this.f1304a = f;
        this.f1305b = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0556g)) {
            return false;
        }
        C0556g gVar = (C0556g) obj;
        return C7284d.m13983a(this.f1304a, gVar.f1304a) && C19383o.m32792b(this.f1305b, gVar.f1305b);
    }

    public final int hashCode() {
        return this.f1305b.hashCode() + (Float.hashCode(this.f1304a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BorderStroke(width=");
        h.append(C7284d.m13984c(this.f1304a));
        h.append(", brush=");
        h.append(this.f1305b);
        h.append(')');
        return h.toString();
    }
}
