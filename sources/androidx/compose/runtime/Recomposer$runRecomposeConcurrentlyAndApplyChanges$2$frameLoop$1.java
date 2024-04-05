package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1", mo70541f = "Recomposer.kt", mo70542l = {590}, mo70543m = "invokeSuspend")
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1355p0 $frameSignal;
    public final /* synthetic */ C1321f0 $parentFrameClock;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(Recomposer recomposer, C1321f0 f0Var, C1355p0 p0Var, C19340c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1> cVar) {
        super(2, cVar);
        this.this$0 = recomposer;
        this.$parentFrameClock = f0Var;
        this.$frameSignal = p0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, this.$parentFrameClock, this.$frameSignal, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Recomposer recomposer = this.this$0;
            C1321f0 f0Var = this.$parentFrameClock;
            C1355p0 p0Var = this.$frameSignal;
            this.label = 1;
            if (Recomposer.m2547w(recomposer, f0Var, p0Var, this) == coroutineSingletons) {
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
