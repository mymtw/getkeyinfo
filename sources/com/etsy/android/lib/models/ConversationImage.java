package com.etsy.android.lib.models;

import com.etsy.android.lib.models.ConversationMessage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Date;
import kotlin.Pair;

public class ConversationImage extends BaseModelImage {
    private static final Pair[] IMG_SIZES_ARRAY = {ImageSizes.IMG_SIZE_75, ImageSizes.IMG_SIZE_FULL};
    public EtsyId mConversationMessageId = new EtsyId();
    public Date mCreateDate;
    public EtsyId mImageId = new EtsyId();
    public int mRank;

    public static ConversationImage fromV3(ConversationMessage.Image image) {
        ConversationImage conversationImage = new ConversationImage();
        conversationImage.mConversationMessageId.setId(image.mConversationMessageId.getId());
        conversationImage.mImageId.setId(image.mImageId.getId());
        conversationImage.mRank = image.mImageOrder;
        conversationImage.mCreateDate = image.mCreateDate;
        conversationImage.mUrlFullxFull = image.mImageData.getUrl();
        conversationImage.mUrl75x75 = image.mImageData.getFullHeightImageUrlForPixelWidth(75);
        return conversationImage;
    }

    public EtsyId getConversationMessageId() {
        return this.mConversationMessageId;
    }

    public Date getCreateDate() {
        return this.mCreateDate;
    }

    public Pair<Integer, String>[] getImageSizesArray() {
        return IMG_SIZES_ARRAY;
    }

    public String getImageUrl() {
        return this.mUrlFullxFull;
    }

    public String getImageUrlForPixelWidth(int i) {
        return i <= BaseModelImage.IMG_SIZE_75.getFirst().intValue() ? this.mUrl75x75 : this.mUrlFullxFull;
    }

    public String getLargestDimension() {
        return BaseModelImage.IMG_SIZE_FULL.getSecond();
    }

    public int getRank() {
        return this.mRank;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2078324984:
                        if (currentName.equals(ResponseConstants.URL_FULLxFULL)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -2048902769:
                        if (currentName.equals(ResponseConstants.CONVERSATION_MESSAGE_ID)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -68483352:
                        if (currentName.equals(ResponseConstants.URL_75x75)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3492908:
                        if (currentName.equals(ResponseConstants.RANK)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 360136379:
                        if (currentName.equals(ResponseConstants.CONVERSATION_IMAGE_ID)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1586354299:
                        if (currentName.equals(ResponseConstants.CREATION_TSZ)) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mUrlFullxFull = BaseModel.parseStringURL(jsonParser);
                        break;
                    case 1:
                        this.mConversationMessageId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 2:
                        this.mUrl75x75 = BaseModel.parseStringURL(jsonParser);
                        break;
                    case 3:
                        this.mRank = jsonParser.getValueAsInt();
                        break;
                    case 4:
                        this.mConversationMessageId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 5:
                        this.mCreateDate = BaseModel.parseIntoDate(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setFullHeight(int i) {
    }

    public void setFullWidth(int i) {
    }

    public void setImageColor(int i) {
    }
}
