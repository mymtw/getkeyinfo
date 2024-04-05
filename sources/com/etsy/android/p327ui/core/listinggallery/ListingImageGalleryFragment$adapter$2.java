package com.etsy.android.p327ui.core.listinggallery;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$adapter$2 */
public final class ListingImageGalleryFragment$adapter$2 extends Lambda implements C19846a<C9643b> {
    public final /* synthetic */ ListingImageGalleryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingImageGalleryFragment$adapter$2(ListingImageGalleryFragment listingImageGalleryFragment) {
        super(0);
        this.this$0 = listingImageGalleryFragment;
    }

    public final C9643b invoke() {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        return new C9643b(requireActivity, this.this$0.getFileSupport(), this.this$0.getEventTracker(), this.this$0);
    }
}
