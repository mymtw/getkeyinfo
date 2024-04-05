package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FreeShippingListingData extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = -768055640797438004L;
    private DetailedFreeShipping formattedMessage;
    private FormattedMoney message;
    private String sellerDescription = "";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final DetailedFreeShipping getFormattedMessage() {
        return this.formattedMessage;
    }

    public final FormattedMoney getMessage() {
        return this.message;
    }

    public final String getSellerDescription() {
        return this.sellerDescription;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != -2046370940) {
            if (c != -106763460) {
                if (c == 954925063 && str.equals("message")) {
                    this.message = (FormattedMoney) BaseModel.Companion.parseObject(jsonParser, FormattedMoney.class);
                    return true;
                }
            } else if (str.equals(ResponseConstants.SELLER_DESCRIPTION)) {
                this.sellerDescription = BaseModel.Companion.parseString(jsonParser);
                return true;
            }
        } else if (str.equals("formatted_message")) {
            this.formattedMessage = null;
            return true;
        }
        return false;
    }

    public final void setFormattedMessage(DetailedFreeShipping detailedFreeShipping) {
        this.formattedMessage = detailedFreeShipping;
    }

    public final void setMessage(FormattedMoney formattedMoney) {
        this.message = formattedMoney;
    }

    public final void setSellerDescription(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.sellerDescription = str;
    }
}
