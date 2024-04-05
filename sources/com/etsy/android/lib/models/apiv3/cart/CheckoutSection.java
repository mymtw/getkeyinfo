package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;

public final class CheckoutSection extends BaseFieldModel {
    public static final int $stable = 8;
    private CheckoutButtonDescription buttonDescription;
    private String buttonText = "";
    private String buttonType = "";
    private String cartGroupId = "";
    private String disclaimer;
    private GooglePayData googlePayData;

    public final CheckoutButtonDescription getButtonDescription() {
        return this.buttonDescription;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getButtonType() {
        return this.buttonType;
    }

    public final String getCartGroupId() {
        return this.cartGroupId;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final GooglePayData getGooglePayData() {
        return this.googlePayData;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        switch (C0072d.m197c(jsonParser, "parser", str, "fieldName")) {
            case -1759410662:
                if (!str.equals(ResponseConstants.BUTTON_TEXT)) {
                    return false;
                }
                this.buttonText = BaseModel.Companion.parseString(jsonParser);
                return true;
            case -1759391705:
                if (!str.equals("button_type")) {
                    return false;
                }
                this.buttonType = BaseModel.Companion.parseString(jsonParser);
                return true;
            case -359084433:
                if (!str.equals("button_description")) {
                    return false;
                }
                this.buttonDescription = (CheckoutButtonDescription) BaseModel.Companion.parseObject(jsonParser, CheckoutButtonDescription.class);
                return true;
            case 432371099:
                if (!str.equals(ResponseConstants.DISCLAIMER)) {
                    return false;
                }
                this.disclaimer = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 574219303:
                if (!str.equals("google_pay_data")) {
                    return false;
                }
                GooglePayApiModel googlePayApiModel = (GooglePayApiModel) BaseModel.Companion.parseObject(jsonParser, GooglePayApiModel.class);
                this.googlePayData = googlePayApiModel != null ? googlePayApiModel.getGooglePayData() : null;
                return true;
            case 1236119834:
                if (!str.equals(ResponseConstants.CART_GROUP_ID)) {
                    return false;
                }
                this.cartGroupId = BaseModel.Companion.parseString(jsonParser);
                return true;
            default:
                return false;
        }
    }

    public final void setButtonDescription(CheckoutButtonDescription checkoutButtonDescription) {
        this.buttonDescription = checkoutButtonDescription;
    }

    public final void setButtonText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.buttonText = str;
    }

    public final void setButtonType(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.buttonType = str;
    }

    public final void setCartGroupId(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.cartGroupId = str;
    }

    public final void setDisclaimer(String str) {
        this.disclaimer = str;
    }

    public final void setGooglePayData(GooglePayData googlePayData2) {
        this.googlePayData = googlePayData2;
    }
}
