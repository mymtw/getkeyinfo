package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.facebook.login.LoginFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.c6 */
public final class C3606c6 {

    /* renamed from: a */
    private final C4296y1 f8304a;

    public C3606c6(C4296y1 y1Var) {
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        this.f8304a = y1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3606c6) && C19383o.m32792b(this.f8304a, ((C3606c6) obj).f8304a);
    }

    public int hashCode() {
        return this.f8304a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TriggerDispatchStartedEvent(request=");
        h.append(this.f8304a);
        h.append(')');
        return h.toString();
    }
}
