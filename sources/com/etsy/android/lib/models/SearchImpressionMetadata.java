package com.etsy.android.lib.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import kotlin.jvm.internal.C19383o;

public final class SearchImpressionMetadata extends BaseModel {
    public static final int $stable = 8;
    private String data;
    private String displayLocation;
    private String loggingKey;

    public final String getData() {
        return this.data;
    }

    public final String getDisplayLocation() {
        return this.displayLocation;
    }

    public final String getLoggingKey() {
        return this.loggingKey;
    }

    public void parseData(JsonParser jsonParser) {
        C19383o.m32797g(jsonParser, "jp");
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (!(jsonParser.getCurrentToken() == JsonToken.VALUE_NULL || currentName == null)) {
                int hashCode = currentName.hashCode();
                if (hashCode != -1552887425) {
                    if (hashCode != 3076010) {
                        if (hashCode == 1592947346 && currentName.equals(ResponseConstants.SearchImpression.DISPLAY_LOCATION)) {
                            this.displayLocation = BaseModel.Companion.parseString(jsonParser);
                        }
                    } else if (currentName.equals("data")) {
                        this.data = BaseModel.Companion.parseString(jsonParser);
                    }
                } else if (currentName.equals(ResponseConstants.SearchImpression.LOGGING_KEY)) {
                    this.loggingKey = BaseModel.Companion.parseString(jsonParser);
                }
            }
        }
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setDisplayLocation(String str) {
        this.displayLocation = str;
    }

    public final void setLoggingKey(String str) {
        this.loggingKey = str;
    }
}
