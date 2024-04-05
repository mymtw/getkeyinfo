package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.facebook.login.LoginFragment;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

/* renamed from: bo.app.p0 */
public final class C4069p0 {

    /* renamed from: a */
    private final C4296y1 f9072a;

    /* renamed from: b */
    private final JSONObject f9073b;

    public C4069p0(C4296y1 y1Var) {
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        this.f9072a = y1Var;
        this.f9073b = y1Var.mo13119l();
    }

    /* renamed from: a */
    public final C4296y1 mo13871a() {
        return this.f9072a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4069p0) && C19383o.m32792b(this.f9072a, ((C4069p0) obj).f9072a);
    }

    public int hashCode() {
        return this.f9072a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("DispatchFailedEvent(request=");
        h.append(this.f9072a);
        h.append(')');
        return h.toString();
    }
}
