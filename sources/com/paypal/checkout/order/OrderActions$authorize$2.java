package com.paypal.checkout.order;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.order.OrderActions$authorize$2", mo70541f = "OrderActions.kt", mo70542l = {56}, mo70543m = "invokeSuspend")
public final class OrderActions$authorize$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ OnAuthorizeComplete $onComplete;
    public int label;
    public final /* synthetic */ OrderActions this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderActions$authorize$2(OrderActions orderActions, OnAuthorizeComplete onAuthorizeComplete, C19340c<? super OrderActions$authorize$2> cVar) {
        super(2, cVar);
        this.this$0 = orderActions;
        this.$onComplete = onAuthorizeComplete;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OrderActions$authorize$2(this.this$0, this.$onComplete, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OrderActions$authorize$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            AuthorizeOrderAction access$getAuthorizeOrderAction$p = this.this$0.authorizeOrderAction;
            this.label = 1;
            obj2 = access$getAuthorizeOrderAction$p.execute(this);
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AuthorizeOrderResult authorizeOrderResult = (AuthorizeOrderResult) obj2;
        PLog.transition$default(PEnums.TransitionName.ORDER_AUTHORIZE_EXECUTED, this.this$0.asOutcome(authorizeOrderResult), (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
        this.$onComplete.onAuthorizeComplete(authorizeOrderResult);
        return C19394m.f43287a;
    }
}
