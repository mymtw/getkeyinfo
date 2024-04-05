package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class Language extends BaseModel {
    public String mCode = "";
    public String mName = "";

    public String getCode() {
        return this.mCode;
    }

    public String getName() {
        return this.mName;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                if (currentName.equals(ResponseConstants.CODE)) {
                    this.mCode = BaseModel.parseString(jsonParser);
                } else if (!currentName.equals("name")) {
                    jsonParser.skipChildren();
                } else {
                    this.mName = BaseModel.parseString(jsonParser);
                }
            }
        }
    }
}
