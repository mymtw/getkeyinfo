package p340ea;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: ea.d */
public final class C12663d {

    /* renamed from: a */
    public final int f27927a;

    /* renamed from: b */
    public final String f27928b;

    public /* synthetic */ C12663d() {
        throw null;
    }

    public C12663d(int i, String str) {
        C19383o.m32797g(str, "logAsJson");
        this.f27927a = i;
        this.f27928b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12663d)) {
            return false;
        }
        C12663d dVar = (C12663d) obj;
        return this.f27927a == dVar.f27927a && C19383o.m32792b(this.f27928b, dVar.f27928b);
    }

    public final int hashCode() {
        return this.f27928b.hashCode() + (Integer.hashCode(this.f27927a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ElkLogDbModel(id=");
        h.append(this.f27927a);
        h.append(", logAsJson=");
        return C0391c.m1057c(h, this.f27928b, ')');
    }
}
