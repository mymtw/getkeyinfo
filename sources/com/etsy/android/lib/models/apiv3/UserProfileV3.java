package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import org.apache.commons.lang3.CharUtils;

public class UserProfileV3 extends BaseModel {
    public boolean mAreFavoriteListingsPublic;
    public boolean mAreFavoriteShopsPublic;
    public String mAvatarUrl = "";
    public String mBio = "";
    public String mDisplayName = "";
    public int mFavoriteListingsCount;
    public int mFavoriteShopsCount;
    public String mFirstName = "";
    public int mFollowerCount;
    public int mFollowingCount;
    public boolean mIsAdmin;
    public boolean mIsFollowing;
    public boolean mIsSeller;
    public String mLocation = "";
    public String mLoginName = "";
    public int mTransactionsSoldCount;
    public EtsyId mUserId = new EtsyId();

    public boolean areFavoriteShopsPublic() {
        return this.mAreFavoriteShopsPublic;
    }

    public String getAvatarUrl() {
        return this.mAvatarUrl;
    }

    public String getBio() {
        return this.mBio;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public int getFavoriteListingsCount() {
        return this.mFavoriteListingsCount;
    }

    public int getFavoriteShopsCount() {
        return this.mFavoriteShopsCount;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public int getFollowerCount() {
        return this.mFollowerCount;
    }

    public int getFollowingCount() {
        return this.mFollowingCount;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public String getLoginName() {
        return this.mLoginName;
    }

    public int getTransactionsSoldCount() {
        return this.mTransactionsSoldCount;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public boolean isAdmin() {
        return this.mIsAdmin;
    }

    public boolean isFollowing() {
        return this.mIsFollowing;
    }

    public boolean isSeller() {
        return this.mIsSeller;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2107390546:
                        if (currentName.equals(ResponseConstants.FOLLOWER_COUNT)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1767320287:
                        if (currentName.equals(ResponseConstants.ARE_FAVORITE_LISTINGS_PUBLIC)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1747812959:
                        if (currentName.equals("login_name")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1055898661:
                        if (currentName.equals(ResponseConstants.FAVORITE_LISTINGS_COUNT)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -545190468:
                        if (currentName.equals(ResponseConstants.IS_FOLLOWING)) {
                            c = 4;
                            break;
                        }
                        break;
                    case -451477821:
                        if (currentName.equals(ResponseConstants.ARE_FAVORITE_SHOPS_PUBLIC)) {
                            c = 5;
                            break;
                        }
                        break;
                    case -441975756:
                        if (currentName.equals(ResponseConstants.IS_SELLER)) {
                            c = 6;
                            break;
                        }
                        break;
                    case -402824823:
                        if (currentName.equals("avatar_url")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -160985414:
                        if (currentName.equals(ResponseConstants.FIRST_NAME)) {
                            c = 8;
                            break;
                        }
                        break;
                    case -147132913:
                        if (currentName.equals("user_id")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 97544:
                        if (currentName.equals(ResponseConstants.BIO)) {
                            c = 10;
                            break;
                        }
                        break;
                    case 107637754:
                        if (currentName.equals(ResponseConstants.IS_ADMIN)) {
                            c = 11;
                            break;
                        }
                        break;
                    case 458536417:
                        if (currentName.equals(ResponseConstants.FOLLOWING_COUNT)) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1313826277:
                        if (currentName.equals(ResponseConstants.TRANSACTION_SOLD_COUNT)) {
                            c = CharUtils.f44393CR;
                            break;
                        }
                        break;
                    case 1615086568:
                        if (currentName.equals(ResponseConstants.DISPLAY_NAME)) {
                            c = 14;
                            break;
                        }
                        break;
                    case 1901043637:
                        if (currentName.equals("location")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 1976152945:
                        if (currentName.equals(ResponseConstants.FAVORITE_SHOPS_COUNT)) {
                            c = 16;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mFollowerCount = jsonParser.getValueAsInt();
                        break;
                    case 1:
                        this.mAreFavoriteListingsPublic = jsonParser.getValueAsBoolean();
                        break;
                    case 2:
                        this.mLoginName = BaseModel.parseString(jsonParser);
                        break;
                    case 3:
                        this.mFavoriteListingsCount = jsonParser.getValueAsInt();
                        break;
                    case 4:
                        this.mIsFollowing = jsonParser.getValueAsBoolean();
                        break;
                    case 5:
                        this.mAreFavoriteShopsPublic = jsonParser.getValueAsBoolean();
                        break;
                    case 6:
                        this.mIsSeller = jsonParser.getValueAsBoolean();
                        break;
                    case 7:
                        this.mAvatarUrl = BaseModel.parseStringURL(jsonParser);
                        break;
                    case 8:
                        this.mFirstName = BaseModel.parseString(jsonParser);
                        break;
                    case 9:
                        this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 10:
                        this.mBio = BaseModel.parseString(jsonParser);
                        break;
                    case 11:
                        this.mIsAdmin = jsonParser.getValueAsBoolean();
                        break;
                    case 12:
                        this.mFollowingCount = jsonParser.getValueAsInt();
                        break;
                    case 13:
                        this.mTransactionsSoldCount = jsonParser.getValueAsInt();
                        break;
                    case 14:
                        this.mDisplayName = BaseModel.parseString(jsonParser);
                        break;
                    case 15:
                        this.mLocation = BaseModel.parseString(jsonParser);
                        break;
                    case 16:
                        this.mFavoriteShopsCount = jsonParser.getValueAsInt();
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setIsFollowing(boolean z) {
        this.mIsFollowing = z;
    }

    public void setLoginName(String str) {
        this.mLoginName = str;
    }

    public void setUserId(EtsyId etsyId) {
        this.mUserId = etsyId;
    }
}
