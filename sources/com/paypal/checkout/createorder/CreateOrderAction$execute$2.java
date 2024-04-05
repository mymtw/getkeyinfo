package com.paypal.checkout.createorder;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.merchanttoken.CreateLsatTokenAction;
import com.paypal.checkout.merchanttoken.CreateLsatTokenException;
import com.paypal.checkout.order.Order;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.createorder.CreateOrderAction$execute$2", mo70541f = "CreateOrderAction.kt", mo70542l = {48}, mo70543m = "invokeSuspend")
public final class CreateOrderAction$execute$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super String>, Object> {
    public final /* synthetic */ Order $order;
    public int label;
    public final /* synthetic */ CreateOrderAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateOrderAction$execute$2(CreateOrderAction createOrderAction, Order order, C19340c<? super CreateOrderAction$execute$2> cVar) {
        super(2, cVar);
        this.this$0 = createOrderAction;
        this.$order = order;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CreateOrderAction$execute$2(this.this$0, this.$order, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super String> cVar) {
        return ((CreateOrderAction$execute$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            String lsatToken = this.this$0.repository.getLsatToken();
            if (lsatToken != null) {
                return this.this$0.createOrderWithLsat(this.$order, lsatToken);
            }
            CreateLsatTokenAction access$getCreateLsatTokenAction$p = this.this$0.createLsatTokenAction;
            this.label = 1;
            obj = access$getCreateLsatTokenAction$p.execute(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (CreateLsatTokenException e) {
                this.this$0.logError("Attempt to create LSAT token failed.");
                throw e;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) obj;
        this.this$0.repository.setLsatToken(str);
        return this.this$0.createOrderWithLsat(this.$order, str);
    }
}
