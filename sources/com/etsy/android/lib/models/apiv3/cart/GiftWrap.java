package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.Money;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class GiftWrap extends BaseFieldModel {
    private String mDescription = "";
    private boolean mIsSelected;
    private Image mPreviewImage;
    private Money mPrice;
    private String mShopName = "";

    public String getDescription() {
        return this.mDescription;
    }

    public Image getPreviewImage() {
        return this.mPreviewImage;
    }

    public Money getPrice() {
        return this.mPrice;
    }

    public String getShopName() {
        return this.mShopName;
    }

    public boolean isSelected() {
        return this.mIsSelected;
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
            case -1724546052:
                if (str.equals("description")) {
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
            case 456541712:
                if (str.equals(ResponseConstants.IS_SELECTED)) {
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
                this.mShopName = BaseModel.parseString(jsonParser);
                return true;
            case 1:
                this.mDescription = BaseModel.parseString(jsonParser);
                return true;
            case 2:
                this.mPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
                return true;
            case 3:
                this.mIsSelected = jsonParser.getValueAsBoolean();
                return true;
            case 4:
                this.mPreviewImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
                return true;
            default:
                return false;
        }
    }
}
