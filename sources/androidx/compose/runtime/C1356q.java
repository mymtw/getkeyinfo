package androidx.compose.runtime;

import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.q */
public final class C1356q implements C1426z0 {

    /* renamed from: b */
    public final C19857l<C1360s, C1358r> f2954b;

    /* renamed from: c */
    public C1358r f2955c;

    public C1356q(C19857l<? super C1360s, ? extends C1358r> lVar) {
        C19383o.m32797g(lVar, "effect");
        this.f2954b = lVar;
    }

    public final void onAbandoned() {
    }

    public final void onForgotten() {
        C1358r rVar = this.f2955c;
        if (rVar != null) {
            rVar.dispose();
        }
        this.f2955c = null;
    }

    public final void onRemembered() {
        this.f2955c = this.f2954b.invoke(C1415u.f3074a);
    }
}
