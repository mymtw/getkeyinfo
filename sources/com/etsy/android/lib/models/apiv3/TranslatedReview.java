package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class TranslatedReview extends BaseModel {
    private String mTranslatedReview = "";

    public String getTranslatedReview() {
        return this.mTranslatedReview;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("review".equals(currentName)) {
                    this.mTranslatedReview = BaseModel.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
