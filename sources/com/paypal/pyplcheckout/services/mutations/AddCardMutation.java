package com.paypal.pyplcheckout.services.mutations;

import com.paypal.pyplcheckout.services.queries.CheckoutQuery;
import p010a9.C0048b;

public final class AddCardMutation {
    public static final AddCardMutation INSTANCE = new AddCardMutation();

    private AddCardMutation() {
    }

    public final String get(boolean z) {
        return C0048b.m163a("mutation ADD_CARD(\n    $token: String!\n    $cardType: FundingOptionType\n    $card: AddCardInput!\n    $user: AddCardUserInput!\n    $address: AddCardBillingAddressInput\n    $paypalRequestId: String\n    $isPartialBillingAddress: Boolean\n) {\n    addCard(\n        token: $token\n        cardType: $cardType\n        card: $card\n        user: $user\n        address: $address\n        paypalRequestId: $paypalRequestId\n        isPartialBillingAddress:  $isPartialBillingAddress\n    )", CheckoutQuery.INSTANCE.getCheckoutResponse(z), "}");
    }
}
