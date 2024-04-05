package com.paypal.pyplcheckout.services.mutations;

public final class ThreeDSAuthenticateMutation {
    public static final ThreeDSAuthenticateMutation INSTANCE = new ThreeDSAuthenticateMutation();

    private ThreeDSAuthenticateMutation() {
    }

    public final String get() {
        return "mutation THREE_DS_AUTHENTICATE (\n    $threeDsServerTransactionId:  String! \n    $authenticatePayload: threedsLookUpPayload!\n    $paymentAuthenticationRequest: String!\n    $amount: AmountInput!\n    $productDetails: ProductDetails\n) {\n    threeDSAuthenticate (\n        threeDsServerTransactionId: $threeDsServerTransactionId, \n        authenticatePayload: $authenticatePayload, \n        paymentAuthenticationRequest: $paymentAuthenticationRequest, \n        amount: $amount, \n        productDetails:  $productDetails, \n    ) {\n        eciIndicator \n        ucafIndicator  \n        authenticationThreeDSStatus  \n        threeDSVersion  \n        threeDSTransactionId  \n        authenticationType  \n        signatureVerificationStatus\n        skipThreeDSEnforcement\n        cardBrandProcessed\n        threeDSEcommerceIndicator \n        threeDSSignatureStatus\n        threeDSUcafIndicator \n        liabilityShift\n        threeDSStatus\n        enrollmentStatus\n        threeDsAuthenticationReason\n        cavv\n    }\n}";
    }
}
