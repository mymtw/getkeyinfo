package com.paypal.pyplcheckout.addshipping.api;

public final class AddressAutoCompleteQuery {
    public static final AddressAutoCompleteQuery INSTANCE = new AddressAutoCompleteQuery();

    private AddressAutoCompleteQuery() {
    }

    public final String get() {
        return "query checkoutQuery(\n  $count: Int\n  $countries: [CountryCodes]\n  $input: String!\n  $language: CheckoutContentLanguageCode\n  $location: GeoLocation\n  $offset: Int\n  $radius: Int\n  $sessionId: String!\n  $strictBounds: Boolean = false\n  $types: GooglePlacesType\n) {\n  addressAutoComplete(\n    count: $count\n    countries: $countries\n    input: $input\n    language: $language\n    location: $location\n    offset: $offset\n    radius: $radius\n    sessionId: $sessionId\n    strictBounds: $strictBounds\n    types: $types\n  ) {\n    suggestions {\n      addressText\n      mainText\n      placeId\n      secondaryText\n    }\n  }\n}";
    }
}
