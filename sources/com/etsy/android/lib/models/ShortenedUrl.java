package com.etsy.android.lib.models;

import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class ShortenedUrl extends BaseModel {
    private static final long serialVersionUID = 7397399633460971137L;
    private String mLongUrl;
    private String mShortUrl;

    public ShortenedUrl() {
    }

    public String getLongUrl() {
        return this.mLongUrl;
    }

    public String getShortUrl() {
        return C8885d0.m17324h(this.mShortUrl) ? this.mShortUrl : this.mLongUrl;
    }

    public boolean isShortened() {
        String str = this.mShortUrl;
        return str != null && !str.equals(this.mLongUrl);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                if (currentName.equals(ResponseConstants.SHORT_URL)) {
                    this.mShortUrl = BaseModel.parseStringURL(jsonParser);
                } else if (!currentName.equals("url")) {
                    jsonParser.skipChildren();
                } else {
                    this.mLongUrl = BaseModel.parseStringURL(jsonParser);
                }
            }
        }
    }

    public ShortenedUrl(String str) {
        this.mLongUrl = str;
    }
}
