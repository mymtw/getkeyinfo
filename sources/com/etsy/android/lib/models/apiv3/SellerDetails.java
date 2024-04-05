package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class SellerDetails extends BaseModel {
    private static final long serialVersionUID = -5013462844915116567L;
    public String mAddressLine1 = "";
    public String mAddressLine2 = "";
    public String mCity = "";
    public String mCountry = "";
    public String mEmail = "";
    public String mFirstName = "";
    public String mFormattedString = "";
    public String mLastName = "";
    public String mPhone = "";
    public String mPostalCode = "";
    public String mState = "";
    public String mVatNumber = "";
    public String traderDistinction;

    public String getAddressLine1() {
        return this.mAddressLine1;
    }

    public String getAddressLine2() {
        return this.mAddressLine2;
    }

    public String getCity() {
        return this.mCity;
    }

    public String getCountry() {
        return this.mCountry;
    }

    public String getEmail() {
        return this.mEmail;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public String getFormattedDetails() {
        return this.mFormattedString;
    }

    public String getLastName() {
        return this.mLastName;
    }

    public String getPhone() {
        return this.mPhone;
    }

    public String getPostalCode() {
        return this.mPostalCode;
    }

    public String getState() {
        return this.mState;
    }

    public String getTraderDistinction() {
        return this.traderDistinction;
    }

    public String getVatNumber() {
        return this.mVatNumber;
    }

    public boolean hasAnyValues() {
        return C8885d0.m17323g(getFirstName()) || C8885d0.m17323g(getLastName()) || C8885d0.m17323g(getAddressLine1()) || C8885d0.m17323g(getAddressLine2()) || C8885d0.m17323g(getCity()) || C8885d0.m17323g(getState()) || C8885d0.m17323g(getPostalCode()) || C8885d0.m17323g(getCountry());
    }

    public boolean hasDetails() {
        return C8885d0.m17323g(getFormattedDetails());
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2053263135:
                        if (currentName.equals(ResponseConstants.POSTAL_CODE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1958633228:
                        if (currentName.equals(ResponseConstants.FORMATTED_STRING)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -769510831:
                        if (currentName.equals(ResponseConstants.EMAIL_ADDRESS)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -612351174:
                        if (currentName.equals(ResponseConstants.PHONE_NUMBER)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -404257102:
                        if (currentName.equals(ResponseConstants.ADDRESS_LINE_1)) {
                            c = 4;
                            break;
                        }
                        break;
                    case -404257101:
                        if (currentName.equals(ResponseConstants.ADDRESS_LINE_2)) {
                            c = 5;
                            break;
                        }
                        break;
                    case -160985414:
                        if (currentName.equals(ResponseConstants.FIRST_NAME)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3053931:
                        if (currentName.equals("city")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 109757585:
                        if (currentName.equals("state")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 957831062:
                        if (currentName.equals("country")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 965209179:
                        if (currentName.equals("trader_distinction")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1033462047:
                        if (currentName.equals(ResponseConstants.VAT_NUMBER)) {
                            c = 11;
                            break;
                        }
                        break;
                    case 2013122196:
                        if (currentName.equals("last_name")) {
                            c = 12;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mPostalCode = BaseModel.parseString(jsonParser);
                        break;
                    case 1:
                        this.mFormattedString = BaseModel.parseString(jsonParser);
                        break;
                    case 2:
                        this.mEmail = BaseModel.parseString(jsonParser);
                        break;
                    case 3:
                        this.mPhone = BaseModel.parseString(jsonParser);
                        break;
                    case 4:
                        this.mAddressLine1 = BaseModel.parseString(jsonParser);
                        break;
                    case 5:
                        this.mAddressLine2 = BaseModel.parseString(jsonParser);
                        break;
                    case 6:
                        this.mFirstName = BaseModel.parseString(jsonParser);
                        break;
                    case 7:
                        this.mCity = BaseModel.parseString(jsonParser);
                        break;
                    case 8:
                        this.mState = BaseModel.parseString(jsonParser);
                        break;
                    case 9:
                        this.mCountry = BaseModel.parseString(jsonParser);
                        break;
                    case 10:
                        this.traderDistinction = BaseModel.parseString(jsonParser);
                        break;
                    case 11:
                        this.mVatNumber = BaseModel.parseString(jsonParser);
                        break;
                    case 12:
                        this.mLastName = BaseModel.parseString(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setAddressLine1(String str) {
        this.mAddressLine1 = str;
    }

    public void setAddressLine2(String str) {
        this.mAddressLine2 = str;
    }

    public void setCity(String str) {
        this.mCity = str;
    }

    public void setCountry(String str) {
        this.mCountry = str;
    }

    public void setEmail(String str) {
        this.mEmail = str;
    }

    public void setFirstName(String str) {
        this.mFirstName = str;
    }

    public void setFormattedDetails(String str) {
        this.mFormattedString = str;
    }

    public void setLastName(String str) {
        this.mLastName = str;
    }

    public void setPhone(String str) {
        this.mPhone = str;
    }

    public void setPostalCode(String str) {
        this.mPostalCode = str;
    }

    public void setState(String str) {
        this.mState = str;
    }

    public void setVatNumber(String str) {
        this.mVatNumber = str;
    }
}
