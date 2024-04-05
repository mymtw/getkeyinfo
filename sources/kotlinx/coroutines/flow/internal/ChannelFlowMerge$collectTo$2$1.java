package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.sync.C19816d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", mo70541f = "Merge.kt", mo70542l = {69}, mo70543m = "invokeSuspend")
final class ChannelFlowMerge$collectTo$2$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19639o<Object> $collector;
    public final /* synthetic */ C19597d<Object> $inner;
    public final /* synthetic */ C19816d $semaphore;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowMerge$collectTo$2$1(C19597d<Object> dVar, C19639o<Object> oVar, C19816d dVar2, C19340c<? super ChannelFlowMerge$collectTo$2$1> cVar) {
        super(2, cVar);
        this.$inner = dVar;
        this.$collector = oVar;
        this.$semaphore = dVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ChannelFlowMerge$collectTo$2$1(this.$inner, this.$collector, this.$semaphore, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ChannelFlowMerge$collectTo$2$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<Object> dVar = this.$inner;
            C19639o<Object> oVar = this.$collector;
            this.label = 1;
            if (dVar.collect(oVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                this.$semaphore.release();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$semaphore.release();
        return C19394m.f43287a;
    }
}
