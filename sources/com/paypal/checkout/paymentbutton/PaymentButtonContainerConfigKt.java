package com.paypal.checkout.paymentbutton;

import com.paypal.checkout.fundingeligibility.FundingEligibilityData;
import com.paypal.checkout.fundingeligibility.FundingEligibilityItem;
import com.paypal.checkout.fundingeligibility.FundingEligibilityResponse;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

public final class PaymentButtonContainerConfigKt {
    public static final FundingEligibilityState mapToFundingEligibilityState(FundingEligibilityResponse fundingEligibilityResponse) {
        C19383o.m32797g(fundingEligibilityResponse, "<this>");
        FundingEligibilityData data = fundingEligibilityResponse.getData();
        if (data == null) {
            return null;
        }
        return new FundingEligibilityState(C19294b0.m32562s0(new Pair(PaymentFundingType.PAYPAL, data.getFundingEligibility().getPaypal()), new Pair(PaymentFundingType.PAY_LATER, new FundingEligibilityItem(false, data.getFundingEligibility().getPaylater().getReasons())), new Pair(PaymentFundingType.PAYPAL_CREDIT, new FundingEligibilityItem(false, data.getFundingEligibility().getCredit().getReasons()))), fundingEligibilityResponse.getError());
    }
}
