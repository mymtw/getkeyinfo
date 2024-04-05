package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.VespaShopShare;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ShopSocialShare extends BaseFieldModel implements VespaShopShare {
    public static final String BTN_TEXT = "btn_text";
    public static final String SHARE_TEXT = "share_text";
    public String mBtnText = "";
    public String mHeadline = "";
    public String mShareText = "";
    public String mShopIconUrl = "";
    public EtsyId mShopId = new EtsyId();
    public String mShopName = "";
    public String mUrl = "";

    public String getBtnText() {
        return this.mBtnText;
    }

    public String getShareText() {
        return this.mShareText;
    }

    public String getShareUrl() {
        return this.mUrl;
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
            case -1787969139:
                if (str.equals(SHARE_TEXT)) {
                    c = 1;
                    break;
                }
                break;
            case -1115058732:
                if (str.equals(ResponseConstants.HEADLINE)) {
                    c = 2;
                    break;
                }
                break;
            case 116079:
                if (str.equals("url")) {
                    c = 3;
                    break;
                }
                break;
            case 3226745:
                if (str.equals(ResponseConstants.ICON)) {
                    c = 4;
                    break;
                }
                break;
            case 2067081988:
                if (str.equals("shop_id")) {
                    c = 5;
                    break;
                }
                break;
            case 2108430640:
                if (str.equals(BTN_TEXT)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mShopName = BaseModel.parseString(jsonParser);
                break;
            case 1:
                this.mShareText = BaseModel.parseString(jsonParser);
                break;
            case 2:
                this.mHeadline = BaseModel.parseString(jsonParser);
                break;
            case 3:
                this.mUrl = BaseModel.parseStringURL(jsonParser);
                break;
            case 4:
                this.mShopIconUrl = BaseModel.parseStringURL(jsonParser);
                break;
            case 5:
                this.mShopId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 6:
                this.mBtnText = BaseModel.parseString(jsonParser);
                break;
            default:
                return false;
        }
        return true;
    }
}
