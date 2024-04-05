package p077d1;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import java.util.Objects;

/* renamed from: d1.c */
public final class C6619c<F, S> {

    /* renamed from: a */
    public final F f14606a;

    /* renamed from: b */
    public final S f14607b;

    public C6619c(F f, S s) {
        this.f14606a = f;
        this.f14607b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6619c)) {
            return false;
        }
        C6619c cVar = (C6619c) obj;
        return Objects.equals(cVar.f14606a, this.f14606a) && Objects.equals(cVar.f14607b, this.f14607b);
    }

    public final int hashCode() {
        F f = this.f14606a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f14607b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Pair{");
        h.append(this.f14606a);
        h.append(" ");
        return C0071c.m192d(h, this.f14607b, "}");
    }
}
