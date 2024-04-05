package com.etsy.android.p327ui.core.review;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.uikit.zoom.C12032d;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.review.a */
public final class C9710a implements C12032d {

    /* renamed from: a */
    public final /* synthetic */ ListingReviewPagerAdapter f21489a;

    public C9710a(ListingReviewPagerAdapter listingReviewPagerAdapter) {
        this.f21489a = listingReviewPagerAdapter;
    }

    /* renamed from: a */
    public final void mo32487a(View view) {
        C19383o.m32797g(view, "target");
        this.f21489a.f21478d.mo21333d("listing_review_image_fullscreen_zoom", (Map<? extends AnalyticsProperty, Object>) null);
    }

    /* renamed from: b */
    public final void mo32488b(View view) {
        C19383o.m32797g(view, "target");
    }
}
