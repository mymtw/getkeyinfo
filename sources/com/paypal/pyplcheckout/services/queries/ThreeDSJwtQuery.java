package com.paypal.pyplcheckout.services.queries;

public final class ThreeDSJwtQuery {
    public static final ThreeDSJwtQuery INSTANCE = new ThreeDSJwtQuery();

    private ThreeDSJwtQuery() {
    }

    public final String get() {
        return "query THREE_DS_JWT ( \n    $referenceId: String! \n    $cardBin: String \n    $jwtIssuer: String! \n    $jwtOrgUnitId: String! \n    $returnUrl: String\n    $redirectUrl: String \n    $transactionId: String \n    $paymentAuthenticationRequest: String \n) { \n    threeDSJwt (\n        referenceId: $referenceId,\n        cardBin: $cardBin,\n        jwtIssuer: $jwtIssuer,\n        jwtOrgUnitId: $jwtOrgUnitId,\n        returnUrl: $returnUrl,\n        redirectUrl: $redirectUrl,\n        transactionId: $transactionId,\n        paymentAuthenticationRequest: $paymentAuthenticationRequest\n    ) \n }";
    }
}
