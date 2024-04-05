package com.etsy.android.lib.models.apiv3;

import android.graphics.Color;
import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p628nj.C18263b;

public final class ExploreBanner extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 6431487970230612168L;
    private int backgroundColor = -1;
    private String deepLinkUrl = "";
    private Image image;
    private String subtitle = "";
    private int subtitleColor = -16777216;
    private String title = "";
    private int titleColor = -16777216;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final int getSubtitleColor() {
        return this.subtitleColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }

    public int getViewType() {
        return R.id.view_type_explore_banner;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", "title", str)) {
            this.title = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
        int i = -1;
        if (C19383o.m32792b(ResponseConstants.TITLE_COLOR, str)) {
            String parseString = BaseModel.Companion.parseString(jsonParser);
            if (C18263b.m30839d0(parseString)) {
                if (parseString.charAt(0) != '#') {
                    parseString = '#' + parseString;
                }
                try {
                    i = Color.parseColor(parseString);
                } catch (IllegalArgumentException unused) {
                }
            }
            this.titleColor = i;
            return true;
        } else if (C19383o.m32792b("subtitle", str)) {
            this.subtitle = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (C19383o.m32792b(ResponseConstants.SUBTITLE_COLOR, str)) {
            String parseString2 = BaseModel.Companion.parseString(jsonParser);
            if (C18263b.m30839d0(parseString2)) {
                if (parseString2.charAt(0) != '#') {
                    parseString2 = '#' + parseString2;
                }
                try {
                    i = Color.parseColor(parseString2);
                } catch (IllegalArgumentException unused2) {
                }
            }
            this.subtitleColor = i;
            return true;
        } else if (C19383o.m32792b(ResponseConstants.BACKGROUND_COLOR, str)) {
            String parseString3 = BaseModel.Companion.parseString(jsonParser);
            if (C18263b.m30839d0(parseString3)) {
                if (parseString3.charAt(0) != '#') {
                    parseString3 = '#' + parseString3;
                }
                try {
                    i = Color.parseColor(parseString3);
                } catch (IllegalArgumentException unused3) {
                }
            }
            this.backgroundColor = i;
            return true;
        } else if (C19383o.m32792b(ResponseConstants.DEEP_LINK_URL, str)) {
            this.deepLinkUrl = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (!C19383o.m32792b(ResponseConstants.IMAGE, str)) {
            return false;
        } else {
            this.image = (Image) BaseModel.Companion.parseObject(jsonParser, Image.class);
            return true;
        }
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setDeepLinkUrl(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.deepLinkUrl = str;
    }

    public final void setImage(Image image2) {
        this.image = image2;
    }

    public final void setSubtitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.subtitle = str;
    }

    public final void setSubtitleColor(int i) {
        this.subtitleColor = i;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }

    public final void setTitleColor(int i) {
        this.titleColor = i;
    }
}
