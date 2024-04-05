package com.etsy.android.lib.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.UserAvatar;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Date;

public class UserProfile extends BaseModel {
    private static final long serialVersionUID = -8560910552168722074L;
    private String location;
    private String mBio = "";
    private int mBirthDay;
    private int mBirthMonth;
    private String mCity = "";
    private Country mCountry;
    private String mFirstName = "";
    private String mGender = "";
    private boolean mIsSeller;
    private boolean mIsTestAccount;
    private Date mJoinDate;
    private String mLastName = "";
    private String mLoginName = "";
    private int mNumFavorites;
    private String mRegion;
    private UserAvatar mUserAvatar;

    public UserProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7, Country country, int i) {
        if (str != null) {
            this.mUserAvatar = new UserAvatar(str);
        }
        this.mCity = str2;
        this.mRegion = str3;
        this.mBio = str4;
        this.mFirstName = str5;
        this.mLastName = str6;
        this.mLoginName = str7;
        this.mCountry = country;
        this.mNumFavorites = i;
    }

    public String getAvailableGender() {
        return this.mGender;
    }

    public String getAvatarUrl(int i) {
        UserAvatar userAvatar = this.mUserAvatar;
        if (userAvatar != null) {
            return userAvatar.getImageUrlForPixelWidth(i);
        }
        return null;
    }

    public String getBio() {
        return this.mBio;
    }

    public int getBirthDay() {
        return this.mBirthDay;
    }

    public int getBirthMonth() {
        return this.mBirthMonth;
    }

    public String getCity() {
        return this.mCity;
    }

    public Country getCountry() {
        return this.mCountry;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public String getImageUrl75x75() {
        UserAvatar userAvatar = this.mUserAvatar;
        if (userAvatar != null) {
            return userAvatar.getImageUrl();
        }
        return null;
    }

    public Date getJoinDate() {
        return this.mJoinDate;
    }

    public String getLastName() {
        return this.mLastName;
    }

    public String getLocation() {
        return this.location;
    }

    public String getLoginName() {
        return this.mLoginName;
    }

    public int getNumFavorites() {
        return this.mNumFavorites;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public boolean isSeller() {
        return this.mIsSeller;
    }

    public boolean isTestAccount() {
        return this.mIsTestAccount;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.FIRST_NAME.equals(currentName)) {
                    this.mFirstName = BaseModel.parseString(jsonParser);
                } else if ("last_name".equals(currentName)) {
                    this.mLastName = BaseModel.parseString(jsonParser);
                } else if ("login_name".equals(currentName)) {
                    this.mLoginName = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.BIO.equals(currentName)) {
                    this.mBio = BaseModel.parseString(jsonParser);
                } else if ("city".equals(currentName)) {
                    this.mCity = BaseModel.parseString(jsonParser);
                } else if ("region".equals(currentName)) {
                    this.mRegion = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.IS_SELLER.equals(currentName)) {
                    this.mIsSeller = jsonParser.getValueAsBoolean();
                } else if ("num_favorites".equals(currentName)) {
                    this.mNumFavorites = jsonParser.getValueAsInt();
                } else if ("image_url_75x75".equals(currentName)) {
                    this.mUserAvatar = new UserAvatar(BaseModel.parseStringURL(jsonParser));
                } else if ("gender".equals(currentName)) {
                    this.mGender = BaseModel.parseString(jsonParser);
                } else if (currentName.equals("country") || ResponseConstants.Includes.COUNTRY.equals(currentName)) {
                    this.mCountry = (Country) BaseModel.parseObject(jsonParser, Country.class);
                } else if ("join_tsz".equals(currentName)) {
                    this.mJoinDate = BaseModel.parseIntoDate(jsonParser);
                } else if ("is_test_account".equals(currentName)) {
                    this.mIsTestAccount = jsonParser.getValueAsBoolean();
                } else if ("birth_month".equals(currentName)) {
                    this.mBirthMonth = jsonParser.getValueAsInt();
                } else if ("birth_day".equals(currentName)) {
                    this.mBirthDay = jsonParser.getValueAsInt();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setBio(String str) {
        this.mBio = str;
    }

    public void setFirstName(String str) {
        this.mFirstName = str;
    }

    public void setJoinDate(Date date) {
        this.mJoinDate = date;
    }

    public void setLastName(String str) {
        this.mLastName = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLoginName(String str) {
        this.mLoginName = str;
    }

    public void setNumFavorites(int i) {
        this.mNumFavorites = i;
    }

    public void setSeller(boolean z) {
        this.mIsSeller = z;
    }

    public void setUserAvatar(UserAvatar userAvatar) {
        this.mUserAvatar = userAvatar;
    }

    public UserProfile() {
    }
}
