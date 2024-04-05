package com.paypal.checkout.createorder;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.createorder.OrderCreateResult;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.createorder.CreateOrderActions$set$1", mo70541f = "CreateOrderActions.kt", mo70542l = {64}, mo70543m = "invokeSuspend")
public final class CreateOrderActions$set$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $orderId;
    public int label;
    public final /* synthetic */ CreateOrderActions this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateOrderActions$set$1(CreateOrderActions createOrderActions, String str, C19340c<? super CreateOrderActions$set$1> cVar) {
        super(2, cVar);
        this.this$0 = createOrderActions;
        this.$orderId = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CreateOrderActions$set$1(this.this$0, this.$orderId, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CreateOrderActions$set$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            CreateOrderActions createOrderActions = this.this$0;
            String str = this.$orderId;
            this.label = 1;
            obj = createOrderActions.attemptBATokenConversion(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = (String) obj;
        DebugConfigManager.getInstance().setCheckoutToken(str2);
        this.this$0.getInternalOnOrderCreated$pyplcheckout_externalThreedsRelease().invoke(new OrderCreateResult.Success(str2));
        return C19394m.f43287a;
    }
}
