package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShopHomeMemberData extends BaseModel {
    public int favoriteShopsCount = 0;
    public boolean mIsFavorer;
    public boolean mIsSubscribedToVacationNotification;
    public List<ListingMemberData> mListingsInfo = new ArrayList(0);

    public int getFavoriteShopsCount() {
        return this.favoriteShopsCount;
    }

    public List<ListingMemberData> getListingsInfo() {
        return this.mListingsInfo;
    }

    public boolean isFavorer() {
        return this.mIsFavorer;
    }

    public boolean isSubscribedToVacationNotification() {
        return this.mIsSubscribedToVacationNotification;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -494126087:
                        if (currentName.equals(ResponseConstants.IS_SUBSCRIBED_TO_VACATION_NOTIFICATION)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 425827670:
                        if (currentName.equals(ResponseConstants.IS_FAVORER)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1094969699:
                        if (currentName.equals(ResponseConstants.LISTINGS_MEMBER_INFO)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1976152945:
                        if (currentName.equals(ResponseConstants.FAVORITE_SHOPS_COUNT)) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mIsSubscribedToVacationNotification = jsonParser.getValueAsBoolean();
                        break;
                    case 1:
                        this.mIsFavorer = jsonParser.getValueAsBoolean();
                        break;
                    case 2:
                        this.mListingsInfo = BaseModel.parseArray(jsonParser, ListingMemberData.class);
                        break;
                    case 3:
                        this.favoriteShopsCount = jsonParser.getValueAsInt();
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setIsFavorer(boolean z) {
        this.mIsFavorer = z;
    }
}
