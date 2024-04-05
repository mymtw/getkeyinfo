package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.List;

public class ListingVideos extends BaseModel {
    private List<ListingVideo> mVideos;

    public List<ListingVideo> getVideos() {
        return this.mVideos;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("files".equals(currentName)) {
                    this.mVideos = BaseModel.parseArray(jsonParser, ListingVideo.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
