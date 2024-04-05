package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.lang3.CharUtils;

public class ShopPolicy extends BaseModel {
    public String additionalInformationMessageTranslated = null;
    public String mAdditionalInformationMessage = "";
    public boolean mHasNoPolicies;
    public String mPaymentPolicy = "";
    public String mPrivacyPolicy = "";
    public String mRefundPolicy = "";
    public String mShippingPolicy = "";
    public Date mUpdateDate;
    public String mWelcomeMessage = "";
    public String paymentPolicyTranslated = null;
    public String privacyPolicyTranslated = null;
    public String refundPolicyTranslated = null;
    public String shippingPolicyTranslated = null;
    public String welcomeMessageTranslated = null;

    public String getAdditionalInformationMessage() {
        return this.mAdditionalInformationMessage;
    }

    public String getAdditionalInformationMessageTranslated() {
        return this.additionalInformationMessageTranslated;
    }

    public String getPaymentPolicy() {
        return this.mPaymentPolicy;
    }

    public String getPaymentPolicyTranslated() {
        return this.paymentPolicyTranslated;
    }

    public String getPrivacyPolicy() {
        return this.mPrivacyPolicy;
    }

    public String getPrivacyPolicyTranslated() {
        return this.privacyPolicyTranslated;
    }

    public String getRefundPolicy() {
        return this.mRefundPolicy;
    }

    public String getRefundPolicyTranslated() {
        return this.refundPolicyTranslated;
    }

    public String getShippingPolicy() {
        return this.mShippingPolicy;
    }

    public String getShippingPolicyTranslated() {
        return this.shippingPolicyTranslated;
    }

    public Date getUpdateDate() {
        return this.mUpdateDate;
    }

    public String getWelcomeMessage() {
        return this.mWelcomeMessage;
    }

    public String getWelcomeMessageTranslated() {
        return this.welcomeMessageTranslated;
    }

    public boolean hasPolicies() {
        return !this.mHasNoPolicies;
    }

    public boolean isEmpty() {
        return this.mAdditionalInformationMessage.isEmpty() && this.mWelcomeMessage.isEmpty() && this.mPaymentPolicy.isEmpty() && this.mRefundPolicy.isEmpty() && this.mShippingPolicy.isEmpty();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1955813889:
                        if (currentName.equals("shipping_machine_translated")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1931413465:
                        if (currentName.equals(ResponseConstants.ADDITIONAL)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -786681338:
                        if (currentName.equals(ResponseConstants.PAYMENT)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -573930140:
                        if (currentName.equals(ResponseConstants.UPDATE_DATE)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -516235858:
                        if (currentName.equals("shipping")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -465646107:
                        if (currentName.equals("privacy_machine_translated")) {
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
                    case -313876762:
                        if (currentName.equals("additional_machine_translated")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 571463657:
                        if (currentName.equals(ResponseConstants.HAS_NO_POLICIES)) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1085542395:
                        if (currentName.equals(ResponseConstants.REFUNDS)) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1233099618:
                        if (currentName.equals(ResponseConstants.WELCOME)) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1608811175:
                        if (currentName.equals("payment_machine_translated")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1725935250:
                        if (currentName.equals("refunds_machine_translated")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1840743371:
                        if (currentName.equals("welcome_machine_translated")) {
                            c = CharUtils.f44393CR;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.shippingPolicyTranslated = BaseModel.parseString(jsonParser);
                        break;
                    case 1:
                        this.mAdditionalInformationMessage = BaseModel.parseString(jsonParser);
                        break;
                    case 2:
                        this.mPaymentPolicy = BaseModel.parseString(jsonParser);
                        break;
                    case 3:
                        this.mUpdateDate = BaseModel.parseIntoDate(jsonParser);
                        break;
                    case 4:
                        this.mShippingPolicy = BaseModel.parseString(jsonParser);
                        break;
                    case 5:
                        this.privacyPolicyTranslated = BaseModel.parseString(jsonParser);
                        break;
                    case 6:
                        this.mPrivacyPolicy = BaseModel.parseString(jsonParser);
                        break;
                    case 7:
                        this.additionalInformationMessageTranslated = BaseModel.parseString(jsonParser);
                        break;
                    case 8:
                        this.mHasNoPolicies = jsonParser.getValueAsBoolean();
                        break;
                    case 9:
                        this.mRefundPolicy = BaseModel.parseString(jsonParser);
                        break;
                    case 10:
                        this.mWelcomeMessage = BaseModel.parseString(jsonParser);
                        break;
                    case 11:
                        this.paymentPolicyTranslated = BaseModel.parseString(jsonParser);
                        break;
                    case 12:
                        this.refundPolicyTranslated = BaseModel.parseString(jsonParser);
                        break;
                    case 13:
                        this.welcomeMessageTranslated = BaseModel.parseString(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }
}
