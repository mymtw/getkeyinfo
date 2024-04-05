package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.DeepLink;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NavigationalPageHeader extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ITEM_TYPE = "navigationalPageHeader";
    private DeepLink deepLink;
    private String title;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public final String getTitle() {
        return this.title;
    }

    public int getViewType() {
        return R.id.view_type_navigational_page_header;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, "title")) {
            this.title = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (!C19383o.m32792b(str, ResponseConstants.DEEP_LINK)) {
            return false;
        } else {
            this.deepLink = (DeepLink) BaseModel.Companion.parseObject(jsonParser, DeepLink.class);
            return true;
        }
    }

    public final void setDeepLink(DeepLink deepLink2) {
        this.deepLink = deepLink2;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
