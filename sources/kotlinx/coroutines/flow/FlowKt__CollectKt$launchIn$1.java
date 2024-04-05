package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.internal.C19637m;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", mo70541f = "Collect.kt", mo70542l = {50}, mo70543m = "invokeSuspend")
final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d<Object> $this_launchIn;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(C19597d<Object> dVar, C19340c<? super FlowKt__CollectKt$launchIn$1> cVar) {
        super(2, cVar);
        this.$this_launchIn = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((FlowKt__CollectKt$launchIn$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<Object> dVar = this.$this_launchIn;
            this.label = 1;
            Object collect = dVar.collect(C19637m.f43600b, this);
            if (collect != coroutineSingletons) {
                collect = C19394m.f43287a;
            }
            if (collect == coroutineSingletons) {
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
