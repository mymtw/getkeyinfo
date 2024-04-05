package p030bo.app;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.u4 */
public final class C4235u4 implements C3961m2 {

    /* renamed from: a */
    private final C4296y1 f9380a;

    /* renamed from: b */
    private final int f9381b;

    /* renamed from: c */
    private final String f9382c;

    /* renamed from: d */
    private final String f9383d;

    public C4235u4(C4296y1 y1Var, int i, String str, String str2) {
        C19383o.m32797g(y1Var, "originalRequest");
        this.f9380a = y1Var;
        this.f9381b = i;
        this.f9382c = str;
        this.f9383d = str2;
    }

    /* renamed from: a */
    public String mo13306a() {
        return this.f9383d;
    }

    /* renamed from: b */
    public C4296y1 mo14122b() {
        return this.f9380a;
    }

    /* renamed from: c */
    public int mo14123c() {
        return this.f9381b;
    }

    /* renamed from: d */
    public String mo14124d() {
        return this.f9382c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4235u4)) {
            return false;
        }
        C4235u4 u4Var = (C4235u4) obj;
        return C19383o.m32792b(mo14122b(), u4Var.mo14122b()) && mo14123c() == u4Var.mo14123c() && C19383o.m32792b(mo14124d(), u4Var.mo14124d()) && C19383o.m32792b(mo13306a(), u4Var.mo13306a());
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((Integer.hashCode(mo14123c()) + (mo14122b().hashCode() * 31)) * 31) + (mo14124d() == null ? 0 : mo14124d().hashCode())) * 31;
        if (mo13306a() != null) {
            i = mo13306a().hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("{code = ");
        h.append(mo14123c());
        h.append(", reason = ");
        h.append(mo14124d());
        h.append(", message = ");
        h.append(mo13306a());
        h.append('}');
        return h.toString();
    }
}
