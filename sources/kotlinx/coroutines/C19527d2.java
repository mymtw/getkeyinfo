package kotlinx.coroutines;

import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.internal.C19733q;
import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: kotlinx.coroutines.d2 */
public final class C19527d2<T> extends C19733q<T> {

    /* renamed from: e */
    public ThreadLocal<Pair<CoroutineContext, Object>> f43459e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19527d2(kotlin.coroutines.C19340c r3, kotlin.coroutines.CoroutineContext r4) {
        /*
            r2 = this;
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.C19545e2.f43500b
            kotlin.coroutines.CoroutineContext$a r1 = r4.get(r0)
            if (r1 != 0) goto L_0x000c
            kotlin.coroutines.CoroutineContext r4 = r4.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f43459e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19527d2.<init>(kotlin.coroutines.c, kotlin.coroutines.CoroutineContext):void");
    }

    /* renamed from: B0 */
    public final void mo72093B0(Object obj) {
        Pair pair = this.f43459e.get();
        C19527d2<?> d2Var = null;
        if (pair != null) {
            ThreadContextKt.m33528a((CoroutineContext) pair.component1(), pair.component2());
            this.f43459e.set(d2Var);
        }
        Object s0 = C19388s.m32884s0(obj);
        C19340c<T> cVar = this.f43683d;
        CoroutineContext context = cVar.getContext();
        Object c = ThreadContextKt.m33530c(context, d2Var);
        if (c != ThreadContextKt.f43649a) {
            d2Var = CoroutineContextKt.m33063d(cVar, context, c);
        }
        try {
            this.f43683d.resumeWith(s0);
            C19394m mVar = C19394m.f43287a;
        } finally {
            if (d2Var == null || d2Var.mo72221E0()) {
                ThreadContextKt.m33528a(context, c);
            }
        }
    }

    /* renamed from: E0 */
    public final boolean mo72221E0() {
        if (this.f43459e.get() == null) {
            return false;
        }
        this.f43459e.set((Object) null);
        return true;
    }
}
