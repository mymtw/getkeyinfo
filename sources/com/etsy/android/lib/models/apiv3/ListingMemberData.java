package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class ListingMemberData extends BaseModel {
    public boolean mHasCollections;
    public boolean mIsFavorite;
    public EtsyId mListingId;

    public ListingMemberData(EtsyId etsyId, boolean z, boolean z2) {
        new EtsyId();
        this.mIsFavorite = z;
        this.mHasCollections = z2;
        this.mListingId = etsyId;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public boolean hasCollections() {
        return this.mHasCollections;
    }

    public boolean isFavorite() {
        return this.mIsFavorite;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2072707216:
                        if (currentName.equals(ResponseConstants.HAS_COLLECTIONS)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 315759889:
                        if (currentName.equals("is_favorite")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 988969142:
                        if (currentName.equals("listing_id")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mHasCollections = jsonParser.getValueAsBoolean();
                        break;
                    case 1:
                        this.mIsFavorite = jsonParser.getValueAsBoolean();
                        break;
                    case 2:
                        this.mListingId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setHasCollections(boolean z) {
        this.mHasCollections = z;
    }

    public void setIsFavorite(boolean z) {
        this.mIsFavorite = z;
    }

    public ListingMemberData() {
        this.mListingId = new EtsyId();
    }
}
