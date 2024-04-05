package androidx.compose.foundation;

import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.n */
public final class C0869n implements C6764b, C6765c<C19857l<? super C1689j, ? extends C19394m>>, C19857l<C1689j, C19394m> {

    /* renamed from: b */
    public final C19857l<C1689j, C19394m> f1879b;

    /* renamed from: c */
    public C19857l<? super C1689j, C19394m> f1880c;

    /* renamed from: d */
    public C1689j f1881d;

    public C0869n(C19857l<? super C1689j, C19394m> lVar) {
        C19383o.m32797g(lVar, "handler");
        this.f1879b = lVar;
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        C19857l<? super C1689j, C19394m> lVar = (C19857l) dVar.mo6818a(FocusedBoundsKt.f1267a);
        if (!C19383o.m32792b(lVar, this.f1880c)) {
            this.f1880c = lVar;
        }
    }

    public final C6767e<C19857l<C1689j, C19394m>> getKey() {
        return FocusedBoundsKt.f1267a;
    }

    public final Object getValue() {
        return this;
    }

    public final Object invoke(Object obj) {
        C1689j jVar = (C1689j) obj;
        this.f1881d = jVar;
        this.f1879b.invoke(jVar);
        C19857l<? super C1689j, C19394m> lVar = this.f1880c;
        if (lVar != null) {
            lVar.invoke(jVar);
        }
        return C19394m.f43287a;
    }
}
