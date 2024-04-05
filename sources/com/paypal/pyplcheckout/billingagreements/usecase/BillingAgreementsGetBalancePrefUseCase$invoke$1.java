package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementBalancePreference;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementState;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;
import com.paypal.pyplcheckout.pojo.BuyerDetails;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class BillingAgreementsGetBalancePrefUseCase$invoke$1 extends Lambda implements C19861p<BillingAgreementState, Boolean, BillingAgreementBalancePreference> {
    public final /* synthetic */ BillingAgreementsGetBalancePrefUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillingAgreementsGetBalancePrefUseCase$invoke$1(BillingAgreementsGetBalancePrefUseCase billingAgreementsGetBalancePrefUseCase) {
        super(2);
        this.this$0 = billingAgreementsGetBalancePrefUseCase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((BillingAgreementState) obj, ((Boolean) obj2).booleanValue());
    }

    public final BillingAgreementBalancePreference invoke(BillingAgreementState billingAgreementState, boolean z) {
        BuyerDetails buyer;
        C19383o.m32797g(billingAgreementState, "baState");
        if (!(billingAgreementState instanceof BillingAgreementState.SupportedState)) {
            return BillingAgreementBalancePreference.NONE;
        }
        if (((BillingAgreementState.SupportedState) billingAgreementState).getType() != BillingAgreementType.WITHOUT_PURCHASE) {
            return BillingAgreementBalancePreference.NONE;
        }
        CheckoutSession checkoutSession = this.this$0.repository.getCheckoutSession();
        boolean z2 = true;
        if (checkoutSession == null || (buyer = checkoutSession.getBuyer()) == null || !buyer.getEligibleToHoldBalance()) {
            z2 = false;
        }
        if (!z2) {
            return BillingAgreementBalancePreference.NONE;
        }
        if (z) {
            return BillingAgreementBalancePreference.ENABLED;
        }
        return BillingAgreementBalancePreference.DISABLED;
    }
}
