package com.etsy.android.p327ui.listing;

import com.etsy.android.uikit.AppBarHelper;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.listing.ListingFragment$appBarHelper$2 */
public final class ListingFragment$appBarHelper$2 extends Lambda implements C19846a<AppBarHelper> {
    public final /* synthetic */ ListingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFragment$appBarHelper$2(ListingFragment listingFragment) {
        super(0);
        this.this$0 = listingFragment;
    }

    public final AppBarHelper invoke() {
        return this.this$0.getAppBarHelperProvider().get();
    }
}
