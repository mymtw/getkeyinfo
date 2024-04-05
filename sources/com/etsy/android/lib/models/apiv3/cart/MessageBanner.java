package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.BaseMessage;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class MessageBanner extends BaseMessage {
    private static final long serialVersionUID = 3923789670607735942L;
    public String mButtonText = "";
    public String mImageUrl = "";
    public String mTitle = "";

    public String getButtonText() {
        return this.mButtonText;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.BUTTON_TEXT.equals(str)) {
            this.mButtonText = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.IMAGE_URL.equals(str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.mImageUrl = BaseModel.parseStringURL(jsonParser);
            return true;
        }
    }
}
