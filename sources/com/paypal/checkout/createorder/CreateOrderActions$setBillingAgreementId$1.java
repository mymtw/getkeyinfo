package com.paypal.checkout.createorder;

import android.content.Context;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.createorder.OrderCreateResult;
import com.paypal.checkout.createorder.p536ba.BaTokenToEcTokenAction;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.exception.PYPLException;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.createorder.CreateOrderActions$setBillingAgreementId$1", mo70541f = "CreateOrderActions.kt", mo70542l = {102}, mo70543m = "invokeSuspend")
public final class CreateOrderActions$setBillingAgreementId$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $billingAgreementId;
    public int label;
    public final /* synthetic */ CreateOrderActions this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateOrderActions$setBillingAgreementId$1(CreateOrderActions createOrderActions, String str, C19340c<? super CreateOrderActions$setBillingAgreementId$1> cVar) {
        super(2, cVar);
        this.this$0 = createOrderActions;
        this.$billingAgreementId = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CreateOrderActions$setBillingAgreementId$1(this.this$0, this.$billingAgreementId, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CreateOrderActions$setBillingAgreementId$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            BaTokenToEcTokenAction access$getBaTokenToEcTokenAction$p = this.this$0.baTokenToEcTokenAction;
            String str2 = this.$billingAgreementId;
            this.label = 1;
            obj = access$getBaTokenToEcTokenAction$p.execute(str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Exception e) {
                this.this$0.getInternalOnOrderCreated$pyplcheckout_externalThreedsRelease().invoke(new OrderCreateResult.Error(new PYPLException(C0326j.m864i("exception with setting BA id: ", e.getMessage()))));
                str = null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) obj;
        if (str != null) {
            CreateOrderActions createOrderActions = this.this$0;
            DebugConfigManager instance = DebugConfigManager.getInstance();
            instance.setCheckoutToken(str);
            createOrderActions.repo.setVaultFlow(false);
            Context applicationContext = instance.getApplicationContext();
            if (applicationContext != null) {
                Cache.cacheIsVaultFlow(applicationContext, createOrderActions.repo.isVaultFlow());
            }
            createOrderActions.getInternalOnOrderCreated$pyplcheckout_externalThreedsRelease().invoke(new OrderCreateResult.Success(str));
        }
        return C19394m.f43287a;
    }
}
