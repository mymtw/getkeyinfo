package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19503g;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", mo70541f = "Channels.kt", mo70542l = {39}, mo70543m = "invokeSuspend")
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19503g<? extends C19394m>>, Object> {
    public final /* synthetic */ Object $element;
    public final /* synthetic */ C19519u<Object> $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(C19519u<Object> uVar, Object obj, C19340c<? super ChannelsKt__ChannelsKt$trySendBlocking$2> cVar) {
        super(2, cVar);
        this.$this_trySendBlocking = uVar;
        this.$element = obj;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, cVar);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19503g<C19394m>> cVar) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            C19519u<Object> uVar = this.$this_trySendBlocking;
            Object obj3 = this.$element;
            this.label = 1;
            if (uVar.mo72188E(obj3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                obj2 = Result.m35480constructorimpl(C0761x.m1673J(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = Result.m35480constructorimpl(C19394m.f43287a);
        return new C19503g(Result.m35486isSuccessimpl(obj2) ? C19394m.f43287a : new C19503g.C19504a(Result.m35483exceptionOrNullimpl(obj2)));
    }
}
