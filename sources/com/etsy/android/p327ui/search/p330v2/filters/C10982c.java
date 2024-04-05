package com.etsy.android.p327ui.search.p330v2.filters;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.lifecycle.C2866i0;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.apiv3.FacetCountListMap;
import com.etsy.android.lib.models.apiv3.filters.StaticFilters;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.p330v2.C10973d;
import com.etsy.android.p327ui.search.p330v2.SearchFacetCountUtilsKt;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.C10980b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.subjects.PublishSubject;
import p414oe.C13164c;

/* renamed from: com.etsy.android.ui.search.v2.filters.c */
public final class C10982c extends C2866i0 {

    /* renamed from: b */
    public final Resources f24346b;

    /* renamed from: c */
    public final C8629a f24347c;

    /* renamed from: d */
    public final C10973d f24348d;

    /* renamed from: e */
    public final C8630b f24349e;

    /* renamed from: f */
    public final C13164c f24350f;

    /* renamed from: g */
    public FacetCountListMap f24351g;

    /* renamed from: h */
    public List<Integer> f24352h;

    /* renamed from: i */
    public StaticFilters f24353i;

    /* renamed from: j */
    public List<C10978a> f24354j = mo36466c();

    /* renamed from: k */
    public SearchOptions f24355k;

    /* renamed from: l */
    public final PublishSubject<SearchOptions> f24356l = new PublishSubject<>();

    /* renamed from: m */
    public final PublishSubject<SearchOptions> f24357m = new PublishSubject<>();

    /* renamed from: n */
    public final FilterFormatter f24358n = new FilterFormatter();

    public C10982c(Resources resources, C8629a aVar, C10973d dVar, C8630b bVar, C13164c cVar) {
        C19383o.m32797g(resources, "resources");
        C19383o.m32797g(aVar, "appCurrency");
        C19383o.m32797g(dVar, "optionsRepository");
        C19383o.m32797g(bVar, "moneyFactory");
        C19383o.m32797g(cVar, "priceFilterHelper");
        this.f24346b = resources;
        this.f24347c = aVar;
        this.f24348d = dVar;
        this.f24349e = bVar;
        this.f24350f = cVar;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f24352h = emptyList;
        this.f24354j = emptyList;
        this.f24355k = dVar.mo36455a((Bundle) null);
    }

