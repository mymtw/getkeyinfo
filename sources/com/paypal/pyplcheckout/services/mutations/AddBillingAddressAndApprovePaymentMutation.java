package com.paypal.pyplcheckout.services.mutations;

import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementBalancePreference;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19453g;

public final class AddBillingAddressAndApprovePaymentMutation {
    public static final AddBillingAddressAndApprovePaymentMutation INSTANCE = new AddBillingAddressAndApprovePaymentMutation();

    private AddBillingAddressAndApprovePaymentMutation() {
    }

    public final String get(boolean z, boolean z2, BillingAgreementBalancePreference billingAgreementBalancePreference) {
        C19383o.m32797g(billingAgreementBalancePreference, "billingAgreementBalancePreference");
        return C19453g.m33013Q0(ApproveMemberPaymentMutation.INSTANCE.getMutation(z, z2, billingAgreementBalancePreference, "\n                mutation ADD_BILLING_ADDRESS_AND_APPROVE_PAYMENT(\n                    $token: String!\n                    $instrumentId: String\n                    $line1: String!\n                    $line2: String\n                    $city: String!\n                    $state: String!\n                    $postalCode: String!\n                    $countryCode: CountryCodes!\n                    $selectedAddressId: String\n                    $preferredFundingOptionId: String\n                    $setStickyFiRequired: Boolean\n                ", "\n                ) {\n                    addBillingAddress(\n                        instrumentId: $instrumentId,\n                        line1: $line1,\n                        line2: $line2,\n                        city: $city\n                        state: $state,\n                        postalCode: $postalCode,\n                        countryCode: $countryCode,\n                    ) { \n                        success \n                       }\n                    approveMemberPayment (\n            "));
    }
}
