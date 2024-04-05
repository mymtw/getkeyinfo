package com.paypal.pyplcheckout.services.queries;

public final class EligibilityQuery {
    public static final EligibilityQuery INSTANCE = new EligibilityQuery();

    private EligibilityQuery() {
    }

    public final String get() {
        return "query MOBILE_SDK_ELIGIBILITY_CALL(\n    $token : String\n    $fundingSource : String\n    $buyerAccessToken : String\n    $buttonSessionID : String\n    $stickinessID : String\n    $nativeAppVersion : String\n    $os : String\n    $nativeSdkVersion : String\n    $enableFunding : [String]\n    $facilitatorClientID : String\n    $domain : String\n    $buyerLanguage : String\n    $isBillingAgreementSupported : Boolean\n    $isCryptoPaymentsSupported : Boolean\n) {\n    mobileSDKEligibility(\n        token: $token\n        fundingSource: $fundingSource\n        buyerAccessToken: $buyerAccessToken\n        buttonSessionID: $buttonSessionID\n        stickinessID: $stickinessID\n        nativeAppVersion: $nativeAppVersion\n        os: $os\n        nativeSdkVersion: $nativeSdkVersion\n        enableFunding: $enableFunding\n        facilitatorClientID: $facilitatorClientID\n        domain: $domain\n        buyerLanguage: $buyerLanguage\n        isBillingAgreementSupported: $isBillingAgreementSupported\n        isCryptoPaymentsSupported: $isCryptoPaymentsSupported\n    ) {\n        paypal {\n            eligibility\n            ineligibilityReason\n            ineligibilityErrorMessage\n        }\n        venmo {\n            eligibility\n            ineligibilityReason\n            ineligibilityErrorMessage\n        }\n    }\n}";
    }
}
