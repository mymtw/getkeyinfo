package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ReceiptReview;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.List;

public class ShopReviewsResult extends BaseModel {
    public int mCount;
    public List<ReceiptReview> mReviews;

    public int getCount() {
        return this.mCount;
    }

    public List<ReceiptReview> getReviews() {
        return this.mReviews;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                if (currentName.equals(ResponseConstants.COUNT)) {
                    this.mCount = jsonParser.getValueAsInt();
                } else if (!currentName.equals(ResponseConstants.REVIEWS)) {
                    jsonParser.skipChildren();
                } else {
                    this.mReviews = BaseModel.parseArray(jsonParser, ReceiptReview.class);
                }
            }
        }
    }
}
