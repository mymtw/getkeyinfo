package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class Rating extends BaseModel {
    public int mCount;
    public double mRating;
    public int mSellerFeedbackCount;
    public double mStars;

    public double getRating() {
        return this.mRating;
    }

    public int getRatingCount() {
        return this.mCount;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.SELLER_FEEDBACK_COUNT.equals(currentName)) {
                    this.mSellerFeedbackCount = jsonParser.getValueAsInt();
                } else if (ResponseConstants.RATING.equals(currentName)) {
                    this.mRating = jsonParser.getValueAsDouble();
                } else if (ResponseConstants.COUNT.equals(currentName)) {
                    this.mCount = jsonParser.getValueAsInt();
                } else if (ResponseConstants.STARS.equals(currentName)) {
                    this.mStars = jsonParser.getValueAsDouble();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
