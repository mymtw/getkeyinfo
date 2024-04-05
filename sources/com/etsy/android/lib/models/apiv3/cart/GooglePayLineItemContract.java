package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.datatypes.EtsyId;

public interface GooglePayLineItemContract {
    String getCurrencyCode();

    String getDescription();

    EtsyId getListingId();

    EtsyMoney getPrice();

    int getQuantity();

    int getRole();
}
