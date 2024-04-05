package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.c5 */
public final class C3605c5 {

    /* renamed from: a */
    private final C3961m2 f8303a;

    public C3605c5(C3961m2 m2Var) {
        C19383o.m32797g(m2Var, "responseError");
        this.f8303a = m2Var;
    }

    /* renamed from: a */
    public final C3961m2 mo13165a() {
        return this.f8303a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3605c5) && C19383o.m32792b(this.f8303a, ((C3605c5) obj).f8303a);
    }

    public int hashCode() {
        return this.f8303a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ServerResponseErrorEvent(responseError=");
        h.append(this.f8303a);
        h.append(')');
        return h.toString();
    }
}
