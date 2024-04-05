package com.paypal.checkout.order;

import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.order.AuthorizeOrderResult;
import com.paypal.checkout.order.UpdateOrderStatusResult;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.order.AuthorizeOrderAction$execute$2", mo70541f = "AuthorizeOrderAction.kt", mo70542l = {22}, mo70543m = "invokeSuspend")
public final class AuthorizeOrderAction$execute$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super AuthorizeOrderResult>, Object> {
    public int label;
    public final /* synthetic */ AuthorizeOrderAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthorizeOrderAction$execute$2(AuthorizeOrderAction authorizeOrderAction, C19340c<? super AuthorizeOrderAction$execute$2> cVar) {
        super(2, cVar);
        this.this$0 = authorizeOrderAction;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AuthorizeOrderAction$execute$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super AuthorizeOrderResult> cVar) {
        return ((AuthorizeOrderAction$execute$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            UpdateOrderStatusAction access$getUpdateOrderStatusAction$p = this.this$0.updateOrderStatusAction;
            this.label = 1;
            obj = access$getUpdateOrderStatusAction$p.execute(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                return new AuthorizeOrderResult.Error((String) null, C0326j.m864i("Authorize order response was not successful. ", th.getMessage()), 1, (DefaultConstructorMarker) null);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        UpdateOrderStatusResult updateOrderStatusResult = (UpdateOrderStatusResult) obj;
        if (updateOrderStatusResult instanceof UpdateOrderStatusResult.Success) {
            return new AuthorizeOrderResult.Success(((UpdateOrderStatusResult.Success) updateOrderStatusResult).getOrderResponse());
        }
        if (updateOrderStatusResult instanceof UpdateOrderStatusResult.Error) {
            return this.this$0.mapError((UpdateOrderStatusResult.Error) updateOrderStatusResult);
        }
        throw new NoWhenBranchMatchedException();
    }
}
