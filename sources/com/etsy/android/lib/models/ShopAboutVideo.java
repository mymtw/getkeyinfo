package com.etsy.android.lib.models;

import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class ShopAboutVideo extends BaseModel {
    public static final String PROVIDER_STATUS_ERROR = "error";
    public static final String PROVIDER_STATUS_NONE = "none";
    public static final String PROVIDER_STATUS_PROCESSING = "processing";
    public static final String PROVIDER_STATUS_READY = "ready";
    public static final String PROVIDER_STATUS_SENDING = "sending";
    public String mProviderStatus = "";
    public EtsyId mShopId = new EtsyId();
    public BaseModelImageWrapper mThumbnail;
    public String mUrl = "";
    public EtsyId mVideoId = new EtsyId();

    public EtsyId getShopId() {
        return this.mShopId;
    }

    public BaseModelImageWrapper getThumbnail() {
        return this.mThumbnail;
    }

    public EtsyId getVideoId() {
        return this.mVideoId;
    }

    public String getVideoUrl() {
        return this.mUrl;
    }

    public boolean hasError() {
        return "error".equals(this.mProviderStatus);
    }

    public boolean isProcessing() {
        return !videoIsReady() && !hasError();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.VIDEO_ID.equals(currentName)) {
                    this.mVideoId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if ("shop_id".equals(currentName)) {
                    this.mShopId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.THUMBNAIL.equals(currentName)) {
                    this.mThumbnail = new BaseModelImageWrapper((Image) BaseModel.parseObject(jsonParser, Image.class));
                } else if ("url".equals(currentName)) {
                    this.mUrl = BaseModel.parseStringPreserveHTMLEscapeEncoding(jsonParser);
                } else if (ResponseConstants.PROVIDER_STATUS.equals(currentName)) {
                    this.mProviderStatus = BaseModel.parseStringPreserveHTMLEscapeEncoding(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public boolean videoIsReady() {
        return PROVIDER_STATUS_READY.equals(this.mProviderStatus);
    }
}
