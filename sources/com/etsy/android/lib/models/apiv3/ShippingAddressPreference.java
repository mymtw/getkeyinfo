package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.squareup.moshi.C17402n;
import java.io.IOException;

public class ShippingAddressPreference extends BaseModel {
    public static final String COUNTRY = "country";
    @C17402n(name = "country")
    private Country mCountry;
    @C17402n(name = "postal_code")
    private String mPostalCode;

    public ShippingAddressPreference() {
        this.mCountry = null;
        this.mPostalCode = "";
    }

    public Country getCountry() {
        return this.mCountry;
    }

    public String getPostalCode() {
        return this.mPostalCode;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("country".equals(currentName)) {
                    this.mCountry = (Country) BaseModel.parseObject(jsonParser, Country.class);
                } else if (ResponseConstants.POSTAL_CODE.equals(currentName)) {
                    this.mPostalCode = BaseModel.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setCountry(Country country) {
        this.mCountry = country;
    }

    public void setPostalCode(String str) {
        this.mPostalCode = str;
    }

    public ShippingAddressPreference(Country country, String str) {
        this.mCountry = country;
        this.mPostalCode = str;
    }
}
