package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class EmptyCart extends BaseFieldModel {
    public static final int $stable = 8;
    private String deepLinkUrl = "";
    private String linkTitle = "";
    private String subtitle = "";
    private String title = "";

    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
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
        return R.id.view_type_multishop_empty_cart;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -2060497896:
                if (!str.equals("subtitle")) {
                    return false;
                }
                this.subtitle = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 110371416:
                if (!str.equals("title")) {
                    return false;
                }
                this.title = BaseModel.Companion.parseString(jsonParser);
                return true;
            case 523834781:
                if (!str.equals(ResponseConstants.DEEP_LINK_URL)) {
                    return false;
                }
                this.deepLinkUrl = BaseModel.Companion.parseStringURL(jsonParser);
                return true;
            case 1186582995:
                if (!str.equals(ResponseConstants.LINK_TITLE)) {
                    return false;
                }
                this.linkTitle = BaseModel.Companion.parseString(jsonParser);
                return true;
            default:
                return false;
        }
    }

    public final void setDeepLinkUrl(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.deepLinkUrl = str;
    }

    public final void setLinkTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.linkTitle = str;
    }

    public final void setSubtitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }
}
