package com.etsy.android.lib.models.apiv3;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.play.core.appupdate.C15562d;
import java.io.IOException;

public class Banner extends BaseFieldModel {
    public static final String ANIMATION_NONE = "none";
    public static final String ANIMATION_SLIDE_FROM_LEFT = "slide_from_left";
    private static final long serialVersionUID = 6672552830457367349L;
    public String mAnimation = "none";
    public int mBackgroundColor = -1;
    public BannerButton mButtonPrimary;
    public BannerButton mButtonSecondary;
    public int mDismissButtonColor = -1;
    public Image mImage;
    public String mMessage = "";
    public int mPlaceholderColor = -1;
    public int mTextColor = -1;
    public String mTitle = "";
    public int mViewType = R.id.view_type_hero_banner;

    public String getAnimation() {
        return this.mAnimation;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public BannerButton getButtonPrimary() {
        return this.mButtonPrimary;
    }

    public BannerButton getButtonSecondary() {
        return this.mButtonSecondary;
    }

    public int getDismissButtonColor() {
        return this.mDismissButtonColor;
    }

    public Image getImage() {
        return this.mImage;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public int getPlaceholderColor() {
        return this.mPlaceholderColor;
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int getViewType() {
        return this.mViewType;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        } else if ("message".equals(str)) {
            this.mMessage = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.IMAGE.equals(str)) {
            this.mImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
            return true;
        } else if (ResponseConstants.BUTTON_PRIMARY.equals(str)) {
            this.mButtonPrimary = (BannerButton) BaseModel.parseObject(jsonParser, BannerButton.class);
            return true;
        } else if (ResponseConstants.BUTTON_SECONDARY.equals(str)) {
            this.mButtonSecondary = (BannerButton) BaseModel.parseObject(jsonParser, BannerButton.class);
            return true;
        } else if (ResponseConstants.TEXT_COLOR.equals(str)) {
            this.mTextColor = C15562d.m25182T(BaseModel.parseString(jsonParser));
            return true;
        } else if (ResponseConstants.BACKGROUND_COLOR.equals(str)) {
            this.mBackgroundColor = C15562d.m25182T(BaseModel.parseString(jsonParser));
            return true;
        } else if (ResponseConstants.PLACEHOLDER_COLOR.equals(str)) {
            this.mPlaceholderColor = C15562d.m25182T(BaseModel.parseString(jsonParser));
            return true;
        } else if (ResponseConstants.DISMISS_BUTTON_COLOR.equals(str)) {
            this.mDismissButtonColor = C15562d.m25182T(BaseModel.parseString(jsonParser));
            return true;
        } else if (!ResponseConstants.ANIMATION.equals(str)) {
            return false;
        } else {
            this.mAnimation = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setAnimation(String str) {
        this.mAnimation = str;
    }

    public void setViewType(int i) {
        this.mViewType = i;
    }
}
