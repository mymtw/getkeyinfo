package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SavedForLaterCarouselHeader extends BaseActionableItem {
    public static final int $stable = 8;
    private static final String BADGE_COUNT = "badge_count";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private int badgeCount;
    private String title = "";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getBadgeCount() {
        return this.badgeCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public int getViewType() {
        return R.id.view_type_multishop_saved_for_later_carousel_header;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, "title")) {
            this.title = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (!C19383o.m32792b(str, BADGE_COUNT)) {
            return super.parseField(jsonParser, str);
        } else {
            this.badgeCount = jsonParser.getIntValue();
            return true;
        }
    }

    public final void setBadgeCount(int i) {
        this.badgeCount = i;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }
}
