package com.etsy.android.lib.models.homescreen;

import com.etsy.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RelatedTagLink extends LandingPageLink {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ITEM_TYPE = "tagLandingPageLink";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public String getPageTitle() {
        return getTitle();
    }

    public int getViewType() {
        return R.id.view_type_horizontal_related_link_tag;
    }
}
