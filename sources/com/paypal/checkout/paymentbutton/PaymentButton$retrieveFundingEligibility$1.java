package com.paypal.checkout.paymentbutton;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.config.PaymentButtonIntent;
import com.paypal.checkout.fundingeligibility.FundingEligibilityResponse;
import com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.paymentbutton.PaymentButton$retrieveFundingEligibility$1", mo70541f = "PaymentButton.kt", mo70542l = {296}, mo70543m = "invokeSuspend")
public final class PaymentButton$retrieveFundingEligibility$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;

    public PaymentButton$retrieveFundingEligibility$1(C19340c<? super PaymentButton$retrieveFundingEligibility$1> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PaymentButton$retrieveFundingEligibility$1(cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PaymentButton$retrieveFundingEligibility$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SdkComponent.Companion companion = SdkComponent.Companion;
            Object r1 = companion.getInstance().getMerchantConfigRepository().m35247getMerchantConfigd1pmJ48();
            PaymentButtonIntent paymentButtonIntent = null;
            if (Result.m35485isFailureimpl(r1)) {
                r1 = null;
            }
            CheckoutConfig checkoutConfig = (CheckoutConfig) r1;
            RetrieveFundingEligibilityAction retrieveFundingEligibilityAction = companion.getInstance().getRetrieveFundingEligibilityAction();
            if (checkoutConfig != null) {
                paymentButtonIntent = checkoutConfig.getPaymentButtonIntent();
            }
            this.label = 1;
            obj = retrieveFundingEligibilityAction.retrieve(paymentButtonIntent, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FundingEligibilityResponse fundingEligibilityResponse = (FundingEligibilityResponse) obj;
        DebugConfigManager.getInstance().setFundingEligibilityResponse(fundingEligibilityResponse);
        if (fundingEligibilityResponse != null) {
            Events.Companion.getInstance().fire(PayPalEventTypes.FUNDING_ELIGIBILITY_RESPONSE, new Success(fundingEligibilityResponse));
        }
        return C19394m.f43287a;
    }
}
