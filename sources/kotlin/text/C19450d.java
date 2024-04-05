package kotlin.text;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p764pq.C20057i;

/* renamed from: kotlin.text.d */
public final class C19450d {

    /* renamed from: a */
    public final String f43387a;

    /* renamed from: b */
    public final C20057i f43388b;

    public C19450d(String str, C20057i iVar) {
        this.f43387a = str;
        this.f43388b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19450d)) {
            return false;
        }
        C19450d dVar = (C19450d) obj;
        return C19383o.m32792b(this.f43387a, dVar.f43387a) && C19383o.m32792b(this.f43388b, dVar.f43388b);
    }

    public final int hashCode() {
        return this.f43388b.hashCode() + (this.f43387a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MatchGroup(value=");
        h.append(this.f43387a);
        h.append(", range=");
        h.append(this.f43388b);
        h.append(')');
        return h.toString();
    }
}
