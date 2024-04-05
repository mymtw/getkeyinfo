package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C19629f;
import kotlinx.coroutines.flow.internal.C19634k;

/* renamed from: kotlinx.coroutines.flow.p1 */
public final class C19662p1<T> implements C19689x1<T>, C19597d, C19634k<T> {

    /* renamed from: b */
    public final C19699g1 f43608b;

    /* renamed from: c */
    public final /* synthetic */ C19689x1<T> f43609c;

    public C19662p1(StateFlowImpl stateFlowImpl, C19699g1 g1Var) {
        this.f43608b = g1Var;
        this.f43609c = stateFlowImpl;
    }

    /* renamed from: b */
    public final C19597d<T> mo72332b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return ((((i >= 0 && i < 2) || i == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) || ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND)) ? this : new C19629f(i, coroutineContext, bufferOverflow, this);
    }

    public final Object collect(C19600e<? super T> eVar, C19340c<?> cVar) {
        return this.f43609c.collect(eVar, cVar);
    }

    public final T getValue() {
        return this.f43609c.getValue();
    }
}
