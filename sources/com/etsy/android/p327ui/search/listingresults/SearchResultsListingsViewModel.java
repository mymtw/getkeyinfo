package com.etsy.android.p327ui.search.listingresults;

import android.view.View;
import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8710g;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.SearchBannerMessage;
import com.etsy.android.lib.models.apiv3.search.GuidedSearch;
import com.etsy.android.lib.models.apiv3.search.QueryCorrection;
import com.etsy.android.lib.models.cardviewelement.SearchFilterHeader;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.lib.persistviewed.PersistViewedBus;
import com.etsy.android.p327ui.search.listingresults.C10909i;
import com.etsy.android.p327ui.search.listingresults.C10920j;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState;
import com.etsy.android.p327ui.search.p330v2.C10971c;
import com.etsy.android.p327ui.search.p330v2.C11028i;
import com.etsy.android.p327ui.search.p330v2.filters.C10982c;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.search.savedsearch.C8976b;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p145io.reactivex.disposables.C7091a;
import p277w8.C8267e;
import p422pe.C13225d;
import p445sf.C13380b;
import p456ua.C13461f;
import p496za.C13943a;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel */
public final class SearchResultsListingsViewModel extends C2866i0 {

    /* renamed from: b */
    public final C13461f f24172b;

    /* renamed from: c */
    public final C11028i f24173c;

    /* renamed from: d */
    public final SearchWithAdsRepository f24174d;

    /* renamed from: e */
    public final C13225d f24175e;

    /* renamed from: f */
    public final ListingCardViewHolderOptions.C11974h f24176f;

    /* renamed from: g */
    public final C8629a f24177g;

    /* renamed from: h */
    public final C10971c f24178h;

    /* renamed from: i */
    public final C13380b f24179i;

    /* renamed from: j */
    public final C8710g f24180j;

    /* renamed from: k */
    public final C8267e f24181k;

    /* renamed from: l */
    public final C10903c f24182l;

    /* renamed from: m */
    public final C8976b f24183m;

    /* renamed from: n */
    public final C11786n f24184n;

    /* renamed from: o */
    public final C13943a f24185o;

    /* renamed from: p */
    public final C10982c f24186p;

    /* renamed from: q */
    public final C8694h f24187q;

    /* renamed from: r */
    public final C10901a f24188r;

    /* renamed from: s */
    public final CoroutineDispatcher f24189s;

    /* renamed from: t */
    public final StateFlowImpl f24190t;

    /* renamed from: u */
    public final C19662p1 f24191u;

    /* renamed from: v */
    public final C7091a f24192v = new C7091a();

    /* renamed from: w */
    public C10923k f24193w = new C10923k(this);

