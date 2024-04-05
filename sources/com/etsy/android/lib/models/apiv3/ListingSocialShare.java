package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.VespaListingShare;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ListingSocialShare extends BaseFieldModel implements VespaListingShare {
    private static final String BTN_TEXT = "btn_text";
    private static final String SHARE_TEXT = "share_text";
    public String mBtnText = "";
    public ListingImage mImage;
    public EtsyId mListingId = new EtsyId();
    public String mShareText;
    public String mTitle = "";
    public String mUrl = "";

    public String getBtnText() {
        return this.mBtnText;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public ListingImage getListingImage() {
        return this.mImage;
    }

    public EtsyMoney getPrice() {
        return C8630b.f18964e.mo21250c();
    }

    public String getShareText() {
        return this.mShareText;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean isAd() {
        return false;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1787969139:
                if (str.equals("share_text")) {
                    c = 0;
                    break;
                }
                break;
            case 104387:
                if (str.equals(ResponseConstants.IMG)) {
                    c = 1;
                    break;
                }
                break;
            case 116079:
                if (str.equals("url")) {
                    c = 2;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c = 3;
                    break;
                }
                break;
            case 988969142:
                if (str.equals("listing_id")) {
                    c = 4;
                    break;
                }
                break;
            case 2108430640:
                if (str.equals("btn_text")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mShareText = BaseModel.parseString(jsonParser);
                break;
            case 1:
                this.mImage = (ListingImage) BaseModel.parseObject(jsonParser, ListingImage.class);
                break;
            case 2:
                this.mUrl = BaseModel.parseString(jsonParser);
                break;
            case 3:
                this.mTitle = BaseModel.parseString(jsonParser);
                break;
            case 4:
                this.mListingId.setId(BaseModel.parseString(jsonParser));
                break;
            case 5:
                this.mBtnText = BaseModel.parseString(jsonParser);
                break;
            default:
                return false;
        }
        return true;
    }
}
