package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.p3 */
public final class C4075p3 implements C3961m2 {

    /* renamed from: a */
    private final String f9079a;

    /* renamed from: b */
    private final C4296y1 f9080b;

    public C4075p3(String str, C4296y1 y1Var) {
        C19383o.m32797g(y1Var, "originalRequest");
        this.f9079a = str;
        this.f9080b = y1Var;
    }

    /* renamed from: a */
    public String mo13306a() {
        return this.f9079a;
    }

    /* renamed from: b */
    public C4296y1 mo13877b() {
        return this.f9080b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4075p3)) {
            return false;
        }
        C4075p3 p3Var = (C4075p3) obj;
        return C19383o.m32792b(mo13306a(), p3Var.mo13306a()) && C19383o.m32792b(mo13877b(), p3Var.mo13877b());
    }

    public int hashCode() {
        return mo13877b().hashCode() + ((mo13306a() == null ? 0 : mo13306a().hashCode()) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("NetworkCommunicationFailureResponseError(errorMessage=");
        h.append(mo13306a());
        h.append(", originalRequest=");
        h.append(mo13877b());
        h.append(')');
        return h.toString();
    }
}
