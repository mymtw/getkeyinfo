package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ColorPairModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.finds.FindsModule;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EditorialCard extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = -127;
    private Image backgroundImage;
    private String backgroundImageColorDark;
    private String backgroundImageColorLight;
    private String cta;
    private Image image;
    private String subtitle;
    private String text;
    private String title;
    private String url;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Image getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getBackgroundImageColorDark() {
        return this.backgroundImageColorDark;
    }

    public final String getBackgroundImageColorLight() {
        return this.backgroundImageColorLight;
    }

    public final String getCta() {
        return this.cta;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int getViewType() {
        return R.id.view_type_finds_editorial;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -2060497896:
                if (!str.equals("subtitle")) {
                    return false;
                }
                this.subtitle = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 98832:
                if (!str.equals(FindsModule.FIELD_CTA)) {
                    return false;
                }
                this.cta = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 116079:
                if (!str.equals("url")) {
                    return false;
                }
                this.url = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 3556653:
                if (!str.equals("text")) {
                    return false;
                }
                this.text = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 100313435:
                if (!str.equals(ResponseConstants.IMAGE)) {
                    return false;
                }
                this.image = (Image) BaseModel.Companion.parseObject(jsonParser, Image.class);
                return true;
            case 110371416:
                if (!str.equals("title")) {
                    return false;
                }
                this.title = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 764360331:
                if (!str.equals(ResponseConstants.BACKGROUND_IMAGE_COLOR_PAIR)) {
                    return false;
                }
                ColorPairModel colorPairModel = (ColorPairModel) BaseModel.Companion.parseObject(jsonParser, ColorPairModel.class);
                if (colorPairModel == null) {
                    return true;
                }
                this.backgroundImageColorLight = colorPairModel.getBackgroundColorDefault();
                this.backgroundImageColorDark = colorPairModel.getBackgroundColorDark();
                return true;
            case 2042251018:
                if (!str.equals(ResponseConstants.BACKGROUND_IMAGE)) {
                    return false;
                }
                this.backgroundImage = (Image) BaseModel.Companion.parseObject(jsonParser, Image.class);
                return true;
            default:
                return false;
        }
    }

    public final void setBackgroundImage(Image image2) {
        this.backgroundImage = image2;
    }

    public final void setBackgroundImageColorDark(String str) {
        this.backgroundImageColorDark = str;
    }

    public final void setBackgroundImageColorLight(String str) {
        this.backgroundImageColorLight = str;
    }

    public final void setCta(String str) {
        this.cta = str;
    }

    public final void setImage(Image image2) {
        this.image = image2;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
