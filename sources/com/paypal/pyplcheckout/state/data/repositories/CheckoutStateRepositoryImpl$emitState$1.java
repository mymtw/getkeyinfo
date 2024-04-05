package com.paypal.pyplcheckout.state.data.repositories;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.extensions.FlowExtensionsKt;
import com.paypal.pyplcheckout.state.data.model.CheckoutState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19656n1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepositoryImpl$emitState$1", mo70541f = "CheckoutStateRepositoryImpl.kt", mo70542l = {42}, mo70543m = "invokeSuspend")
public final class CheckoutStateRepositoryImpl$emitState$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ CheckoutState $state;
    public int label;
    public final /* synthetic */ CheckoutStateRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStateRepositoryImpl$emitState$1(CheckoutStateRepositoryImpl checkoutStateRepositoryImpl, CheckoutState checkoutState, C19340c<? super CheckoutStateRepositoryImpl$emitState$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStateRepositoryImpl;
        this.$state = checkoutState;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CheckoutStateRepositoryImpl$emitState$1(this.this$0, this.$state, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CheckoutStateRepositoryImpl$emitState$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19656n1 access$get_state$p = this.this$0._state;
            CheckoutState checkoutState = this.$state;
            this.label = 1;
            if (FlowExtensionsKt.emitOnce(access$get_state$p, checkoutState, this) == coroutineSingletons) {
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
