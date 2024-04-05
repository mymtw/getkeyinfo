package com.paypal.pyplcheckout.pojo;

import p003a2.C0015b;

public final class EligibilityResponseKt {
    public static final String ineligibilityReasonAndErrorMessage(Eligibility eligibility) {
        String str;
        String ineligibilityErrorMessage;
        String str2 = "unknown";
        if (eligibility == null || (str = eligibility.getIneligibilityReason()) == null) {
            str = str2;
        }
        if (!(eligibility == null || (ineligibilityErrorMessage = eligibility.getIneligibilityErrorMessage()) == null)) {
            str2 = ineligibilityErrorMessage;
        }
        return C0015b.m90i("ineligibilityReason: ", str, "; ineligibilityErrorMessage: ", str2);
    }
}
