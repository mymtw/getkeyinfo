package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.Lifecycle;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", mo70541f = "PausingDispatcher.kt", mo70542l = {162}, mo70543m = "invokeSuspend")
public final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super T>, Object> {
    public final /* synthetic */ C19861p<C19525d0, C19340c<? super T>, Object> $block;
    public final /* synthetic */ Lifecycle.State $minState;
    public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, C19861p<? super C19525d0, ? super C19340c<? super T>, ? extends Object> pVar, C19340c<? super PausingDispatcherKt$whenStateAtLeast$2> cVar) {
        super(2, cVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super T> cVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            CoroutineContext coroutineContext = ((C19525d0) this.L$0).getCoroutineContext();
            int i2 = C19699g1.f43634d1;
            C19699g1 g1Var = (C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b);
            if (g1Var != null) {
                C2849c0 c0Var = new C2849c0();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, c0Var.f6467c, g1Var);
                try {
                    C19861p<C19525d0, C19340c<? super T>, Object> pVar = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = C19697g.m33471i(this, c0Var, pVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController = lifecycleController2;
                    lifecycleController.mo10738a();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            lifecycleController = (LifecycleController) this.L$0;
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lifecycleController.mo10738a();
        return obj;
    }
}
