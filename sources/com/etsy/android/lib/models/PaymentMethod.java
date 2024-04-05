package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PaymentMethod extends BaseModel {
    public static final String TYPE_GOOGLE_PAY = "google_pay";
    public static final String TYPE_GOOGLE_WALLET = "google";
    private static final String TYPE_KLARNA_INVOICING = "klarna";
    private static final long serialVersionUID = 1675529418136702018L;
    private final List<String> mDetails = new ArrayList(0);
    private boolean mIsDirectCheckout = false;
    private String mName;
    private String mType;

    public PaymentMethod() {
    }

    private void parseDetails(JsonParser jsonParser) throws IOException {
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    this.mDetails.add(BaseModel.parseString(jsonParser));
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof PaymentMethod) && ((PaymentMethod) obj).mType.equals(this.mType);
    }

    public List<String> getDetails() {
        return this.mDetails;
    }

    public String getName() {
        return this.mName;
    }

    public String getType() {
        return this.mType;
    }

    public int hashCode() {
        return this.mType.hashCode();
    }

    public boolean isDirectCheckout() {
        return this.mIsDirectCheckout;
    }

    public boolean isGooglePay() {
        return "google_pay".equals(this.mType);
    }

    public boolean isGoogleWallet() {
        return TYPE_GOOGLE_WALLET.equals(this.mType);
    }

    public boolean isKlarnaInstallments() {
        return "k_pay_in_4".equals(this.mType) || "k_pay_in_3".equals(this.mType) || "k_financing".equals(this.mType);
    }

    public boolean isKlarnaInvoicing() {
        return "klarna".equals(this.mType);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case 3373707:
                        if (currentName.equals("name")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3575610:
                        if (currentName.equals("type")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 100490164:
                        if (currentName.equals("is_dc")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1557721666:
                        if (currentName.equals("details")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mName = BaseModel.parseString(jsonParser);
                        break;
                    case 1:
                        this.mType = BaseModel.parseString(jsonParser);
                        break;
                    case 2:
                        this.mIsDirectCheckout = jsonParser.getValueAsBoolean();
                        break;
                    case 3:
                        parseDetails(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public String toString() {
        return this.mType;
    }

    public PaymentMethod(String str, String str2, boolean z) {
        this.mType = str;
        this.mName = str2;
        this.mIsDirectCheckout = z;
    }
}
