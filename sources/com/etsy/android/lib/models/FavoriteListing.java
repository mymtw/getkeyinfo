package com.etsy.android.lib.models;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class FavoriteListing extends Listing {
    private static final long serialVersionUID = -3838008077209921973L;

    public FavoriteListing() {
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("listing_id".equals(currentName)) {
                    this.mListingId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if ("user_id".equals(currentName)) {
                    this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.LISTING_V2.equals(currentName)) {
                    super.parseData(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public FavoriteListing(EtsyId etsyId, String str) {
        super(etsyId, str);
    }
}
