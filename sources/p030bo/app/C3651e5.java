package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.e5 */
public final class C3651e5 {

    /* renamed from: a */
    private final C3624d5 f8378a;

    public C3651e5(C3624d5 d5Var) {
        C19383o.m32797g(d5Var, "session");
        this.f8378a = d5Var;
        if (!(!d5Var.mo13215y())) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.".toString());
        }
    }

    /* renamed from: a */
    public final C3624d5 mo13258a() {
        return this.f8378a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3651e5) && C19383o.m32792b(this.f8378a, ((C3651e5) obj).f8378a);
    }

    public int hashCode() {
        return this.f8378a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SessionCreatedEvent(session=");
        h.append(this.f8378a);
        h.append(')');
        return h.toString();
    }
}
