package kotlinx.coroutines;

import kotlin.coroutines.C19340c;
import kotlinx.coroutines.selects.C19803d;
import kotlinx.coroutines.selects.C19805f;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.s */
public final class C19792s<T> extends C19749k1 implements C19771r<T>, C19803d<T> {
    public C19792s(C19699g1 g1Var) {
        super(true);
        mo72523k0(g1Var);
    }

    /* renamed from: A */
    public final <R> void mo72161A(C19805f<? super R> fVar, C19861p<? super T, ? super C19340c<? super R>, ? extends Object> pVar) {
        mo72530v0(fVar, pVar);
    }

    /* renamed from: B */
    public final boolean mo72564B(T t) {
        return mo72524n0(t);
    }

    /* renamed from: d */
    public final T mo72404d() {
        return mo72515X();
    }

    /* renamed from: n */
    public final Object mo72405n(C19340c<? super T> cVar) {
        return mo72507I(cVar);
    }

    /* renamed from: x */
    public final boolean mo72565x(Throwable th) {
        return mo72524n0(new C19830v(th, false));
    }
}
