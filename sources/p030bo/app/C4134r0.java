package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.facebook.login.LoginFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.r0 */
public final class C4134r0 {

    /* renamed from: a */
    private final C4296y1 f9184a;

    public C4134r0(C4296y1 y1Var) {
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        this.f9184a = y1Var;
    }

    /* renamed from: a */
    public final C4296y1 mo13990a() {
        return this.f9184a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4134r0) && C19383o.m32792b(this.f9184a, ((C4134r0) obj).f9184a);
    }

    public int hashCode() {
        return this.f9184a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("DispatchSucceededEvent(request=");
        h.append(this.f9184a);
        h.append(')');
        return h.toString();
    }
}
