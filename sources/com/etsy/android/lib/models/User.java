package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.android.gms.common.Scopes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class User extends BaseModel {
    public static final long serialVersionUID = 8791766047665382345L;
    public String displayName;
    public Image mAvatar;
    public String mAvatarUrl;
    public int mAwaitingFeedbackCount;
    public String mEmail;
    public List<FavoriteListing> mFavoriteListings;
    public int mFollowerCount;
    public int mFollowingCount;
    public String mLoginName;
    public UserProfile mProfile;
    public List<Shop> mShops;
    public List<UserAddress> mUserAddresses;
    public EtsyId mUserId;
    public String realOrLoginName;

    public static class PublicKey extends BaseModel {
        public String mKeyId;
        public String mKeyString;

        public String getKeyId() {
            return this.mKeyId;
        }

        public String getKeyString() {
            return this.mKeyString;
        }

        public void parseData(JsonParser jsonParser) throws IOException {
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                String currentName = jsonParser.getCurrentName();
                jsonParser.nextToken();
                if ("key".equals(currentName)) {
                    this.mKeyString = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.KEY_ID.equals(currentName)) {
                    this.mKeyId = BaseModel.parseStringIdOrNumericValue(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public User() {
        this.mLoginName = "";
        this.mEmail = "";
        this.realOrLoginName = "";
        this.mAvatarUrl = "";
        this.displayName = "";
        this.mUserId = new EtsyId();
        this.mShops = new ArrayList(0);
        this.mFavoriteListings = new ArrayList(0);
        this.mUserAddresses = new ArrayList(0);
    }

    public Image getAvatar() {
        return this.mAvatar;
    }

    public String getAvatarUrl() {
        return this.mAvatarUrl;
    }

    public int getAwaitingFeedbackCount() {
        return this.mAwaitingFeedbackCount;
    }

    public int getBirthDay() {
        UserProfile userProfile = this.mProfile;
        if (userProfile != null) {
            return userProfile.getBirthDay();
        }
        return 0;
    }

    public int getBirthMonth() {
        UserProfile userProfile = this.mProfile;
        if (userProfile != null) {
            return userProfile.getBirthMonth();
        }
        return 0;
    }

    public String getCity() {
        UserProfile userProfile = this.mProfile;
        if (userProfile != null) {
            return userProfile.getCity();
        }
        return null;
    }

    public Country getCountry() {
        UserProfile userProfile = this.mProfile;
        if (userProfile != null) {
            return userProfile.getCountry();
        }
        return null;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getEmail() {
        return this.mEmail;
    }

    public List<FavoriteListing> getFavoriteListings() {
        return this.mFavoriteListings;
    }

    public List<Listing> getFavoritesAsListings() {
        return new ArrayList(this.mFavoriteListings);
    }

    public String getFirstName() {
        return getProfile() != null ? getProfile().getFirstName() : "";
    }

    public int getFollowerCount() {
        return this.mFollowerCount;
    }

    public int getFollowingCount() {
        return this.mFollowingCount;
    }

    public Date getJoinDate() {
        UserProfile userProfile = this.mProfile;
        if (userProfile != null) {
            return userProfile.getJoinDate();
        }
        return null;
    }

    public String getLastName() {
        return getProfile() != null ? getProfile().getLastName() : "";
    }

    public String getLoginName() {
        return this.mLoginName;
    }

    public Shop getMainShop() {
        if (this.mShops.size() > 0) {
            return this.mShops.get(0);
        }
        return null;
    }

    public UserProfile getProfile() {
        return this.mProfile;
    }

    public String getRealOrLoginName() {
        return this.realOrLoginName;
    }

    public String getRegion() {
        UserProfile userProfile = this.mProfile;
        if (userProfile != null) {
            return userProfile.getRegion();
        }
        return null;
    }

    public List<Shop> getShops() {
        return this.mShops;
    }

    public List<UserAddress> getUserAddresses() {
        return this.mUserAddresses;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("user_id".equals(currentName)) {
                    this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if ("login_name".equals(currentName)) {
                    this.mLoginName = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.PRIMARY_EMAIL.equals(currentName)) {
                    this.mEmail = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.FOLLOWER_COUNT.equals(currentName)) {
                    this.mFollowerCount = jsonParser.getValueAsInt();
                } else if (ResponseConstants.FOLLOWING_COUNT.equals(currentName)) {
                    this.mFollowingCount = jsonParser.getValueAsInt();
                } else if (ResponseConstants.AWAITING_FEEDBACK_COUNT.equals(currentName)) {
                    this.mAwaitingFeedbackCount = jsonParser.getValueAsInt();
                } else if (currentName.equals(Scopes.PROFILE) || ResponseConstants.Includes.PROFILE.equals(currentName)) {
                    this.mProfile = (UserProfile) BaseModel.parseObject(jsonParser, UserProfile.class);
                } else if (ResponseConstants.Includes.FAVORITE_LISTINGS.equals(currentName)) {
                    this.mFavoriteListings = BaseModel.parseArray(jsonParser, FavoriteListing.class);
                } else if (currentName.equals("shops") || ResponseConstants.Includes.SHOPS.equals(currentName)) {
                    this.mShops = BaseModel.parseArray(jsonParser, Shop.class);
                } else if (ResponseConstants.Includes.ADDRESSES.equals(currentName)) {
                    this.mUserAddresses = BaseModel.parseArray(jsonParser, UserAddress.class);
                } else if (ResponseConstants.AVATAR.equals(currentName)) {
                    this.mAvatar = (Image) BaseModel.parseObject(jsonParser, Image.class);
                } else if (ResponseConstants.REAL_NAME.equals(currentName)) {
                    this.realOrLoginName = jsonParser.getValueAsString();
                } else if ("avatar_url".equals(currentName)) {
                    this.mAvatarUrl = jsonParser.getValueAsString();
                } else if (ResponseConstants.DISPLAY_NAME.equals(currentName)) {
                    this.displayName = jsonParser.getValueAsString();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setAvatar(Image image) {
        this.mAvatar = image;
    }

    public void setAvatarUrl(String str) {
        this.mAvatarUrl = str;
    }

    public void setEmail(String str) {
        this.mEmail = str;
    }

    public void setFollowerCount(int i) {
        this.mFollowerCount = i;
    }

    public void setFollowingCount(int i) {
        this.mFollowingCount = i;
    }

    public void setLoginName(String str) {
        this.mLoginName = str;
    }

    public void setProfile(UserProfile userProfile) {
        this.mProfile = userProfile;
    }

    public void setShops(List<Shop> list) {
        this.mShops = list;
    }

    public void setUserId(EtsyId etsyId) {
        this.mUserId = etsyId;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.TARGET_USER_ID, Long.valueOf(this.mUserId.getIdAsLong()));
        return hashMap;
    }

    public User(EtsyId etsyId, String str, String str2, int i, int i2, int i3, List<Shop> list, UserProfile userProfile, List<FavoriteListing> list2, List<UserAddress> list3) {
        this.realOrLoginName = "";
        this.mAvatarUrl = "";
        this.displayName = "";
        this.mUserId = etsyId;
        this.mLoginName = str;
        this.mEmail = str2;
        this.mFollowerCount = i;
        this.mFollowingCount = i2;
        this.mAwaitingFeedbackCount = i3;
        this.mShops = list;
        this.mProfile = userProfile;
        this.mFavoriteListings = list2;
        this.mUserAddresses = list3;
    }
}
