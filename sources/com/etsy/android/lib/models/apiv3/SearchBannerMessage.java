package com.etsy.android.lib.models.apiv3;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class SearchBannerMessage extends BaseActionableItem {
    public static final int $stable = 8;
    private String deepLink;
    private DisplayFormat displayFormat;
    private Images images;
    private String subtext;
    private String text;

    public enum DisplayFormat {
        GiftCardBanner("buy_gift_card_tapped");
        
        private final String analyticsName;

        private DisplayFormat(String str) {
            this.analyticsName = str;
        }

        public final String getAnalyticsName() {
            return this.analyticsName;
        }
    }

    public static final class Images extends BaseFieldModel {
        public static final int $stable = 8;
        private String image1x;
        private String image2x;
        private String image3x;

        public final String getImage1x() {
            return this.image1x;
        }

        public final String getImage2x() {
            return this.image2x;
        }

        public final String getImage3x() {
            return this.image3x;
        }

        public final String getImageForDensity(Context context) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            int i = context.getResources().getDisplayMetrics().densityDpi;
            return i >= 480 ? this.image3x : i >= 320 ? this.image2x : i >= Integer.MIN_VALUE ? this.image1x : this.image3x;
        }

        public boolean parseField(JsonParser jsonParser, String str) {
            int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
            if (c != 1639) {
                if (c != 1670) {
                    if (c == 1701 && str.equals(ResponseConstants.IMAGE_3X)) {
                        this.image3x = BaseModel.Companion.parseString(jsonParser);
                        return true;
                    }
                } else if (str.equals(ResponseConstants.IMAGE_2X)) {
                    this.image2x = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
            } else if (str.equals(ResponseConstants.IMAGE_1X)) {
                this.image1x = BaseModel.Companion.parseString(jsonParser);
                return true;
            }
            return false;
        }

        public final void setImage1x(String str) {
            this.image1x = str;
        }

        public final void setImage2x(String str) {
            this.image2x = str;
        }

        public final void setImage3x(String str) {
            this.image3x = str;
        }
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final DisplayFormat getDisplayFormat() {
        return this.displayFormat;
    }

    public final Images getImages() {
        return this.images;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getText() {
        return this.text;
    }

    public int getViewType() {
        return R.id.view_type_search_banner;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -1867586707:
                if (str.equals(ResponseConstants.SUBTEXT2)) {
                    this.subtext = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case -1185250696:
                if (str.equals("images")) {
                    this.images = (Images) BaseModel.Companion.parseObject(jsonParser, Images.class);
                    return true;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    this.text = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 629233382:
                if (str.equals("deeplink")) {
                    this.deepLink = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 1399053844:
                if (str.equals(ResponseConstants.DISPLAY_FORMAT)) {
                    this.displayFormat = jsonParser.getIntValue() == 1 ? DisplayFormat.GiftCardBanner : DisplayFormat.GiftCardBanner;
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setDeepLink(String str) {
        this.deepLink = str;
    }

    public final void setDisplayFormat(DisplayFormat displayFormat2) {
        this.displayFormat = displayFormat2;
    }

    public final void setImages(Images images2) {
        this.images = images2;
    }

    public final void setSubtext(String str) {
        this.subtext = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
