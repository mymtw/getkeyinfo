package com.paypal.pyplcheckout.services.mutations;

public final class AddressValidationMutation {
    public static final AddressValidationMutation INSTANCE = new AddressValidationMutation();

    private AddressValidationMutation() {
    }

    public final String get() {
        return "query ADDRESS_VALIDATION(\n  $ line1: String\n  $ line2: String\n  $ city: String\n  $ state: String\n  $ postalCode: String\n  $ country: CountryCodes\n  $ addressLine1: String\n  $ addressLine2: String\n  $ addressLine3: String\n  $ adminArea1: String\n  $ adminArea2: String\n  $ adminArea3: String\n  $ adminArea4: String\n  $ countryCode: CountryCodes\n) {\n  addressValidation(\n    line1: $ line1\n    line2: $ line2\n    city: $ city\n    state: $ state\n    postalCode: $ postalCode,\n    country: $ country,\n    addressLine1: $ addressLine1,\n    addressLine2: $ addressLine2,\n    addressLine3: $ addressLine3,\n    adminArea1: $ adminArea1,\n    adminArea2: $ adminArea2,\n    adminArea3: $ adminArea3,\n    adminArea4: $ adminArea4,\n    countryCode: $ countryCode\n  ) {\n    isValidAddress\n    isReformatted\n    badFields {\n      line1\n      line2\n      city\n      state\n      postalCode\n      country\n    }\n    mailability\n    formattedAddress\n    line1\n    line2\n    city\n    state\n    postalCode\n    country\n    addressLine1\n    addressLine2\n    addressLine3\n    adminArea1\n    adminArea2\n    adminArea3\n    adminArea4\n    countryCode\n  }\n}";
    }
}
