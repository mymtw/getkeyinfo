package com.etsy.android.p327ui.search.filters;

import android.os.Bundle;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.apiv3.SearchWithAds;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.etsy.android.lib.models.apiv3.filters.AttributeValue;
import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.lib.models.apiv3.filters.StaticFilterAttribute;
import com.etsy.android.lib.models.apiv3.filters.StaticFilters;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import com.etsy.android.lib.models.editable.EditableListing;
import com.etsy.android.lib.util.C8905i;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.p330v2.C10971c;
import com.etsy.android.p327ui.search.p330v2.C10973d;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10984a;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10985b;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10986c;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10990e;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11005m;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11015r;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchFiltersRequest;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository;
import com.etsy.android.p327ui.util.C11786n;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.play.core.appupdate.C15562d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C19928a0;
import p003a2.C0023f;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8071s;
import p321cc.C8568b;
import p346fa.C12703a;
import p402n9.C13093m;
import p402n9.C13095o;
import p414oe.C13164c;
import p456ua.C13461f;
import p486y9.C13888d;
import p568fn.C17782b;
import p753kq.C19857l;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.search.filters.e */
public final class C10767e extends C2866i0 {

    /* renamed from: A */
    public final PublishSubject<C10986c> f23728A;

    /* renamed from: B */
    public Map<AttributeFacet, ? extends Set<ValueFacet>> f23729B;

    /* renamed from: C */
    public Map<AttributeFacet, ? extends Set<ValueFacet>> f23730C;

    /* renamed from: D */
    public SearchOptions f23731D;

    /* renamed from: E */
    public final String f23732E;

    /* renamed from: F */
    public final C7091a f23733F;

    /* renamed from: G */
    public Map<SearchFiltersV2Type, Integer> f23734G;

    /* renamed from: H */
    public final Map<Integer, SortOrder> f23735H;

    /* renamed from: I */
    public final Map<Integer, SearchOptions.MarketPlace> f23736I;

    /* renamed from: b */
    public final C8694h f23737b;

    /* renamed from: c */
    public final C13461f f23738c;

    /* renamed from: d */
    public final C13888d f23739d;

    /* renamed from: e */
    public final C8629a f23740e;

    /* renamed from: f */
    public final C10973d f23741f;

    /* renamed from: g */
    public final C10766d f23742g;

    /* renamed from: h */
    public final C11786n f23743h;

    /* renamed from: i */
    public final C12703a f23744i;

    /* renamed from: j */
    public final SearchWithAdsRepository f23745j;

    /* renamed from: k */
    public final C13164c f23746k;

    /* renamed from: l */
    public String f23747l = "";

    /* renamed from: m */
    public String f23748m = "";

    /* renamed from: n */
    public FacetCount f23749n = new FacetCount();

    /* renamed from: o */
    public List<AttributeFacet> f23750o;

    /* renamed from: p */
    public SearchFiltersRequest f23751p;

    /* renamed from: q */
    public final PublishSubject<SearchWithAds> f23752q;

    /* renamed from: r */
    public List<AttributeFacet> f23753r;

    /* renamed from: s */
    public StaticFilters f23754s;

    /* renamed from: t */
    public final PublishSubject<Boolean> f23755t;

    /* renamed from: u */
    public final PublishSubject<C10985b> f23756u;

    /* renamed from: v */
    public C19254a<List<FilterCountry>> f23757v;

    /* renamed from: w */
    public final C19254a<FilterCountry> f23758w;

    /* renamed from: x */
    public final PublishSubject<C11005m.C11006a> f23759x;

    /* renamed from: y */
    public final PublishSubject<String> f23760y;

    /* renamed from: z */
    public final PublishSubject<C10984a> f23761z;

    /* renamed from: com.etsy.android.ui.search.filters.e$a */
    public /* synthetic */ class C10768a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23762a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f23763b;

