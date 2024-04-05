package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.f6 */
public final class C3672f6 {

    /* renamed from: a */
    private final C4173s2 f8424a;

    public C3672f6(C4173s2 s2Var) {
        C19383o.m32797g(s2Var, "triggerEvent");
        this.f8424a = s2Var;
    }

    /* renamed from: a */
    public final C4173s2 mo13299a() {
        return this.f8424a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3672f6) && C19383o.m32792b(this.f8424a, ((C3672f6) obj).f8424a);
    }

    public int hashCode() {
        return this.f8424a.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TriggerEventEvent(triggerEvent=");
        h.append(this.f8424a);
        h.append(')');
        return h.toString();
    }
}
