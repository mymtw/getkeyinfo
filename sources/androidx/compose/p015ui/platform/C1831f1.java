package androidx.compose.p015ui.platform;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.f1 */
public final class C1831f1 {

    /* renamed from: a */
    public final String f4089a;

    /* renamed from: b */
    public final Object f4090b;

    public C1831f1(String str, Object obj) {
        this.f4089a = str;
        this.f4090b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1831f1)) {
            return false;
        }
        C1831f1 f1Var = (C1831f1) obj;
        return C19383o.m32792b(this.f4089a, f1Var.f4089a) && C19383o.m32792b(this.f4090b, f1Var.f4090b);
    }

    public final int hashCode() {
        int hashCode = this.f4089a.hashCode() * 31;
        Object obj = this.f4090b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ValueElement(name=");
        h.append(this.f4089a);
        h.append(", value=");
        return C0073e.m209i(h, this.f4090b, ')');
    }
}
