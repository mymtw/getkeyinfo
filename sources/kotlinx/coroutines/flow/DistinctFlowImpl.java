package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19857l;
import p753kq.C19861p;
import p772tq.C20203a;

public final class DistinctFlowImpl<T> implements C19597d<T> {

    /* renamed from: b */
    public final C19597d<T> f43509b;

    /* renamed from: c */
    public final C19857l<T, Object> f43510c;

    /* renamed from: d */
    public final C19861p<Object, Object, Boolean> f43511d;

    public DistinctFlowImpl(C19597d dVar) {
        C19857l<Object, Object> lVar = FlowKt__DistinctKt.f43517a;
        C19861p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.f43518b;
        this.f43509b = dVar;
        this.f43510c = lVar;
        this.f43511d = pVar;
    }

    public final Object collect(C19600e<? super T> eVar, C19340c<? super C19394m> cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = C20203a.f44778h;
        Object collect = this.f43509b.collect(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, eVar), cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }
}
