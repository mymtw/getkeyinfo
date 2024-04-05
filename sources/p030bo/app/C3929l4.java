package p030bo.app;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.l4 */
public final class C3929l4 {

    /* renamed from: a */
    private final C3964m4 f8835a;

    /* renamed from: b */
    private final String f8836b;

    public C3929l4(C3964m4 m4Var, String str) {
        C19383o.m32797g(m4Var, "pathType");
        C19383o.m32797g(str, "remoteUrl");
        this.f8835a = m4Var;
        this.f8836b = str;
    }

    /* renamed from: a */
    public final C3964m4 mo13667a() {
        return this.f8835a;
    }

    /* renamed from: b */
    public final String mo13668b() {
        return this.f8836b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3929l4)) {
            return false;
        }
        C3929l4 l4Var = (C3929l4) obj;
        return this.f8835a == l4Var.f8835a && C19383o.m32792b(this.f8836b, l4Var.f8836b);
    }

    public int hashCode() {
        return this.f8836b.hashCode() + (this.f8835a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("RemotePath(pathType=");
        h.append(this.f8835a);
        h.append(", remoteUrl=");
        return C0391c.m1057c(h, this.f8836b, ')');
    }
}
