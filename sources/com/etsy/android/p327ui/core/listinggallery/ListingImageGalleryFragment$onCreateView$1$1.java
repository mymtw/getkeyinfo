package com.etsy.android.p327ui.core.listinggallery;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$onCreateView$1$1 */
public final class ListingImageGalleryFragment$onCreateView$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ListingImageGalleryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingImageGalleryFragment$onCreateView$1$1(ListingImageGalleryFragment listingImageGalleryFragment) {
        super(1);
        this.this$0 = listingImageGalleryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.getAnalyticsContext().mo21333d("listing_gallery_close_button_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        this.this$0.onImageDismissed();
    }
}
