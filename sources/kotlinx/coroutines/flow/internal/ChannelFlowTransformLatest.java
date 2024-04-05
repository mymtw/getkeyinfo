package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p753kq.C19862q;

public final class ChannelFlowTransformLatest<T, R> extends C19628e<T, R> {

    /* renamed from: f */
    public final C19862q<C19600e<? super R>, T, C19340c<? super C19394m>, Object> f43569f;

    public ChannelFlowTransformLatest(C19862q<? super C19600e<? super R>, ? super T, ? super C19340c<? super C19394m>, ? extends Object> qVar, C19597d<? extends T> dVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(i, coroutineContext, bufferOverflow, dVar);
        this.f43569f = qVar;
    }

    /* renamed from: g */
    public final C19626c<R> mo72261g(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f43569f, this.f43594e, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: j */
    public final Object mo72351j(C19600e<? super R> eVar, C19340c<? super C19394m> cVar) {
        Object d = C19697g.m33466d(new ChannelFlowTransformLatest$flowCollect$3(this, eVar, (C19340c<? super ChannelFlowTransformLatest$flowCollect$3>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }
}
