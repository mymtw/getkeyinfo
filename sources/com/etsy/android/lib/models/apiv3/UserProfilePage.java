package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserProfilePage extends BaseModel {
    public List<Collection> mCollections = new ArrayList(0);
    public List<ShopCard> mFavoriteShops = new ArrayList(0);
    public ShopCard mShopCard;
    public UserProfileV3 mUserProfile;

    public List<Collection> getCollections() {
        return this.mCollections;
    }

    public List<ShopCard> getFavoriteShops() {
        return this.mFavoriteShops;
    }

    public ShopCard getShopCard() {
        return this.mShopCard;
    }

    public UserProfileV3 getUserProfile() {
        return this.mUserProfile;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2104245575:
                        if (currentName.equals(ResponseConstants.SHOP_CARD)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1420489766:
                        if (currentName.equals(ResponseConstants.FAVORITE_SHOPS)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1216225589:
                        if (currentName.equals(ResponseConstants.USER_PROFILE)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1853891989:
                        if (currentName.equals("collections")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mShopCard = (ShopCard) BaseModel.parseObject(jsonParser, ShopCard.class);
                        break;
                    case 1:
                        this.mFavoriteShops = BaseModel.parseArray(jsonParser, ShopCard.class);
                        break;
                    case 2:
                        this.mUserProfile = (UserProfileV3) BaseModel.parseObject(jsonParser, UserProfileV3.class);
                        break;
                    case 3:
                        this.mCollections = BaseModel.parseArray(jsonParser, Collection.class);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }
}
