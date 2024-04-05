package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.facebook.login.LoginFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.b6 */
public final class C3593b6 {

    /* renamed from: a */
    private final C4296y1 f8255a;

    public C3593b6(C4296y1 y1Var) {
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        this.f8255a = y1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3593b6) && C19383o.m32792b(this.f8255a, ((C3593b6) obj).f8255a);
    }

    public int hashCode() {
        return this.f8255a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TriggerDispatchCompletedEvent(request=");
        h.append(this.f8255a);
        h.append(')');
        return h.toString();
    }
}
