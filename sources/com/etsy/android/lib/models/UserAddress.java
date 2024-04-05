package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.HashMap;

public class UserAddress extends BaseModel {
    public static final long serialVersionUID = 6834864859786949576L;
    public String mCity;
    public Country mCountry;
    public EtsyId mCountryId;
    public String mFirstLine;
    public boolean mIsDefaultShipping;
    public String mName;
    public String mSecondLine;
    public String mState;
    public EtsyId mUserAddressId;
    public EtsyId mUserId;
    public String mZip;

    public UserAddress() {
        this.mName = "";
        this.mFirstLine = "";
        this.mSecondLine = "";
        this.mCity = "";
        this.mState = "";
        this.mZip = "";
        this.mUserAddressId = new EtsyId();
        this.mUserId = new EtsyId();
        this.mCountryId = new EtsyId();
    }

    public String getCity() {
        return this.mCity;
    }

    public Country getCountry() {
        return this.mCountry;
    }

    public EtsyId getCountryId() {
        return this.mCountryId;
    }

    public String getFirstLine() {
        return this.mFirstLine;
    }

    public String getName() {
        return this.mName;
    }

    public String getSecondLine() {
        return this.mSecondLine;
    }

    public String getState() {
        return this.mState;
    }

    public EtsyId getUserAddressId() {
        return this.mUserAddressId;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public String getZip() {
        return this.mZip;
    }

    public boolean isDefaultShipping() {
        return this.mIsDefaultShipping;
    }

    public void parseAddressField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.USER_ADDRESS_ID.equals(str)) {
            this.mUserAddressId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if ("user_id".equals(str)) {
            this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if ("name".equals(str)) {
            this.mName = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.FIRST_LINE.equals(str)) {
            this.mFirstLine = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.SECOND_LINE.equals(str)) {
            this.mSecondLine = BaseModel.parseString(jsonParser);
        } else if ("city".equals(str)) {
            this.mCity = BaseModel.parseString(jsonParser);
        } else if ("state".equals(str)) {
            this.mState = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.ZIP.equals(str)) {
            this.mZip = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.COUNTRY_ID.equals(str)) {
            this.mCountryId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if (ResponseConstants.IS_DEFAULT_SHIPPING.equals(str)) {
            this.mIsDefaultShipping = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.Includes.COUNTRY.equals(str)) {
            this.mCountry = (Country) BaseModel.parseObject(jsonParser, Country.class);
        } else {
            C8694h.f19097a.mo21306a(String.format("Field %s not found on UserAddress Model", new Object[]{str}));
            jsonParser.skipChildren();
        }
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                parseAddressField(jsonParser, currentName);
            }
        }
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(2);
        hashMap.put(PredefinedAnalyticsProperty.USER_ADDRESS_ID, this.mUserAddressId.getId());
        hashMap.put(PredefinedAnalyticsProperty.TARGET_USER_ID, this.mUserId.getId());
        return hashMap;
    }

    public UserAddress(EtsyId etsyId, EtsyId etsyId2, String str, boolean z) {
        this.mName = "";
        this.mFirstLine = "";
        this.mSecondLine = "";
        this.mCity = "";
        this.mState = "";
        this.mZip = "";
        this.mUserAddressId = new EtsyId();
        this.mUserId = etsyId;
        this.mCountryId = etsyId2;
        this.mZip = str;
        this.mIsDefaultShipping = z;
    }
}
