package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.d6 */
public final class C3628d6 {

    /* renamed from: a */
    private final String f8348a;

    /* renamed from: b */
    private final C4208t1 f8349b;

    public C3628d6(String str, C4208t1 t1Var) {
        C19383o.m32797g(str, "campaignId");
        C19383o.m32797g(t1Var, "pushClickEvent");
        this.f8348a = str;
        this.f8349b = t1Var;
    }

    /* renamed from: a */
    public final String mo13219a() {
        return this.f8348a;
    }

    /* renamed from: b */
    public final C4208t1 mo13220b() {
        return this.f8349b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3628d6)) {
            return false;
        }
        C3628d6 d6Var = (C3628d6) obj;
        return C19383o.m32792b(this.f8348a, d6Var.f8348a) && C19383o.m32792b(this.f8349b, d6Var.f8349b);
    }

    public int hashCode() {
        return this.f8349b.hashCode() + (this.f8348a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TriggerEligiblePushClickEvent(campaignId=");
        h.append(this.f8348a);
        h.append(", pushClickEvent=");
        h.append(this.f8349b);
        h.append(')');
        return h.toString();
    }
}
