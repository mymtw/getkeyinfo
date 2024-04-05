package com.etsy.android.p327ui.listing;

import android.os.Bundle;
import com.etsy.android.p327ui.core.listinggallery.ListingImageGalleryFragment;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.listing.ListingFragment$onViewCreated$4 */
public final class ListingFragment$onViewCreated$4 extends Lambda implements C19861p<String, Bundle, C19394m> {
    public final /* synthetic */ ListingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFragment$onViewCreated$4(ListingFragment listingFragment) {
        super(2);
        this.this$0 = listingFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Bundle) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, Bundle bundle) {
        C19383o.m32797g(str, "<anonymous parameter 0>");
        C19383o.m32797g(bundle, "bundle");
        this.this$0.getViewModel().mo33464b(new C13597g.C13726s1(bundle.getInt(ListingImageGalleryFragment.SELECTED_IMAGE_POSITION, -1), (ListingVideoPosition) bundle.getParcelable(ListingImageGalleryFragment.LISTING_VIDEO_POSITION)));
        if (bundle.getBoolean(ListingImageGalleryFragment.SCROLL_TO_REVIEWS, false)) {
            this.this$0.getViewModel().mo33464b(C13597g.C13679l3.f30173a);
        }
    }
}
