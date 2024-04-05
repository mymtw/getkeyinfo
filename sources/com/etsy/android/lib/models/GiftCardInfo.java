package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.IOException;

public class GiftCardInfo extends BaseModel {
    private static final long serialVersionUID = -1806616131589913961L;
    public double mAmount = ShadowDrawableWrapper.COS_45;
    public String mDesignImage = "";
    public GiftCardDesign mGiftCardDesign;
    public boolean mIsEmail;
    public String mMessage = "";
    public String mRecipientEmail = "";
    public String mRecipientName = "";
    public String mSenderName = "";

    public double getAmount() {
        return this.mAmount;
    }

    public String getDesignImage() {
        return this.mDesignImage;
    }

    public GiftCardDesign getGiftCardDesign() {
        return this.mGiftCardDesign;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public String getRecipientEmail() {
        return this.mRecipientEmail;
    }

    public String getRecipientName() {
        return this.mRecipientName;
    }

    public String getSenderName() {
        return this.mSenderName;
    }

    public boolean isEmail() {
        return this.mIsEmail;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("is_email".equals(currentName)) {
                    this.mIsEmail = jsonParser.getValueAsBoolean();
                } else if ("recipient_name".equals(currentName)) {
                    this.mRecipientName = BaseModel.parseString(jsonParser);
                } else if ("sender_name".equals(currentName)) {
                    this.mSenderName = BaseModel.parseString(jsonParser);
                } else if ("recipient_email".equals(currentName)) {
                    this.mRecipientEmail = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.AMOUNT.equals(currentName)) {
                    this.mAmount = jsonParser.getValueAsDouble();
                } else if ("design_image".equals(currentName)) {
                    this.mDesignImage = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.IMG.equals(currentName)) {
                    this.mGiftCardDesign = new GiftCardDesign().parseData(jsonParser);
                } else if ("message".equals(currentName)) {
                    this.mMessage = BaseModel.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
