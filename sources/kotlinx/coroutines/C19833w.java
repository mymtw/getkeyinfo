package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.w */
public final class C19833w {

    /* renamed from: a */
    public final Object f43845a;

    /* renamed from: b */
    public final C19857l<Throwable, C19394m> f43846b;

    public C19833w(C19857l lVar, Object obj) {
        this.f43845a = obj;
        this.f43846b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19833w)) {
            return false;
        }
        C19833w wVar = (C19833w) obj;
        return C19383o.m32792b(this.f43845a, wVar.f43845a) && C19383o.m32792b(this.f43846b, wVar.f43846b);
    }

    public final int hashCode() {
        Object obj = this.f43845a;
        return this.f43846b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CompletedWithCancellation(result=");
        h.append(this.f43845a);
        h.append(", onCancellation=");
        h.append(this.f43846b);
        h.append(')');
        return h.toString();
    }
}
