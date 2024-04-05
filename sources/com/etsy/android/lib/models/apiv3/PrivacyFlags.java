package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import org.apache.commons.lang3.ObjectUtils;

public class PrivacyFlags extends BaseModel {
    private static final long serialVersionUID = 1904584598858626743L;
    public PrivacyFlag mCommunication = new PrivacyFlag();
    public PrivacyFlag mFulfillment = new PrivacyFlag();
    public PrivacyFlag mLegal = new PrivacyFlag();
    public PrivacyFlag mOther = new PrivacyFlag();

    public PrivacyFlags() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof PrivacyFlags) {
            PrivacyFlags privacyFlags = (PrivacyFlags) obj;
            return ObjectUtils.equals(this.mCommunication, privacyFlags.getCommunication()) && ObjectUtils.equals(this.mFulfillment, privacyFlags.getFulfillment()) && ObjectUtils.equals(this.mLegal, privacyFlags.getLegal()) && ObjectUtils.equals(this.mOther, privacyFlags.getOther());
        }
    }

    public PrivacyFlag getCommunication() {
        return this.mCommunication;
    }

    public PrivacyFlag getFulfillment() {
        return this.mFulfillment;
    }

    public PrivacyFlag getLegal() {
        return this.mLegal;
    }

    public PrivacyFlag getOther() {
        PrivacyFlag privacyFlag = this.mOther;
        privacyFlag.setEnabled(privacyFlag.isEnabled() && C8885d0.m17323g(this.mOther.getLabel()));
        return this.mOther;
    }

    public int hashCode() {
        int hashCode = ObjectUtils.hashCode(this.mFulfillment);
        int hashCode2 = ObjectUtils.hashCode(this.mLegal);
        return ObjectUtils.hashCode(this.mOther) + ((hashCode2 + ((hashCode + ((ObjectUtils.hashCode(this.mCommunication) + 527) * 31)) * 31)) * 31);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1035284522:
                        if (currentName.equals(ResponseConstants.COMMUNICATION)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 102851257:
                        if (currentName.equals(ResponseConstants.LEGAL)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 106069776:
                        if (currentName.equals("other")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1512395230:
                        if (currentName.equals(ResponseConstants.FULFILLMENT)) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mCommunication = (PrivacyFlag) BaseModel.parseObject(jsonParser, PrivacyFlag.class);
                        break;
                    case 1:
                        this.mLegal = (PrivacyFlag) BaseModel.parseObject(jsonParser, PrivacyFlag.class);
                        break;
                    case 2:
                        this.mOther = (PrivacyFlag) BaseModel.parseObject(jsonParser, PrivacyFlag.class);
                        break;
                    case 3:
                        this.mFulfillment = (PrivacyFlag) BaseModel.parseObject(jsonParser, PrivacyFlag.class);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setCommunication(PrivacyFlag privacyFlag) {
        this.mCommunication = privacyFlag;
    }

    public void setFulfillment(PrivacyFlag privacyFlag) {
        this.mFulfillment = privacyFlag;
    }

    public void setLegal(PrivacyFlag privacyFlag) {
        this.mLegal = privacyFlag;
    }

    public void setOther(PrivacyFlag privacyFlag) {
        this.mOther = privacyFlag;
    }

    public PrivacyFlags(PrivacyFlags privacyFlags) {
        this.mCommunication = new PrivacyFlag(privacyFlags.getCommunication());
        this.mFulfillment = new PrivacyFlag(privacyFlags.getFulfillment());
        this.mLegal = new PrivacyFlag(privacyFlags.getLegal());
        this.mOther = new PrivacyFlag(privacyFlags.getOther());
    }
}
