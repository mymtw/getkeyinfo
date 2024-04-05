package kotlin.collections;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlin.collections.x */
public final class C19331x<T> {

    /* renamed from: a */
    public final int f43190a;

    /* renamed from: b */
    public final T f43191b;

    public C19331x(int i, T t) {
        this.f43190a = i;
        this.f43191b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19331x)) {
            return false;
        }
        C19331x xVar = (C19331x) obj;
        return this.f43190a == xVar.f43190a && C19383o.m32792b(this.f43191b, xVar.f43191b);
    }

    public final int hashCode() {
        int i = this.f43190a * 31;
        T t = this.f43191b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("IndexedValue(index=");
        h.append(this.f43190a);
        h.append(", value=");
        return C0073e.m209i(h, this.f43191b, ')');
    }
}
