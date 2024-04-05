package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

@Deprecated
public class EtsyError extends BaseModel {
    private static final long serialVersionUID = -4386411807738795965L;
    private String mName = "";

    public String getName() {
        return this.mName;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (!"name".equals(currentName)) {
                    jsonParser.skipChildren();
                } else if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
                            this.mName = BaseModel.parseString(jsonParser);
                        }
                    }
                } else {
                    this.mName = BaseModel.parseString(jsonParser);
                }
            }
        }
    }
}
