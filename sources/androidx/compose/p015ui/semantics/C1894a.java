package androidx.compose.p015ui.semantics;

import android.support.p013v4.media.C0072d;
import kotlin.C19283a;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.semantics.a */
public final class C1894a<T extends C19283a<? extends Boolean>> {

    /* renamed from: a */
    public final String f4217a;

    /* renamed from: b */
    public final T f4218b;

    public C1894a(String str, T t) {
        this.f4217a = str;
        this.f4218b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1894a)) {
            return false;
        }
        C1894a aVar = (C1894a) obj;
        return C19383o.m32792b(this.f4217a, aVar.f4217a) && C19383o.m32792b(this.f4218b, aVar.f4218b);
    }

    public final int hashCode() {
        String str = this.f4217a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.f4218b;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AccessibilityAction(label=");
        h.append(this.f4217a);
        h.append(", action=");
        h.append(this.f4218b);
        h.append(')');
        return h.toString();
    }
}
