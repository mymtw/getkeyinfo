package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class BannerButton extends BaseFieldModel {
    private static final long serialVersionUID = -4199074753041174004L;
    public Boolean mDismissBannerOnTap = Boolean.FALSE;
    public String mText = "";
    public String mUrl = "";

    public Boolean getDismissBannerOnTap() {
        return this.mDismissBannerOnTap;
    }

    public String getText() {
        return this.mText;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("text".equals(str)) {
            this.mText = BaseModel.parseString(jsonParser);
            return true;
        } else if ("url".equals(str)) {
            this.mUrl = BaseModel.parseStringURL(jsonParser);
            return true;
        } else if (!ResponseConstants.DISMISS_BANNER_ON_TAP.equals(str)) {
            return false;
        } else {
            this.mDismissBannerOnTap = Boolean.valueOf(jsonParser.getBooleanValue());
            return true;
        }
    }
}
