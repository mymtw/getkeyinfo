package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.g */
public final class C3674g implements C3961m2 {

    /* renamed from: a */
    private final String f8427a;

    /* renamed from: b */
    private final C4296y1 f8428b;

    public C3674g(String str, C4296y1 y1Var) {
        C19383o.m32797g(y1Var, "originalRequest");
        this.f8427a = str;
        this.f8428b = y1Var;
    }

    /* renamed from: a */
    public String mo13306a() {
        return this.f8427a;
    }

    /* renamed from: b */
    public C4296y1 mo13307b() {
        return this.f8428b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3674g)) {
            return false;
        }
        C3674g gVar = (C3674g) obj;
        return C19383o.m32792b(mo13306a(), gVar.mo13306a()) && C19383o.m32792b(mo13307b(), gVar.mo13307b());
    }

    public int hashCode() {
        return mo13307b().hashCode() + ((mo13306a() == null ? 0 : mo13306a().hashCode()) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("BasicResponseError(errorMessage=");
        h.append(mo13306a());
        h.append(", originalRequest=");
        h.append(mo13307b());
        h.append(')');
        return h.toString();
    }
}
