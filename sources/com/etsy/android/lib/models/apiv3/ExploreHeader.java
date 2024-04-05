package com.etsy.android.lib.models.apiv3;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.play.core.appupdate.C15562d;
import java.io.IOException;

public class ExploreHeader extends BaseFieldModel {
    private static final long serialVersionUID = 7291856721322005393L;
    public int mBackgroundColor = -1;
    public Image mImage;
    public String mSubtitle = "";
    public int mSubtitleTextColor = -16777216;
    public String mTitle = "";
    public int mTitleTextColor = -16777216;

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public Image getImage() {
        return this.mImage;
    }

    public String getSubtitle() {
        return this.mSubtitle;
    }

    public int getSubtitleTextColor() {
        return this.mSubtitleTextColor;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int getTitleTextColor() {
        return this.mTitleTextColor;
    }

    public int getViewType() {
        return R.id.view_type_explore_header;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.TITLE_TEXT_COLOR.equals(str)) {
            this.mTitleTextColor = C15562d.m25182T(BaseModel.parseString(jsonParser));
            return true;
        } else if (ResponseConstants.SUB_TITLE.equals(str)) {
            this.mSubtitle = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.SUB_TITLE_TEXT_COLOR.equals(str)) {
            this.mSubtitleTextColor = C15562d.m25182T(BaseModel.parseString(jsonParser));
            return true;
        } else if (ResponseConstants.IMAGE.equals(str)) {
            this.mImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
            return true;
        } else if (!ResponseConstants.BACKGROUND_COLOR.equals(str)) {
            return false;
        } else {
            this.mBackgroundColor = C15562d.m25182T(BaseModel.parseString(jsonParser));
            return true;
        }
    }
}
