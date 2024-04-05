package com.etsy.android.p327ui;

import android.content.res.Resources;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.SearchFABScrollBehavior$shrinkDelay$2 */
public final class SearchFABScrollBehavior$shrinkDelay$2 extends Lambda implements C19846a<Integer> {
    public final /* synthetic */ Resources $resources;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFABScrollBehavior$shrinkDelay$2(Resources resources) {
        super(0);
        this.$resources = resources;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.$resources.getDimensionPixelSize(R.dimen.search_fab_scroll_delay));
    }
}