        static {
            int[] iArr = new int[SearchFiltersV2Type.values().length];
            iArr[SearchFiltersV2Type.SORT_BY.ordinal()] = 1;
            iArr[SearchFiltersV2Type.CATEGORY.ordinal()] = 2;
            iArr[SearchFiltersV2Type.ITEM_TYPE.ordinal()] = 3;
            iArr[SearchFiltersV2Type.SHIPPING.ordinal()] = 4;
            iArr[SearchFiltersV2Type.OTHER_OPTIONS.ordinal()] = 5;
            iArr[SearchFiltersV2Type.SHOP_LOCATION.ordinal()] = 6;
            iArr[SearchFiltersV2Type.SHIPS_TO.ordinal()] = 7;
            iArr[SearchFiltersV2Type.SIZE.ordinal()] = 8;
            iArr[SearchFiltersV2Type.MULTI_SELECT.ordinal()] = 9;
            iArr[SearchFiltersV2Type.COLOR.ordinal()] = 10;
            iArr[SearchFiltersV2Type.FREE_SHIPPING.ordinal()] = 11;
            iArr[SearchFiltersV2Type.SHIPPING_ONE_DAY.ordinal()] = 12;
            iArr[SearchFiltersV2Type.SHIPPING_ONE_THREE_DAYS.ordinal()] = 13;
            iArr[SearchFiltersV2Type.ON_SALE.ordinal()] = 14;
            iArr[SearchFiltersV2Type.ACCEPT_GIFT_CARDS.ordinal()] = 15;
            iArr[SearchFiltersV2Type.CUSTOMIZABLE.ordinal()] = 16;
            iArr[SearchFiltersV2Type.CAN_BE_GIFT_WRAPPED.ordinal()] = 17;
            f23762a = iArr;
            int[] iArr2 = new int[SearchOptions.Location.LocationType.values().length];
            iArr2[SearchOptions.Location.LocationType.ANYWHERE.ordinal()] = 1;
            iArr2[SearchOptions.Location.LocationType.LOCAL.ordinal()] = 2;
            iArr2[SearchOptions.Location.LocationType.CUSTOM.ordinal()] = 3;
            f23763b = iArr2;
        }
    }

    public C10767e(C8694h hVar, C13461f fVar, C13888d dVar, C8629a aVar, C10973d dVar2, C10766d dVar3, C11786n nVar, C12703a aVar2, C8618c cVar, SearchWithAdsRepository searchWithAdsRepository, C13164c cVar2) {
        C8694h hVar2 = hVar;
        C13461f fVar2 = fVar;
        C13888d dVar4 = dVar;
        C8629a aVar3 = aVar;
        C10973d dVar5 = dVar2;
        C10766d dVar6 = dVar3;
        C11786n nVar2 = nVar;
        C12703a aVar4 = aVar2;
        SearchWithAdsRepository searchWithAdsRepository2 = searchWithAdsRepository;
        C13164c cVar3 = cVar2;
        C19383o.m32797g(hVar2, "logCat");
        C19383o.m32797g(fVar2, "schedulers");
        C19383o.m32797g(dVar4, "currentLocale");
        C19383o.m32797g(aVar3, "appCurrency");
        C19383o.m32797g(dVar5, "optionsRepository");
        C19383o.m32797g(dVar6, "filtersItemProvider");
        C19383o.m32797g(nVar2, "resourceProvider");
        C19383o.m32797g(aVar4, "grafana");
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(searchWithAdsRepository2, "searchWithAdsRepository");
        C19383o.m32797g(cVar3, "priceFilterHelper");
        this.f23737b = hVar2;
        this.f23738c = fVar2;
        this.f23739d = dVar4;
        this.f23740e = aVar3;
        this.f23741f = dVar5;
        this.f23742g = dVar6;
        this.f23743h = nVar2;
        this.f23744i = aVar4;
        this.f23745j = searchWithAdsRepository2;
        this.f23746k = cVar3;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f23750o = emptyList;
        this.f23751p = new SearchFiltersRequest((String) null, (String) null, (SearchOptions) null, (String) null, (Bundle) null, (Integer) null, (Boolean) null, 127, (DefaultConstructorMarker) null);
        this.f23752q = new PublishSubject<>();
        this.f23753r = emptyList;
        this.f23755t = new PublishSubject<>();
        this.f23756u = new PublishSubject<>();
        this.f23757v = new C19254a<>();
        C19254a<FilterCountry> aVar5 = new C19254a<>();
        this.f23758w = aVar5;
        this.f23759x = new PublishSubject<>();
        this.f23760y = new PublishSubject<>();
        this.f23761z = new PublishSubject<>();
        this.f23728A = new PublishSubject<>();
        this.f23729B = C19294b0.m32559p0();
        this.f23730C = C19294b0.m32559p0();
        this.f23731D = new SearchOptions((List) null, false, false, false, false, false, false, false, (SearchOptions.Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
        this.f23732E = aVar.mo21246a();
        this.f23733F = new C7091a();
        aVar5.onNext(new FilterCountry(this.f23731D.getShipsToCountryName(), this.f23731D.getShipsToCountryCode()));
        this.f23734G = dVar6.f23727d;
        this.f23735H = C19294b0.m32562s0(new Pair(mo35743f(SearchFiltersV2Type.SORT_RELEVANCE), SortOrder.RELEVANCY), new Pair(mo35743f(SearchFiltersV2Type.SORT_RECENT), SortOrder.MOST_RECENT), new Pair(mo35743f(SearchFiltersV2Type.SORT_HIGHEST_PRICE), SortOrder.HIGHEST_PRICE), new Pair(mo35743f(SearchFiltersV2Type.SORT_LOWEST_PRICE), SortOrder.LOWEST_PRICE));
        this.f23736I = C19294b0.m32562s0(new Pair(mo35743f(SearchFiltersV2Type.ALL_ITEMS), SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS), new Pair(mo35743f(SearchFiltersV2Type.HANDMADE), SearchOptions.MarketPlace.MARKETPLACE_HANDMADE), new Pair(mo35743f(SearchFiltersV2Type.VINTAGE), SearchOptions.MarketPlace.MARKETPLACE_VINTAGE));
    }

    /* renamed from: b */
    public static String m18647b(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("");
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                FacetCount facetCount = (FacetCount) next;
                if (i == 0) {
                    sb.append(facetCount.getName());
                } else {
                    sb.append(EditableListing.CATEGORY_PATH_JOIN_STRING);
                    sb.append(facetCount.getName());
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "categoryBreadcrumb.toString()");
        return sb2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10990e m18648d(com.etsy.android.lib.models.apiv3.filters.AttributeFacet r3) {
        /*
            java.lang.String r0 = "facet"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r0 = r3.getAttribute()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r0 = r0.getNameRes()
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x003b
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r0 = r3.getAttribute()
            r2 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Integer r0 = r0.getNameRes()
            if (r0 != 0) goto L_0x0022
            goto L_0x0029
        L_0x0022:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0029
            r2 = 1
        L_0x0029:
            if (r2 != 0) goto L_0x003b
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.e$a r0 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.e$a
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r3 = r3.getAttribute()
            if (r3 == 0) goto L_0x0037
            java.lang.Integer r1 = r3.getNameRes()
        L_0x0037:
            r0.<init>(r1)
            return r0
        L_0x003b:
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r0 = r3.getAttribute()
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = r0.getName()
            goto L_0x0047
        L_0x0046:
            r0 = r1
        L_0x0047:
            if (r0 == 0) goto L_0x005d
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.e$b r0 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.e$b
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r3 = r3.getAttribute()
            if (r3 == 0) goto L_0x0055
            java.lang.String r1 = r3.getName()
        L_0x0055:
            java.lang.String r3 = java.lang.String.valueOf(r1)
            r0.<init>(r3)
            return r0
        L_0x005d:
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.e$b r3 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.e$b
            java.lang.String r0 = ""
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.C10767e.m18648d(com.etsy.android.lib.models.apiv3.filters.AttributeFacet):com.etsy.android.ui.search.v2.filters.searchfiltersv2.e");
    }

    /* renamed from: g */
    public static String m18649g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!C19383o.m32792b(((ValueFacet) next).getCount(), "0")) {
                arrayList2.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            String str = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            AttributeValue attributeValue = ((ValueFacet) next2).getAttributeValue();
            if (attributeValue != null) {
                str = attributeValue.getName();
            }
            if (hashSet.add(str)) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C19322o.m32624F0(arrayList3));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            AttributeValue attributeValue2 = ((ValueFacet) it3.next()).getAttributeValue();
            arrayList4.add(attributeValue2 != null ? attributeValue2.getName() : null);
        }
        return C19327t.m32644Z0(arrayList4, ", ", (String) null, (String) null, (C19857l) null, 62);
    }

    /* renamed from: r */
    public static boolean m18650r(FacetCount facetCount, List list, FacetCount facetCount2) {
        C19383o.m32797g(facetCount, "root");
        C19383o.m32797g(list, "categoriesPath");
        C19383o.m32797g(facetCount2, "key");
        list.add(facetCount);
        if (C19383o.m32792b(facetCount, facetCount2)) {
            return true;
        }
        if (facetCount.getChildren().isEmpty()) {
            list.remove(list.size() - 1);
            return false;
        }
        FacetCount facetCount3 = facetCount.getChildren().get(0);
        C19383o.m32796f(facetCount3, "root.children[0]");
        boolean r = m18650r(facetCount3, list, facetCount2);
        for (FacetCount next : facetCount.getChildren()) {
            if (!r) {
                C19383o.m32796f(next, "child");
                if (!m18650r(next, list, facetCount2)) {
                    r = false;
                }
            }
            r = true;
        }
        if (!r) {
            list.remove(list.size() - 1);
        }
        return r;
    }

    /* renamed from: t */
    public static LinkedHashMap m18651t(AttributeFacet attributeFacet, ValueFacet valueFacet, boolean z, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (map.containsKey(attributeFacet)) {
            Set set = (Set) map.get(attributeFacet);
            if (set != null) {
                linkedHashSet.addAll(set);
            }
            if (z) {
                linkedHashSet.add(valueFacet);
            } else {
                linkedHashSet.remove(valueFacet);
            }
            for (ValueFacet valueFacet2 : attributeFacet.getValueFacets()) {
                if (linkedHashSet.contains(valueFacet2)) {
                    linkedHashSet2.add(valueFacet2);
                }
            }
        } else if (z) {
            linkedHashSet2.add(valueFacet);
        }
        if (!linkedHashSet2.isEmpty()) {
            linkedHashMap.put(attributeFacet, linkedHashSet2);
        } else {
            linkedHashMap.remove(attributeFacet);
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public final LinkedHashMap mo35741c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PredefinedAnalyticsProperty.QUERY, this.f23748m);
        linkedHashMap.put(PredefinedAnalyticsProperty.CATEGORY_NODE_WHEN_FILTERS_BUTTON_TAPPED, this.f23747l);
        return linkedHashMap;
    }

    /* renamed from: e */
    public final String mo35742e(SearchFiltersV2Type searchFiltersV2Type) {
        return this.f23742g.mo35740a(searchFiltersV2Type);
    }

    /* renamed from: f */
    public final Integer mo35743f(SearchFiltersV2Type searchFiltersV2Type) {
        C10766d dVar = this.f23742g;
        dVar.getClass();
        C19383o.m32797g(searchFiltersV2Type, "filterType");
        return dVar.f23727d.get(searchFiltersV2Type);
    }

    /* renamed from: h */
    public final C11016s mo35744h(AttributeFacet attributeFacet, SearchOptions searchOptions) {
        int i;
        C19383o.m32797g(searchOptions, "searchOptions");
        AttributeValue attribute = attributeFacet.getAttribute();
        SearchFiltersV2Type filterType = attribute != null ? attribute.getFilterType() : null;
        String str = "";
        switch (filterType == null ? -1 : C10768a.f23762a[filterType.ordinal()]) {
            case 1:
                Map<Integer, SortOrder> map = this.f23735H;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry next : map.entrySet()) {
                    if (((SortOrder) next.getValue()) == searchOptions.getSortOrder()) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                return new C11016s.C11018b((Integer) C19327t.m32637S0(linkedHashMap.keySet()));
            case 2:
                ArrayList arrayList = new ArrayList();
                if (!searchOptions.getCategoryFacets().contains(this.f23749n)) {
                    arrayList.add(this.f23749n);
                }
                if (!searchOptions.getCategoryFacets().isEmpty()) {
                    arrayList.addAll(searchOptions.getCategoryFacets());
                }
                if (arrayList.size() != 1 || !C19383o.m32792b(arrayList.get(0), this.f23749n)) {
                    str = ((FacetCount) arrayList.get(arrayList.size() - 1)).getId();
                    C19383o.m32796f(str, "{\n                      ….id\n                    }");
                }
                this.f23747l = str;
                return new C11016s.C11017a(m18647b(arrayList), arrayList);
            case 3:
                Map<Integer, SearchOptions.MarketPlace> map2 = this.f23736I;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry next2 : map2.entrySet()) {
                    if (((SearchOptions.MarketPlace) next2.getValue()) == searchOptions.getMarketplace()) {
                        linkedHashMap2.put(next2.getKey(), next2.getValue());
                    }
                }
                return new C11016s.C11018b((Integer) C19327t.m32637S0(linkedHashMap2.keySet()));
            case 4:
            case 5:
                ArrayList i2 = mo35745i(attributeFacet, searchOptions, "constant_filters");
                return new C11016s.C11019c(m18649g(i2), i2);
            case 6:
                int i3 = C10768a.f23763b[searchOptions.getShopLocation().getType().ordinal()];
                if (i3 == 1) {
                    i = R.string.new_search_filter_shop_location_anywhere;
                } else if (i3 == 2) {
                    i = R.string.search_filter_shop_location_local;
                } else if (i3 == 3) {
                    i = R.string.new_search_filter_shop_location_custom_title;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return new C11016s.C11022f(i, searchOptions.getShopLocation());
            case 7:
                this.f23758w.onNext(new FilterCountry(searchOptions.getShipsToCountryName(), searchOptions.getShipsToCountryCode()));
                return new C11016s.C11023g(searchOptions.getShipsToCountryName());
            case 8:
            case 9:
            case 10:
                ArrayList i4 = mo35745i(attributeFacet, searchOptions, "dynamic_filters");
                return new C11016s.C11019c(m18649g(i4), i4);
            default:
                return new C11016s.C11023g(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo35745i(com.etsy.android.lib.models.apiv3.filters.AttributeFacet r13, com.etsy.android.p327ui.search.p330v2.SearchOptions r14, java.lang.String r15) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r3 = "dynamic_filters"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r15, r3)
            r5 = 0
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00ae
            java.lang.String r1 = r14.getAttributeValuesParam()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r8 = ","
            java.lang.String[] r8 = new java.lang.String[]{r8}
            r9 = 6
            java.util.List r1 = kotlin.text.C19459m.m33056y1(r1, r8, r5, r9)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = kotlin.collections.C19322o.m32624F0(r1)
            r8.<init>(r10)
            java.util.Iterator r1 = r1.iterator()
        L_0x0038:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0048
            java.lang.Object r10 = r1.next()
            java.lang.String r10 = (java.lang.String) r10
            r8.add(r10)
            goto L_0x0038
        L_0x0048:
            java.util.Iterator r1 = r8.iterator()
        L_0x004c:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x00a8
            java.lang.Object r8 = r1.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = ":"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.util.List r8 = kotlin.text.C19459m.m33056y1(r8, r10, r5, r9)
            boolean r10 = r8.isEmpty()
            r10 = r10 ^ r6
            if (r10 == 0) goto L_0x004c
            int r10 = r8.size()
            r11 = 2
            if (r10 != r11) goto L_0x004c
            java.lang.Object r10 = r8.get(r5)
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r11 = r13.getAttribute()
            if (r11 == 0) goto L_0x007f
            java.lang.String r11 = r11.getId()
            goto L_0x0080
        L_0x007f:
            r11 = r7
        L_0x0080:
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r11)
            if (r10 == 0) goto L_0x004c
            java.lang.Object r8 = r8.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "{"
            java.lang.String r11 = ""
            java.lang.String r8 = kotlin.text.C19457k.m33023a1(r8, r10, r11, r5)
            java.lang.String r10 = "}"
            java.lang.String r8 = kotlin.text.C19457k.m33023a1(r8, r10, r11, r5)
            java.lang.String r10 = "|"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.util.List r8 = kotlin.text.C19459m.m33056y1(r8, r10, r5, r9)
            r4.addAll(r8)
            goto L_0x004c
        L_0x00a8:
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.AttributeFacet, ? extends java.util.Set<com.etsy.android.lib.models.apiv3.filters.ValueFacet>> r1 = r12.f23729B
            r2.putAll(r1)
            r1 = r4
        L_0x00ae:
            java.lang.String r4 = "constant_filters"
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r15, r4)
            if (r8 == 0) goto L_0x0149
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r8 = r13.getAttribute()
            if (r8 == 0) goto L_0x00c6
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r8 = r8.getFilterType()
            goto L_0x00c7
        L_0x00c6:
            r8 = r7
        L_0x00c7:
            if (r8 != 0) goto L_0x00cb
            r8 = -1
            goto L_0x00d3
        L_0x00cb:
            int[] r9 = com.etsy.android.p327ui.search.filters.C10767e.C10768a.f23762a
            int r8 = r8.ordinal()
            r8 = r9[r8]
        L_0x00d3:
            r9 = 4
            if (r8 == r9) goto L_0x0117
            r9 = 5
            if (r8 == r9) goto L_0x00da
            goto L_0x0144
        L_0x00da:
            boolean r8 = r14.getOnSale()
            if (r8 == 0) goto L_0x00e9
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r8 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.ON_SALE
            java.lang.String r8 = r12.mo35742e(r8)
            r1.add(r8)
        L_0x00e9:
            boolean r8 = r14.getAcceptsGiftCards()
            if (r8 == 0) goto L_0x00f8
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r8 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.ACCEPT_GIFT_CARDS
            java.lang.String r8 = r12.mo35742e(r8)
            r1.add(r8)
        L_0x00f8:
            boolean r8 = r14.getCustomizable()
            if (r8 == 0) goto L_0x0107
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r8 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.CUSTOMIZABLE
            java.lang.String r8 = r12.mo35742e(r8)
            r1.add(r8)
        L_0x0107:
            boolean r14 = r14.getGiftWrap()
            if (r14 == 0) goto L_0x0144
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r14 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.CAN_BE_GIFT_WRAPPED
            java.lang.String r14 = r12.mo35742e(r14)
            r1.add(r14)
            goto L_0x0144
        L_0x0117:
            boolean r8 = r14.getFreeShipping()
            if (r8 == 0) goto L_0x0126
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r8 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.FREE_SHIPPING
            java.lang.String r8 = r12.mo35742e(r8)
            r1.add(r8)
        L_0x0126:
            boolean r8 = r14.getOneDayShipping()
            if (r8 == 0) goto L_0x0135
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r8 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.SHIPPING_ONE_DAY
            java.lang.String r8 = r12.mo35742e(r8)
            r1.add(r8)
        L_0x0135:
            boolean r14 = r14.getThreeDayShipping()
            if (r14 == 0) goto L_0x0144
            com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type r14 = com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type.SHIPPING_ONE_THREE_DAYS
            java.lang.String r14 = r12.mo35742e(r14)
            r1.add(r14)
        L_0x0144:
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.AttributeFacet, ? extends java.util.Set<com.etsy.android.lib.models.apiv3.filters.ValueFacet>> r14 = r12.f23730C
            r2.putAll(r14)
        L_0x0149:
            java.util.List r14 = r13.getValueFacets()
            java.util.Iterator r14 = r14.iterator()
        L_0x0151:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x018b
            java.lang.Object r8 = r14.next()
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r8 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r8
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r9 = r8.getAttributeValue()
            if (r9 == 0) goto L_0x0168
            java.lang.String r9 = r9.getId()
            goto L_0x0169
        L_0x0168:
            r9 = r7
        L_0x0169:
            boolean r9 = r1.contains(r9)
            if (r9 == 0) goto L_0x0151
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r15, r3)
            if (r9 == 0) goto L_0x0187
            java.lang.String r9 = r8.getCount()
            if (r9 == 0) goto L_0x0180
            int r9 = java.lang.Integer.parseInt(r9)
            goto L_0x0181
        L_0x0180:
            r9 = r5
        L_0x0181:
            if (r9 <= 0) goto L_0x0187
            r0.add(r8)
            goto L_0x0151
        L_0x0187:
            r0.add(r8)
            goto L_0x0151
        L_0x018b:
            boolean r14 = r0.isEmpty()
            r14 = r14 ^ r6
            if (r14 == 0) goto L_0x01b0
            java.util.Set r14 = kotlin.collections.C19327t.m32664t1(r0)
            r2.put(r13, r14)
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r15, r4)
            if (r13 == 0) goto L_0x01a8
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.AttributeFacet, ? extends java.util.Set<com.etsy.android.lib.models.apiv3.filters.ValueFacet>> r13 = r12.f23730C
            java.util.LinkedHashMap r13 = kotlin.collections.C19294b0.m32564u0(r13, r2)
            r12.f23730C = r13
            goto L_0x01b0
        L_0x01a8:
            java.util.Map<com.etsy.android.lib.models.apiv3.filters.AttributeFacet, ? extends java.util.Set<com.etsy.android.lib.models.apiv3.filters.ValueFacet>> r13 = r12.f23729B
            java.util.LinkedHashMap r13 = kotlin.collections.C19294b0.m32564u0(r13, r2)
            r12.f23729B = r13
        L_0x01b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.C10767e.mo35745i(com.etsy.android.lib.models.apiv3.filters.AttributeFacet, com.etsy.android.ui.search.v2.SearchOptions, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: j */
    public final void mo35746j(Throwable th) {
        this.f23755t.onNext(Boolean.FALSE);
        if (th != null) {
            this.f23737b.error(th);
        } else {
            this.f23737b.mo21306a("Unknown error");
        }
        this.f23744i.mo45474a("searchfiltersv2_viewmodel.error");
    }

    /* renamed from: k */
    public final void mo35747k(List<AttributeFacet> list, StaticFilters staticFilters) {
        StaticFilterAttribute staticFilterAttribute;
        List<StaticFilterAttribute> attributes;
        T t;
        C19383o.m32797g(list, "dynamicFacets");
        this.f23754s = staticFilters;
        if (staticFilters == null || (attributes = staticFilters.getAttributes()) == null) {
            staticFilterAttribute = null;
        } else {
            Iterator<T> it = attributes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C19383o.m32792b(((StaticFilterAttribute) t).getId(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    break;
                }
            }
            staticFilterAttribute = (StaticFilterAttribute) t;
        }
        this.f23753r = list;
        if (this.f23750o.isEmpty()) {
            C10766d dVar = this.f23742g;
            dVar.getClass();
            if (dVar.f23726c.isEmpty()) {
                ArrayList arrayList = dVar.f23726c;
                AttributeFacet attributeFacet = new AttributeFacet();
                AttributeValue attributeValue = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type = SearchFiltersV2Type.SORT_BY;
                attributeValue.setId(dVar.mo35740a(searchFiltersV2Type));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type), attributeValue, searchFiltersV2Type);
                attributeFacet.setAttribute(attributeValue);
                ArrayList arrayList2 = new ArrayList();
                ValueFacet valueFacet = new ValueFacet();
                AttributeValue attributeValue2 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type2 = SearchFiltersV2Type.SORT_RELEVANCE;
                attributeValue2.setId(dVar.mo35740a(searchFiltersV2Type2));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type2), attributeValue2, searchFiltersV2Type2);
                valueFacet.setAttributeValue(attributeValue2);
                ValueFacet valueFacet2 = new ValueFacet();
                AttributeValue attributeValue3 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type3 = SearchFiltersV2Type.SORT_RECENT;
                attributeValue3.setId(dVar.mo35740a(searchFiltersV2Type3));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type3), attributeValue3, searchFiltersV2Type3);
                valueFacet2.setAttributeValue(attributeValue3);
                ValueFacet valueFacet3 = new ValueFacet();
                AttributeValue attributeValue4 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type4 = SearchFiltersV2Type.SORT_HIGHEST_PRICE;
                attributeValue4.setId(dVar.mo35740a(searchFiltersV2Type4));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type4), attributeValue4, searchFiltersV2Type4);
                valueFacet3.setAttributeValue(attributeValue4);
                ValueFacet valueFacet4 = new ValueFacet();
                AttributeValue attributeValue5 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type5 = SearchFiltersV2Type.SORT_LOWEST_PRICE;
                attributeValue5.setId(dVar.mo35740a(searchFiltersV2Type5));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type5), attributeValue5, searchFiltersV2Type5);
                valueFacet4.setAttributeValue(attributeValue5);
                arrayList2.add(valueFacet);
                arrayList2.add(valueFacet2);
                arrayList2.add(valueFacet3);
                arrayList2.add(valueFacet4);
                attributeFacet.setValueFacets(arrayList2);
                arrayList.add(attributeFacet);
                ArrayList arrayList3 = dVar.f23726c;
                AttributeFacet attributeFacet2 = new AttributeFacet();
                AttributeValue attributeValue6 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type6 = SearchFiltersV2Type.CATEGORY;
                attributeValue6.setId(dVar.mo35740a(searchFiltersV2Type6));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type6), attributeValue6, searchFiltersV2Type6);
                attributeFacet2.setAttribute(attributeValue6);
                arrayList3.add(attributeFacet2);
                ArrayList arrayList4 = dVar.f23726c;
                AttributeFacet attributeFacet3 = new AttributeFacet();
                AttributeValue attributeValue7 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type7 = SearchFiltersV2Type.ITEM_TYPE;
                attributeValue7.setId(dVar.mo35740a(searchFiltersV2Type7));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type7), attributeValue7, searchFiltersV2Type7);
                attributeFacet3.setAttribute(attributeValue7);
                ArrayList arrayList5 = new ArrayList();
                ValueFacet valueFacet5 = new ValueFacet();
                AttributeValue attributeValue8 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type8 = SearchFiltersV2Type.ALL_ITEMS;
                attributeValue8.setId(dVar.mo35740a(searchFiltersV2Type8));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type8), attributeValue8, searchFiltersV2Type8);
                valueFacet5.setAttributeValue(attributeValue8);
                ValueFacet valueFacet6 = new ValueFacet();
                AttributeValue attributeValue9 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type9 = SearchFiltersV2Type.HANDMADE;
                attributeValue9.setId(dVar.mo35740a(searchFiltersV2Type9));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type9), attributeValue9, searchFiltersV2Type9);
                valueFacet6.setAttributeValue(attributeValue9);
                ValueFacet valueFacet7 = new ValueFacet();
                AttributeValue attributeValue10 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type10 = SearchFiltersV2Type.VINTAGE;
                attributeValue10.setId(dVar.mo35740a(searchFiltersV2Type10));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type10), attributeValue10, searchFiltersV2Type10);
                valueFacet7.setAttributeValue(attributeValue10);
                arrayList5.add(valueFacet5);
                arrayList5.add(valueFacet6);
                arrayList5.add(valueFacet7);
                attributeFacet3.setValueFacets(arrayList5);
                arrayList4.add(attributeFacet3);
                ArrayList arrayList6 = dVar.f23726c;
                AttributeFacet attributeFacet4 = new AttributeFacet();
                AttributeValue attributeValue11 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type11 = SearchFiltersV2Type.PRICE;
                attributeValue11.setId(dVar.mo35740a(searchFiltersV2Type11));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type11), attributeValue11, searchFiltersV2Type11);
                attributeFacet4.setAttribute(attributeValue11);
                arrayList6.add(attributeFacet4);
                ArrayList arrayList7 = dVar.f23726c;
                AttributeFacet attributeFacet5 = new AttributeFacet();
                AttributeValue attributeValue12 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type12 = SearchFiltersV2Type.SHIPPING;
                attributeValue12.setId(dVar.mo35740a(searchFiltersV2Type12));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type12), attributeValue12, searchFiltersV2Type12);
                attributeFacet5.setAttribute(attributeValue12);
                ValueFacet valueFacet8 = new ValueFacet();
                AttributeValue attributeValue13 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type13 = SearchFiltersV2Type.FREE_SHIPPING;
                attributeValue13.setId(dVar.mo35740a(searchFiltersV2Type13));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type13), attributeValue13, searchFiltersV2Type13);
                valueFacet8.setAttributeValue(attributeValue13);
                ValueFacet valueFacet9 = new ValueFacet();
                AttributeValue attributeValue14 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type14 = SearchFiltersV2Type.SHIPPING_ONE_DAY;
                attributeValue14.setId(dVar.mo35740a(searchFiltersV2Type14));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type14), attributeValue14, searchFiltersV2Type14);
                valueFacet9.setAttributeValue(attributeValue14);
                ValueFacet valueFacet10 = new ValueFacet();
                AttributeValue attributeValue15 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type15 = SearchFiltersV2Type.SHIPPING_ONE_THREE_DAYS;
                attributeValue15.setId(dVar.mo35740a(searchFiltersV2Type15));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type15), attributeValue15, searchFiltersV2Type15);
                valueFacet10.setAttributeValue(attributeValue15);
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(valueFacet8);
                arrayList8.add(valueFacet9);
                arrayList8.add(valueFacet10);
                attributeFacet5.setValueFacets(arrayList8);
                arrayList7.add(attributeFacet5);
                ArrayList arrayList9 = dVar.f23726c;
                AttributeFacet attributeFacet6 = new AttributeFacet();
                AttributeValue attributeValue16 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type16 = SearchFiltersV2Type.SHIPS_TO;
                attributeValue16.setId(dVar.mo35740a(searchFiltersV2Type16));
                attributeValue16.setNameRes(dVar.f23727d.get(searchFiltersV2Type16));
                attributeValue16.setFilterType(searchFiltersV2Type16);
                attributeFacet6.setAttribute(attributeValue16);
                arrayList9.add(attributeFacet6);
                ArrayList arrayList10 = dVar.f23726c;
                AttributeFacet attributeFacet7 = new AttributeFacet();
                AttributeValue attributeValue17 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type17 = SearchFiltersV2Type.SHOP_LOCATION;
                attributeValue17.setId(dVar.mo35740a(searchFiltersV2Type17));
                attributeValue17.setNameRes(dVar.f23727d.get(searchFiltersV2Type17));
                attributeValue17.setFilterType(searchFiltersV2Type17);
                attributeFacet7.setAttribute(attributeValue17);
                ValueFacet valueFacet11 = new ValueFacet();
                AttributeValue attributeValue18 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type18 = SearchFiltersV2Type.ANYWHERE;
                attributeValue18.setId(dVar.mo35740a(searchFiltersV2Type18));
                attributeValue18.setNameRes(dVar.f23727d.get(searchFiltersV2Type18));
                attributeValue18.setFilterType(searchFiltersV2Type18);
                valueFacet11.setAttributeValue(attributeValue18);
                ValueFacet valueFacet12 = new ValueFacet();
                AttributeValue attributeValue19 = new AttributeValue();
                attributeValue19.setId(dVar.mo35740a(SearchFiltersV2Type.LOCAL));
                attributeValue19.setName(dVar.f23725b.mo46719c().getDisplayCountry());
                valueFacet12.setAttributeValue(attributeValue19);
                ValueFacet valueFacet13 = new ValueFacet();
                AttributeValue attributeValue20 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type19 = SearchFiltersV2Type.CUSTOM_SHOP_LOCATION;
                attributeValue20.setId(dVar.mo35740a(searchFiltersV2Type19));
                attributeValue20.setNameRes(dVar.f23727d.get(searchFiltersV2Type19));
                attributeValue20.setFilterType(searchFiltersV2Type19);
                valueFacet13.setAttributeValue(attributeValue20);
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(valueFacet11);
                arrayList11.add(valueFacet12);
                arrayList11.add(valueFacet13);
                attributeFacet7.setValueFacets(arrayList11);
                arrayList10.add(attributeFacet7);
                ArrayList arrayList12 = dVar.f23726c;
                AttributeFacet attributeFacet8 = new AttributeFacet();
                AttributeValue attributeValue21 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type20 = SearchFiltersV2Type.OTHER_OPTIONS;
                attributeValue21.setId(dVar.mo35740a(searchFiltersV2Type20));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type20), attributeValue21, searchFiltersV2Type20);
                attributeFacet8.setAttribute(attributeValue21);
                ValueFacet valueFacet14 = new ValueFacet();
                AttributeValue attributeValue22 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type21 = SearchFiltersV2Type.ON_SALE;
                attributeValue22.setId(dVar.mo35740a(searchFiltersV2Type21));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type21), attributeValue22, searchFiltersV2Type21);
                valueFacet14.setAttributeValue(attributeValue22);
                ValueFacet valueFacet15 = new ValueFacet();
                AttributeValue attributeValue23 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type22 = SearchFiltersV2Type.ACCEPT_GIFT_CARDS;
                attributeValue23.setId(dVar.mo35740a(searchFiltersV2Type22));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type22), attributeValue23, searchFiltersV2Type22);
                valueFacet15.setAttributeValue(attributeValue23);
                ValueFacet valueFacet16 = new ValueFacet();
                AttributeValue attributeValue24 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type23 = SearchFiltersV2Type.CUSTOMIZABLE;
                attributeValue24.setId(dVar.mo35740a(searchFiltersV2Type23));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type23), attributeValue24, searchFiltersV2Type23);
                valueFacet16.setAttributeValue(attributeValue24);
                ValueFacet valueFacet17 = new ValueFacet();
                AttributeValue attributeValue25 = new AttributeValue();
                SearchFiltersV2Type searchFiltersV2Type24 = SearchFiltersV2Type.CAN_BE_GIFT_WRAPPED;
                attributeValue25.setId(dVar.mo35740a(searchFiltersV2Type24));
                C0023f.m113n(dVar.f23724a, dVar.f23727d.get(searchFiltersV2Type24), attributeValue25, searchFiltersV2Type24);
                valueFacet17.setAttributeValue(attributeValue25);
                ArrayList arrayList13 = new ArrayList();
                arrayList13.add(valueFacet14);
                arrayList13.add(valueFacet15);
                arrayList13.add(valueFacet16);
                arrayList13.add(valueFacet17);
                attributeFacet8.setValueFacets(arrayList13);
                arrayList12.add(attributeFacet8);
                dVar.f23726c.addAll(7, C10766d.m18645b(list, staticFilterAttribute));
            }
            this.f23750o = dVar.f23726c;
        }
        int i = 0;
        for (T next : this.f23750o) {
            int i2 = i + 1;
            if (i >= 0) {
                AttributeFacet attributeFacet9 = (AttributeFacet) next;
                C10990e d = m18648d(attributeFacet9);
                C11016s h = mo35744h(attributeFacet9, this.f23731D);
                PublishSubject<C10985b> publishSubject = this.f23756u;
                AttributeValue attribute = attributeFacet9.getAttribute();
                publishSubject.onNext(new C10985b(attributeFacet9, attribute != null ? attribute.getId() : null, d, h, 2, i));
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
    }

    /* renamed from: l */
    public final void mo35748l() {
        PublishSubject<Boolean> publishSubject = this.f23755t;
        Boolean bool = Boolean.TRUE;
        publishSubject.onNext(bool);
        String query = this.f23751p.getQuery();
        if (query == null) {
            query = "";
        }
        C11015r rVar = new C11015r(query, this.f23751p.getAnchorListingId(), this.f23731D, this.f23732E, C15562d.m25187Y(this.f23751p.getRequestParams()), (C10971c) null, this.f23751p.getLimit(), (String) null, bool, true, false, (C8707d) null, (Long) null, Boolean.FALSE);
        SearchWithAdsRepository searchWithAdsRepository = this.f23745j;
        searchWithAdsRepository.getClass();
        String str = rVar.f24424h;
        C8071s<C20145v<C19928a0>> d = str == null || str.length() == 0 ? searchWithAdsRepository.f24364a.mo36566d(C0761x.m1746u(rVar)) : searchWithAdsRepository.f24364a.mo36564b(rVar.f24424h, C0761x.m1746u(rVar));
        C8568b bVar = new C8568b(6);
        d.getClass();
        this.f23733F.mo19403b(C0391c.m1056b(this.f23738c, C0472h.m1243e(this.f23738c, new C19211l(new C19208j(d, bVar), new C13093m(2)))).mo20658g(new C8905i(this, 5), new C13095o(this, 3)));
    }

    /* renamed from: m */
    public final void mo35749m(int i) {
        if (i == R.string.new_search_filter_shop_location_anywhere) {
            this.f23731D.getShopLocation().setType(SearchOptions.Location.LocationType.ANYWHERE);
        } else if (i == R.string.search_filter_shop_location_local) {
            SearchOptions.Location shopLocation = this.f23731D.getShopLocation();
            SearchOptions.Location.LocationType locationType = SearchOptions.Location.LocationType.LOCAL;
            shopLocation.setType(locationType);
            SearchOptions.Location shopLocation2 = this.f23731D.getShopLocation();
            String displayCountry = this.f23739d.mo46719c().getDisplayCountry();
            C19383o.m32796f(displayCountry, "currentLocale.getSystemLocale().displayCountry");
            shopLocation2.set(locationType, displayCountry);
        }
        mo35752p(false);
        mo35748l();
    }

    /* renamed from: n */
    public final void mo35750n(String str) {
        C19383o.m32797g(str, "location");
        if (str.length() == 0) {
            mo35749m(R.string.new_search_filter_shop_location_anywhere);
        } else {
            SearchOptions.Location shopLocation = this.f23731D.getShopLocation();
            SearchOptions.Location.LocationType locationType = SearchOptions.Location.LocationType.CUSTOM;
            shopLocation.setType(locationType);
            this.f23731D.getShopLocation().set(locationType, str);
        }
        mo35748l();
    }

    /* renamed from: o */
    public final void mo35751o(String str, boolean z) {
        LinkedHashMap A0 = C19294b0.m32558A0(mo35741c());
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.FILTER_PRICE_MIN;
        String bigDecimal = this.f23731D.getMinPrice().toString();
        C19383o.m32796f(bigDecimal, "searchOptions.minPrice.toString()");
        A0.put(predefinedAnalyticsProperty, bigDecimal);
        C11016s.C11023g gVar = str != null ? new C11016s.C11023g(str) : null;
        if (z) {
            gVar = new C11016s.C11023g(this.f23746k.mo45883g(this.f23731D.getMinPrice(), this.f23731D.getMaxPrice()));
        }
        if (!C19383o.m32792b(this.f23731D.getMaxPrice(), SearchOptions.DEFAULT_HIGH_PRICE) || this.f23731D.getUserSpecifiedMax()) {
            A0.put(PredefinedAnalyticsProperty.FILTER_PRICE_MAX, String.valueOf(this.f23731D.getMaxPrice()));
        } else {
            A0.put(PredefinedAnalyticsProperty.FILTER_PRICE_MAX, "null");
        }
        A0.put(PredefinedAnalyticsProperty.CURRENCY, this.f23740e.mo21246a());
        A0.put(PredefinedAnalyticsProperty.FILTER_CUSTOM_INPUT, String.valueOf(z));
        this.f23728A.onNext(new C10986c(new C10987d.C10989b(this.f23734G.get(SearchFiltersV2Type.PRICE)), A0, gVar, Boolean.TRUE));
    }

    public final void onCleared() {
        super.onCleared();
        this.f23756u.onComplete();
        this.f23757v.onComplete();
        this.f23758w.onComplete();
        this.f23761z.onComplete();
        this.f23741f.getClass();
        this.f23733F.mo19405d();
        C8694h hVar = this.f23737b;
        hVar.mo21310e(this + " onCleared()");
    }

    /* renamed from: p */
    public final void mo35752p(boolean z) {
        LinkedHashMap A0 = C19294b0.m32558A0(mo35741c());
        A0.put(PredefinedAnalyticsProperty.FILTER_SHOP_LOCATION_TYPE, this.f23731D.getShopLocation().getType().toString());
        A0.put(PredefinedAnalyticsProperty.FILTER_SHOP_LOCATION_VALUE, this.f23731D.getShopLocation().getLocation());
        A0.put(PredefinedAnalyticsProperty.FILTER_CUSTOM_INPUT, String.valueOf(z));
        this.f23728A.onNext(new C10986c(new C10987d.C10989b(this.f23734G.get(SearchFiltersV2Type.SHOP_LOCATION)), A0, new C11016s.C11023g(this.f23731D.getShopLocation().getType().toString()), Boolean.TRUE));
    }

    /* renamed from: q */
    public final void mo35753q(String str, String str2, List list) {
        C19383o.m32797g(list, "categoryFacets");
        C19383o.m32797g(str2, "query");
        Collections.sort(list, FacetCount.byDecreasingCount);
        this.f23748m = str2;
        C10973d dVar = this.f23741f;
        dVar.getClass();
        dVar.f24337b = list;
        this.f23749n = new FacetCount(mo35742e(SearchFiltersV2Type.CATEGORY), str, 1, this.f23741f.f24337b);
    }

    /* renamed from: s */
    public final LinkedHashMap mo35754s(AttributeFacet attributeFacet, ValueFacet valueFacet, boolean z) {
        LinkedHashMap t = m18651t(attributeFacet, valueFacet, z, this.f23730C);
        this.f23730C = t;
        AttributeValue attributeValue = valueFacet.getAttributeValue();
        SearchFiltersV2Type filterType = attributeValue != null ? attributeValue.getFilterType() : null;
        switch (filterType == null ? -1 : C10768a.f23762a[filterType.ordinal()]) {
            case 11:
                this.f23731D.setFreeShipping(z);
                break;
            case 12:
                this.f23731D.setOneDayShipping(z);
                break;
            case 13:
                this.f23731D.setThreeDayShipping(z);
                break;
            case 14:
                this.f23731D.setOnSale(z);
                break;
            case 15:
                this.f23731D.setAcceptsGiftCards(z);
                break;
            case 16:
                this.f23731D.setCustomizable(z);
                break;
            case 17:
                this.f23731D.setGiftWrap(z);
                break;
        }
        mo35748l();
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d A[Catch:{ Exception -> 0x0093 }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35755u(int r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "min"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "max"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            int r0 = r8.length()     // Catch:{ Exception -> 0x0093 }
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            r3 = 0
            if (r0 == 0) goto L_0x003c
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance()     // Catch:{ Exception -> 0x0093 }
            java.lang.Number r8 = r0.parse(r8)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0093 }
            java.math.BigDecimal r0 = kotlin.text.C19456j.m33015S0(r8)     // Catch:{ Exception -> 0x0093 }
            if (r0 == 0) goto L_0x0036
            java.math.BigDecimal r4 = java.math.BigDecimal.ZERO     // Catch:{ Exception -> 0x0093 }
            int r0 = r0.compareTo(r4)     // Catch:{ Exception -> 0x0093 }
            if (r0 != 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x0093 }
            goto L_0x0037
        L_0x0036:
            r0 = r3
        L_0x0037:
            if (r0 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r0 = r2
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            int r4 = r9.length()     // Catch:{ Exception -> 0x0093 }
            if (r4 <= 0) goto L_0x0045
            r4 = r2
            goto L_0x0046
        L_0x0045:
            r4 = r1
        L_0x0046:
            if (r4 == 0) goto L_0x006b
            java.text.NumberFormat r4 = java.text.NumberFormat.getNumberInstance()     // Catch:{ Exception -> 0x0093 }
            java.lang.Number r9 = r4.parse(r9)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0093 }
            java.math.BigDecimal r4 = kotlin.text.C19456j.m33015S0(r9)     // Catch:{ Exception -> 0x0093 }
            if (r4 == 0) goto L_0x0066
            java.math.BigDecimal r5 = java.math.BigDecimal.ZERO     // Catch:{ Exception -> 0x0093 }
            int r4 = r4.compareTo(r5)     // Catch:{ Exception -> 0x0093 }
            if (r4 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ Exception -> 0x0093 }
            goto L_0x0067
        L_0x0066:
            r4 = r3
        L_0x0067:
            if (r4 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r1 = r2
        L_0x006b:
            if (r0 != 0) goto L_0x0073
            if (r1 != 0) goto L_0x0073
            r6.mo35757w()     // Catch:{ Exception -> 0x0093 }
            goto L_0x009a
        L_0x0073:
            if (r0 != 0) goto L_0x007d
            java.math.BigDecimal r8 = kotlin.text.C19456j.m33015S0(r9)     // Catch:{ Exception -> 0x0093 }
            r6.mo35756v(r3, r8, r7)     // Catch:{ Exception -> 0x0093 }
            goto L_0x009a
        L_0x007d:
            if (r1 != 0) goto L_0x0087
            java.math.BigDecimal r8 = kotlin.text.C19456j.m33015S0(r8)     // Catch:{ Exception -> 0x0093 }
            r6.mo35756v(r8, r3, r7)     // Catch:{ Exception -> 0x0093 }
            goto L_0x009a
        L_0x0087:
            java.math.BigDecimal r8 = kotlin.text.C19456j.m33015S0(r8)     // Catch:{ Exception -> 0x0093 }
            java.math.BigDecimal r9 = kotlin.text.C19456j.m33015S0(r9)     // Catch:{ Exception -> 0x0093 }
            r6.mo35756v(r8, r9, r7)     // Catch:{ Exception -> 0x0093 }
            goto L_0x009a
        L_0x0093:
            r7 = move-exception
            r6.mo35757w()
            r6.mo35746j(r7)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.C10767e.mo35755u(int, java.lang.String, java.lang.String):void");
    }

    /* renamed from: v */
    public final void mo35756v(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        if (bigDecimal == null || bigDecimal2 == null || bigDecimal.compareTo(bigDecimal2) <= 0) {
            bigDecimal4 = bigDecimal;
            bigDecimal3 = bigDecimal2;
        } else {
            bigDecimal3 = bigDecimal;
            bigDecimal4 = bigDecimal2;
        }
        boolean z = true;
        this.f23731D.setUserSpecifiedMin(bigDecimal != null);
        SearchOptions searchOptions = this.f23731D;
        if (bigDecimal2 == null) {
            z = false;
        }
        searchOptions.setUserSpecifiedMax(z);
        this.f23731D.setMinPrice(bigDecimal4 == null ? SearchOptions.DEFAULT_LOW_PRICE : bigDecimal4);
        this.f23731D.setMaxPrice(bigDecimal3 == null ? (BigDecimal) SearchOptions.DEFAULT_HIGH_PRICE : bigDecimal3);
        this.f23731D.setPriceIndex(i);
        this.f23761z.onNext(new C10984a(mo35742e(SearchFiltersV2Type.PRICE), new C11016s.C11023g(this.f23746k.mo45883g(bigDecimal4, bigDecimal3))));
        mo35748l();
    }

    /* renamed from: w */
    public final void mo35757w() {
        String str;
        this.f23731D.setUserSpecifiedMax(false);
        this.f23731D.setMinPrice(SearchOptions.DEFAULT_LOW_PRICE);
        this.f23731D.setMaxPrice((BigDecimal) SearchOptions.DEFAULT_HIGH_PRICE);
        this.f23731D.setPriceIndex(0);
        Integer num = this.f23734G.get(SearchFiltersV2Type.ANY_PRICE);
        if (num != null) {
            str = this.f23743h.mo38059c(num.intValue(), new Object[0]);
        } else {
            str = null;
        }
        mo35751o(str, false);
    }
}
