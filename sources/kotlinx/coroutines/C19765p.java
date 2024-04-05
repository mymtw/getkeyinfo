package kotlinx.coroutines;

import kotlin.C19394m;

/* renamed from: kotlinx.coroutines.p */
public final class C19765p extends C19704h1 implements C19762o {

    /* renamed from: f */
    public final C19768q f43723f;

    public C19765p(C19749k1 k1Var) {
        this.f43723f = k1Var;
    }

    /* renamed from: F */
    public final void mo72253F(Throwable th) {
        this.f43723f.mo72511R(mo72494G());
    }

    /* renamed from: c */
    public final boolean mo72559c(Throwable th) {
        return mo72494G().mo72374T(th);
    }

    public final C19699g1 getParent() {
        return mo72494G();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72253F((Throwable) obj);
        return C19394m.f43287a;
    }
}
