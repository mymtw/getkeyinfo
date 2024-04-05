package androidx.compose.p015ui;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.C1436d;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.CombinedModifier */
public final class CombinedModifier implements C1436d {

    /* renamed from: b */
    public final C1436d f3099b;

    /* renamed from: c */
    public final C1436d f3100c;

    public CombinedModifier(C1436d dVar, C1436d dVar2) {
        C19383o.m32797g(dVar, "outer");
        C19383o.m32797g(dVar2, "inner");
        this.f3099b = dVar;
        this.f3100c = dVar2;
    }

    /* renamed from: c */
    public final boolean mo6116c(C19857l<? super C1436d.C1438b, Boolean> lVar) {
        C19383o.m32797g(lVar, "predicate");
        return this.f3099b.mo6116c(lVar) && this.f3100c.mo6116c(lVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            return C19383o.m32792b(this.f3099b, combinedModifier.f3099b) && C19383o.m32792b(this.f3100c, combinedModifier.f3100c);
        }
    }

    public final int hashCode() {
        return (this.f3100c.hashCode() * 31) + this.f3099b.hashCode();
    }

    /* renamed from: i */
    public final <R> R mo6119i(R r, C19861p<? super R, ? super C1436d.C1438b, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return this.f3100c.mo6119i(this.f3099b.mo6119i(r, pVar), pVar);
    }

    /* renamed from: m */
    public final <R> R mo6120m(R r, C19861p<? super C1436d.C1438b, ? super R, ? extends R> pVar) {
        return this.f3099b.mo6120m(this.f3100c.mo6120m(r, pVar), pVar);
    }

    public final String toString() {
        return C0391c.m1057c(C0326j.m866k('['), (String) mo6119i("", CombinedModifier$toString$1.INSTANCE), ']');
    }
}
