package com.etsy.android.p327ui.search.filters;

import android.os.Bundle;
import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10984a;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10986c;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$onViewCreated$4 */
public final class SearchFiltersV2Fragment$onViewCreated$4 extends Lambda implements C19861p<String, Bundle, C19394m> {
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$onViewCreated$4(SearchFiltersV2Fragment searchFiltersV2Fragment) {
        super(2);
        this.this$0 = searchFiltersV2Fragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Bundle) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, Bundle bundle) {
        C19383o.m32797g(str, "<anonymous parameter 0>");
        C19383o.m32797g(bundle, "bundle");
        FilterCountry filterCountry = (FilterCountry) bundle.getParcelable("ARG_FILTER_COUNTRY");
        if (filterCountry != null) {
            C10767e viewModel = this.this$0.getViewModel();
            viewModel.getClass();
            viewModel.f23758w.onNext(filterCountry);
            SearchFiltersV2Type searchFiltersV2Type = SearchFiltersV2Type.SHIPS_TO;
            viewModel.f23761z.onNext(new C10984a(viewModel.mo35742e(searchFiltersV2Type), new C11016s.C11023g(filterCountry.getDisplayName())));
            viewModel.f23728A.onNext(new C10986c(new C10987d.C10989b(viewModel.f23734G.get(searchFiltersV2Type)), viewModel.mo35741c(), new C11016s.C11023g(filterCountry.getDisplayName()), Boolean.TRUE));
            viewModel.f23731D.setShipsTo(filterCountry.getCountryCode(), filterCountry.getDisplayName());
            viewModel.mo35748l();
        }
    }
}
