package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class StructuredShopCharLimits extends BaseModel {
    private static final long serialVersionUID = -44975806744768436L;
    public int mPrivacyPolicyOtherLimit = 750;

    public int getPrivacyOtherLimit() {
        return this.mPrivacyPolicyOtherLimit;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                if (!currentName.equals(ResponseConstants.PRIVACY_POLICY_OTHER)) {
                    jsonParser.skipChildren();
                } else {
                    this.mPrivacyPolicyOtherLimit = jsonParser.getValueAsInt();
                }
            }
        }
    }
}
