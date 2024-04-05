package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.g3 */
public final class C3690g3 implements C3961m2 {

    /* renamed from: a */
    private final String f8445a;

    /* renamed from: b */
    private final C4296y1 f8446b;

    public C3690g3(String str, C4296y1 y1Var) {
        C19383o.m32797g(y1Var, "originalRequest");
        this.f8445a = str;
        this.f8446b = y1Var;
    }

    /* renamed from: a */
    public String mo13306a() {
        return this.f8445a;
    }

    /* renamed from: b */
    public C4296y1 mo13327b() {
        return this.f8446b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3690g3)) {
            return false;
        }
        C3690g3 g3Var = (C3690g3) obj;
        return C19383o.m32792b(mo13306a(), g3Var.mo13306a()) && C19383o.m32792b(mo13327b(), g3Var.mo13327b());
    }

    public int hashCode() {
        return mo13327b().hashCode() + ((mo13306a() == null ? 0 : mo13306a().hashCode()) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InvalidApiKeyError(errorMessage=");
        h.append(mo13306a());
        h.append(", originalRequest=");
        h.append(mo13327b());
        h.append(')');
        return h.toString();
    }
}
