package com.etsy.android.p327ui.search.listingresults;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12788a;
import p356ge.C12790b;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$createSimplifiedQueryView$1 */
public final class SearchResultsListingsFragment$createSimplifiedQueryView$1 extends TrackingOnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ String $query;
    public final /* synthetic */ SearchResultsListingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsFragment$createSimplifiedQueryView$1(String str, SearchResultsListingsFragment searchResultsListingsFragment, FragmentActivity fragmentActivity, PredefinedAnalyticsProperty predefinedAnalyticsProperty) {
        super((AnalyticsProperty) predefinedAnalyticsProperty, (Object) str);
        this.$query = str;
        this.this$0 = searchResultsListingsFragment;
        this.$activity = fragmentActivity;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        C12788a.m20424c(this.$activity, new SearchContainerKey(C12790b.m20432d(this.this$0), new SearchSpec(this.$query, (Long) null, (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1022, (DefaultConstructorMarker) null), (SearchRedirectSpec) null, (Bundle) null, 12, (DefaultConstructorMarker) null));
    }
}
