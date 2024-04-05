package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class TranslatedPrivacyPolicy extends BaseModel {
    private String mTranslatedOtherPolicy = "";

    public String getTranslatedOtherPolicy() {
        return this.mTranslatedOtherPolicy;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.PRIVACY_OTHER_TEXT.equals(currentName)) {
                    this.mTranslatedOtherPolicy = BaseModel.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
