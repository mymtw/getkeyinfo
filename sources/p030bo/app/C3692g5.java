package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.g5 */
public final class C3692g5 {

    /* renamed from: a */
    private final C3624d5 f8448a;

    public C3692g5(C3624d5 d5Var) {
        C19383o.m32797g(d5Var, "sealedSession");
        this.f8448a = d5Var;
    }

    /* renamed from: a */
    public final C3624d5 mo13332a() {
        return this.f8448a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3692g5) && C19383o.m32792b(this.f8448a, ((C3692g5) obj).f8448a);
    }

    public int hashCode() {
        return this.f8448a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SessionSealedEvent(sealedSession=");
        h.append(this.f8448a);
        h.append(')');
        return h.toString();
    }
}
