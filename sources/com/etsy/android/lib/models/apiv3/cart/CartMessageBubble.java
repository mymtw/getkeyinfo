package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class CartMessageBubble extends MessageBubble {
    public CartErrorResolution cartErrorResolution;
    public boolean indent = true;

    public CartErrorResolution getCartErrorResolution() {
        return this.cartErrorResolution;
    }

    public boolean hasErrorDropdown() {
        CartErrorResolution cartErrorResolution2 = this.cartErrorResolution;
        return (cartErrorResolution2 == null || cartErrorResolution2.getType() == 4) ? false : true;
    }

    public boolean hasLinkCta() {
        CartErrorResolution cartErrorResolution2 = this.cartErrorResolution;
        return cartErrorResolution2 != null && cartErrorResolution2.getType() == 4;
    }

    public boolean isIndented() {
        return this.indent;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.ERROR_RESOLUTION.equals(str)) {
            this.cartErrorResolution = (CartErrorResolution) BaseModel.parseObject(jsonParser, CartErrorResolution.class);
            return true;
        } else if (!ResponseConstants.INDENT.equals(str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.indent = jsonParser.getBooleanValue();
            return true;
        }
    }
}
