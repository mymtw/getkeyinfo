package com.etsy.android.p327ui.search.filters.refactor;

import android.content.res.Resources;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p391le.C13016a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.filters.refactor.z */
public final class C10863z {

    /* renamed from: a */
    public final Locale f24092a;

    public C10863z() {
        Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
        C19383o.m32796f(locale, "getSystem().configuration.locales.get(0)");
        this.f24092a = locale;
    }

    /* renamed from: a */
    public final SearchOptions mo36067a(C10855s sVar) {
        C10802f fVar;
        List list;
        BigDecimal bigDecimal;
        SearchOptions.Location location;
        BigDecimal bigDecimal2;
        String str;
        String str2;
        SortOrder sortOrder;
        SearchOptions.MarketPlace marketPlace;
        String str3;
        String merchSectionId;
        String merchCollectionId;
        String merchOnSearchVariant;
        String pctDiscountMin;
        String pctDiscountMax;
        SearchOptions.Location location2;
        C10798d dVar;
        C10798d dVar2;
        C10798d dVar3;
        C10798d dVar4;
        C10855s sVar2 = sVar;
        C10856t tVar = sVar2.f24058a;
        FilterParams filterParams = sVar2.f24059b;
        SearchOptions searchOptions = filterParams != null ? filterParams.getSearchOptions() : null;
        SearchFiltersUiGroupItem.C10782c cVar = tVar.f24066d;
        if (cVar != null) {
            fVar = cVar.mo35833h();
        } else {
            SearchFiltersUiGroupItem.C10783d dVar5 = tVar.f24067e;
            fVar = dVar5 != null ? dVar5.mo35841i() : null;
        }
        FacetCount facetCount = sVar2.f24060c;
        SearchFiltersUiGroupItem.C10781b bVar = tVar.f24064b;
        ArrayList e0 = C19388s.m32860e0(facetCount, bVar != null ? bVar.mo35828f() : null);
        if (e0 == null) {
            list = EmptyList.INSTANCE;
        } else {
            ArrayList q1 = C19327t.m32661q1(e0);
            FacetCount facetCount2 = (FacetCount) C19327t.m32640V0(q1);
            list = q1;
            if (C19383o.m32792b(facetCount2 != null ? facetCount2.getId() : null, "top-level-facets")) {
                if (!q1.isEmpty()) {
                    q1.remove(0);
                    list = q1;
                } else {
                    throw new NoSuchElementException("List is empty.");
                }
            }
        }
        List list2 = list;
        SearchFiltersUiGroupItem.OtherOptions otherOptions = tVar.f24072j;
        boolean z = (otherOptions == null || (dVar4 = otherOptions.f23818d) == null) ? false : dVar4.f23922d;
        SearchFiltersUiGroupItem.Shipping shipping = tVar.f24068f;
        boolean z2 = shipping != null ? shipping.f23826e : false;
        boolean z3 = shipping != null ? shipping.f23828g : false;
        boolean z4 = shipping != null ? shipping.f23829h : false;
        boolean z5 = (otherOptions == null || (dVar3 = otherOptions.f23819e) == null) ? false : dVar3.f23922d;
        boolean z6 = (otherOptions == null || (dVar2 = otherOptions.f23820f) == null) ? false : dVar2.f23922d;
        boolean z7 = (otherOptions == null || (dVar = otherOptions.f23821g) == null) ? false : dVar.f23922d;
        SearchFiltersUiGroupItem.C10785f fVar2 = tVar.f24070h;
        if (fVar2 == null) {
            bigDecimal = null;
            location = new SearchOptions.Location((String) null, (SearchOptions.Location.LocationType) null, 3, (DefaultConstructorMarker) null);
        } else {
            if (fVar2.f23875e.f23930c) {
                location2 = new SearchOptions.Location(tVar.f24070h.f23875e.f23929b, SearchOptions.Location.LocationType.LOCAL);
            } else {
                C10793c0 c0Var = fVar2.f23876f;
                if (!c0Var.f23909c || !C18263b.m30839d0(c0Var.f23910d)) {
                    bigDecimal = null;
                    location = new SearchOptions.Location((String) null, SearchOptions.Location.LocationType.ANYWHERE, 1, (DefaultConstructorMarker) null);
                } else {
                    location2 = new SearchOptions.Location(tVar.f24070h.f23876f.f23910d, SearchOptions.Location.LocationType.CUSTOM);
                }
            }
            location = location2;
            bigDecimal = null;
        }
        if (fVar == null || (bigDecimal2 = fVar.f23932a) == null) {
            bigDecimal2 = SearchOptions.DEFAULT_LOW_PRICE;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        BigDecimal bigDecimal4 = fVar != null ? fVar.f23933b : bigDecimal;
        boolean z8 = fVar != null ? fVar.f23935d : false;
        boolean z9 = fVar != null ? fVar.f23934c : false;
        SearchFiltersUiGroupItem.C10784e eVar = tVar.f24069g;
        if (eVar == null || (str = eVar.f23870e) == null) {
            str = this.f24092a.getCountry();
        }
        C19383o.m32796f(str, "filters.shipsTo?.country…e ?: systemLocale.country");
        SearchFiltersUiGroupItem.C10784e eVar2 = tVar.f24069g;
        if (eVar2 == null || (str2 = eVar2.f23869d) == null) {
            str2 = this.f24092a.getDisplayCountry();
        }
        C19383o.m32796f(str2, "filters.shipsTo?.country…stemLocale.displayCountry");
        SearchFiltersUiGroupItem.SortBy sortBy = tVar.f24063a;
        if (sortBy == null || (sortOrder = sortBy.mo35824h()) == null) {
            SortOrder.Companion.getClass();
            sortOrder = SortOrder.DEFAULT;
        }
        SortOrder sortOrder2 = sortOrder;
        SearchFiltersUiGroupItem.ItemType itemType = tVar.f24065c;
        if (itemType == null || (marketPlace = itemType.mo35803h()) == null) {
            marketPlace = SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS;
        }
        SearchOptions.MarketPlace marketPlace2 = marketPlace;
        if (searchOptions == null || (str3 = searchOptions.getSpellingCorrectionShowOriginal()) == null) {
            str3 = "";
        }
        boolean categoryProlist = searchOptions != null ? searchOptions.getCategoryProlist() : true;
        String str4 = (searchOptions == null || (pctDiscountMax = searchOptions.getPctDiscountMax()) == null) ? "" : pctDiscountMax;
        String str5 = (searchOptions == null || (pctDiscountMin = searchOptions.getPctDiscountMin()) == null) ? "" : pctDiscountMin;
        FilterParams filterParams2 = sVar2.f24059b;
        String query = filterParams2 != null ? filterParams2.getQuery() : null;
        if (query == null) {
            query = "";
        }
        return new SearchOptions(list2, z, z2, z3, z4, z5, z6, z7, location, bigDecimal3, bigDecimal4, z8, z9, str, str2, sortOrder2, marketPlace2, str3, categoryProlist, str4, str5, query, C13016a.C13017a.m20733a(tVar.mo36034c()), 0, searchOptions != null ? searchOptions.isMerchLibrary() : false, (searchOptions == null || (merchOnSearchVariant = searchOptions.getMerchOnSearchVariant()) == null) ? "" : merchOnSearchVariant, (searchOptions == null || (merchCollectionId = searchOptions.getMerchCollectionId()) == null) ? "" : merchCollectionId, (searchOptions == null || (merchSectionId = searchOptions.getMerchSectionId()) == null) ? "" : merchSectionId, 8388608, (DefaultConstructorMarker) null);
    }
}
