package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.m6 */
public final class C3967m6 {

    /* renamed from: a */
    private final C4173s2 f8904a;

    /* renamed from: b */
    private final C4275x2 f8905b;

    public C3967m6(C4173s2 s2Var, C4275x2 x2Var) {
        C19383o.m32797g(s2Var, "originalTriggerEvent");
        C19383o.m32797g(x2Var, "failedTriggeredAction");
        this.f8904a = s2Var;
        this.f8905b = x2Var;
    }

    /* renamed from: a */
    public final C4173s2 mo13716a() {
        return this.f8904a;
    }

    /* renamed from: b */
    public final C4275x2 mo13717b() {
        return this.f8905b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3967m6)) {
            return false;
        }
        C3967m6 m6Var = (C3967m6) obj;
        return C19383o.m32792b(this.f8904a, m6Var.f8904a) && C19383o.m32792b(this.f8905b, m6Var.f8905b);
    }

    public int hashCode() {
        return this.f8905b.hashCode() + (this.f8904a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TriggeredActionRetryEvent(originalTriggerEvent=");
        h.append(this.f8904a);
        h.append(", failedTriggeredAction=");
        h.append(this.f8905b);
        h.append(')');
        return h.toString();
    }
}
