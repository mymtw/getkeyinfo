package com.etsy.android.lib.models.homescreen;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

public class MessageCard extends BaseModel {
    public static final String ITEM_TYPE = "messageCard";
    public String mDeepLinkUrl = "";
    public String mImageName = "";
    public String mLink = "";
    public String mLinkTitle = "";
    public String mSubtitle = "";
    public String mTitle = "";
    public boolean mTryAgain = false;

    public String getDeepLinkUrl() {
        return this.mDeepLinkUrl;
    }

    public String getImageName() {
        return this.mImageName;
    }

    public String getLink() {
        return this.mLink;
    }

    public String getLinkTitle() {
        return this.mLinkTitle;
    }

    public String getSubtitle() {
        return this.mSubtitle;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int getViewType() {
        return R.id.view_type_message_card;
    }

    public boolean isTryAgain() {
        return this.mTryAgain;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("title".equals(currentName)) {
                    this.mTitle = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.SUB_TITLE.equals(currentName)) {
                    this.mSubtitle = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.LINK_TITLE.equals(currentName)) {
                    this.mLinkTitle = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.LINK_PATH.equals(currentName)) {
                    this.mLink = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.DEEP_LINK_URL.equals(currentName)) {
                    this.mDeepLinkUrl = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.TRY_AGAIN.equals(currentName)) {
                    this.mTryAgain = jsonParser.getBooleanValue();
                } else if (ResponseConstants.IMAGE.equals(currentName)) {
                    this.mImageName = BaseModel.parseNonNullString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setDeepLinkUrl(String str) {
        this.mDeepLinkUrl = str;
    }

    public void setImageName(String str) {
        this.mImageName = str;
    }

    public void setLink(String str) {
        this.mLink = str;
    }

    public void setLinkTitle(String str) {
        this.mLinkTitle = str;
    }

    public void setSubtitle(String str) {
        this.mSubtitle = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setTryAgain(boolean z) {
        this.mTryAgain = z;
    }
}
