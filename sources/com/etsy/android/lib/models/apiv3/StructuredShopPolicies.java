package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Date;

public class StructuredShopPolicies extends BaseModel {
    private static final long serialVersionUID = -3325270444200620201L;
    public String mAdditionalTermsAndConditions = "";
    public boolean mCanHaveAdditionalPolicies;
    public StructuredShopCharLimits mCharacterLimits = new StructuredShopCharLimits();
    public boolean mIncludeResolutionLink;
    public StructuredShopPayments mPayments;
    public EtsyId mPoliciesId = new EtsyId();
    public StructuredShopPrivacy mPrivacy;
    public StructuredShopRefunds mRefunds;
    public StructuredShopShipping mShipping;
    public Date mUpdateDate;

    public boolean canHaveAdditionalPolicies() {
        return this.mCanHaveAdditionalPolicies;
    }

    public StructuredShopCharLimits getCharacterLimits() {
        return this.mCharacterLimits;
    }

    public Date getLastUpdatedDate() {
        return this.mUpdateDate;
    }

    public StructuredShopPayments getPayments() {
        return this.mPayments;
    }

    public StructuredShopPrivacy getPrivacy() {
        return this.mPrivacy;
    }

    public StructuredShopRefunds getRefunds() {
        return this.mRefunds;
    }

    public StructuredShopShipping getShipping() {
        return this.mShipping;
    }

    public String getTermsAndConditions() {
        return this.mAdditionalTermsAndConditions;
    }

    public boolean includeResolutionLink() {
        return this.mIncludeResolutionLink;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1875349856:
                        if (currentName.equals(ResponseConstants.CAN_HAVE_ADDITIONAL_POLICIES)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1573828319:
                        if (currentName.equals(ResponseConstants.CHAR_LIMITS)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1158353680:
                        if (currentName.equals(ResponseConstants.TERMS_AND_CONDITIONS)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -888263421:
                        if (currentName.equals(ResponseConstants.INCLUDE_RESOLUTION_LINK)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -573930140:
                        if (currentName.equals(ResponseConstants.UPDATE_DATE)) {
                            c = 4;
                            break;
                        }
                        break;
                    case -516235858:
                        if (currentName.equals("shipping")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -314498168:
                        if (currentName.equals(ResponseConstants.PRIVACY)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1085542395:
                        if (currentName.equals(ResponseConstants.REFUNDS)) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1382682413:
                        if (currentName.equals(ResponseConstants.PAYMENTS)) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1713061482:
                        if (currentName.equals(ResponseConstants.POLICIES_ID)) {
                            c = 9;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mCanHaveAdditionalPolicies = jsonParser.getValueAsBoolean();
                        break;
                    case 1:
                        this.mCharacterLimits = (StructuredShopCharLimits) BaseModel.parseObject(jsonParser, StructuredShopCharLimits.class);
                        break;
                    case 2:
                        this.mAdditionalTermsAndConditions = BaseModel.parseString(jsonParser);
                        break;
                    case 3:
                        this.mIncludeResolutionLink = jsonParser.getValueAsBoolean();
                        break;
                    case 4:
                        this.mUpdateDate = BaseModel.parseIntoDate(jsonParser);
                        break;
                    case 5:
                        this.mShipping = (StructuredShopShipping) BaseModel.parseObject(jsonParser, StructuredShopShipping.class);
                        break;
                    case 6:
                        this.mPrivacy = (StructuredShopPrivacy) BaseModel.parseObject(jsonParser, StructuredShopPrivacy.class);
                        break;
                    case 7:
                        this.mRefunds = (StructuredShopRefunds) BaseModel.parseObject(jsonParser, StructuredShopRefunds.class);
                        break;
                    case 8:
                        this.mPayments = (StructuredShopPayments) BaseModel.parseObject(jsonParser, StructuredShopPayments.class);
                        break;
                    case 9:
                        this.mPoliciesId.setId(BaseModel.parseString(jsonParser));
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setCanHaveAdditionalPolicies(boolean z) {
        this.mCanHaveAdditionalPolicies = z;
    }

    public void setCharacterLimits(StructuredShopCharLimits structuredShopCharLimits) {
        this.mCharacterLimits = structuredShopCharLimits;
    }

    public void setIncludeResolutionLink(boolean z) {
        this.mIncludeResolutionLink = z;
    }

    public void setLastUpdatedDate(Date date) {
        this.mUpdateDate = date;
    }

    public void setPayments(StructuredShopPayments structuredShopPayments) {
        this.mPayments = structuredShopPayments;
    }

    public void setPoliciesId(EtsyId etsyId) {
        this.mPoliciesId = etsyId;
    }

    public void setPrivacy(StructuredShopPrivacy structuredShopPrivacy) {
        this.mPrivacy = structuredShopPrivacy;
    }

    public void setRefunds(StructuredShopRefunds structuredShopRefunds) {
        this.mRefunds = structuredShopRefunds;
    }

    public void setShipping(StructuredShopShipping structuredShopShipping) {
        this.mShipping = structuredShopShipping;
    }

    public void setTermsAndConditions(String str) {
        this.mAdditionalTermsAndConditions = str;
    }
}
