package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class MessageToSeller extends BaseFieldModel {
    public String mHint;
    public String mMessage;

    public String getHint() {
        return this.mHint;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("message_to_seller".equals(str)) {
            this.mMessage = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.HINT.equals(str)) {
            return false;
        } else {
            this.mHint = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }
}
