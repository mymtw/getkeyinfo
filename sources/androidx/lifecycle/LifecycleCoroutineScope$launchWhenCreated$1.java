package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.Lifecycle;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", mo70541f = "Lifecycle.kt", mo70542l = {79}, mo70543m = "invokeSuspend")
final class LifecycleCoroutineScope$launchWhenCreated$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C19525d0, C19340c<? super C19394m>, Object> $block;
    public int label;
    public final /* synthetic */ C2882o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenCreated$1(C2882o oVar, C19861p<? super C19525d0, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super LifecycleCoroutineScope$launchWhenCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = oVar;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.this$0, this.$block, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Lifecycle a = this.this$0.mo10742a();
            C19861p<C19525d0, C19340c<? super C19394m>, Object> pVar = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.m6780a(a, Lifecycle.State.CREATED, pVar, this) == coroutineSingletons) {
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
