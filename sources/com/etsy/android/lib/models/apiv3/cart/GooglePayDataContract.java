package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.currency.EtsyMoney;
import java.io.Serializable;

public interface GooglePayDataContract extends Serializable {
    long getCartId();

    String getMessageToSeller();

    String getShopName();

    EtsyMoney getTotal();

    boolean isGiftCardApplied();
}
