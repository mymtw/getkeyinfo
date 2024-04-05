package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShopListingsSearchResult extends BaseModel {
    public List<ListingCard> mListings = new ArrayList(0);
    public String mSortOrderId = "";

    public List<ListingCard> getListings() {
        return this.mListings;
    }

    public String getSortOrderId() {
        return this.mSortOrderId;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                if (currentName.equals(ResponseConstants.LISTING_CARDS)) {
                    this.mListings = BaseModel.parseArray(jsonParser, ListingCard.class);
                } else if (!currentName.equals(ResponseConstants.SORT_ORDER)) {
                    jsonParser.skipChildren();
                } else {
                    this.mSortOrderId = BaseModel.parseString(jsonParser);
                }
            }
        }
    }
}
