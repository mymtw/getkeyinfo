package kotlinx.coroutines.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19464a;
import p744gq.C19059b;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.internal.q */
public class C19733q<T> extends C19464a<T> implements C19059b {

    /* renamed from: d */
    public final C19340c<T> f43683d;

    public C19733q(C19340c cVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f43683d = cVar;
    }

    /* renamed from: B0 */
    public void mo72093B0(Object obj) {
        this.f43683d.resumeWith(C19388s.m32884s0(obj));
    }

    /* renamed from: H */
    public void mo72252H(Object obj) {
        C19382n.m32784z0((C19857l) null, C19388s.m32884s0(obj), C19388s.m32873m0(this.f43683d));
    }

    public final C19059b getCallerFrame() {
        C19340c<T> cVar = this.f43683d;
        if (cVar instanceof C19059b) {
            return (C19059b) cVar;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: l0 */
    public final boolean mo72477l0() {
        return true;
    }
}
