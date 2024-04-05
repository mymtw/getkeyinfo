package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.facebook.login.LoginFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.q4 */
public final class C4104q4 {

    /* renamed from: a */
    private final C4296y1 f9133a;

    public C4104q4(C4296y1 y1Var) {
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        this.f9133a = y1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4104q4) && C19383o.m32792b(this.f9133a, ((C4104q4) obj).f9133a);
    }

    public int hashCode() {
        return this.f9133a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("RequestNetworkErrorEvent(request=");
        h.append(this.f9133a);
        h.append(')');
        return h.toString();
    }
}
