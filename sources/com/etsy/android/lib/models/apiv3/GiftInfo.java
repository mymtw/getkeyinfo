package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class GiftInfo extends BaseFieldModel {
    public String mDescription = "";
    public boolean mIsEligible;
    public boolean mOffersGiftMessage;
    public Image mPreviewImage;
    public Money mPrice;

    public String getDescription() {
        return this.mDescription;
    }

    public Image getPreviewImage() {
        return this.mPreviewImage;
    }

    public Money getPrice() {
        return this.mPrice;
    }

    public boolean isEligible() {
        return this.mIsEligible;
    }

    public boolean offersGiftMessage() {
        return this.mOffersGiftMessage;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1724546052:
                if (str.equals("description")) {
                    c = 0;
                    break;
                }
                break;
            case -634286772:
                if (str.equals(ResponseConstants.IS_ELIGIBLE)) {
                    c = 1;
                    break;
                }
                break;
            case 106934601:
                if (str.equals(ResponseConstants.PRICE)) {
                    c = 2;
                    break;
                }
                break;
            case 305702304:
                if (str.equals(ResponseConstants.OFFERS_GIFT_MESSAGE)) {
                    c = 3;
                    break;
                }
                break;
            case 696777252:
                if (str.equals(ResponseConstants.PREVIEW_IMAGE)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mDescription = BaseModel.parseString(jsonParser);
                return true;
            case 1:
                this.mIsEligible = jsonParser.getBooleanValue();
                return true;
            case 2:
                this.mPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
                return true;
            case 3:
                this.mOffersGiftMessage = jsonParser.getValueAsBoolean();
                return true;
            case 4:
                this.mPreviewImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
                return true;
            default:
                return false;
        }
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setIsEligible(boolean z) {
        this.mIsEligible = z;
    }

    public void setOffersGiftMessage(boolean z) {
        this.mOffersGiftMessage = z;
    }

    public void setPreviewImage(Image image) {
        this.mPreviewImage = image;
    }

    public void setPrice(Money money) {
        this.mPrice = money;
    }
}
