package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ConversationMessage extends BaseModel {
    private static final long serialVersionUID = -787040166711791765L;
    public EtsyId mConversationId = new EtsyId();
    public long mCreationDate;
    public boolean mHasImages;
    public List<ConversationImage> mImages = new ArrayList(0);
    public String mLanguage = "";
    public String mMessage = "";
    public int mMessageOrder;
    public String mTranslatedMessage = "";
    public EtsyId mUserId = new EtsyId();

    public static class Image extends BaseFieldModel {
        public EtsyId mConversationMessageId = new EtsyId();
        public Date mCreateDate;
        public com.etsy.android.lib.models.apiv3.Image mImageData;
        public EtsyId mImageId = new EtsyId();
        public int mImageOrder;

        public boolean parseField(JsonParser jsonParser, String str) throws IOException {
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -2048902769:
                    if (str.equals(ResponseConstants.CONVERSATION_MESSAGE_ID)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1780685974:
                    if (str.equals(ResponseConstants.IMAGE_ORDER)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1443258354:
                    if (str.equals(ResponseConstants.IMAGE_DATA)) {
                        c = 2;
                        break;
                    }
                    break;
                case -859601281:
                    if (str.equals(ResponseConstants.IMAGE_ID)) {
                        c = 3;
                        break;
                    }
                    break;
                case -494058223:
                    if (str.equals(ResponseConstants.CREATE_DATE)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.mConversationMessageId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                    break;
                case 1:
                    this.mImageOrder = jsonParser.getValueAsInt();
                    break;
                case 2:
                    this.mImageData = (com.etsy.android.lib.models.apiv3.Image) BaseModel.parseObject(jsonParser, com.etsy.android.lib.models.apiv3.Image.class);
                    break;
                case 3:
                    this.mImageId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                    break;
                case 4:
                    this.mCreateDate = BaseModel.parseIntoDate(jsonParser);
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    public EtsyId getConversationId() {
        return this.mConversationId;
    }

    public long getCreationDate() {
        return this.mCreationDate;
    }

    public boolean getHasImages() {
        return this.mHasImages;
    }

    public List<ConversationImage> getImages() {
        return this.mImages;
    }

    public String getLanguage() {
        return this.mLanguage;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public int getMessageOrder() {
        return this.mMessageOrder;
    }

    public String getTranslatedMessage() {
        return this.mTranslatedMessage;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("user_id".equals(currentName) || ResponseConstants.SENDER_ID.equals(currentName)) {
                    this.mUserId.setId(BaseModel.parseString(jsonParser));
                } else if (ResponseConstants.CONVERSATION_ID.equals(currentName)) {
                    this.mConversationId.setId(BaseModel.parseString(jsonParser));
                } else if (ResponseConstants.MESSAGE_ORDER.equals(currentName)) {
                    this.mMessageOrder = jsonParser.getValueAsInt();
                } else if (ResponseConstants.HAS_IMAGES.equals(currentName)) {
                    this.mHasImages = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.CREATION_TSZ.equals(currentName) || ResponseConstants.CREATE_DATE.equals(currentName)) {
                    this.mCreationDate = jsonParser.getValueAsLong() * 1000;
                } else if ("message".equals(currentName)) {
                    this.mMessage = BaseModel.parseString(jsonParser);
                } else if ("language".equals(currentName)) {
                    this.mLanguage = BaseModel.parseString(jsonParser).trim();
                } else if ("Images".equals(currentName)) {
                    this.mImages = BaseModel.parseArray(jsonParser, ConversationImage.class);
                } else if ("images".equals(currentName)) {
                    List<Image> parseArray = BaseModel.parseArray(jsonParser, Image.class);
                    this.mImages = new ArrayList(parseArray.size());
                    for (Image fromV3 : parseArray) {
                        this.mImages.add(ConversationImage.fromV3(fromV3));
                    }
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setTranslatedMessage(String str) {
        this.mTranslatedMessage = str;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.TARGET_USER_ID, this.mUserId);
        return hashMap;
    }
}
