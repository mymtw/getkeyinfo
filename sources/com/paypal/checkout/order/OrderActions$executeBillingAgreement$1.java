package com.paypal.checkout.order;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementAction;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult;
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

@C19060c(mo70540c = "com.paypal.checkout.order.OrderActions$executeBillingAgreement$1", mo70541f = "OrderActions.kt", mo70542l = {111}, mo70543m = "invokeSuspend")
public final class OrderActions$executeBillingAgreement$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ OnExecuteBillingAgreementComplete $onComplete;
    public int label;
    public final /* synthetic */ OrderActions this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderActions$executeBillingAgreement$1(OrderActions orderActions, OnExecuteBillingAgreementComplete onExecuteBillingAgreementComplete, C19340c<? super OrderActions$executeBillingAgreement$1> cVar) {
        super(2, cVar);
        this.this$0 = orderActions;
        this.$onComplete = onExecuteBillingAgreementComplete;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OrderActions$executeBillingAgreement$1(this.this$0, this.$onComplete, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OrderActions$executeBillingAgreement$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ExecuteBillingAgreementAction access$getExecuteBillingAgreementAction$p = this.this$0.executeBillingAgreementAction;
            this.label = 1;
            obj = access$getExecuteBillingAgreementAction$p.execute(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ExecuteBillingAgreementResult executeBillingAgreementResult = (ExecuteBillingAgreementResult) obj;
        PLog pLog = PLog.INSTANCE;
        PLog.decision$default(PEnums.TransitionName.BA_EXECUTE_RESPONSE, this.this$0.asOutcome(executeBillingAgreementResult), (PEnums.EventCode) null, PEnums.StateName.POST_REVIEW, (String) null, (String) null, this.this$0.intDesc(executeBillingAgreementResult), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1972, (Object) null);
        this.$onComplete.onExecuteBillingAgreementComplete(executeBillingAgreementResult);
        return C19394m.f43287a;
    }
}
