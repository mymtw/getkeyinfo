package com.etsy.android.p327ui.search.countryselector;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.Country;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import com.etsy.android.p327ui.util.countries.CountrySelectorFragment;
import com.etsy.android.p327ui.util.countries.CountrySelectorViewModel;
import com.etsy.android.uikit.BaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.search.countryselector.SearchCountrySelectorFragment */
public final class SearchCountrySelectorFragment extends CountrySelectorFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getFragmentTitle() {
        return R.string.search_filter_ships_to_title;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "filters_v2_country_selector_screen";
    }

    public void onCountrySelected(Country country) {
        C19383o.m32797g(country, "country");
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_FILTER_COUNTRY", new FilterCountry(country.getName(), country.getIsoCountryCode()));
        C19394m mVar = C19394m.f43287a;
        C19388s.m32892w0(this, "COUNTRY_SELECTED", bundle);
        C12788a.m20426e(getActivity());
    }

    public void onStop() {
        super.onStop();
        getDisposable().mo19405d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        FilterCountry filterCountry;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activity;
            baseActivity.getAppBarHelper().setTitle(getFragmentTitle());
            baseActivity.getAppBarHelper().setHomeAsUpEnabled(true);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (filterCountry = (FilterCountry) arguments.getParcelable("ARG_FILTER_COUNTRY")) != null) {
            CountrySelectorViewModel viewModel = getViewModel();
            Country country = new Country(0, filterCountry.getDisplayName(), filterCountry.getCountryCode(), (String) null, (String) null, 25, (DefaultConstructorMarker) null);
            viewModel.getClass();
            viewModel.f26232f.onNext(country);
        }
    }

    public C11324t.C11325a.C11327b getBottomTabsOverrides() {
        return C11324t.C11325a.C11327b.f24989c;
    }
}
