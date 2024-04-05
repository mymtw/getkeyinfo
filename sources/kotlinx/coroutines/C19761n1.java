package kotlinx.coroutines;

import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19388s;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.n1 */
public final class C19761n1 extends C19835w1 {

    /* renamed from: d */
    public final C19340c<C19394m> f43721d;

    public C19761n1(CoroutineContext coroutineContext, C19861p<? super C19525d0, ? super C19340c<? super C19394m>, ? extends Object> pVar) {
        super(coroutineContext, false);
        this.f43721d = C19388s.m32843R(pVar, this, this);
    }

    /* renamed from: t0 */
    public final void mo72527t0() {
        try {
            C19382n.m32784z0((C19857l) null, Result.m35480constructorimpl(C19394m.f43287a), C19388s.m32873m0(this.f43721d));
        } catch (Throwable th) {
            C19543e0.m33294J(th, this);
            throw null;
        }
    }
}
