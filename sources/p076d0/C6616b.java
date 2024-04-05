package p076d0;

import androidx.compose.p015ui.input.rotary.C1658a;
import kotlin.jvm.internal.C19383o;
import p076d0.C6615a;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p753kq.C19857l;

/* renamed from: d0.b */
public final class C6616b<T extends C6615a> implements C6764b, C6765c<C6616b<T>> {

    /* renamed from: b */
    public final C19857l<C6615a, Boolean> f14599b;

    /* renamed from: c */
    public final C19857l<C6615a, Boolean> f14600c = null;

    /* renamed from: d */
    public final C6767e<C6616b<T>> f14601d;

    /* renamed from: e */
    public C6616b<T> f14602e;

    public C6616b(C19857l lVar, C6767e eVar) {
        C19383o.m32797g(eVar, "key");
        this.f14599b = lVar;
        this.f14601d = eVar;
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        this.f14602e = (C6616b) dVar.mo6818a(this.f14601d);
    }

    /* renamed from: a */
    public final boolean mo18800a(C1658a aVar) {
        C19857l<C6615a, Boolean> lVar = this.f14599b;
        if (lVar != null && lVar.invoke(aVar).booleanValue()) {
            return true;
        }
        C6616b<T> bVar = this.f14602e;
        if (bVar != null) {
            return bVar.mo18800a(aVar);
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo18801b(C1658a aVar) {
        C6616b<T> bVar = this.f14602e;
        if (bVar != null && bVar.mo18801b(aVar)) {
            return true;
        }
        C19857l<C6615a, Boolean> lVar = this.f14600c;
        if (lVar != null) {
            return lVar.invoke(aVar).booleanValue();
        }
        return false;
    }

    public final C6767e<C6616b<T>> getKey() {
        return this.f14601d;
    }

    public final Object getValue() {
        return this;
    }
}