    /* renamed from: b */
    public final void mo36465b(C10978a aVar) {
        Object obj;
        boolean z;
        ArrayList q1 = C19327t.m32661q1(this.f24354j);
        Iterator it = q1.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C10978a) obj).f24343b == aVar.f24343b) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (((C10978a) obj) == null) {
            q1.add(aVar);
        }
        this.f24354j = C19327t.m32660p1(q1);
    }

    /* renamed from: c */
    public final ArrayList mo36466c() {
        String str;
        ArrayList arrayList = new ArrayList();
        if (this.f24355k.hasCategoryFacets()) {
            SearchOptions searchOptions = this.f24355k;
            C19383o.m32797g(searchOptions, "searchOptions");
            arrayList.add(new C10978a(SearchFacetCountUtilsKt.m18946a(searchOptions), FilterType.FILTER_CATEGORY));
        }
        if (this.f24355k.hasMarketplace()) {
            SearchOptions searchOptions2 = this.f24355k;
            Resources resources = this.f24346b;
            C19383o.m32797g(searchOptions2, "searchOptions");
            C19383o.m32797g(resources, "resources");
            SearchOptions.MarketPlace marketplace = searchOptions2.getMarketplace();
            C19383o.m32797g(marketplace, "marketplace");
            int i = C10980b.C10981a.f24345a[marketplace.ordinal()];
            if (i == 1) {
                str = resources.getString(R.string.vintage);
                C19383o.m32796f(str, "resources.getString(R.string.vintage)");
            } else if (i != 2) {
                str = resources.getString(R.string.all_items);
                C19383o.m32796f(str, "resources.getString(R.string.all_items)");
            } else {
                str = resources.getString(R.string.handmade);
                C19383o.m32796f(str, "resources.getString(R.string.handmade)");
            }
            arrayList.add(new C10978a(str, FilterType.FILTER_MARKETPLACE));
        }
        if (this.f24355k.hasSortOrder()) {
            Resources resources2 = this.f24346b;
            SortOrder sortOrder = this.f24355k.getSortOrder();
            C19383o.m32797g(resources2, "resources");
            C19383o.m32797g(sortOrder, "sortOrder");
            SortOrder.Companion.getClass();
            String string = resources2.getString(R.string.new_search_sorted_by_desc, new Object[]{SortOrder.C10730a.m18621a(resources2, sortOrder)});
            C19383o.m32796f(string, "resources.getString(\n   …ces, sortOrder)\n        )");
            arrayList.add(new C10978a(string, FilterType.OPTION_SORT_ORDER));
        }
        if (this.f24355k.hasMinPrice() || this.f24355k.hasMaxPrice()) {
            SearchOptions searchOptions3 = this.f24355k;
            arrayList.add(C10980b.m18955a(searchOptions3, searchOptions3.hasMaxPrice(), this.f24346b, this.f24347c, this.f24349e));
        }
        if (this.f24355k.hasShipsToCountry()) {
            SearchOptions searchOptions4 = this.f24355k;
            Resources resources3 = this.f24346b;
            C19383o.m32797g(searchOptions4, "searchOptions");
            C19383o.m32797g(resources3, "resources");
            String string2 = resources3.getString(R.string.new_search_empty_view_ships_to_desc, new Object[]{searchOptions4.getShipsToCountryName()});
            C19383o.m32796f(string2, "resources.getString(\n   …psToCountryName\n        )");
            arrayList.add(new C10978a(string2, FilterType.FILTER_SHIPS_TO));
        }
        if (this.f24355k.getAcceptsGiftCards()) {
            Resources resources4 = this.f24346b;
            C19383o.m32797g(resources4, "resources");
            String string3 = resources4.getString(R.string.new_search_empty_view_gift_cards_desc);
            C19383o.m32796f(string3, "resources.getString(R.st…pty_view_gift_cards_desc)");
            arrayList.add(new C10978a(string3, FilterType.FILTER_GIFT_CARDS));
        }
        if (!this.f24355k.getShopLocation().isAnywhere()) {
            SearchOptions searchOptions5 = this.f24355k;
            Resources resources5 = this.f24346b;
            C19383o.m32797g(searchOptions5, "searchOptions");
            C19383o.m32797g(resources5, "resources");
            String string4 = resources5.getString(R.string.new_search_empty_view_shop_location_desc, new Object[]{searchOptions5.getShopLocation().getLocation(resources5)});
            C19383o.m32796f(string4, "resources.getString(\n   …tion(resources)\n        )");
            arrayList.add(new C10978a(string4, FilterType.FILTER_SHOP_LOCATION));
        }
        if (this.f24355k.getOnSale()) {
            Resources resources6 = this.f24346b;
            C19383o.m32797g(resources6, "resources");
            String string5 = resources6.getString(R.string.new_search_filter_onsale);
            C19383o.m32796f(string5, "resources.getString(R.st…new_search_filter_onsale)");
            arrayList.add(new C10978a(string5, FilterType.FILTER_ONSALE));
        }
        if (this.f24355k.getFreeShipping()) {
            Resources resources7 = this.f24346b;
            C19383o.m32797g(resources7, "resources");
            String string6 = resources7.getString(R.string.new_search_filter_free_shipping);
            C19383o.m32796f(string6, "resources.getString(R.st…rch_filter_free_shipping)");
            arrayList.add(new C10978a(string6, FilterType.FILTER_FREE_SHIPPING));
        }
        if (this.f24355k.getOneDayShipping()) {
            Resources resources8 = this.f24346b;
            C19383o.m32797g(resources8, "resources");
            String string7 = resources8.getString(R.string.new_search_filter_1_day_shipping);
            C19383o.m32796f(string7, "resources.getString(R.st…ch_filter_1_day_shipping)");
            arrayList.add(new C10978a(string7, FilterType.FILTER_1_DAY_SHIPPING));
        }
        if (this.f24355k.getThreeDayShipping()) {
            Resources resources9 = this.f24346b;
            C19383o.m32797g(resources9, "resources");
            String string8 = resources9.getString(R.string.new_search_filter_3_day_shipping);
            C19383o.m32796f(string8, "resources.getString(R.st…ch_filter_3_day_shipping)");
            arrayList.add(new C10978a(string8, FilterType.FILTER_3_DAY_SHIPPING));
        }
        if (this.f24355k.getCustomizable()) {
            Resources resources10 = this.f24346b;
            C19383o.m32797g(resources10, "resources");
            String string9 = resources10.getString(R.string.new_search_filter_customizable);
            C19383o.m32796f(string9, "resources.getString(R.st…arch_filter_customizable)");
            arrayList.add(new C10978a(string9, FilterType.FILTER_CUSTOMIZABLE));
        }
        if (this.f24355k.getGiftWrap()) {
            Resources resources11 = this.f24346b;
            C19383o.m32797g(resources11, "resources");
            String string10 = resources11.getString(R.string.new_search_filter_gift_wrapped);
            C19383o.m32796f(string10, "resources.getString(R.st…arch_filter_gift_wrapped)");
            arrayList.add(new C10978a(string10, FilterType.FILTER_GIFT_WRAP));
        }
        return arrayList;
    }
}
