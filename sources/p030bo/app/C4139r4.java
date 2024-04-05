package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.facebook.login.LoginFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.r4 */
public final class C4139r4 {

    /* renamed from: a */
    private final C4296y1 f9187a;

    public C4139r4(C4296y1 y1Var) {
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        this.f9187a = y1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4139r4) && C19383o.m32792b(this.f9187a, ((C4139r4) obj).f9187a);
    }

    public int hashCode() {
        return this.f9187a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("RequestNetworkSuccessEvent(request=");
        h.append(this.f9187a);
        h.append(')');
        return h.toString();
    }
}
