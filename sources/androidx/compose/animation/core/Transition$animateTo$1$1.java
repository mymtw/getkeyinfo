package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.animation.core.Transition$animateTo$1$1", mo70541f = "Transition.kt", mo70542l = {434}, mo70543m = "invokeSuspend")
public final class Transition$animateTo$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(Transition<S> transition, C19340c<? super Transition$animateTo$1$1> cVar) {
        super(2, cVar);
        this.this$0 = transition;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, cVar);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((Transition$animateTo$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19525d0 d0Var;
        C04051 r4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            d0Var = (C19525d0) this.L$0;
        } else if (i == 1) {
            d0Var = (C19525d0) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            final float g = SuspendAnimationKt.m1076g(d0Var.getCoroutineContext());
            final Transition<S> transition = this.this$0;
            r4 = new C19857l<Long, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return C19394m.f43287a;
                }

                public final void invoke(long j) {
                    if (!transition.mo3413e()) {
                        transition.mo3414f(j / 1, g);
                    }
                }
            };
            this.L$0 = d0Var;
            this.label = 1;
        } while (C18263b.m30871u0(r4, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
