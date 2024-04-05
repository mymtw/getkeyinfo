package com.etsy.android.p327ui.search.filters;

import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;

/* renamed from: com.etsy.android.ui.search.filters.a */
public final /* synthetic */ class C10755a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f23701b;

    /* renamed from: c */
    public final /* synthetic */ int f23702c;

    /* renamed from: d */
    public final /* synthetic */ TrackingBaseFragment f23703d;

    public /* synthetic */ C10755a(TrackingBaseFragment trackingBaseFragment, int i, int i2) {
        this.f23701b = i2;
        this.f23703d = trackingBaseFragment;
        this.f23702c = i;
    }

    public final void run() {
        switch (this.f23701b) {
            case 0:
                SearchFiltersV2Fragment.m35031buildContentToggle$lambda33$lambda31((SearchFiltersV2Fragment) this.f23703d, this.f23702c);
                return;
            default:
                SearchResultsListingsFragment.m35041handleListingRecentlyViewed$lambda18$lambda17((SearchResultsListingsFragment) this.f23703d, this.f23702c);
                return;
        }
    }
}
