package kotlinx.coroutines.reactive;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19515q;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.internal.C19721f;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", mo70541f = "ReactiveFlow.kt", mo70542l = {87}, mo70543m = "invokeSuspend")
final class PublisherAsFlow$collectSlowPath$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19600e<Object> $collector;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C19778d<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PublisherAsFlow$collectSlowPath$2(C19600e<Object> eVar, C19778d<Object> dVar, C19340c<? super PublisherAsFlow$collectSlowPath$2> cVar) {
        super(2, cVar);
        this.$collector = eVar;
        this.this$0 = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PublisherAsFlow$collectSlowPath$2 publisherAsFlow$collectSlowPath$2 = new PublisherAsFlow$collectSlowPath$2(this.$collector, this.this$0, cVar);
        publisherAsFlow$collectSlowPath$2.L$0 = obj;
        return publisherAsFlow$collectSlowPath$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PublisherAsFlow$collectSlowPath$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19600e<Object> eVar = this.$collector;
            C19778d<Object> dVar = this.this$0;
            C19515q<Object> i2 = dVar.mo72342i(new C19721f(((C19525d0) this.L$0).getCoroutineContext().plus(dVar.f43591b)));
            this.label = 1;
            Object a = FlowKt__ChannelsKt.m33370a(eVar, i2, true, this);
            if (a != coroutineSingletons) {
                a = C19394m.f43287a;
            }
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
