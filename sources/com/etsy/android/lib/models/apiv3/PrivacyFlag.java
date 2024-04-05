package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import org.apache.commons.lang3.ObjectUtils;

public class PrivacyFlag extends BaseModel {
    private static final long serialVersionUID = -1736461258020701046L;
    public boolean mEnabled;
    public String mLabel = "";
    public String mLanguage = "";

    public PrivacyFlag() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof PrivacyFlag) {
            PrivacyFlag privacyFlag = (PrivacyFlag) obj;
            return ObjectUtils.equals(this.mLabel, privacyFlag.getLabel()) && ObjectUtils.equals(Boolean.valueOf(this.mEnabled), Boolean.valueOf(privacyFlag.isEnabled()));
        }
    }

    public String getLabel() {
        return this.mLabel;
    }

    @JsonIgnore
    public String getLanguage() {
        return this.mLanguage;
    }

    public int hashCode() {
        return ((ObjectUtils.hashCode(this.mLabel) + 527) * 31) + (this.mEnabled ? 1 : 0);
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1613589672:
                        if (currentName.equals("language")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1609594047:
                        if (currentName.equals(ResponseConstants.ENABLED)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 102727412:
                        if (currentName.equals(ResponseConstants.LABEL)) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mLanguage = BaseModel.parseString(jsonParser);
                        break;
                    case 1:
                        this.mEnabled = jsonParser.getValueAsBoolean();
                        break;
                    case 2:
                        this.mLabel = BaseModel.parseString(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    public PrivacyFlag(PrivacyFlag privacyFlag) {
        this.mLabel = privacyFlag.getLabel();
        this.mEnabled = privacyFlag.isEnabled();
        this.mLanguage = privacyFlag.getLanguage();
    }
}
