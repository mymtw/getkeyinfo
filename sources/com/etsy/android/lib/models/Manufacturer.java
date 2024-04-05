package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.C8694h;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class Manufacturer extends BaseModel {
    public String mDescription = "";
    public String mLocation = "";
    public String mName = "";

    public String getDescription() {
        return this.mDescription;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public String getName() {
        return this.mName;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("name".equals(currentName)) {
                    this.mName = BaseModel.parseString(jsonParser);
                } else if ("description".equals(currentName)) {
                    this.mDescription = BaseModel.parseString(jsonParser);
                } else if ("location".equals(currentName)) {
                    this.mLocation = BaseModel.parseString(jsonParser);
                } else {
                    C8694h.f19097a.mo21306a(String.format("Field %s not found on Manufacturer Model", new Object[]{currentName}));
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setLocation(String str) {
        this.mLocation = str;
    }

    public void setName(String str) {
        this.mName = str;
    }
}
