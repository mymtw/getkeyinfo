package androidx.compose.runtime;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.a0 */
public final class C1294a0 {

    /* renamed from: a */
    public final Object f2797a;

    /* renamed from: b */
    public final Object f2798b;

    public C1294a0(Integer num, Object obj) {
        this.f2797a = num;
        this.f2798b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1294a0)) {
            return false;
        }
        C1294a0 a0Var = (C1294a0) obj;
        return C19383o.m32792b(this.f2797a, a0Var.f2797a) && C19383o.m32792b(this.f2798b, a0Var.f2798b);
    }

    public final int hashCode() {
        Object obj = this.f2797a;
        int i = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f2798b;
        if (obj2 instanceof Enum) {
            i = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i + ordinal;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("JoinedKey(left=");
        h.append(this.f2797a);
        h.append(", right=");
        return C0073e.m209i(h, this.f2798b, ')');
    }
}
