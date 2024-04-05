package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import org.apache.commons.lang3.ObjectUtils;

public class StructuredShopPrivacy extends BaseModel {
    private static final long serialVersionUID = -9054900251304900568L;
    public PrivacyFlags mFlags = new PrivacyFlags();
    public String mHeader;
    public MachineTranslationViewState mOtherTranslationState = new MachineTranslationViewState();
    public String mTranslatedOtherText;

    public StructuredShopPrivacy() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof StructuredShopPrivacy) {
            StructuredShopPrivacy structuredShopPrivacy = (StructuredShopPrivacy) obj;
            return ObjectUtils.equals(this.mHeader, structuredShopPrivacy.getHeader()) && ObjectUtils.equals(this.mFlags, structuredShopPrivacy.getFlags());
        }
    }

    @JsonIgnore
    public PrivacyFlag getCommunication() {
        return this.mFlags.getCommunication();
    }

    public PrivacyFlags getFlags() {
        return this.mFlags;
    }

    @JsonIgnore
    public PrivacyFlag getFulfillment() {
        return this.mFlags.getFulfillment();
    }

    public String getHeader() {
        return this.mHeader;
    }

    @JsonIgnore
    public PrivacyFlag getLegal() {
        return this.mFlags.getLegal();
    }

    @JsonIgnore
    public PrivacyFlag getOther() {
        return this.mFlags.getOther();
    }

    @JsonIgnore
    public String getTranslatedOtherText() {
        return this.mTranslatedOtherText;
    }

    @JsonIgnore
    public MachineTranslationViewState getTranslationState() {
        return this.mOtherTranslationState;
    }

    public boolean hasAnyEnabledFlags() {
        PrivacyFlags privacyFlags = this.mFlags;
        return privacyFlags != null && (privacyFlags.getCommunication().isEnabled() || this.mFlags.getFulfillment().isEnabled() || this.mFlags.getLegal().isEnabled() || this.mFlags.getOther().isEnabled());
    }

    public int hashCode() {
        return ObjectUtils.hashCode(this.mFlags) + ((ObjectUtils.hashCode(this.mHeader) + 527) * 31);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                if (currentName.equals(ResponseConstants.HEADER)) {
                    this.mHeader = BaseModel.parseString(jsonParser);
                } else if (!currentName.equals(ResponseConstants.FLAGS)) {
                    jsonParser.skipChildren();
                } else {
                    this.mFlags = (PrivacyFlags) BaseModel.parseObject(jsonParser, PrivacyFlags.class);
                }
            }
        }
    }

    public void setFlags(PrivacyFlags privacyFlags) {
        this.mFlags = privacyFlags;
    }

    public void setHeader(String str) {
        this.mHeader = str;
    }

    public void setOtherTranslation(String str) {
        this.mTranslatedOtherText = str;
    }

    public StructuredShopPrivacy(StructuredShopPrivacy structuredShopPrivacy) {
        setFlags(new PrivacyFlags(structuredShopPrivacy.getFlags()));
        setHeader(structuredShopPrivacy.getHeader());
    }
}
