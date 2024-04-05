package com.etsy.android.p327ui.search.listingresults;

import android.content.SharedPreferences;
import com.etsy.android.p327ui.search.listingresults.C10909i;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.flow.StateFlowImpl;

/* renamed from: com.etsy.android.ui.search.listingresults.k */
public final /* synthetic */ class C10923k implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SearchResultsListingsViewModel f24234a;

    public /* synthetic */ C10923k(SearchResultsListingsViewModel searchResultsListingsViewModel) {
        this.f24234a = searchResultsListingsViewModel;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Object value;
        SearchResultsListingsViewModel searchResultsListingsViewModel = this.f24234a;
        C19383o.m32797g(searchResultsListingsViewModel, "this$0");
        C19383o.m32797g(sharedPreferences, "sharedPreferences");
        C19383o.m32797g(str, "key");
        boolean z = true;
        if (C19383o.m32792b("show3x3viewTry2", str)) {
            searchResultsListingsViewModel.mo36202i(sharedPreferences.getBoolean(str, true));
        }
        SearchResultsListingsState.ViewMode viewMode = ((SearchResultsListingsState) searchResultsListingsViewModel.f24191u.getValue()).f24167n;
        SearchResultsListingsState.ViewMode viewMode2 = SearchResultsListingsState.ViewMode.THREE_BY_THREE;
        if (viewMode != viewMode2) {
            z = false;
        }
        if (!z) {
            viewMode2 = SearchResultsListingsState.ViewMode.TWO_BY_TWO;
        }
        StateFlowImpl stateFlowImpl = searchResultsListingsViewModel.f24190t;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, ((SearchResultsListingsState) value).mo36191a(new C10909i.C10912c(viewMode2))));
    }
}
