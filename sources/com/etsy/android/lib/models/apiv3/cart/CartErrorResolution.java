package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CartErrorResolution extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int TYPE_LINK_CTA = 4;
    public static final int TYPE_QUANTITY = 3;
    public static final int TYPE_SHIPPING = 2;
    public static final int TYPE_VARIATION = 1;
    public String prompt;
    private int quantity;
    private PaymentUpdateShippingCountry shippingCountries;
    private int type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getPrompt() {
        String str = this.prompt;
        if (str != null) {
            return str;
        }
        C19383o.m32805o(ResponseConstants.PROMPT);
        throw null;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final PaymentUpdateShippingCountry getShippingCountries() {
        return this.shippingCountries;
    }

    public final int getType() {
        return this.type;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", ResponseConstants.PROMPT, str)) {
            setPrompt(BaseModel.Companion.parseString(jsonParser));
        } else if (C19383o.m32792b("type", str)) {
            String parseString = BaseModel.Companion.parseString(jsonParser);
            if (C19383o.m32792b(ResponseConstants.VARIATIONS, parseString)) {
                this.type = 1;
            } else if (C19383o.m32792b("shipping", parseString)) {
                this.type = 2;
            } else if (C19383o.m32792b(ResponseConstants.QUANTITY, parseString)) {
                this.type = 3;
            } else if (C19383o.m32792b(ResponseConstants.LINK_CTA, parseString)) {
                this.type = 4;
            }
        } else if (C19383o.m32792b(ResponseConstants.QUANTITY, str)) {
            this.quantity = jsonParser.getIntValue();
        } else if (!C19383o.m32792b("shipping", str)) {
            return false;
        } else {
            this.shippingCountries = (PaymentUpdateShippingCountry) BaseModel.Companion.parseObject(jsonParser, PaymentUpdateShippingCountry.class);
        }
        return true;
    }

    public final void setPrompt(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.prompt = str;
    }

    public final void setQuantity(int i) {
        this.quantity = i;
    }

    public final void setShippingCountries(PaymentUpdateShippingCountry paymentUpdateShippingCountry) {
        this.shippingCountries = paymentUpdateShippingCountry;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