    public SearchResultsListingsViewModel(C13461f fVar, C11028i iVar, SearchWithAdsRepository searchWithAdsRepository, C13225d dVar, ListingCardViewHolderOptions.C11974h hVar, C8629a aVar, C10971c cVar, C13380b bVar, C8710g gVar, C8267e eVar, C10903c cVar2, C8976b bVar2, C11786n nVar, C13943a aVar2, C10982c cVar3, PersistViewedBus persistViewedBus, C8694h hVar2, C10901a aVar3, CoroutineDispatcher coroutineDispatcher) {
        C13461f fVar2 = fVar;
        C11028i iVar2 = iVar;
        SearchWithAdsRepository searchWithAdsRepository2 = searchWithAdsRepository;
        C13225d dVar2 = dVar;
        ListingCardViewHolderOptions.C11974h hVar3 = hVar;
        C8629a aVar4 = aVar;
        C10971c cVar4 = cVar;
        C13380b bVar3 = bVar;
        C8710g gVar2 = gVar;
        C8267e eVar2 = eVar;
        C10903c cVar5 = cVar2;
        C8976b bVar4 = bVar2;
        C11786n nVar2 = nVar;
        C13943a aVar5 = aVar2;
        C8694h hVar4 = hVar2;
        C19383o.m32797g(fVar2, "rxSchedulers");
        C19383o.m32797g(iVar2, "simplifiedQueriesRepository");
        C19383o.m32797g(searchWithAdsRepository2, "searchWithAdsRepository");
        C19383o.m32797g(dVar2, "searchImpressionRepository");
        C19383o.m32797g(hVar3, "searchResults");
        C19383o.m32797g(aVar4, "appCurrency");
        C19383o.m32797g(cVar4, "searchBuyerFeatures");
        C19383o.m32797g(bVar3, "pagination");
        C19383o.m32797g(gVar2, "performanceTrackerAdapter");
        C19383o.m32797g(eVar2, "adImpressionRepository");
        C19383o.m32797g(cVar5, "searchResultsListingsEligibility");
        C19383o.m32797g(bVar4, "savedSearchPromptEligibility");
        C19383o.m32797g(nVar2, "resourceProvider");
        C19383o.m32797g(aVar5, "sharedPreferencesProvider");
        C19383o.m32797g(cVar3, "searchFiltersViewModel");
        C19383o.m32797g(persistViewedBus, "persistViewedBus");
        C19383o.m32797g(hVar2, "logCat");
        C19383o.m32797g(aVar3, "recentlyViewedLogic");
        C19383o.m32797g(coroutineDispatcher, "defaultDispatcher");
        this.f24172b = fVar2;
        this.f24173c = iVar2;
        this.f24174d = searchWithAdsRepository2;
        this.f24175e = dVar2;
        this.f24176f = hVar3;
        this.f24177g = aVar4;
        this.f24178h = cVar4;
        this.f24179i = bVar3;
        this.f24180j = gVar2;
        this.f24181k = eVar2;
        this.f24182l = cVar5;
        this.f24183m = bVar4;
        this.f24184n = nVar2;
        this.f24185o = aVar5;
        this.f24186p = cVar3;
        this.f24187q = hVar2;
        this.f24188r = aVar3;
        this.f24189s = coroutineDispatcher;
        StateFlowImpl g = C19388s.m32862g(new SearchResultsListingsState(EmptyList.INSTANCE, "", (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List<SearchBannerMessage>) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List<IFormattedTaxonomyCategory>) null, SearchResultsListingsState.ViewMode.TWO_BY_TWO, false, false, (View) null, C10920j.C10922b.f24233a));
        this.f24190t = g;
        this.f24191u = C0761x.m1750w(g);
        mo36202i(aVar2.mo46761a().getBoolean("show3x3viewTry2", false));
        aVar2.mo46761a().registerOnSharedPreferenceChangeListener(this.f24193w);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x013a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.etsy.android.lib.models.cardviewelement.Page mo36195b(com.etsy.android.p327ui.search.p330v2.SearchOptions r27, java.util.List r28, boolean r29) {
        /*
            r26 = this;
            r0 = r26
            com.etsy.android.lib.models.cardviewelement.Page r1 = new com.etsy.android.lib.models.cardviewelement.Page
            r1.<init>()
            int r2 = r26.mo36200g()
            if (r2 > 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.etsy.android.lib.models.cardviewelement.ListSection r3 = new com.etsy.android.lib.models.cardviewelement.ListSection
            r3.<init>()
            r4 = 0
            if (r29 == 0) goto L_0x003b
            com.etsy.android.lib.models.cardviewelement.SearchFilterHeader r5 = r26.mo36197d()
            if (r5 != 0) goto L_0x0034
            com.etsy.android.lib.models.cardviewelement.SearchFilterHeader r5 = new com.etsy.android.lib.models.cardviewelement.SearchFilterHeader
            com.etsy.android.ui.util.n r6 = r0.f24184n
            r7 = 2131953387(0x7f1306eb, float:1.9543244E38)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r6 = r6.mo38059c(r7, r8)
            r5.<init>(r6)
            r0.mo36203j(r5)
        L_0x0034:
            com.etsy.android.lib.models.cardviewelement.SearchFilterHeader r5 = r26.mo36197d()
            r3.setHeader(r5)
        L_0x003b:
            com.etsy.android.lib.models.apiv3.ListingCard r5 = r26.mo36196c()
            if (r5 == 0) goto L_0x0094
            if (r29 == 0) goto L_0x0094
            com.etsy.android.lib.models.apiv3.ListingCard r5 = r26.mo36196c()
            if (r5 != 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            r6 = 2131430414(0x7f0b0c0e, float:1.8482528E38)
            r5.setViewType(r6)
        L_0x0050:
            kotlinx.coroutines.flow.StateFlowImpl r10 = r0.f24190t
        L_0x0052:
            java.lang.Object r15 = r10.getValue()
            r6 = r15
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r6 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r6
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r4 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 262135(0x3fff7, float:3.6733E-40)
            r25 = r1
            r1 = r10
            r10 = r5
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r6 = com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState.m18908b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r4 = r1.mo72337i(r4, r6)
            if (r4 == 0) goto L_0x008f
            com.etsy.android.lib.models.apiv3.ListingCard r1 = r26.mo36196c()
            kotlin.jvm.internal.C19383o.m32794d(r1)
            r2.add(r1)
            goto L_0x0096
        L_0x008f:
            r10 = r1
            r1 = r25
            r4 = 0
            goto L_0x0052
        L_0x0094:
            r25 = r1
        L_0x0096:
            r1 = r28
            r2.addAll(r1)
            com.etsy.android.ui.search.listingresults.c r4 = r0.f24182l
            com.etsy.android.lib.config.e r4 = r4.f24207a
            com.etsy.android.lib.config.EtsyConfigKey r5 = com.etsy.android.lib.config.C8592b.f18758S0
            o9.l r4 = r4.mo21137g(r5)
            boolean r5 = r4.mo45840h()
            r6 = 1
            if (r5 == 0) goto L_0x00bc
            kotlinx.coroutines.flow.p1 r5 = r0.f24191u
            java.lang.Object r5 = r5.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r5
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState$ViewMode r5 = r5.f24167n
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState$ViewMode r7 = com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState.ViewMode.TWO_BY_TWO
            if (r5 != r7) goto L_0x00bc
            r5 = r6
            goto L_0x00bd
        L_0x00bc:
            r5 = 0
        L_0x00bd:
            if (r5 == 0) goto L_0x015a
            java.lang.String r4 = r4.f28871b
            int r5 = r4.hashCode()
            r7 = -874698270(0xffffffffcbdd29e2, float:-2.8988356E7)
            r8 = 10
            if (r5 == r7) goto L_0x00e9
            r7 = -860968463(0xffffffffccaea9f1, float:-9.1574152E7)
            if (r5 == r7) goto L_0x00dd
            r7 = 114717(0x1c01d, float:1.60753E-40)
            if (r5 == r7) goto L_0x00d7
            goto L_0x00f4
        L_0x00d7:
            java.lang.String r5 = "ten"
            r4.equals(r5)
            goto L_0x00f4
        L_0x00dd:
            java.lang.String r5 = "twenty"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00e6
            goto L_0x00f4
        L_0x00e6:
            r8 = 20
            goto L_0x00f4
        L_0x00e9:
            java.lang.String r5 = "thirty"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r8 = 30
        L_0x00f4:
            int r4 = r2.size()
            int r1 = r28.size()
            int r4 = r4 - r1
            if (r29 == 0) goto L_0x0101
            r1 = 0
            goto L_0x010b
        L_0x0101:
            kotlinx.coroutines.flow.p1 r1 = r0.f24191u
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r1 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r1
            int r1 = r1.f24164k
        L_0x010b:
            int r8 = r8 * 2
            int r8 = r8 - r1
            int r4 = r4 + r8
            if (r8 < 0) goto L_0x0137
            int r1 = r2.size()
            if (r1 <= r4) goto L_0x0137
            kotlinx.coroutines.flow.p1 r1 = r0.f24191u
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r1 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r1
            com.etsy.android.lib.models.apiv3.search.GuidedSearch r1 = r1.f24158e
            if (r1 == 0) goto L_0x0132
            java.util.List r1 = r1.getQueryReformulations()
            if (r1 == 0) goto L_0x0132
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r6
            if (r1 != r6) goto L_0x0132
            r1 = r6
            goto L_0x0133
        L_0x0132:
            r1 = 0
        L_0x0133:
            if (r1 == 0) goto L_0x0137
            r1 = r6
            goto L_0x0138
        L_0x0137:
            r1 = 0
        L_0x0138:
            if (r1 == 0) goto L_0x015a
            com.etsy.android.ui.util.n r1 = r0.f24184n
            r5 = 2131952378(0x7f1302fa, float:1.9541197E38)
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r1 = r1.mo38059c(r5, r8)
            com.etsy.android.search.e r5 = new com.etsy.android.search.e
            kotlinx.coroutines.flow.p1 r7 = r0.f24191u
            java.lang.Object r7 = r7.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r7 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r7
            com.etsy.android.lib.models.apiv3.search.GuidedSearch r7 = r7.f24158e
            r8 = r27
            r5.<init>(r7, r8, r1)
            r2.add(r4, r5)
        L_0x015a:
            if (r29 == 0) goto L_0x017d
            kotlinx.coroutines.flow.p1 r1 = r0.f24191u
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r1 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r1
            java.util.List<com.etsy.android.lib.models.apiv3.SearchBannerMessage> r1 = r1.f24160g
            boolean r1 = kotlinx.coroutines.C19543e0.m33306Y(r1)
            if (r1 == 0) goto L_0x017d
            kotlinx.coroutines.flow.p1 r1 = r0.f24191u
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r1 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r1
            java.util.List<com.etsy.android.lib.models.apiv3.SearchBannerMessage> r1 = r1.f24160g
            kotlin.jvm.internal.C19383o.m32794d(r1)
            r4 = 0
            r2.addAll(r4, r1)
        L_0x017d:
            kotlinx.coroutines.flow.p1 r1 = r0.f24191u
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r1 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r1
            java.util.List<com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory> r1 = r1.f24166m
            if (r1 == 0) goto L_0x019b
            if (r29 == 0) goto L_0x019b
            boolean r4 = r1.isEmpty()
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x019b
            com.etsy.android.ui.cardview.viewholders.p r4 = new com.etsy.android.ui.cardview.viewholders.p
            r4.<init>(r1)
            r1 = 0
            r2.add(r1, r4)
        L_0x019b:
            r3.setItems(r2)
            r1 = r25
            r1.addListSection(r3)
            if (r29 == 0) goto L_0x01cb
            kotlinx.coroutines.flow.StateFlowImpl r2 = r0.f24190t
        L_0x01a7:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r4 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r4
            com.etsy.android.ui.search.listingresults.i$i r5 = new com.etsy.android.ui.search.listingresults.i$i
            int r6 = r26.mo36200g()
            kotlinx.coroutines.flow.p1 r7 = r0.f24191u
            java.lang.Object r7 = r7.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r7 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r7
            com.etsy.android.lib.models.apiv3.search.QueryCorrection r7 = r7.f24159f
            r5.<init>(r6, r7)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r4 = r4.mo36191a(r5)
            boolean r3 = r2.mo72337i(r3, r4)
            if (r3 == 0) goto L_0x01a7
        L_0x01cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.listingresults.SearchResultsListingsViewModel.mo36195b(com.etsy.android.ui.search.v2.SearchOptions, java.util.List, boolean):com.etsy.android.lib.models.cardviewelement.Page");
    }

    /* renamed from: c */
    public final ListingCard mo36196c() {
        return ((SearchResultsListingsState) this.f24191u.getValue()).f24157d;
    }

    /* renamed from: d */
    public final SearchFilterHeader mo36197d() {
        return ((SearchResultsListingsState) this.f24191u.getValue()).f24165l;
    }

    /* renamed from: e */
    public final String mo36198e() {
        return ((SearchResultsListingsState) this.f24191u.getValue()).f24155b;
    }

    /* renamed from: f */
    public final Long mo36199f() {
        return ((SearchResultsListingsState) this.f24191u.getValue()).f24161h;
    }

    /* renamed from: g */
    public final int mo36200g() {
        return ((SearchResultsListingsState) this.f24191u.getValue()).f24163j;
    }

    /* renamed from: h */
    public final void mo36201h() {
        Object value;
        String str = ((SearchResultsListingsState) this.f24191u.getValue()).f24167n == SearchResultsListingsState.ViewMode.THREE_BY_THREE ? "micro" : "standard";
        HashMap hashMap = new HashMap();
        hashMap.put(PredefinedAnalyticsProperty.LISTING_CARD_SIZE, str);
        if (mo36199f() != null) {
            hashMap.put(PredefinedAnalyticsProperty.CONTENT_SOURCE, "saved_searches");
        }
        if (mo36198e().length() > 0) {
            hashMap.put(PredefinedAnalyticsProperty.QUERY, mo36198e());
        }
        StateFlowImpl stateFlowImpl = this.f24190t;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, ((SearchResultsListingsState) value).mo36191a(new C10909i.C10910a(hashMap))));
    }

    /* renamed from: i */
    public final void mo36202i(boolean z) {
        Object value;
        StateFlowImpl stateFlowImpl = this.f24190t;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, SearchResultsListingsState.m18908b((SearchResultsListingsState) value, (ArrayList) null, (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List) null, z ? SearchResultsListingsState.ViewMode.THREE_BY_THREE : SearchResultsListingsState.ViewMode.TWO_BY_TWO, false, false, (C10920j.C10921a) null, 253951)));
    }

    /* renamed from: j */
    public final void mo36203j(SearchFilterHeader searchFilterHeader) {
        Object value;
        StateFlowImpl stateFlowImpl = this.f24190t;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, SearchResultsListingsState.m18908b((SearchResultsListingsState) value, (ArrayList) null, (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, searchFilterHeader, (List) null, (SearchResultsListingsState.ViewMode) null, false, false, (C10920j.C10921a) null, 260095)));
    }

    /* renamed from: k */
    public final void mo36204k(int i) {
        Object value;
        StateFlowImpl stateFlowImpl = this.f24190t;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, SearchResultsListingsState.m18908b((SearchResultsListingsState) value, (ArrayList) null, (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, i, (SearchFilterHeader) null, (List) null, (SearchResultsListingsState.ViewMode) null, false, false, (C10920j.C10921a) null, 261119)));
    }

    /* renamed from: l */
    public final void mo36205l(String str) {
        Object value;
        StateFlowImpl stateFlowImpl = this.f24190t;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, SearchResultsListingsState.m18908b((SearchResultsListingsState) value, (ArrayList) null, str, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List) null, (SearchResultsListingsState.ViewMode) null, false, false, (C10920j.C10921a) null, 262141)));
    }

    /* renamed from: m */
    public final void mo36206m(Long l) {
        Object value;
        StateFlowImpl stateFlowImpl = this.f24190t;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, SearchResultsListingsState.m18908b((SearchResultsListingsState) value, (ArrayList) null, (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, l, false, 0, 0, (SearchFilterHeader) null, (List) null, (SearchResultsListingsState.ViewMode) null, false, false, (C10920j.C10921a) null, 262015)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0178  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36207n(com.etsy.android.lib.models.apiv3.SearchWithAds r26, boolean r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.lang.String r3 = "results"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            com.etsy.android.ui.search.v2.filters.c r3 = r0.f24186p
            r3.getClass()
            com.etsy.android.lib.models.apiv3.FacetCountListMap r4 = r26.getFacetCountListMap()
            if (r4 == 0) goto L_0x001b
            java.util.List r4 = r4.getCategoryFacetCounts()
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            if (r4 == 0) goto L_0x0042
            int r6 = r4.size()
            if (r6 <= 0) goto L_0x0042
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.etsy.android.ui.search.v2.SearchOptions r7 = r3.f24355k
            com.etsy.android.lib.models.apiv3.FacetCount r7 = r7.getSelectedCategoryFacet()
            if (r7 == 0) goto L_0x0036
            java.lang.String r7 = r7.getId()
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            boolean r4 = com.etsy.android.lib.models.apiv3.FacetCount.buildPathToFacet(r4, r7, r6)
            if (r4 == 0) goto L_0x0042
            com.etsy.android.ui.search.v2.SearchOptions r4 = r3.f24355k
            r4.setCategoryFacets(r6)
        L_0x0042:
            com.etsy.android.lib.models.apiv3.FacetCountListMap r4 = r26.getFacetCountListMap()
            r3.f24351g = r4
            java.util.List r4 = r26.getPriceBuckets()
            if (r4 != 0) goto L_0x0050
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
        L_0x0050:
            r3.f24352h = r4
            com.etsy.android.lib.models.apiv3.filters.StaticFilters r4 = r26.getStaticFilters()
            r3.f24353i = r4
            if (r2 == 0) goto L_0x00c0
            java.util.List r3 = r26.getFeaturedCategories()
            boolean r3 = kotlinx.coroutines.C19543e0.m33306Y(r3)
            if (r3 == 0) goto L_0x0071
            java.util.List r3 = r26.getFeaturedCategories()
            if (r3 == 0) goto L_0x006f
            java.util.ArrayList r3 = kotlin.collections.C19327t.m32661q1(r3)
            goto L_0x007b
        L_0x006f:
            r3 = 0
            goto L_0x007b
        L_0x0071:
            kotlinx.coroutines.flow.p1 r3 = r0.f24191u
            java.lang.Object r3 = r3.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r3 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r3
            java.util.List<com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory> r3 = r3.f24166m
        L_0x007b:
            kotlinx.coroutines.flow.StateFlowImpl r4 = r0.f24190t
        L_0x007d:
            java.lang.Object r15 = r4.getValue()
            r6 = r15
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r6 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r6
            com.etsy.android.ui.search.listingresults.i$b r7 = com.etsy.android.p327ui.search.listingresults.C10909i.C10911b.f24221a
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r6 = r6.mo36191a(r7)
            int r16 = r26.getCount()
            com.etsy.android.lib.models.apiv3.ListingCard r10 = r26.getAnchorListing()
            com.etsy.android.lib.models.apiv3.search.GuidedSearch r11 = r26.getGuidedSearch()
            com.etsy.android.lib.models.apiv3.search.QueryCorrection r12 = r26.getQueryCorrection()
            java.util.List r13 = r26.getBannerMessages()
            r7 = 0
            r8 = 0
            r9 = 0
            r14 = 0
            r17 = 0
            r5 = r15
            r15 = r17
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 257415(0x3ed87, float:3.60715E-40)
            r19 = r3
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r6 = com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState.m18908b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r5 = r4.mo72337i(r5, r6)
            if (r5 == 0) goto L_0x007d
        L_0x00c0:
            boolean r3 = r26.userHasSavedSearches()
            boolean r4 = r26.showEmailSignUpModal()
            java.lang.String r5 = "savedSearchOnboardingPromptShownKey"
            r6 = 1
            if (r3 != 0) goto L_0x018d
            java.lang.String r7 = r25.mo36198e()
            int r7 = r7.length()
            r8 = 0
            if (r7 <= 0) goto L_0x00da
            r7 = r6
            goto L_0x00db
        L_0x00da:
            r7 = r8
        L_0x00db:
            if (r7 == 0) goto L_0x018d
            com.etsy.android.search.savedsearch.b r7 = r0.f24183m
            za.a r9 = r7.f19809a
            android.content.SharedPreferences r9 = r9.mo46761a()
            boolean r9 = r9.getBoolean(r5, r8)
            if (r9 != 0) goto L_0x00f8
            com.etsy.android.lib.config.c r7 = r7.f19810b
            com.etsy.android.lib.config.EtsyConfigKey r9 = com.etsy.android.lib.config.C8592b.C8598f.f18875e
            boolean r7 = r7.mo21132b(r9)
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x00f8
            r7 = r6
            goto L_0x00f9
        L_0x00f8:
            r7 = r8
        L_0x00f9:
            if (r7 == 0) goto L_0x0110
            com.etsy.android.search.savedsearch.b r7 = r0.f24183m
            za.a r7 = r7.f19809a
            android.content.SharedPreferences r7 = r7.mo46761a()
            android.content.SharedPreferences$Editor r7 = r7.edit()
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r5, r6)
            r7.apply()
            goto L_0x0175
        L_0x0110:
            kotlinx.coroutines.flow.p1 r7 = r0.f24191u
            java.lang.Object r7 = r7.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r7 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r7
            boolean r7 = r7.f24168o
            if (r7 == 0) goto L_0x0143
            com.etsy.android.search.savedsearch.b r7 = r0.f24183m
            boolean r9 = r7.f19812d
            if (r9 != 0) goto L_0x013b
            za.a r9 = r7.f19809a
            android.content.SharedPreferences r9 = r9.mo46761a()
            boolean r9 = r9.getBoolean(r5, r8)
            if (r9 == 0) goto L_0x013b
            com.etsy.android.lib.config.c r7 = r7.f19810b
            com.etsy.android.lib.config.EtsyConfigKey r9 = com.etsy.android.lib.config.C8592b.C8598f.f18875e
            boolean r7 = r7.mo21132b(r9)
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x013b
            r7 = r6
            goto L_0x013c
        L_0x013b:
            r7 = r8
        L_0x013c:
            if (r7 == 0) goto L_0x0143
            com.etsy.android.search.savedsearch.b r7 = r0.f24183m
            r7.f19812d = r6
            goto L_0x0175
        L_0x0143:
            kotlinx.coroutines.flow.p1 r7 = r0.f24191u
            java.lang.Object r7 = r7.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r7 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r7
            boolean r7 = r7.f24169p
            if (r7 == 0) goto L_0x0176
            com.etsy.android.search.savedsearch.b r7 = r0.f24183m
            boolean r9 = r7.f19811c
            if (r9 != 0) goto L_0x016e
            za.a r9 = r7.f19809a
            android.content.SharedPreferences r9 = r9.mo46761a()
            boolean r9 = r9.getBoolean(r5, r8)
            if (r9 == 0) goto L_0x016e
            com.etsy.android.lib.config.c r7 = r7.f19810b
            com.etsy.android.lib.config.EtsyConfigKey r9 = com.etsy.android.lib.config.C8592b.C8598f.f18875e
            boolean r7 = r7.mo21132b(r9)
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x016e
            r7 = r6
            goto L_0x016f
        L_0x016e:
            r7 = r8
        L_0x016f:
            if (r7 == 0) goto L_0x0176
            com.etsy.android.search.savedsearch.b r7 = r0.f24183m
            r7.f19811c = r6
        L_0x0175:
            r8 = r6
        L_0x0176:
            if (r8 == 0) goto L_0x018d
            kotlinx.coroutines.flow.StateFlowImpl r7 = r0.f24190t
        L_0x017a:
            java.lang.Object r8 = r7.getValue()
            r9 = r8
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r9 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r9
            com.etsy.android.ui.search.listingresults.i$h r10 = com.etsy.android.p327ui.search.listingresults.C10909i.C10917h.f24227a
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r9 = r9.mo36191a(r10)
            boolean r8 = r7.mo72337i(r8, r9)
            if (r8 == 0) goto L_0x017a
        L_0x018d:
            if (r3 == 0) goto L_0x01c2
            if (r4 == 0) goto L_0x01c2
            com.etsy.android.search.savedsearch.b r3 = r0.f24183m
            boolean r3 = r3.f19813e
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x01c2
            kotlinx.coroutines.flow.StateFlowImpl r3 = r0.f24190t
        L_0x019a:
            java.lang.Object r4 = r3.getValue()
            r7 = r4
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r7 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r7
            com.etsy.android.ui.search.listingresults.i$g r8 = com.etsy.android.p327ui.search.listingresults.C10909i.C10916g.f24226a
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r7 = r7.mo36191a(r8)
            boolean r4 = r3.mo72337i(r4, r7)
            if (r4 == 0) goto L_0x019a
            com.etsy.android.search.savedsearch.b r3 = r0.f24183m
            r3.f19813e = r6
            za.a r3 = r3.f19809a
            android.content.SharedPreferences r3 = r3.mo46761a()
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r5, r6)
            r3.apply()
        L_0x01c2:
            kotlinx.coroutines.flow.StateFlowImpl r3 = r0.f24190t
        L_0x01c4:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.Long r13 = r26.getSavedSearchId()
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 262015(0x3ff7f, float:3.67161E-40)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState.m18908b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r4 = r3.mo72337i(r4, r5)
            if (r4 == 0) goto L_0x01c4
            kotlinx.coroutines.d0 r3 = kotlin.jvm.internal.C19388s.m32866i0(r25)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$setSearchWithAdsResults$3 r4 = new com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$setSearchWithAdsResults$3
            r5 = 0
            r4.<init>(r0, r1, r2, r5)
            r1 = 3
            kotlinx.coroutines.C19697g.m33468f(r3, r5, r5, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.listingresults.SearchResultsListingsViewModel.mo36207n(com.etsy.android.lib.models.apiv3.SearchWithAds, boolean):void");
    }

    public final void onCleared() {
        this.f24192v.mo19405d();
        this.f24185o.mo46761a().unregisterOnSharedPreferenceChangeListener(this.f24193w);
    }
}
