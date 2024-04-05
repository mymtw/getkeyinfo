package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.z4 */
public final class C4322z4 {

    /* renamed from: a */
    private final C4299y4 f9538a;

    public C4322z4(C4299y4 y4Var) {
        C19383o.m32797g(y4Var, "serverConfig");
        this.f9538a = y4Var;
    }

    /* renamed from: a */
    public final C4299y4 mo14256a() {
        return this.f9538a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4322z4) && C19383o.m32792b(this.f9538a, ((C4322z4) obj).f9538a);
    }

    public int hashCode() {
        return this.f9538a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ServerConfigReceivedEvent(serverConfig=");
        h.append(this.f9538a);
        h.append(')');
        return h.toString();
    }
}
