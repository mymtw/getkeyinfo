package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Money;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.HashMap;

@Deprecated
public class GooglePayApiModel extends BaseFieldModel {
    private static final String IS_GIFT_CARD_APPLIED = "is_gift_card_applied";
    private static final String MESSAGE_TO_SELLER = "message_to_seller";
    private static final long serialVersionUID = 3945873498578745874L;
    public long cartId;
    public boolean isGiftCardApplied;
    public String messageToSeller = "";
    public String shopName = "";
    public Money total;

    public GooglePayData getGooglePayData() {
        return new GooglePayData(this.cartId, this.total.asEtsyMoney(), this.shopName, this.isGiftCardApplied, this.messageToSeller);
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2103918028:
                if (str.equals(ResponseConstants.SHOP_NAME)) {
                    c = 0;
                    break;
                }
                break;
            case -1379865717:
                if (str.equals("message_to_seller")) {
                    c = 1;
                    break;
                }
                break;
            case 110549828:
                if (str.equals(ResponseConstants.TOTAL)) {
                    c = 2;
                    break;
                }
                break;
            case 554410650:
                if (str.equals(ResponseConstants.CART_ID)) {
                    c = 3;
                    break;
                }
                break;
            case 1842835752:
                if (str.equals(IS_GIFT_CARD_APPLIED)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.shopName = BaseModel.parseString(jsonParser);
                break;
            case 1:
                this.messageToSeller = BaseModel.parseString(jsonParser);
                break;
            case 2:
                this.total = (Money) BaseModel.parseObject(jsonParser, Money.class);
                break;
            case 3:
                this.cartId = jsonParser.getValueAsLong();
                break;
            case 4:
                this.isGiftCardApplied = jsonParser.getValueAsBoolean();
                break;
            default:
                return false;
        }
        return true;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.CART_ID, Long.valueOf(this.cartId));
        return hashMap;
    }
}
