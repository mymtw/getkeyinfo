package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.internal.ThreadContextKt;
import p568fn.C17782b;

/* renamed from: kotlinx.coroutines.flow.internal.e */
public abstract class C19628e<S, T> extends C19626c<T> {

    /* renamed from: e */
    public final C19597d<S> f43594e;

    public C19628e(int i, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, C19597d dVar) {
        super(coroutineContext, i, bufferOverflow);
        this.f43594e = dVar;
    }

    public final Object collect(C19600e<? super T> eVar, C19340c<? super C19394m> cVar) {
        if (this.f43592c == -3) {
            CoroutineContext context = cVar.getContext();
            CoroutineContext plus = context.plus(this.f43591b);
            if (C19383o.m32792b(plus, context)) {
                Object j = mo72351j(eVar, cVar);
                return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : C19394m.f43287a;
            }
            C19341d.C19342a aVar = C19341d.C19342a.f43195b;
            if (C19383o.m32792b(plus.get(aVar), context.get(aVar))) {
                CoroutineContext context2 = cVar.getContext();
                if (!(eVar instanceof C19639o ? true : eVar instanceof C19637m)) {
                    eVar = new UndispatchedContextCollector<>(eVar, context2);
                }
                Object t0 = C17782b.m29887t0(plus, eVar, ThreadContextKt.m33529b(plus), new ChannelFlowOperator$collectWithContextUndispatched$2(this, (C19340c<? super ChannelFlowOperator$collectWithContextUndispatched$2>) null), cVar);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (t0 != coroutineSingletons) {
                    t0 = C19394m.f43287a;
                }
                return t0 == coroutineSingletons ? t0 : C19394m.f43287a;
            }
        }
        Object collect = super.collect(eVar, cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }

    /* renamed from: f */
    public final Object mo72260f(C19513o<? super T> oVar, C19340c<? super C19394m> cVar) {
        Object j = mo72351j(new C19639o(oVar), cVar);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : C19394m.f43287a;
    }

    /* renamed from: j */
    public abstract Object mo72351j(C19600e<? super T> eVar, C19340c<? super C19394m> cVar);

    public final String toString() {
        return this.f43594e + " -> " + super.toString();
    }
}
