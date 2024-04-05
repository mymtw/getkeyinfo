package com.etsy.android.p327ui.core.listinggallery;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LandingPageKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.core.listinggallery.ListingImageGalleryFragment$setupVisuallySimilarButton$1$listener$1 */
public final class C9636xef5e56ac extends TrackingOnClickListener {
    public final /* synthetic */ LandingPageLink $landingPageLink;
    public final /* synthetic */ ListingImageGalleryFragment this$0;

    public C9636xef5e56ac(ListingImageGalleryFragment listingImageGalleryFragment, LandingPageLink landingPageLink) {
        this.this$0 = listingImageGalleryFragment;
        this.$landingPageLink = landingPageLink;
    }

    public void onViewClick(View view) {
        this.this$0.getAnalyticsContext().mo21333d("visually_similar_button_tapped", C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.BUTTON_PLACEMENT, "gallery")));
        C12788a.m20424c(this.this$0.getActivity(), new LandingPageKey(C19421p.m32935c0(this.this$0.getActivity()), this.$landingPageLink, (Bundle) null, 4, (DefaultConstructorMarker) null));
    }
}
