package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

@Deprecated
public abstract class BaseFieldModel extends BaseModel {
    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL || currentName == null || !parseField(jsonParser, currentName)) {
                jsonParser.skipChildren();
            }
        }
    }

    public abstract boolean parseField(JsonParser jsonParser, String str) throws IOException;
}
