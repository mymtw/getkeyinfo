package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.pojo.CheckoutSessionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class BillingAgreementsCacheTypeUseCase {
    private final BillingAgreementsRepository billingAgreementsRepository;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckoutSessionType.values().length];
            iArr[CheckoutSessionType.BILLING_WITH_PURCHASE.ordinal()] = 1;
            iArr[CheckoutSessionType.BILLING_WITHOUT_PURCHASE.ordinal()] = 2;
            iArr[CheckoutSessionType.PURCHASE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BillingAgreementsCacheTypeUseCase(BillingAgreementsRepository billingAgreementsRepository2) {
        C19383o.m32797g(billingAgreementsRepository2, "billingAgreementsRepository");
        this.billingAgreementsRepository = billingAgreementsRepository2;
    }

    public final void invoke(CheckoutSessionType checkoutSessionType) {
        BillingAgreementType billingAgreementType;
        C19383o.m32797g(checkoutSessionType, "checkoutSessionType");
        int i = WhenMappings.$EnumSwitchMapping$0[checkoutSessionType.ordinal()];
        if (i == 1) {
            billingAgreementType = BillingAgreementType.WITH_PURCHASE;
        } else if (i == 2) {
            billingAgreementType = BillingAgreementType.WITHOUT_PURCHASE;
        } else if (i == 3) {
            billingAgreementType = BillingAgreementType.NOT_SUPPORTED;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.billingAgreementsRepository.setBillingAgreementSessionType(billingAgreementType);
        PLog pLog = PLog.INSTANCE;
        PLog.transition$default(PEnums.TransitionName.CHECKOUT_SESSION_TYPE_IDENTIFIED, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, PEnums.StateName.REVIEW, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, checkoutSessionType.name(), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15348, (Object) null);
    }
}
