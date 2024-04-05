package com.paypal.pyplcheckout.services.mutations;

public final class ThreeDSLookUpMutation {
    public static final ThreeDSLookUpMutation INSTANCE = new ThreeDSLookUpMutation();

    private ThreeDSLookUpMutation() {
    }

    public final String get() {
        return "mutation threeDSLookup(\n    $token: String,\n    $threedsLookUpPayload: threedsLookUpPayload!,\n    $amount: AmountInput!,\n    $nativeSDK: Boolean!,\n    $productDetails: ProductDetails\n) {\n    threeDSLookUp(\n        token:$token,\n        threedsLookUpPayload: $threedsLookUpPayload,\n        amount: $amount,\n        nativeSDK: $nativeSDK,\n        productDetails: $productDetails\n    ) {\n            transactionId\n            threeDSVersion\n            enrollmentStatus\n            liabilityShift\n            cardBrandProcessed\n            signatureVerificationStatus\n            threeDSStatus\n            paymentAuthenticationRequest\n            acsURL {href}\n            redirectURL {href}\n            transactionStatusCode\n            transactionStatusMessage\n            threeDsServerTransactionId\n            threeDsAuthenticationReason\n            threeDSUcafIndicator\n            authenticationThreeDSStatus\n            threeDsProcessorTraceNumber\n            cavv\n        }\n}";
    }
}
