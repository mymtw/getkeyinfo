package com.paypal.pyplcheckout.services.mutations;

import com.paypal.pyplcheckout.services.queries.CheckoutQuery;
import p010a9.C0048b;

public final class ThreeDSResolveContingencyMutation {
    public static final ThreeDSResolveContingencyMutation INSTANCE = new ThreeDSResolveContingencyMutation();

    private ThreeDSResolveContingencyMutation() {
    }

    public final String get(boolean z) {
        return C0048b.m163a("mutation THREE_DS_RESOLVE_CONTINGENCY (\n    $token:  String!\n    $authId: String!\n    $status: ResolveThreeDsContingencyStatus!\n    $referenceId: String!\n    $creditCardId: String!\n) {\n    resolveThreeDsContingency (\n        token: $token, \n        authId: $authId, \n        status: $status, \n        referenceId: $referenceId, \n        creditCardId: $creditCardId\n    )", CheckoutQuery.INSTANCE.getCheckoutResponse(z), "}");
    }
}
