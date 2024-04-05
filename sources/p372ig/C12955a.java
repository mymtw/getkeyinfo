package p372ig;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: ig.a */
public final class C12955a {

    /* renamed from: a */
    public final String f28535a;

    /* renamed from: b */
    public final boolean f28536b;

    public C12955a(String str, boolean z) {
        C19383o.m32797g(str, "name");
        this.f28535a = str;
        this.f28536b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12955a)) {
            return false;
        }
        C12955a aVar = (C12955a) obj;
        return C19383o.m32792b(this.f28535a, aVar.f28535a) && this.f28536b == aVar.f28536b;
    }

    public final int hashCode() {
        String str = this.f28535a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f28536b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GateKeeper(name=");
        h.append(this.f28535a);
        h.append(", value=");
        h.append(this.f28536b);
        h.append(")");
        return h.toString();
    }
}
