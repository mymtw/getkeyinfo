package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.flow.g0 */
public final class C19607g0 implements C19597d<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19597d f43564b;

    /* renamed from: c */
    public final /* synthetic */ C19861p f43565c;

    public C19607g0(ChannelFlowTransformLatest channelFlowTransformLatest, C19861p pVar) {
        this.f43564b = channelFlowTransformLatest;
        this.f43565c = pVar;
    }

    public final Object collect(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        Object collect = this.f43564b.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), eVar, this.f43565c), cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }
}
