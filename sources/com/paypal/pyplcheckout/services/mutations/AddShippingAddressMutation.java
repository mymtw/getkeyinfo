package com.paypal.pyplcheckout.services.mutations;

import com.paypal.pyplcheckout.services.queries.CheckoutQuery;
import p010a9.C0048b;

public final class AddShippingAddressMutation {
    public static final AddShippingAddressMutation INSTANCE = new AddShippingAddressMutation();

    private AddShippingAddressMutation() {
    }

    public final String get(boolean z) {
        return C0048b.m163a("mutation ADD_SHIPPING_ADDRESS(\n    $ token:  String!\n    $ givenName:  String!\n    $ familyName:  String!\n    $ line1:  String\n    $ line2:  String\n    $ city:  String\n    $ state:  String\n    $ postalCode:  String\n    $ countryCode:  CountryCodes!\n    $ normalize: Boolean = false\n    $ addressLine1: String\n    $ addressLine2: String\n    $ addressLine3: String\n    $ adminArea4: String\n    $ adminArea3: String\n    $ adminArea2: String\n    $ adminArea1: String\n) {\n    addShippingAddress(\n        token: $token,\n        givenName: $givenName,\n        familyName: $familyName,\n        line1: $line1,\n        line2: $line2,\n        city: $city,\n        state: $state,\n        postalCode: $postalCode,\n        countryCode: $countryCode,\n        normalize: $normalize,\n        addressLine1: $addressLine1,\n        addressLine2: $addressLine2,\n        addressLine3: $addressLine3,\n        adminArea4: $adminArea4,\n        adminArea3: $adminArea3,\n        adminArea2: $adminArea2,\n        adminArea1: $adminArea1,\n)", CheckoutQuery.INSTANCE.getCheckoutResponse(z), "\n            }");
    }
}
