package com.etsy.android.p327ui.user.addresses;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.Country;
import com.etsy.android.p327ui.util.countries.CountrySelectorFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.user.addresses.AddressCountrySelectorFragment */
public final class AddressCountrySelectorFragment extends CountrySelectorFragment {
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
        return R.string.country;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCountrySelected(Country country) {
        C19383o.m32797g(country, "country");
        C19388s.m32892w0(this, "REQUEST_COUNTRY_SELECTED", C19382n.m32717K(new Pair("KEY_SELECTED_COUNTRY_ID", Integer.valueOf(country.getCountryId())), new Pair("KEY_SELECTED_COUNTRY_NAME", country.getName())));
        C12788a.m20426e(getActivity());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            getViewModel().mo38038b(arguments.getInt("KEY_ADDRESS_PRESELECTED_COUNTRY"));
        }
    }
}
