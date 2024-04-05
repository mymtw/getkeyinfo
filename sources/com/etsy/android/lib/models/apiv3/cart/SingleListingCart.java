package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import org.apache.commons.lang3.CharUtils;

public class SingleListingCart extends BaseFieldModel {
    private static final String GOOGLE_PAY_DATA = "google_pay_data";
    private static final long serialVersionUID = 4687384470536769179L;
    public EtsyId cartId;
    public GooglePayData googlePayData;
    public boolean hasFreeShipping;
    public boolean hasVAT;
    public boolean isDirectCheckout;
    public boolean isDownloadOnly;
    public Money itemTotal;
    public String shippingDestination;
    public Money shippingTotal;
    public String shopName;
    public boolean shouldShowCurrencyConversionNotice;
    public Money taxTotal;
    public Money total;
    public String transparentPriceMsg;

    public EtsyId getCartId() {
        return this.cartId;
    }

    public GooglePayData getGooglePayData() {
        return this.googlePayData;
    }

    public Money getItemTotal() {
        return this.itemTotal;
    }

    public String getShippingDestination() {
        return this.shippingDestination;
    }

    public Money getShippingTotal() {
        return this.shippingTotal;
    }

    public String getShopName() {
        return this.shopName;
    }

    public Money getTaxTotal() {
        return this.taxTotal;
    }

    public Money getTotal() {
        return this.total;
    }

    public String getTransparentPriceMsg() {
        return this.transparentPriceMsg;
    }

    public boolean hasFreeShipping() {
        return this.hasFreeShipping;
    }

    public boolean hasVAT() {
        return this.hasVAT;
    }

    public boolean isDirectCheckout() {
        return this.isDirectCheckout;
    }

    public boolean isDownloadOnly() {
        return this.isDownloadOnly;
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
            case -1951211752:
                if (str.equals(ResponseConstants.ITEM_TOTAL)) {
                    c = 1;
                    break;
                }
                break;
            case -1718064387:
                if (str.equals(ResponseConstants.SHIPPING_DESTINATION)) {
                    c = 2;
                    break;
                }
                break;
            case -1567193751:
                if (str.equals(ResponseConstants.SHOULD_SHOW_CURRENCY_CONVERSION_NOTICE)) {
                    c = 3;
                    break;
                }
                break;
            case -1248415058:
                if (str.equals(ResponseConstants.IS_DOWNLOAD_ONLY)) {
                    c = 4;
                    break;
                }
                break;
            case -723577634:
                if (str.equals(ResponseConstants.TRANSPARENT_PRICE_MSG)) {
                    c = 5;
                    break;
                }
                break;
            case -414564036:
                if (str.equals(ResponseConstants.HAS_FREE_SHIPPING)) {
                    c = 6;
                    break;
                }
                break;
            case -334454413:
                if (str.equals(ResponseConstants.SHIPPING_TOTAL)) {
                    c = 7;
                    break;
                }
                break;
            case -831056:
                if (str.equals(ResponseConstants.TAX_TOTAL)) {
                    c = 8;
                    break;
                }
                break;
            case 110549828:
                if (str.equals(ResponseConstants.TOTAL)) {
                    c = 9;
                    break;
                }
                break;
            case 554410650:
                if (str.equals(ResponseConstants.CART_ID)) {
                    c = 10;
                    break;
                }
                break;
            case 574219303:
                if (str.equals(GOOGLE_PAY_DATA)) {
                    c = 11;
                    break;
                }
                break;
            case 697281540:
                if (str.equals(ResponseConstants.HAS_VAT)) {
                    c = 12;
                    break;
                }
                break;
            case 890963911:
                if (str.equals(ResponseConstants.IS_DIRECT_CHECKOUT)) {
                    c = CharUtils.f44393CR;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.shopName = BaseModel.parseNonNullString(jsonParser);
                return true;
            case 1:
                this.itemTotal = (Money) BaseModel.parseObject(jsonParser, Money.class);
                return true;
            case 2:
                this.shippingDestination = BaseModel.parseNonNullString(jsonParser);
                return true;
            case 3:
                this.shouldShowCurrencyConversionNotice = jsonParser.getBooleanValue();
                return true;
            case 4:
                this.isDownloadOnly = jsonParser.getBooleanValue();
                return true;
            case 5:
                this.transparentPriceMsg = BaseModel.parseNonNullString(jsonParser);
                return true;
            case 6:
                this.hasFreeShipping = jsonParser.getBooleanValue();
                return true;
            case 7:
                this.shippingTotal = (Money) BaseModel.parseObject(jsonParser, Money.class);
                return true;
            case 8:
                this.taxTotal = (Money) BaseModel.parseObject(jsonParser, Money.class);
                return true;
            case 9:
                this.total = (Money) BaseModel.parseObject(jsonParser, Money.class);
                return true;
            case 10:
                this.cartId = new EtsyId(BaseModel.parseString(jsonParser));
                return true;
            case 11:
                this.googlePayData = ((GooglePayApiModel) BaseModel.parseObject(jsonParser, GooglePayApiModel.class)).getGooglePayData();
                return true;
            case 12:
                this.hasVAT = jsonParser.getBooleanValue();
                return true;
            case 13:
                this.isDirectCheckout = jsonParser.getBooleanValue();
                return true;
            default:
                return false;
        }
    }

    public boolean shouldShowCurrencyConversionNotice() {
        return this.shouldShowCurrencyConversionNotice;
    }
}
