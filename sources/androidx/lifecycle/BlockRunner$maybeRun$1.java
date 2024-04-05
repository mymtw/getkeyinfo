package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.BlockRunner$maybeRun$1", mo70541f = "CoroutineLiveData.kt", mo70542l = {176}, mo70543m = "invokeSuspend")
final class BlockRunner$maybeRun$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C2844b<Object> this$0;

    public BlockRunner$maybeRun$1(C2844b<Object> bVar, C19340c<? super BlockRunner$maybeRun$1> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1((C2844b<Object>) null, cVar);
        blockRunner$maybeRun$1.L$0 = obj;
        return blockRunner$maybeRun$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((BlockRunner$maybeRun$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            throw null;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C0761x.m1684O0(obj);
            throw null;
        }
    }
}
