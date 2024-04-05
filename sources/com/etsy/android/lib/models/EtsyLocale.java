package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class EtsyLocale extends BaseModel {
    public EtsyCurrency mCurrency;

    public EtsyCurrency getCurrency() {
        return this.mCurrency;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("currency".equals(currentName)) {
                    this.mCurrency = (EtsyCurrency) BaseModel.parseObject(jsonParser, EtsyCurrency.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
