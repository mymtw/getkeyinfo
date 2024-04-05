package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0069a;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.filters.refactor.ItemTypeSelectItem;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.filters.refactor.ShippingSelectItem;
import com.etsy.android.p327ui.search.filters.refactor.SortBySelectItem;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import com.etsy.android.p327ui.util.C11786n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p391le.C13016a;
import p486y9.C13888d;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.search.filters.refactor.u */
public final class C10857u {

    /* renamed from: a */
    public final C11786n f24078a;

    /* renamed from: b */
    public final C8630b f24079b;

    /* renamed from: c */
    public final C8629a f24080c;

    /* renamed from: d */
    public final C13888d f24081d;

    /* renamed from: e */
    public final C13016a f24082e;

    /* renamed from: f */
    public final C10836m f24083f;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.u$a */
    public /* synthetic */ class C10858a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24084a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f24085b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f24086c;

        static {
            int[] iArr = new int[SortOrder.values().length];
            iArr[SortOrder.RELEVANCY.ordinal()] = 1;
            iArr[SortOrder.MOST_RECENT.ordinal()] = 2;
            iArr[SortOrder.HIGHEST_PRICE.ordinal()] = 3;
            iArr[SortOrder.LOWEST_PRICE.ordinal()] = 4;
            f24084a = iArr;
            int[] iArr2 = new int[SearchOptions.MarketPlace.values().length];
            iArr2[SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS.ordinal()] = 1;
            iArr2[SearchOptions.MarketPlace.MARKETPLACE_HANDMADE.ordinal()] = 2;
            iArr2[SearchOptions.MarketPlace.MARKETPLACE_VINTAGE.ordinal()] = 3;
            f24085b = iArr2;
            int[] iArr3 = new int[ShippingSelectItem.ShippingType.values().length];
            iArr3[ShippingSelectItem.ShippingType.FREE_SHIPPING_ID.ordinal()] = 1;
            iArr3[ShippingSelectItem.ShippingType.ONE_DAY_SHIPPING_ID.ordinal()] = 2;
            iArr3[ShippingSelectItem.ShippingType.THREE_DAY_SHIPPING_ID.ordinal()] = 3;
            f24086c = iArr3;
        }
    }

    public C10857u(C11786n nVar, C8630b bVar, C8629a aVar, C13888d dVar, C13016a aVar2, C10836m mVar) {
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(bVar, "moneyFactory");
        C19383o.m32797g(aVar, "appCurrency");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(aVar2, "dynamicFiltersFactory");
        C19383o.m32797g(mVar, "eligibility");
        this.f24078a = nVar;
        this.f24079b = bVar;
        this.f24080c = aVar;
        this.f24081d = dVar;
        this.f24082e = aVar2;
        this.f24083f = mVar;
    }

    /* renamed from: b */
    public static List m18866b(List list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        List d0 = C17782b.m29864d0(new Pair(0, C19327t.m32638T0(list)));
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                int intValue = ((Number) next).intValue();
                arrayList.add(i == C17782b.m29859Y(list) ? new Pair(Integer.valueOf(intValue), null) : new Pair(Integer.valueOf(intValue), list.get(i2)));
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        ArrayList f1 = C19327t.m32650f1(arrayList, d0);
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(f1));
        Iterator it = f1.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int intValue2 = ((Number) pair.component1()).intValue();
            Integer num = (Integer) pair.component2();
            arrayList2.add(new Pair(new BigDecimal(intValue2), num != null ? new BigDecimal(num.intValue()) : null));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final String mo36047a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C19383o.m32797g(bigDecimal, ResponseConstants.MIN);
        if (C19383o.m32792b(bigDecimal, BigDecimal.ZERO)) {
            return this.f24078a.mo38059c(R.string.search_filters_price_max_bound_desc, mo36059n(bigDecimal2));
        } else if (bigDecimal2 == null) {
            return this.f24078a.mo38059c(R.string.search_filters_price_min_bound_desc, mo36059n(bigDecimal));
        } else {
            return this.f24078a.mo38059c(R.string.search_filters_price_range_desc, mo36059n(bigDecimal), mo36059n(bigDecimal2));
        }
    }

    /* renamed from: c */
    public final SearchFiltersUiGroupItem.C10781b mo36048c(FacetCount facetCount, String str) {
        ArrayList e0 = C19388s.m32860e0(facetCount, str);
        if (facetCount == null) {
            return null;
        }
        if (e0 == null) {
            C11786n nVar = this.f24078a;
            C19383o.m32797g(nVar, "resourceProvider");
            C10789b n0 = C19388s.m32875n0(facetCount, 0, true, (String) null, C17782b.m29864d0(facetCount.getName()));
            List<FacetCount> children = facetCount.getChildren();
            C19383o.m32796f(children, "facetCount.children");
            List<FacetCount> l1 = C19327t.m32656l1(children, new C10859v());
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(l1));
            for (FacetCount facetCount2 : l1) {
                C19383o.m32796f(facetCount2, "it");
                arrayList.add(C19388s.m32875n0(facetCount2, 1, false, facetCount2.getId(), C17782b.m29865e0(facetCount.getName(), facetCount2.getName())));
            }
            return new SearchFiltersUiGroupItem.C10781b(C19327t.m32650f1(arrayList, C17782b.m29864d0(n0)), nVar.mo38059c(R.string.category, new Object[0]));
        }
        C11786n nVar2 = this.f24078a;
        C19383o.m32797g(nVar2, "resourceProvider");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(C19322o.m32624F0(e0));
        int i = 0;
        for (Object next : e0) {
            int i2 = i + 1;
            if (i >= 0) {
                FacetCount facetCount3 = (FacetCount) next;
                String name = facetCount3.getName();
                C19383o.m32796f(name, "facet.name");
                arrayList2.add(name);
                arrayList3.add(C19388s.m32875n0(facetCount3, i, i == C17782b.m29859Y(e0), C19383o.m32792b(facetCount3.getId(), "top-level-facets") ? null : facetCount3.getId(), arrayList2));
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        List<FacetCount> children2 = ((FacetCount) C19327t.m32645a1(e0)).getChildren();
        C19383o.m32796f(children2, "categoryPath.last().children");
        List<FacetCount> l12 = C19327t.m32656l1(children2, new C10860w());
        ArrayList arrayList4 = new ArrayList(C19322o.m32624F0(l12));
        for (FacetCount facetCount4 : l12) {
            C19383o.m32796f(facetCount4, "it");
            arrayList4.add(C19388s.m32875n0(facetCount4, C17782b.m29859Y(e0) + 1, false, facetCount4.getId(), C19327t.m32651g1(arrayList2, facetCount4.getName())));
        }
        return new SearchFiltersUiGroupItem.C10781b(C19327t.m32650f1(arrayList4, arrayList3), nVar2.mo38059c(R.string.category, new Object[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0102 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0025 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo36049d(java.util.List r21, com.etsy.android.lib.models.apiv3.filters.StaticFilters r22, java.util.Map r23, java.util.List r24) {
        /*
            r20 = this;
            r0 = r23
            r1 = r24
            java.lang.String r2 = "dynamicFacets"
            r3 = r21
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            java.lang.String r2 = "selections"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.String r2 = "expandedFilters"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r2 = r20
            le.a r4 = r2.f24082e
            r4.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r21.iterator()
        L_0x0025:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00f1
            java.lang.Object r5 = r3.next()
            com.etsy.android.lib.models.apiv3.filters.AttributeFacet r5 = (com.etsy.android.lib.models.apiv3.filters.AttributeFacet) r5
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r7 = r5.getAttribute()
            if (r7 == 0) goto L_0x0042
            java.lang.Boolean r7 = r7.isSize()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
            goto L_0x0043
        L_0x0042:
            r7 = 0
        L_0x0043:
            if (r7 == 0) goto L_0x0098
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r7 = r5.getAttribute()
            if (r7 == 0) goto L_0x00e9
            java.lang.String r7 = r7.getName()
            if (r7 != 0) goto L_0x0053
            goto L_0x00e9
        L_0x0053:
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r8 = r5.getAttribute()
            if (r8 == 0) goto L_0x00e9
            java.lang.String r8 = r8.getId()
            if (r8 != 0) goto L_0x0061
            goto L_0x00e9
        L_0x0061:
            java.lang.Object r6 = r0.get(r8)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x006b
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x006b:
            java.util.List r5 = r5.getValueFacets()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0078:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x008e
            java.lang.Object r10 = r5.next()
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r10 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r10
            com.etsy.android.ui.search.filters.refactor.d r10 = p391le.C13016a.m20732a(r8, r10, r6)
            if (r10 == 0) goto L_0x0078
            r9.add(r10)
            goto L_0x0078
        L_0x008e:
            com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$SizeSelect r6 = new com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$SizeSelect
            boolean r5 = r1.contains(r8)
            r6.<init>(r8, r9, r5, r7)
            goto L_0x00ea
        L_0x0098:
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r7 = r5.getAttribute()
            if (r7 == 0) goto L_0x00e9
            java.lang.String r7 = r7.getName()
            if (r7 != 0) goto L_0x00a5
            goto L_0x00e9
        L_0x00a5:
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r8 = r5.getAttribute()
            if (r8 == 0) goto L_0x00e9
            java.lang.String r8 = r8.getId()
            if (r8 != 0) goto L_0x00b2
            goto L_0x00e9
        L_0x00b2:
            java.lang.Object r6 = r0.get(r8)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x00bc
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x00bc:
            java.util.List r5 = r5.getValueFacets()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00c9:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x00df
            java.lang.Object r10 = r5.next()
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r10 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r10
            com.etsy.android.ui.search.filters.refactor.d r10 = p391le.C13016a.m20732a(r8, r10, r6)
            if (r10 == 0) goto L_0x00c9
            r9.add(r10)
            goto L_0x00c9
        L_0x00df:
            com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$MultiSelect r6 = new com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$MultiSelect
            boolean r5 = r1.contains(r8)
            r6.<init>(r8, r9, r5, r7)
            goto L_0x00ea
        L_0x00e9:
            r6 = 0
        L_0x00ea:
            if (r6 == 0) goto L_0x0025
            r4.add(r6)
            goto L_0x0025
        L_0x00f1:
            if (r22 == 0) goto L_0x01d7
            java.util.List r3 = r22.getAttributes()
            if (r3 == 0) goto L_0x01d7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0102:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01d5
            java.lang.Object r7 = r3.next()
            com.etsy.android.lib.models.apiv3.filters.StaticFilterAttribute r7 = (com.etsy.android.lib.models.apiv3.filters.StaticFilterAttribute) r7
            java.lang.String r8 = "staticFilterAttribute"
            kotlin.jvm.internal.C19383o.m32797g(r7, r8)
            java.lang.String r8 = r7.getId()
            java.lang.String r9 = "1"
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            if (r8 == 0) goto L_0x01cd
            java.lang.String r8 = r7.getName()
            if (r8 != 0) goto L_0x0127
            goto L_0x01cd
        L_0x0127:
            java.lang.String r15 = r7.getId()
            if (r15 != 0) goto L_0x012f
            goto L_0x01cd
        L_0x012f:
            java.lang.Object r9 = r0.get(r15)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L_0x0139
            kotlin.collections.EmptyList r9 = kotlin.collections.EmptyList.INSTANCE
        L_0x0139:
            r14 = r9
            java.util.List r7 = r7.getValues()
            if (r7 == 0) goto L_0x01b9
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0149:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x01b6
            java.lang.Object r9 = r7.next()
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r9 = (com.etsy.android.lib.models.apiv3.filters.AttributeValue) r9
            java.lang.String r10 = r9.getId()
            if (r10 != 0) goto L_0x015c
            goto L_0x0185
        L_0x015c:
            java.lang.String r12 = r9.getName()
            if (r12 != 0) goto L_0x0163
            goto L_0x0185
        L_0x0163:
            java.util.LinkedHashMap r11 = com.etsy.android.p327ui.search.filters.refactor.C10811j.f23949a
            java.lang.String r6 = r9.getId()
            java.lang.Object r6 = r11.get(r6)
            com.etsy.android.ui.search.filters.refactor.h r6 = (com.etsy.android.p327ui.search.filters.refactor.C10804h) r6
            com.etsy.android.lib.models.apiv3.Image r9 = r9.getImage()
            if (r9 == 0) goto L_0x017a
            java.lang.String r9 = r9.getUrl()
            goto L_0x017b
        L_0x017a:
            r9 = 0
        L_0x017b:
            if (r6 != 0) goto L_0x018c
            if (r9 == 0) goto L_0x0185
            com.etsy.android.ui.search.filters.refactor.h$c r6 = new com.etsy.android.ui.search.filters.refactor.h$c
            r6.<init>(r9)
            goto L_0x018c
        L_0x0185:
            r19 = r13
            r16 = r14
            r6 = r15
            r9 = 0
            goto L_0x01a4
        L_0x018c:
            boolean r16 = r14.contains(r10)
            com.etsy.android.ui.search.filters.refactor.c r17 = new com.etsy.android.ui.search.filters.refactor.c
            r18 = 1
            r9 = r17
            r11 = r15
            r19 = r13
            r13 = r16
            r16 = r14
            r14 = r6
            r6 = r15
            r15 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15)
        L_0x01a4:
            if (r9 == 0) goto L_0x01b0
            r10 = r19
            r10.add(r9)
            r15 = r6
            r13 = r10
            r14 = r16
            goto L_0x0149
        L_0x01b0:
            r15 = r6
            r14 = r16
            r13 = r19
            goto L_0x0149
        L_0x01b6:
            r10 = r13
            r6 = r15
            goto L_0x01bc
        L_0x01b9:
            r6 = r15
            kotlin.collections.EmptyList r13 = kotlin.collections.EmptyList.INSTANCE
        L_0x01bc:
            boolean r7 = r13.isEmpty()
            if (r7 == 0) goto L_0x01c3
            goto L_0x01cd
        L_0x01c3:
            com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$ColorSelect r7 = new com.etsy.android.ui.search.filters.refactor.SearchFiltersUiGroupItem$ColorSelect
            boolean r9 = r1.contains(r6)
            r7.<init>(r6, r13, r9, r8)
            goto L_0x01ce
        L_0x01cd:
            r7 = 0
        L_0x01ce:
            if (r7 == 0) goto L_0x0102
            r5.add(r7)
            goto L_0x0102
        L_0x01d5:
            r6 = r5
            goto L_0x01d8
        L_0x01d7:
            r6 = 0
        L_0x01d8:
            if (r6 != 0) goto L_0x01dc
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x01dc:
            java.util.ArrayList r0 = kotlin.collections.C19327t.m32650f1(r6, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.C10857u.mo36049d(java.util.List, com.etsy.android.lib.models.apiv3.filters.StaticFilters, java.util.Map, java.util.List):java.util.ArrayList");
    }

    /* renamed from: e */
    public final SearchFiltersUiGroupItem.ItemType mo36050e(SearchOptions.MarketPlace marketPlace) {
        int i;
        String e = C0069a.m174e("randomUUID().toString()");
        int i2 = C10858a.f24085b[marketPlace.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            i = ItemTypeSelectItem.ItemTypeType.ALL_ITEMS_ID.ordinal();
        } else if (i2 == 2) {
            i = ItemTypeSelectItem.ItemTypeType.HANDMADE_ID.ordinal();
        } else if (i2 == 3) {
            i = ItemTypeSelectItem.ItemTypeType.VINTAGE_ID.ordinal();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ItemTypeSelectItem.ItemTypeType[] values = ItemTypeSelectItem.ItemTypeType.values();
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            ItemTypeSelectItem.ItemTypeType itemTypeType = values[i3];
            int i5 = i4 + 1;
            C11786n nVar = this.f24078a;
            if (i4 != i) {
                z = false;
            }
            C19383o.m32797g(nVar, "resourceProvider");
            C19383o.m32797g(itemTypeType, "selectedItemType");
            arrayList.add(new ItemTypeSelectItem(C0069a.m174e("randomUUID().toString()"), nVar.mo38059c(itemTypeType.getNameResource(), new Object[0]), z, itemTypeType));
            i3++;
            z = true;
            i4 = i5;
        }
        return new SearchFiltersUiGroupItem.ItemType(e, arrayList, false, this.f24078a.mo38059c(R.string.new_search_filter_item_type, new Object[0]));
    }

    /* renamed from: f */
    public final SearchFiltersUiGroupItem.OtherOptions mo36051f(boolean z, boolean z2, boolean z3, boolean z4) {
        String e = C0069a.m174e("randomUUID().toString()");
        return new SearchFiltersUiGroupItem.OtherOptions(e, this.f24078a.mo38059c(R.string.structured_payment_other_options, new Object[0]), false, new C10798d(e, this.f24078a.mo38059c(R.string.new_search_filter_onsale, new Object[0]), z), new C10798d(e, this.f24078a.mo38059c(R.string.new_search_filter_accepts_giftcards, new Object[0]), z2), new C10798d(e, this.f24078a.mo38059c(R.string.new_search_filter_customizable, new Object[0]), z3), new C10798d(e, this.f24078a.mo38059c(R.string.new_search_filter_gift_wrapped, new Object[0]), z4));
    }

    /* renamed from: g */
    public final SearchFiltersUiGroupItem.C10783d mo36052g(List<Integer> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, boolean z3) {
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        boolean z4 = z2;
        boolean z5 = z3;
        String currencySymbol = this.f24079b.mo21248a("0", this.f24080c.mo21246a()).getCurrencySymbol();
        List b = m18866b(list);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(b));
        Iterator it = b.iterator();
        while (true) {
            boolean z6 = false;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            BigDecimal bigDecimal5 = (BigDecimal) pair.component1();
            BigDecimal bigDecimal6 = (BigDecimal) pair.component2();
            String a = mo36047a(bigDecimal5, bigDecimal6);
            if (z && C19383o.m32792b(bigDecimal5, bigDecimal3) && C19383o.m32792b(bigDecimal6, bigDecimal4)) {
                z6 = true;
            }
            arrayList.add(new C10803g(a, z6, bigDecimal5, bigDecimal6, PriceSelectType.PRICE_RANGE, 65));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(mo36060o(z4));
        arrayList2.addAll(arrayList);
        arrayList2.add(mo36061p(z5, z5 ? bigDecimal3 : null, z5 ? bigDecimal4 : null));
        PriceRange priceRange = z5 ? new PriceRange(bigDecimal3, bigDecimal4) : new PriceRange((BigDecimal) null, (BigDecimal) null);
        return new SearchFiltersUiGroupItem.C10783d(C0069a.m174e("randomUUID().toString()"), this.f24078a.mo38059c(R.string.price, new Object[0]), mo36054i(z4, bigDecimal3, bigDecimal4), false, arrayList2, currencySymbol + 9 + this.f24078a.mo38059c(R.string.search_filters_price_min, new Object[0]), currencySymbol + 9 + this.f24078a.mo38059c(R.string.search_filters_price_max, new Object[0]), priceRange, false);
    }

    /* renamed from: h */
    public final SearchFiltersUiGroupItem.C10782c mo36053h(List<Integer> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        boolean z5 = z2;
        boolean z6 = z3;
        if (!this.f24083f.f23989a.mo21132b(C8592b.f18762U0)) {
            return null;
        }
        String currencySymbol = this.f24079b.mo21248a("0", this.f24080c.mo21246a()).getCurrencySymbol();
        List<Pair> b = m18866b(list);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(b));
        for (Pair pair : b) {
            BigDecimal bigDecimal5 = (BigDecimal) pair.component1();
            BigDecimal bigDecimal6 = (BigDecimal) pair.component2();
            String a = mo36047a(bigDecimal5, bigDecimal6);
            if (z) {
                if (bigDecimal3 != null && bigDecimal5.compareTo(bigDecimal3) >= 0) {
                    if ((bigDecimal6 == null && bigDecimal4 == null) || (bigDecimal6 != null && (bigDecimal4 == null || bigDecimal6.compareTo(bigDecimal4) <= 0))) {
                        z4 = true;
                        arrayList.add(new C10803g(a, z4, bigDecimal5, bigDecimal6, PriceSelectType.PRICE_RANGE, 65));
                    }
                }
            }
            z4 = false;
            arrayList.add(new C10803g(a, z4, bigDecimal5, bigDecimal6, PriceSelectType.PRICE_RANGE, 65));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(mo36060o(z5));
        arrayList2.addAll(arrayList);
        arrayList2.add(mo36061p(z6, z6 ? bigDecimal3 : null, z6 ? bigDecimal4 : null));
        PriceRange priceRange = z6 ? new PriceRange(bigDecimal3, bigDecimal4) : new PriceRange((BigDecimal) null, (BigDecimal) null);
        return new SearchFiltersUiGroupItem.C10782c(C0069a.m174e("randomUUID().toString()"), this.f24078a.mo38059c(R.string.price, new Object[0]), mo36054i(z5, bigDecimal3, bigDecimal4), false, arrayList2, currencySymbol + 9 + this.f24078a.mo38059c(R.string.search_filters_price_min, new Object[0]), currencySymbol + 9 + this.f24078a.mo38059c(R.string.search_filters_price_max, new Object[0]), priceRange, false);
    }

    /* renamed from: i */
    public final String mo36054i(boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        String str;
        if (z) {
            return this.f24078a.mo38059c(R.string.search_filters_any_price, new Object[0]);
        }
        String str2 = null;
        if (bigDecimal != null) {
            str = this.f24079b.mo21248a(bigDecimal.toString(), this.f24080c.mo21246a()).setMaximumFractionDigits(bigDecimal.scale() <= 0 ? 0 : 2).format();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        if (bigDecimal2 != null) {
            str2 = this.f24079b.mo21248a(bigDecimal2.toString(), this.f24080c.mo21246a()).setMaximumFractionDigits(bigDecimal2.scale() <= 0 ? 0 : 2).format();
        }
        if (str2 != null) {
            str3 = str2;
        }
        if (bigDecimal == null || C19383o.m32792b(bigDecimal, BigDecimal.ZERO)) {
            return this.f24078a.mo38059c(R.string.search_filters_price_max_bound_desc, str3);
        } else if (bigDecimal2 == null) {
            return this.f24078a.mo38059c(R.string.search_filters_price_min_bound_desc, str);
        } else {
            return this.f24078a.mo38059c(R.string.search_filters_price_range_desc, str, str3);
        }
    }

    /* renamed from: j */
    public final SearchFiltersUiGroupItem.Shipping mo36055j(boolean z, boolean z2, boolean z3) {
        boolean z4;
        String e = C0069a.m174e("randomUUID().toString()");
        ShippingSelectItem.ShippingType[] values = ShippingSelectItem.ShippingType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (ShippingSelectItem.ShippingType shippingType : values) {
            int i = C10858a.f24086c[shippingType.ordinal()];
            if (i == 1) {
                z4 = z;
            } else if (i == 2) {
                z4 = z2;
            } else if (i == 3) {
                z4 = z3;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C11786n nVar = this.f24078a;
            C19383o.m32797g(nVar, "resourceProvider");
            arrayList.add(new ShippingSelectItem(C0069a.m174e("randomUUID().toString()"), nVar.mo38059c(shippingType.getNameResource(), new Object[0]), z4, shippingType));
        }
        return new SearchFiltersUiGroupItem.Shipping(e, arrayList, false, this.f24078a.mo38059c(R.string.shipping, new Object[0]));
    }

    /* renamed from: k */
    public final SearchFiltersUiGroupItem.C10784e mo36056k(FilterCountry filterCountry) {
        return new SearchFiltersUiGroupItem.C10784e(false, C0069a.m174e("randomUUID().toString()"), this.f24078a.mo38059c(R.string.search_filter_ships_to_title, new Object[0]), filterCountry.getDisplayName(), filterCountry.getCountryCode());
    }

    /* renamed from: l */
    public final SearchFiltersUiGroupItem.C10785f mo36057l(SearchOptions.Location location) {
        boolean z = true;
        boolean z2 = location.getType() == SearchOptions.Location.LocationType.CUSTOM;
        String location2 = z2 ? location.getLocation() : "";
        String c = this.f24078a.mo38059c(R.string.search_filter_location_title, new Object[0]);
        C10799d0 d0Var = new C10799d0(C0069a.m174e("randomUUID().toString()"), this.f24078a.mo38059c(R.string.new_search_filter_shop_location_anywhere, new Object[0]), location.getType() == SearchOptions.Location.LocationType.ANYWHERE);
        String displayCountry = this.f24081d.mo46719c().getDisplayCountry();
        C19383o.m32796f(displayCountry, "currentLocale.getSystemLocale().displayCountry");
        if (location.getType() != SearchOptions.Location.LocationType.LOCAL) {
            z = false;
        }
        String country = this.f24081d.mo46719c().getCountry();
        C19383o.m32796f(country, "currentLocale.getSystemLocale().country");
        return new SearchFiltersUiGroupItem.C10785f(C0069a.m174e("randomUUID().toString()"), c, false, d0Var, new C10801e0(C0069a.m174e("randomUUID().toString()"), displayCountry, z, country), new C10793c0(C0069a.m174e("randomUUID().toString()"), this.f24078a.mo38059c(R.string.new_search_filter_shop_location_custom_title, new Object[0]), z2, location2));
    }

    /* renamed from: m */
    public final SearchFiltersUiGroupItem.SortBy mo36058m(SortOrder sortOrder) {
        int i;
        String e = C0069a.m174e("randomUUID().toString()");
        int i2 = C10858a.f24084a[sortOrder.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            i = SortBySelectItem.SortByType.RELEVANCY.ordinal();
        } else if (i2 == 2) {
            i = SortBySelectItem.SortByType.MOST_RECENT.ordinal();
        } else if (i2 == 3) {
            i = SortBySelectItem.SortByType.HIGHEST_PRICE.ordinal();
        } else if (i2 == 4) {
            i = SortBySelectItem.SortByType.LOWEST_PRICE.ordinal();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        SortBySelectItem.SortByType[] values = SortBySelectItem.SortByType.values();
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            SortBySelectItem.SortByType sortByType = values[i3];
            int i5 = i4 + 1;
            C11786n nVar = this.f24078a;
            if (i4 != i) {
                z = false;
            }
            C19383o.m32797g(nVar, "resourceProvider");
            C19383o.m32797g(sortByType, "sortOrder");
            arrayList.add(new SortBySelectItem(C0069a.m174e("randomUUID().toString()"), nVar.mo38059c(sortByType.getNameResource(), new Object[0]), z, sortByType));
            i3++;
            z = true;
            i4 = i5;
        }
        return new SearchFiltersUiGroupItem.SortBy(e, arrayList, false, this.f24078a.mo38059c(R.string.new_search_filter_sort_by, new Object[0]));
    }

    /* renamed from: n */
    public final String mo36059n(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return "";
        }
        return this.f24079b.mo21248a(bigDecimal.toString(), this.f24080c.mo21246a()).setMaximumFractionDigits(bigDecimal.scale() <= 0 ? 0 : 2).format();
    }

    /* renamed from: o */
    public final C10803g mo36060o(boolean z) {
        return new C10803g(this.f24078a.mo38059c(R.string.search_filters_any_price, new Object[0]), z, (BigDecimal) null, (BigDecimal) null, PriceSelectType.ANY_PRICE, 89);
    }

    /* renamed from: p */
    public final C10803g mo36061p(boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return new C10803g(this.f24078a.mo38059c(R.string.order_custom, new Object[0]), z, bigDecimal, bigDecimal2, PriceSelectType.CUSTOM_PRICE, 65);
    }
}
