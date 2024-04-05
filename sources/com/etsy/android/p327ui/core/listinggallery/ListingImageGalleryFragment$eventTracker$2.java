package com.etsy.android.p327ui.core.listinggallery;

import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.uikit.view.C11951f;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$eventTracker$2 */
public final class ListingImageGalleryFragment$eventTracker$2 extends Lambda implements C19846a<C11951f> {
    public final /* synthetic */ ListingImageGalleryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingImageGalleryFragment$eventTracker$2(ListingImageGalleryFragment listingImageGalleryFragment) {
        super(0);
        this.this$0 = listingImageGalleryFragment;
    }

    public final C11951f invoke() {
        C8703p analyticsContext = this.this$0.getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        return new C11951f(analyticsContext);
    }
}
