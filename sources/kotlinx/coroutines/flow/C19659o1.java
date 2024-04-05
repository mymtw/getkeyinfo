package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C19629f;
import kotlinx.coroutines.flow.internal.C19634k;

/* renamed from: kotlinx.coroutines.flow.o1 */
public final class C19659o1<T> implements C19668r1<T>, C19597d, C19634k<T> {

    /* renamed from: b */
    public final /* synthetic */ C19668r1<T> f43606b;

    public C19659o1(C19671s1 s1Var) {
        this.f43606b = s1Var;
    }

    /* renamed from: b */
    public final C19597d<T> mo72332b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? this : new C19629f(i, coroutineContext, bufferOverflow, this);
    }

    public final Object collect(C19600e<? super T> eVar, C19340c<?> cVar) {
        return this.f43606b.collect(eVar, cVar);
    }
}
