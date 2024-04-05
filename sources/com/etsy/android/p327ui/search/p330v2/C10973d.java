package com.etsy.android.p327ui.search.p330v2;

import android.os.Bundle;
import android.os.Parcelable;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.math.BigDecimal;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.search.v2.d */
public final class C10973d {

    /* renamed from: a */
    public final SearchOptions f24336a = new SearchOptions((List) null, false, false, false, false, false, false, false, (SearchOptions.Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);

    /* renamed from: b */
    public List<? extends FacetCount> f24337b = EmptyList.INSTANCE;

    public C10973d(C8618c cVar) {
        C19383o.m32797g(cVar, "configMap");
    }

    /* renamed from: a */
    public final SearchOptions mo36455a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            return SearchOptions.copy$default(this.f24336a, (List) null, false, false, false, false, false, false, false, (SearchOptions.Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (Object) null);
        }
        if (bundle2.containsKey("SEARCH_OPTIONS")) {
            Parcelable parcelable = bundle2.getParcelable("SEARCH_OPTIONS");
            C19383o.m32794d(parcelable);
            SearchOptions searchOptions = (SearchOptions) parcelable;
            bundle2.remove("SEARCH_OPTIONS");
            return searchOptions;
        } else if (!bundle2.containsKey("SEARCH_OPTIONS_FILTERS_V2")) {
            return SearchOptions.copy$default(this.f24336a, (List) null, false, false, false, false, false, false, false, (SearchOptions.Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (Object) null);
        } else {
            Parcelable parcelable2 = bundle2.getParcelable("SEARCH_OPTIONS_FILTERS_V2");
            C19383o.m32794d(parcelable2);
            return (SearchOptions) parcelable2;
        }
    }
}
