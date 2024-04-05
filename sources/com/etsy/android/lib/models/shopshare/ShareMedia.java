package com.etsy.android.lib.models.shopshare;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.List;

public class ShareMedia extends BaseModel {
    private List<ShareAnnotation> mAnnotations;
    private Image mImage;
    private EtsyId mMediaId = new EtsyId();
    private int mMediaType;
    private int mOriginalHeight;
    private int mOriginalWidth;

    public List<ShareAnnotation> getAnnotations() {
        return this.mAnnotations;
    }

    public Image getImage() {
        return this.mImage;
    }

    public EtsyId getMediaId() {
        return this.mMediaId;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public int getOriginalHeight() {
        return this.mOriginalHeight;
    }

    public int getOriginalWidth() {
        return this.mOriginalWidth;
    }

    public ShareAnnotation getPrimaryAnnotation() {
        return this.mAnnotations.iterator().next();
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
                        case -961709276:
                            if (currentName.equals(ResponseConstants.ANNOTATIONS)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -900774058:
                            if (currentName.equals(ResponseConstants.MEDIA_ID)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -636516523:
                            if (currentName.equals(ResponseConstants.ORIGINAL_HEIGHT)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 100313435:
                            if (currentName.equals(ResponseConstants.IMAGE)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1933097432:
                            if (currentName.equals(ResponseConstants.ORIGINAL_WIDTH)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1939875509:
                            if (currentName.equals(ResponseConstants.MEDIA_TYPE)) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY && jsonParser.nextToken() != jsonToken) {
                                this.mAnnotations = BaseModel.parseArray(jsonParser, ShareAnnotation.class);
                                break;
                            }
                        case 1:
                            this.mMediaId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                            break;
                        case 2:
                            this.mOriginalHeight = jsonParser.getValueAsInt();
                            break;
                        case 3:
                            this.mImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
                            break;
                        case 4:
                            this.mOriginalWidth = jsonParser.getValueAsInt();
                            break;
                        case 5:
                            this.mMediaType = jsonParser.getValueAsInt();
                            break;
                        default:
                            jsonParser.skipChildren();
                            break;
                    }
                }
            }
        }
    }

    public void setAnnotations(List<ShareAnnotation> list) {
        this.mAnnotations = list;
    }
}
