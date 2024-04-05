package com.paypal.checkout.createorder;

import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.createorder.CreateOrderActions;
import com.paypal.checkout.createorder.OrderCreateResult;
import com.paypal.checkout.order.Order;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.exception.PYPLException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.createorder.CreateOrderActions$createOrder$1", mo70541f = "CreateOrderActions.kt", mo70542l = {132}, mo70543m = "invokeSuspend")
public final class CreateOrderActions$createOrder$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ CreateOrderActions.OnOrderCreated $onOrderCreated;
    public final /* synthetic */ Order $order;
    public int label;
    public final /* synthetic */ CreateOrderActions this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateOrderActions$createOrder$1(CreateOrderActions createOrderActions, Order order, CreateOrderActions.OnOrderCreated onOrderCreated, C19340c<? super CreateOrderActions$createOrder$1> cVar) {
        super(2, cVar);
        this.this$0 = createOrderActions;
        this.$order = order;
        this.$onOrderCreated = onOrderCreated;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CreateOrderActions$createOrder$1(this.this$0, this.$order, this.$onOrderCreated, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CreateOrderActions$createOrder$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            CreateOrderAction access$getCreateOrderAction$p = this.this$0.createOrderAction;
            Order order = this.$order;
            this.label = 1;
            obj2 = access$getCreateOrderAction$p.execute(order, this);
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
                obj2 = obj;
            } catch (Exception e) {
                this.this$0.getInternalOnOrderCreated$pyplcheckout_externalThreedsRelease().invoke(new OrderCreateResult.Error(new PYPLException(C0326j.m864i("exception when creating order: ", e.getMessage()))));
                PLog.transition$default(PEnums.TransitionName.CREATE_ORDER_EXECUTED, PEnums.Outcome.FAILED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
                str = null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) obj2;
        if (str != null) {
            CreateOrderActions.OnOrderCreated onOrderCreated = this.$onOrderCreated;
            CreateOrderActions createOrderActions = this.this$0;
            if (onOrderCreated != null) {
                onOrderCreated.onCreated(str);
            }
            createOrderActions.getInternalOnOrderCreated$pyplcheckout_externalThreedsRelease().invoke(new OrderCreateResult.Success(str));
            PLog.transition$default(PEnums.TransitionName.CREATE_ORDER_EXECUTED, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
        }
        return C19394m.f43287a;
    }
}
