package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SignedOutMessageCard extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SIGNED_OUT_CART_MESSAGE_CARD_TYPE = "signedOutCartMessageCard";
    private String deeplinkUrl;
    private String imageName;
    private String linkTitle;
    private String subtitle;
    private String title;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getLinkTitle() {
        return this.linkTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int getViewType() {
        return R.id.view_type_signed_out_cart_message_card;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -42298471:
                if (str.equals(ResponseConstants.SUB_TITLE)) {
                    this.subtitle = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 100313435:
                if (str.equals(ResponseConstants.IMAGE)) {
                    this.imageName = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    this.title = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 523834781:
                if (str.equals(ResponseConstants.DEEP_LINK_URL)) {
                    this.deeplinkUrl = BaseModel.Companion.parseStringURL(jsonParser);
                    return true;
                }
                break;
            case 1186582995:
                if (str.equals(ResponseConstants.LINK_TITLE)) {
                    this.linkTitle = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setDeeplinkUrl(String str) {
        this.deeplinkUrl = str;
    }

    public final void setImageName(String str) {
        this.imageName = str;
    }

    public final void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
