package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;

public final class ShopHeader extends ShopCard {
    public static final int $stable = 8;
    private long cartGroupId;
    private boolean isPrivate;
    private boolean isTrustSignalsOn;

    public final long getCartGroupId() {
        return this.cartGroupId;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isTrustSignalsOn() {
        return this.isTrustSignalsOn;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", ResponseConstants.IS_PRIVATE, str)) {
            this.isPrivate = jsonParser.getBooleanValue();
            return true;
        } else if (C19383o.m32792b(ResponseConstants.TRUST_SIGNALS_ON, str)) {
            this.isTrustSignalsOn = jsonParser.getBooleanValue();
            return true;
        } else if (!C19383o.m32792b(ResponseConstants.CART_GROUP_ID, str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.cartGroupId = jsonParser.getLongValue();
            return true;
        }
    }
}
