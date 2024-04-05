package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.play.core.appupdate.C15562d;
import java.io.IOException;
import java.util.List;

public class Segment extends BaseFieldModel implements ILink {
    private static final long serialVersionUID = 8449013538448797573L;
    public Integer backgroundColor = null;
    public String deepLink = null;
    public List<ListingImage> images = null;
    public String title = "";

    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public List<ListingImage> getImages() {
        return this.images;
    }

    public String getLink() {
        return this.deepLink;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.title = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.BACKGROUND_COLOR.equals(str)) {
            this.backgroundColor = Integer.valueOf(C15562d.m25182T(BaseModel.parseString(jsonParser)));
            return true;
        } else if (ResponseConstants.DEEP_LINK.equals(str)) {
            this.deepLink = BaseModel.parseString(jsonParser);
            return true;
        } else if (!"images".equals(str)) {
            return false;
        } else {
            this.images = BaseModel.parseArray(jsonParser, ListingImage.class);
            return true;
        }
    }
}
