package com.paypal.pyplcheckout.services.mutations;

public final class GetLsatUpgradeMutation {
    public static final GetLsatUpgradeMutation INSTANCE = new GetLsatUpgradeMutation();

    private GetLsatUpgradeMutation() {
    }

    public final String get() {
        return "mutation UPGRADE_LOW_SCOPED_ACCESS_TOKEN ( \n    $token: String! \n    $buyerAccessToken: String! \n    $merchantLSAT: String!\n) { \n    upgradeLowScopeAccessToken (\n    token: $token, \n    buyerAccessToken: $buyerAccessToken, \n    merchantLSAT: $merchantLSAT\n) \n}";
    }
}
