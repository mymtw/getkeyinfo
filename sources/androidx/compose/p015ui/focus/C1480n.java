package androidx.compose.p015ui.focus;

import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p219r.C7734e;

/* renamed from: androidx.compose.ui.focus.n */
public final class C1480n implements C6764b, C6765c<C1480n> {

    /* renamed from: b */
    public C1480n f3196b;

    /* renamed from: c */
    public final C7734e<FocusModifier> f3197c = new C7734e<>(new FocusModifier[16]);

    public C1480n(C1478l lVar) {
        C19383o.m32797g(lVar, "focusRequester");
        lVar.f3195a.mo20232c(this);
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        C1480n nVar = (C1480n) dVar.mo6818a(FocusRequesterModifierKt.f3169a);
        if (!C19383o.m32792b(nVar, this.f3196b)) {
            C1480n nVar2 = this.f3196b;
            if (nVar2 != null) {
                nVar2.mo6223e(this.f3197c);
            }
            if (nVar != null) {
                nVar.mo6221b(this.f3197c);
            }
            this.f3196b = nVar;
        }
    }

    /* renamed from: a */
    public final void mo6220a(FocusModifier focusModifier) {
        C19383o.m32797g(focusModifier, "focusModifier");
        this.f3197c.mo20232c(focusModifier);
        C1480n nVar = this.f3196b;
        if (nVar != null) {
            nVar.mo6220a(focusModifier);
        }
    }

    /* renamed from: b */
    public final void mo6221b(C7734e<FocusModifier> eVar) {
        C19383o.m32797g(eVar, "newModifiers");
        C7734e<FocusModifier> eVar2 = this.f3197c;
        eVar2.mo20233e(eVar2.f17157d, eVar);
        C1480n nVar = this.f3196b;
        if (nVar != null) {
            nVar.mo6221b(eVar);
        }
    }

    /* renamed from: d */
    public final void mo6222d(FocusModifier focusModifier) {
        C19383o.m32797g(focusModifier, "focusModifier");
        this.f3197c.mo20241o(focusModifier);
        C1480n nVar = this.f3196b;
        if (nVar != null) {
            nVar.mo6222d(focusModifier);
        }
    }

    /* renamed from: e */
    public final void mo6223e(C7734e<FocusModifier> eVar) {
        C19383o.m32797g(eVar, "removedModifiers");
        this.f3197c.mo20242p(eVar);
        C1480n nVar = this.f3196b;
        if (nVar != null) {
            nVar.mo6223e(eVar);
        }
    }

    public final C6767e<C1480n> getKey() {
        return FocusRequesterModifierKt.f3169a;
    }

    public final Object getValue() {
        return this;
    }
}
