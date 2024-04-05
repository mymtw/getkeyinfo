package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", mo70541f = "FlowCoroutine.kt", mo70542l = {51}, mo70543m = "invokeSuspend")
final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19862q<C19525d0, C19600e<Object>, C19340c<? super C19394m>, Object> $block;
    public final /* synthetic */ C19600e<Object> $this_unsafeFlow;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowCoroutineKt$scopedFlow$1$1(C19862q<? super C19525d0, ? super C19600e<Object>, ? super C19340c<? super C19394m>, ? extends Object> qVar, C19600e<Object> eVar, C19340c<? super FlowCoroutineKt$scopedFlow$1$1> cVar) {
        super(2, cVar);
        this.$block = qVar;
        this.$this_unsafeFlow = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.$block, this.$this_unsafeFlow, cVar);
        flowCoroutineKt$scopedFlow$1$1.L$0 = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19862q<C19525d0, C19600e<Object>, C19340c<? super C19394m>, Object> qVar = this.$block;
            C19600e<Object> eVar = this.$this_unsafeFlow;
            this.label = 1;
            if (qVar.invoke((C19525d0) this.L$0, eVar, this) == coroutineSingletons) {
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
