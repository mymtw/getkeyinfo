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

@C19060c(mo70540c = "com.paypal.checkout.order.OrderActions$capture$2", mo70541f = "OrderActions.kt", mo70542l = {36}, mo70543m = "invokeSuspend")
public final class OrderActions$capture$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ OnCaptureComplete $onComplete;
    public int label;
    public final /* synthetic */ OrderActions this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderActions$capture$2(OrderActions orderActions, OnCaptureComplete onCaptureComplete, C19340c<? super OrderActions$capture$2> cVar) {
        super(2, cVar);
        this.this$0 = orderActions;
        this.$onComplete = onCaptureComplete;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OrderActions$capture$2(this.this$0, this.$onComplete, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OrderActions$capture$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            CaptureOrderAction access$getCaptureOrderAction$p = this.this$0.captureOrderAction;
            this.label = 1;
            obj2 = access$getCaptureOrderAction$p.execute(this);
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CaptureOrderResult captureOrderResult = (CaptureOrderResult) obj2;
        PLog.transition$default(PEnums.TransitionName.ORDER_CAPTURE_EXECUTED, this.this$0.asOutcome(captureOrderResult), (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
        this.$onComplete.onCaptureComplete(captureOrderResult);
        return C19394m.f43287a;
    }
}
