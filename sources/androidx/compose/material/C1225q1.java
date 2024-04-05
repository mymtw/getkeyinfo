package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ListingCardSize;
import kotlin.jvm.internal.C19383o;
import p202p.C7638a;
import p202p.C7644f;
import p202p.C7645g;

/* renamed from: androidx.compose.material.q1 */
public final class C1225q1 {

    /* renamed from: a */
    public final C7638a f2547a;

    /* renamed from: b */
    public final C7638a f2548b;

    /* renamed from: c */
    public final C7638a f2549c;

    public C1225q1() {
        this((C7644f) null, 7);
    }

    public C1225q1(C7644f fVar, int i) {
        fVar = (i & 1) != 0 ? C7645g.m14661a((float) 4) : fVar;
        C7644f fVar2 = null;
        C7644f a = (i & 2) != 0 ? C7645g.m14661a((float) 4) : null;
        fVar2 = (i & 4) != 0 ? C7645g.m14661a((float) 0) : fVar2;
        C19383o.m32797g(fVar, ListingCardSize.SMALL);
        C19383o.m32797g(a, "medium");
        C19383o.m32797g(fVar2, ListingCardSize.LARGE);
        this.f2547a = fVar;
        this.f2548b = a;
        this.f2549c = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225q1)) {
            return false;
        }
        C1225q1 q1Var = (C1225q1) obj;
        return C19383o.m32792b(this.f2547a, q1Var.f2547a) && C19383o.m32792b(this.f2548b, q1Var.f2548b) && C19383o.m32792b(this.f2549c, q1Var.f2549c);
    }

    public final int hashCode() {
        int hashCode = this.f2548b.hashCode();
        return this.f2549c.hashCode() + ((hashCode + (this.f2547a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Shapes(small=");
        h.append(this.f2547a);
        h.append(", medium=");
        h.append(this.f2548b);
        h.append(", large=");
        h.append(this.f2549c);
        h.append(')');
        return h.toString();
    }
}
