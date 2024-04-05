package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import org.apache.commons.lang3.ObjectUtils;

public class NonRefundableItem extends BaseModel {
    private static final long serialVersionUID = -2427758889766752627L;
    public String mName;
    public boolean mNonRefundable;
    public String mType;

    public NonRefundableItem() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof NonRefundableItem) {
            NonRefundableItem nonRefundableItem = (NonRefundableItem) obj;
            return this.mType.equals(nonRefundableItem.getType()) && this.mName.equals(nonRefundableItem.getName()) && this.mNonRefundable == nonRefundableItem.isNonRefundable();
        }
    }

    public String getName() {
        return this.mName;
    }

    public String getType() {
        return this.mType;
    }

    public int hashCode() {
        int hashCode = ObjectUtils.hashCode(this.mType);
        return ObjectUtils.hashCode(this.mName) + ((hashCode + ((true + (this.mNonRefundable ^ true ? 1 : 0)) * 31)) * 31);
    }

    public boolean isNonRefundable() {
        return this.mNonRefundable;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1588014716:
                        if (currentName.equals(ResponseConstants.NON_REFUNDABLE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (currentName.equals("name")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3575610:
                        if (currentName.equals("type")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mNonRefundable = jsonParser.getValueAsBoolean();
                        break;
                    case 1:
                        this.mName = BaseModel.parseString(jsonParser);
                        break;
                    case 2:
                        this.mType = BaseModel.parseStringPreserveHTMLEscapeEncoding(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setNonRefundable(boolean z) {
        this.mNonRefundable = z;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public NonRefundableItem(NonRefundableItem nonRefundableItem) {
        this.mType = nonRefundableItem.getType();
        this.mName = nonRefundableItem.getName();
        this.mNonRefundable = nonRefundableItem.isNonRefundable();
    }
}
