package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class GiftOptions extends BaseFieldModel {
    public String mGiftMessage = "";
    public GiftWrap mGiftWrap;
    public boolean mIsGift;
    public boolean mOffersGiftMessage;
    public int mViewType = R.id.view_type_gift_options;

    public String getGiftMessage() {
        return this.mGiftMessage;
    }

    public GiftWrap getGiftWrap() {
        return this.mGiftWrap;
    }

    public int getViewType() {
        return this.mViewType;
    }

    public boolean isGift() {
        return this.mIsGift;
    }

    public boolean offersGiftMessage() {
        return this.mOffersGiftMessage;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 305702304:
                if (str.equals(ResponseConstants.OFFERS_GIFT_MESSAGE)) {
                    c = 0;
                    break;
                }
                break;
            case 570711545:
                if (str.equals("gift_wrap")) {
                    c = 1;
                    break;
                }
                break;
            case 1946607608:
                if (str.equals("gift_message")) {
                    c = 2;
                    break;
                }
                break;
            case 2081865509:
                if (str.equals("is_gift")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mOffersGiftMessage = jsonParser.getValueAsBoolean();
                return true;
            case 1:
                this.mGiftWrap = (GiftWrap) BaseModel.parseObject(jsonParser, GiftWrap.class);
                return true;
            case 2:
                this.mGiftMessage = BaseModel.parseString(jsonParser);
                return true;
            case 3:
                this.mIsGift = jsonParser.getValueAsBoolean();
                return true;
            default:
                return false;
        }
    }

    public void setGiftMessage(String str) {
        this.mGiftMessage = str;
    }
}
