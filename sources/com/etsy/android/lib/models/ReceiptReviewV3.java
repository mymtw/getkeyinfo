package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReceiptReviewV3 extends BaseModel {
    public int count = 0;
    public int filterCount = 0;
    public RatingsPercents ratingsPercents;
    public List<ReceiptReview> reviews = new ArrayList(0);

    public int getCount() {
        return this.count;
    }

    public int getFilterCount() {
        return this.filterCount;
    }

    public RatingsPercents getRatingsPercents() {
        return this.ratingsPercents;
    }

    public List<ReceiptReview> getReviews() {
        return this.reviews;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.COUNT.equals(currentName)) {
                    this.count = jsonParser.getIntValue();
                } else if ("filtered_count".equals(currentName)) {
                    this.filterCount = jsonParser.getIntValue();
                } else if ("star_percents".equals(currentName)) {
                    this.ratingsPercents = (RatingsPercents) BaseModel.parseObject(jsonParser, RatingsPercents.class);
                } else if (ResponseConstants.REVIEWS.equals(currentName)) {
                    this.reviews = BaseModel.parseArray(jsonParser, ReceiptReview.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
