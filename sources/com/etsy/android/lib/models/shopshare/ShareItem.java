package com.etsy.android.lib.models.shopshare;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ShareItemLike;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ShareItem extends BaseModel implements ShareItemLike {
    public Date mCreateDate;
    public List<ShareMedia> mMedia;
    public EtsyId mShareId = new EtsyId();
    public String mText = "";
    public String mUrl = "";

    public Date getCreateDate() {
        return this.mCreateDate;
    }

    public List<ShareMedia> getMedia() {
        return this.mMedia;
    }

    public ShareAnnotation getPrimaryAnnotation() {
        return getPrimaryMedia().getPrimaryAnnotation();
    }

    public ShareMedia getPrimaryMedia() {
        return this.mMedia.iterator().next();
    }

    public EtsyId getShareId() {
        return this.mShareId;
    }

    public String getText() {
        return this.mText;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (currentToken != jsonToken) {
                String currentName = jsonParser.getCurrentName();
                jsonParser.nextToken();
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    currentName.getClass();
                    char c = 65535;
                    switch (currentName.hashCode()) {
                        case -743759493:
                            if (currentName.equals(ResponseConstants.SHARE_ID)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -494058223:
                            if (currentName.equals(ResponseConstants.CREATE_DATE)) {
                                c = 1;
                                break;
                            }
                            break;
                        case 116079:
                            if (currentName.equals("url")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3556653:
                            if (currentName.equals("text")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 103772132:
                            if (currentName.equals(ResponseConstants.MEDIA)) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.mShareId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                            break;
                        case 1:
                            this.mCreateDate = BaseModel.parseIntoDate(jsonParser);
                            break;
                        case 2:
                            this.mUrl = BaseModel.parseStringURL(jsonParser);
                            break;
                        case 3:
                            this.mText = BaseModel.parseString(jsonParser);
                            break;
                        case 4:
                            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY && jsonParser.nextToken() != jsonToken) {
                                this.mMedia = BaseModel.parseArray(jsonParser, ShareMedia.class);
                                break;
                            }
                        default:
                            jsonParser.skipChildren();
                            break;
                    }
                }
            }
        }
    }

    public void setMedia(List<ShareMedia> list) {
        this.mMedia = list;
    }

    public void setText(String str) {
        this.mText = str;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        EtsyId objectId;
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.SHARE_ID, this.mShareId.getId());
        ShareAnnotation primaryAnnotation = getPrimaryAnnotation();
        if (!(primaryAnnotation == null || (objectId = primaryAnnotation.getObjectId()) == null)) {
            hashMap.put(PredefinedAnalyticsProperty.ANNOTATION_OBJECT_ID, objectId.getId());
            hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, objectId.getId());
        }
        return hashMap;
    }
}
