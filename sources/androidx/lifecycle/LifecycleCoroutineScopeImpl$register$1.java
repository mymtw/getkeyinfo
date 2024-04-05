package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo70541f = "Lifecycle.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, C19340c<? super LifecycleCoroutineScopeImpl$register$1> cVar) {
        super(2, cVar);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, cVar);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            if (this.this$0.f6434b.mo10734b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.this$0;
                lifecycleCoroutineScopeImpl.f6434b.mo10733a(lifecycleCoroutineScopeImpl);
            } else {
                C1993m.m4372r(d0Var.getCoroutineContext(), (CancellationException) null);
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
