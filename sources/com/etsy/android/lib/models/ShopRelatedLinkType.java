package com.etsy.android.lib.models;

import android.text.TextUtils;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;

public enum ShopRelatedLinkType {
    FACEBOOK(R.string.facebook, "facebook"),
    TWITTER(R.string.twitter, ShopRelatedLink.TWITTER_TITLE),
    INSTAGRAM(R.string.instagram, ShopRelatedLink.INSTAGRAM_TITLE),
    PINTEREST(R.string.pinterest, ShopRelatedLink.PINTEREST_TITLE),
    BLOG(R.string.shop_blog, ShopRelatedLink.SHOP_BLOG_TITLE),
    WEBSITE(R.string.shop_website, ShopRelatedLink.SHOP_WEBSITE_TITLE);
    
    public static final Companion Companion = null;
    private String fieldTitle;
    private int resName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ShopRelatedLinkType fromTitleField(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (ShopRelatedLinkType shopRelatedLinkType : ShopRelatedLinkType.values()) {
                if (C19457k.m33019W0(shopRelatedLinkType.getFieldTitle(), str, true)) {
                    return shopRelatedLinkType;
                }
            }
            return null;
        }

        public final int displayTitleResFromFieldName(String str) {
            ShopRelatedLinkType fromTitleField = fromTitleField(str);
            if (fromTitleField != null) {
                return fromTitleField.getResName();
            }
            return -1;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private ShopRelatedLinkType(int i, String str) {
        this.resName = i;
        this.fieldTitle = str;
    }

    public final String getFieldTitle() {
        return this.fieldTitle;
    }

    public final int getResName() {
        return this.resName;
    }

    public final void setFieldTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.fieldTitle = str;
    }

    public final void setResName(int i) {
        this.resName = i;
    }
}
