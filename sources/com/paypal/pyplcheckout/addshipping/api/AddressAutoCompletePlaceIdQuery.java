package com.paypal.pyplcheckout.addshipping.api;

public final class AddressAutoCompletePlaceIdQuery {
    public static final AddressAutoCompletePlaceIdQuery INSTANCE = new AddressAutoCompletePlaceIdQuery();

    private AddressAutoCompletePlaceIdQuery() {
    }

    public final String get() {
        return "query addressFromAutoCompletePlaceId(\n    $language: CheckoutContentLanguageCode\n    $placeId: ID!\n    $region: String\n    $sessionId: String!\n) {\n    addressFromAutoCompletePlaceId(\n    language: $language,\n    placeId: $placeId,\n    region: $region,\n    sessionId: $sessionId) {\n    address {\n      fullAddress\n      state\n      postalCode\n      city\n    }\n  }\n}";
    }
}
