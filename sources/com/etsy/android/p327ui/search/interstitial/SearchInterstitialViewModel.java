package com.etsy.android.p327ui.search.interstitial;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.search.SearchHistoryRepository;
import com.etsy.android.p327ui.search.SearchSuggestionsRepository;
import com.etsy.android.search.AutoSuggestRepository;
import com.etsy.android.search.C8971c;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p346fa.C12703a;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel */
public final class SearchInterstitialViewModel extends C2866i0 {

    /* renamed from: b */
    public final SearchSuggestionsRepository f24115b;

    /* renamed from: c */
    public final SearchHistoryRepository f24116c;

    /* renamed from: d */
    public final C8971c f24117d;

    /* renamed from: e */
    public final AutoSuggestRepository f24118e;

    /* renamed from: f */
    public final CoroutineDispatcher f24119f;

    /* renamed from: g */
    public final C12703a f24120g;

    /* renamed from: h */
    public final C13888d f24121h;

    /* renamed from: i */
    public final C10876b f24122i;

    /* renamed from: j */
    public final C10875a f24123j;

    /* renamed from: k */
    public final StateFlowImpl f24124k;

    /* renamed from: l */
    public final C19662p1 f24125l;

    /* renamed from: m */
    public final StateFlowImpl f24126m = C19388s.m32862g("");

    public SearchInterstitialViewModel(SearchSuggestionsRepository searchSuggestionsRepository, SearchHistoryRepository searchHistoryRepository, C8971c cVar, AutoSuggestRepository autoSuggestRepository, CoroutineDispatcher coroutineDispatcher, C12703a aVar, C13888d dVar, C10876b bVar, C10875a aVar2) {
        C19383o.m32797g(searchSuggestionsRepository, "searchSuggestionsRepository");
        C19383o.m32797g(searchHistoryRepository, "searchHistoryRepository");
        C19383o.m32797g(cVar, "autoSuggestVariantRepository");
        C19383o.m32797g(autoSuggestRepository, "autoSuggestRepository");
        C19383o.m32797g(coroutineDispatcher, "defaultDispatcher");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(bVar, "searchInterstitialEligibility");
        C19383o.m32797g(aVar2, "landingSuggestionMapper");
        this.f24115b = searchSuggestionsRepository;
        this.f24116c = searchHistoryRepository;
        this.f24117d = cVar;
        this.f24118e = autoSuggestRepository;
        this.f24119f = coroutineDispatcher;
        this.f24120g = aVar;
        this.f24121h = dVar;
        this.f24122i = bVar;
        this.f24123j = aVar2;
        StateFlowImpl g = C19388s.m32862g(new C10882d(0));
        this.f24124k = g;
        this.f24125l = C0761x.m1750w(g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36096b(boolean r18, boolean r19, kotlin.coroutines.C19340c<? super java.util.List<? extends com.etsy.android.p327ui.search.p330v2.suggestions.C11083w>> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel$loadSuggestions$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$loadSuggestions$1 r2 = (com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel$loadSuggestions$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$loadSuggestions$1 r2 = new com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$loadSuggestions$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.L$0
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel r2 = (com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            com.etsy.android.ui.search.SearchSuggestionsRepository r1 = r0.f24115b
            r2.L$0 = r0
            r2.label = r5
            r4 = r18
            r6 = r19
            java.lang.Object r1 = r1.mo35654a(r4, r6, r2)
            if (r1 != r3) goto L_0x004b
            return r3
        L_0x004b:
            r2 = r0
        L_0x004c:
            com.etsy.android.ui.search.SearchSuggestionsRepository$a r1 = (com.etsy.android.p327ui.search.SearchSuggestionsRepository.C10727a) r1
            com.etsy.android.ui.search.interstitial.a r2 = r2.f24123j
            r2.getClass()
            java.lang.String r3 = "result"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            com.etsy.android.ui.search.interstitial.b r3 = r2.f24131a
            com.etsy.android.lib.config.e r3 = r3.f24132a
            com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.f18750O0
            boolean r3 = r3.mo21132b(r4)
            r4 = 3
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x01e3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r8 = r1 instanceof com.etsy.android.p327ui.search.SearchSuggestionsRepository.C10727a.C10729b
            if (r8 == 0) goto L_0x01dd
            com.etsy.android.ui.search.SearchSuggestionsRepository$a$b r1 = (com.etsy.android.p327ui.search.SearchSuggestionsRepository.C10727a.C10729b) r1
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r8 = r1.f23665a
            java.util.List r8 = r8.getRecentSearches()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r9 = r1.f23665a
            java.util.List r9 = r9.getRecentlyViewed()
            if (r9 == 0) goto L_0x00b6
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.C19322o.m32624F0(r9)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x008d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00b7
            java.lang.Object r11 = r9.next()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$RecentlyViewed r11 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.RecentlyViewed) r11
            com.etsy.android.ui.search.v2.suggestions.o$d r12 = new com.etsy.android.ui.search.v2.suggestions.o$d
            java.lang.String r13 = r11.getTitle()
            java.lang.String r14 = r11.getListing_id()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$RecentlyViewed$Image r15 = r11.getImg()
            java.lang.String r15 = r15.getUrl()
            boolean r11 = r11.is_favorite()
            r12.<init>(r13, r14, r11, r15)
            r10.add(r12)
            goto L_0x008d
        L_0x00b6:
            r10 = r6
        L_0x00b7:
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r9 = r1.f23665a
            java.util.List r9 = r9.getSavedSearches()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r11 = r1.f23665a
            java.util.List r11 = r11.getCategories()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r12 = r1.f23665a
            java.util.List r12 = r12.getGiftGuides()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r1 = r1.f23665a
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$PurchaseGiftCard r1 = r1.getPurchaseGiftCard()
            boolean r13 = kotlinx.coroutines.C19543e0.m33306Y(r9)
            if (r13 == 0) goto L_0x011f
            com.etsy.android.ui.search.v2.suggestions.w$g r13 = new com.etsy.android.ui.search.v2.suggestions.w$g
            com.etsy.android.ui.search.v2.suggestions.k$d r14 = com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11060d.f24507a
            r13.<init>(r14)
            r3.add(r13)
            int r13 = r9.size()
            if (r13 > r4) goto L_0x0107
            java.util.Iterator r4 = r9.iterator()
            r9 = r7
        L_0x00ea:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x011f
            java.lang.Object r13 = r4.next()
            int r14 = r9 + 1
            if (r9 < 0) goto L_0x0103
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery r13 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.SavableSearchQuery) r13
            com.etsy.android.ui.search.v2.suggestions.w$f r9 = r2.mo36107a(r13, r9)
            r3.add(r9)
            r9 = r14
            goto L_0x00ea
        L_0x0103:
            p568fn.C17782b.m29877o0()
            throw r6
        L_0x0107:
            r13 = r7
        L_0x0108:
            if (r13 >= r4) goto L_0x011a
            java.lang.Object r14 = r9.get(r13)
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery r14 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.SavableSearchQuery) r14
            com.etsy.android.ui.search.v2.suggestions.w$f r14 = r2.mo36107a(r14, r13)
            r3.add(r14)
            int r13 = r13 + 1
            goto L_0x0108
        L_0x011a:
            com.etsy.android.ui.search.v2.suggestions.w$i r2 = com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11092i.f24563a
            r3.add(r2)
        L_0x011f:
            boolean r2 = kotlinx.coroutines.C19543e0.m33306Y(r10)
            if (r2 == 0) goto L_0x0137
            com.etsy.android.ui.search.v2.suggestions.w$g r2 = new com.etsy.android.ui.search.v2.suggestions.w$g
            com.etsy.android.ui.search.v2.suggestions.k$c r4 = com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11059c.f24506a
            r2.<init>(r4)
            r3.add(r2)
            com.etsy.android.ui.search.v2.suggestions.w$k r2 = new com.etsy.android.ui.search.v2.suggestions.w$k
            r2.<init>(r10)
            r3.add(r2)
        L_0x0137:
            boolean r2 = kotlinx.coroutines.C19543e0.m33306Y(r8)
            if (r2 == 0) goto L_0x0173
            com.etsy.android.ui.search.v2.suggestions.w$g r2 = new com.etsy.android.ui.search.v2.suggestions.w$g
            com.etsy.android.ui.search.v2.suggestions.k$b r4 = com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11058b.f24505a
            r2.<init>(r4)
            r3.add(r2)
            java.util.Iterator r2 = r8.iterator()
            r4 = r7
        L_0x014c:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0173
            java.lang.Object r8 = r2.next()
            int r9 = r4 + 1
            if (r4 < 0) goto L_0x016f
            com.etsy.android.lib.models.apiv3.search.Query r8 = (com.etsy.android.lib.models.apiv3.search.Query) r8
            com.etsy.android.ui.search.v2.suggestions.w$f r10 = new com.etsy.android.ui.search.v2.suggestions.w$f
            com.etsy.android.ui.search.v2.suggestions.o$c r13 = new com.etsy.android.ui.search.v2.suggestions.o$c
            java.lang.String r8 = r8.getQuery()
            r13.<init>(r8, r4)
            r10.<init>(r13)
            r3.add(r10)
            r4 = r9
            goto L_0x014c
        L_0x016f:
            p568fn.C17782b.m29877o0()
            throw r6
        L_0x0173:
            boolean r2 = kotlinx.coroutines.C19543e0.m33306Y(r11)
            if (r2 == 0) goto L_0x01a6
            com.etsy.android.ui.search.v2.suggestions.w$h r2 = new com.etsy.android.ui.search.v2.suggestions.w$h
            com.etsy.android.ui.search.v2.suggestions.q$c r4 = com.etsy.android.p327ui.search.p330v2.suggestions.C11071q.C11074c.f24539a
            r2.<init>(r4)
            r3.add(r2)
            java.util.Iterator r2 = r11.iterator()
            r4 = r7
        L_0x0188:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x01a6
            java.lang.Object r8 = r2.next()
            int r9 = r4 + 1
            if (r4 < 0) goto L_0x01a2
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r8 = (com.etsy.android.lib.models.apiv3.search.TaxonomyNode) r8
            com.etsy.android.ui.search.v2.suggestions.w$b r10 = new com.etsy.android.ui.search.v2.suggestions.w$b
            r10.<init>(r8, r4)
            r3.add(r10)
            r4 = r9
            goto L_0x0188
        L_0x01a2:
            p568fn.C17782b.m29877o0()
            throw r6
        L_0x01a6:
            boolean r2 = kotlinx.coroutines.C19543e0.m33306Y(r12)
            if (r2 == 0) goto L_0x01c5
            java.util.Iterator r2 = r12.iterator()
        L_0x01b0:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01c5
            java.lang.Object r4 = r2.next()
            com.etsy.android.lib.models.apiv3.search.GiftGuide r4 = (com.etsy.android.lib.models.apiv3.search.GiftGuide) r4
            com.etsy.android.ui.search.v2.suggestions.w$o r6 = new com.etsy.android.ui.search.v2.suggestions.w$o
            r6.<init>(r4)
            r3.add(r6)
            goto L_0x01b0
        L_0x01c5:
            if (r1 == 0) goto L_0x01ce
            boolean r2 = r1.getEligible()
            if (r2 != r5) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r5 = r7
        L_0x01cf:
            if (r5 == 0) goto L_0x01dd
            com.etsy.android.ui.search.v2.suggestions.w$d r2 = new com.etsy.android.ui.search.v2.suggestions.w$d
            java.lang.String r1 = r1.getImageUrl()
            r2.<init>(r1)
            r3.add(r2)
        L_0x01dd:
            java.util.List r1 = kotlin.collections.C19327t.m32660p1(r3)
            goto L_0x035c
        L_0x01e3:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.etsy.android.ui.search.v2.suggestions.w$h r8 = new com.etsy.android.ui.search.v2.suggestions.w$h
            com.etsy.android.ui.search.v2.suggestions.q$b r9 = com.etsy.android.p327ui.search.p330v2.suggestions.C11071q.C11073b.f24538a
            r8.<init>(r9)
            r3.add(r8)
            boolean r8 = r1 instanceof com.etsy.android.p327ui.search.SearchSuggestionsRepository.C10727a.C10729b
            if (r8 == 0) goto L_0x0358
            com.etsy.android.ui.search.SearchSuggestionsRepository$a$b r1 = (com.etsy.android.p327ui.search.SearchSuggestionsRepository.C10727a.C10729b) r1
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r8 = r1.f23665a
            java.util.List r8 = r8.getRecentSearches()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r9 = r1.f23665a
            java.util.List r9 = r9.getPopularSearches()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r10 = r1.f23665a
            java.util.List r10 = r10.getRecentlyViewed()
            if (r10 == 0) goto L_0x0243
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.C19322o.m32624F0(r10)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L_0x0219:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0244
            java.lang.Object r12 = r10.next()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$RecentlyViewed r12 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.RecentlyViewed) r12
            com.etsy.android.ui.search.v2.suggestions.o$d r13 = new com.etsy.android.ui.search.v2.suggestions.o$d
            java.lang.String r14 = r12.getTitle()
            java.lang.String r15 = r12.getListing_id()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$RecentlyViewed$Image r16 = r12.getImg()
            java.lang.String r5 = r16.getUrl()
            boolean r12 = r12.is_favorite()
            r13.<init>(r14, r15, r12, r5)
            r11.add(r13)
            r5 = 1
            goto L_0x0219
        L_0x0243:
            r11 = r6
        L_0x0244:
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r1 = r1.f23665a
            java.util.List r1 = r1.getSavedSearches()
            boolean r5 = kotlinx.coroutines.C19543e0.m33306Y(r1)
            if (r5 == 0) goto L_0x029a
            com.etsy.android.ui.search.v2.suggestions.w$g r5 = new com.etsy.android.ui.search.v2.suggestions.w$g
            com.etsy.android.ui.search.v2.suggestions.k$d r10 = com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11060d.f24507a
            r5.<init>(r10)
            r3.add(r5)
            int r5 = r1.size()
            if (r5 > r4) goto L_0x0282
            java.util.Iterator r1 = r1.iterator()
            r4 = r7
        L_0x0265:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x029a
            java.lang.Object r5 = r1.next()
            int r10 = r4 + 1
            if (r4 < 0) goto L_0x027e
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery r5 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.SavableSearchQuery) r5
            com.etsy.android.ui.search.v2.suggestions.w$f r4 = r2.mo36107a(r5, r4)
            r3.add(r4)
            r4 = r10
            goto L_0x0265
        L_0x027e:
            p568fn.C17782b.m29877o0()
            throw r6
        L_0x0282:
            r5 = r7
        L_0x0283:
            if (r5 >= r4) goto L_0x0295
            java.lang.Object r10 = r1.get(r5)
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery r10 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.SavableSearchQuery) r10
            com.etsy.android.ui.search.v2.suggestions.w$f r10 = r2.mo36107a(r10, r5)
            r3.add(r10)
            int r5 = r5 + 1
            goto L_0x0283
        L_0x0295:
            com.etsy.android.ui.search.v2.suggestions.w$i r1 = com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11092i.f24563a
            r3.add(r1)
        L_0x029a:
            if (r11 == 0) goto L_0x02a5
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            r1 = r7
            goto L_0x02a6
        L_0x02a5:
            r1 = 1
        L_0x02a6:
            if (r1 != 0) goto L_0x02ba
            com.etsy.android.ui.search.v2.suggestions.w$g r1 = new com.etsy.android.ui.search.v2.suggestions.w$g
            com.etsy.android.ui.search.v2.suggestions.k$c r2 = com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11059c.f24506a
            r1.<init>(r2)
            r3.add(r1)
            com.etsy.android.ui.search.v2.suggestions.w$k r1 = new com.etsy.android.ui.search.v2.suggestions.w$k
            r1.<init>(r11)
            r3.add(r1)
        L_0x02ba:
            if (r8 == 0) goto L_0x02c5
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x02c3
            goto L_0x02c5
        L_0x02c3:
            r1 = r7
            goto L_0x02c6
        L_0x02c5:
            r1 = 1
        L_0x02c6:
            if (r1 != 0) goto L_0x02fe
            com.etsy.android.ui.search.v2.suggestions.w$g r1 = new com.etsy.android.ui.search.v2.suggestions.w$g
            com.etsy.android.ui.search.v2.suggestions.k$b r2 = com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11058b.f24505a
            r1.<init>(r2)
            r3.add(r1)
            java.util.Iterator r1 = r8.iterator()
            r2 = r7
        L_0x02d7:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02fe
            java.lang.Object r4 = r1.next()
            int r5 = r2 + 1
            if (r2 < 0) goto L_0x02fa
            com.etsy.android.lib.models.apiv3.search.Query r4 = (com.etsy.android.lib.models.apiv3.search.Query) r4
            com.etsy.android.ui.search.v2.suggestions.w$f r10 = new com.etsy.android.ui.search.v2.suggestions.w$f
            com.etsy.android.ui.search.v2.suggestions.o$c r11 = new com.etsy.android.ui.search.v2.suggestions.o$c
            java.lang.String r4 = r4.getQuery()
            r11.<init>(r4, r2)
            r10.<init>(r11)
            r3.add(r10)
            r2 = r5
            goto L_0x02d7
        L_0x02fa:
            p568fn.C17782b.m29877o0()
            throw r6
        L_0x02fe:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r9 == 0) goto L_0x030e
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x030c
            goto L_0x030e
        L_0x030c:
            r2 = r7
            goto L_0x030f
        L_0x030e:
            r2 = 1
        L_0x030f:
            if (r2 != 0) goto L_0x0347
            com.etsy.android.ui.search.v2.suggestions.w$g r2 = new com.etsy.android.ui.search.v2.suggestions.w$g
            com.etsy.android.ui.search.v2.suggestions.k$a r4 = com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11057a.f24504a
            r2.<init>(r4)
            r1.add(r2)
            java.util.Iterator r2 = r9.iterator()
            r4 = r7
        L_0x0320:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0347
            java.lang.Object r5 = r2.next()
            int r9 = r4 + 1
            if (r4 < 0) goto L_0x0343
            com.etsy.android.lib.models.apiv3.search.Query r5 = (com.etsy.android.lib.models.apiv3.search.Query) r5
            com.etsy.android.ui.search.v2.suggestions.w$f r10 = new com.etsy.android.ui.search.v2.suggestions.w$f
            com.etsy.android.ui.search.v2.suggestions.o$b r11 = new com.etsy.android.ui.search.v2.suggestions.o$b
            java.lang.String r5 = r5.getQuery()
            r11.<init>(r5, r4)
            r10.<init>(r11)
            r1.add(r10)
            r4 = r9
            goto L_0x0320
        L_0x0343:
            p568fn.C17782b.m29877o0()
            throw r6
        L_0x0347:
            if (r8 == 0) goto L_0x0352
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0350
            goto L_0x0352
        L_0x0350:
            r5 = r7
            goto L_0x0353
        L_0x0352:
            r5 = 1
        L_0x0353:
            if (r5 == 0) goto L_0x0358
            kotlin.collections.C19324q.m32628J0(r1, r3)
        L_0x0358:
            java.util.List r1 = kotlin.collections.C19327t.m32660p1(r3)
        L_0x035c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel.mo36096b(boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo36097c(String str) {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SearchInterstitialViewModel$onQuery$1(str, this, (C19340c<? super SearchInterstitialViewModel$onQuery$1>) null), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01aa, code lost:
        if ((r13.length() > 0) == true) goto L_0x01ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36098d(java.lang.String r11, java.lang.String r12, int r13, boolean r14, kotlin.coroutines.C19340c<? super java.util.List<? extends com.etsy.android.p327ui.search.p330v2.suggestions.C11083w>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel$runCompositeAutoComplete$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$runCompositeAutoComplete$1 r0 = (com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel$runCompositeAutoComplete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$runCompositeAutoComplete$1 r0 = new com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$runCompositeAutoComplete$1
            r0.<init>(r10, r15)
        L_0x0018:
            r6 = r0
            java.lang.Object r15 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r7 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r7) goto L_0x0034
            java.lang.Object r11 = r6.L$2
            fa.b r11 = (p346fa.C12704b) r11
            java.lang.Object r12 = r6.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r6.L$0
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel r13 = (com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel) r13
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)
            goto L_0x0063
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)
            fa.a r15 = r10.f24120g
            r15.getClass()
            fa.b r8 = new fa.b
            com.etsy.android.lib.util.e0 r1 = r15.f27991a
            r8.<init>(r1, r15)
            com.etsy.android.search.AutoSuggestRepository r1 = r10.f24118e
            r6.L$0 = r10
            r6.L$1 = r11
            r6.L$2 = r8
            r6.label = r7
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            java.lang.Object r15 = r1.mo30567a(r2, r3, r4, r5, r6)
            if (r15 != r0) goto L_0x0060
            return r0
        L_0x0060:
            r13 = r10
            r12 = r11
            r11 = r8
        L_0x0063:
            com.etsy.android.search.AutoSuggestRepository$a r15 = (com.etsy.android.search.AutoSuggestRepository.C8965a) r15
            boolean r14 = r15 instanceof com.etsy.android.search.AutoSuggestRepository.C8965a.C8967b
            r0 = 0
            if (r14 == 0) goto L_0x01bd
            p346fa.C12704b.m20387a(r11)
            com.etsy.android.search.AutoSuggestRepository$a$b r15 = (com.etsy.android.search.AutoSuggestRepository.C8965a.C8967b) r15
            com.etsy.android.search.CompositeSuggestions r11 = r15.f19772a
            r13.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List<com.etsy.android.lib.models.apiv3.search.GiftGuide> r15 = r11.f19777c
            if (r15 == 0) goto L_0x0086
            boolean r15 = r15.isEmpty()
            r15 = r15 ^ r7
            if (r15 != r7) goto L_0x0086
            r15 = r7
            goto L_0x0087
        L_0x0086:
            r15 = r0
        L_0x0087:
            if (r15 == 0) goto L_0x00a9
            com.etsy.android.ui.search.interstitial.b r13 = r13.f24122i
            com.etsy.android.lib.config.e r13 = r13.f24132a
            com.etsy.android.lib.config.EtsyConfigKey r15 = com.etsy.android.lib.config.C8592b.f18748N0
            boolean r13 = r13.mo21132b(r15)
            if (r13 == 0) goto L_0x00a9
            com.etsy.android.ui.search.v2.suggestions.w$p r13 = new com.etsy.android.ui.search.v2.suggestions.w$p
            com.etsy.android.ui.search.v2.suggestions.a0$b r15 = com.etsy.android.p327ui.search.p330v2.suggestions.C11040a0.C11042b.f24484a
            r13.<init>(r15, r0)
            r14.add(r13)
            com.etsy.android.ui.search.v2.suggestions.w$e r13 = new com.etsy.android.ui.search.v2.suggestions.w$e
            java.util.List<com.etsy.android.lib.models.apiv3.search.GiftGuide> r15 = r11.f19777c
            r13.<init>(r15)
            r14.add(r13)
        L_0x00a9:
            java.util.List<java.lang.String> r13 = r11.f19775a
            r15 = 0
            if (r13 == 0) goto L_0x00d6
            java.util.Iterator r13 = r13.iterator()
            r1 = r0
        L_0x00b3:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00d6
            java.lang.Object r2 = r13.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L_0x00d2
            java.lang.String r2 = (java.lang.String) r2
            com.etsy.android.ui.search.v2.suggestions.w$f r4 = new com.etsy.android.ui.search.v2.suggestions.w$f
            com.etsy.android.ui.search.v2.suggestions.o$a r5 = new com.etsy.android.ui.search.v2.suggestions.o$a
            r5.<init>(r2, r1)
            r4.<init>(r5)
            r14.add(r4)
            r1 = r3
            goto L_0x00b3
        L_0x00d2:
            p568fn.C17782b.m29877o0()
            throw r15
        L_0x00d6:
            java.util.List<java.lang.String> r13 = r11.f19775a
            if (r13 == 0) goto L_0x00e0
            boolean r13 = r13.isEmpty()
            r13 = r13 ^ r7
            goto L_0x00e1
        L_0x00e0:
            r13 = r0
        L_0x00e1:
            java.util.List<com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$RecentlyViewed> r1 = r11.f19778d
            boolean r1 = kotlinx.coroutines.C19543e0.m33306Y(r1)
            if (r1 == 0) goto L_0x013f
            java.util.List<com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$RecentlyViewed> r13 = r11.f19778d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r13)
            r1.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L_0x00f8:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0121
            java.lang.Object r2 = r13.next()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$RecentlyViewed r2 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.RecentlyViewed) r2
            com.etsy.android.ui.search.v2.suggestions.o$d r3 = new com.etsy.android.ui.search.v2.suggestions.o$d
            java.lang.String r4 = r2.getTitle()
            java.lang.String r5 = r2.getListing_id()
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$RecentlyViewed$Image r6 = r2.getImg()
            java.lang.String r6 = r6.getUrl()
            boolean r2 = r2.is_favorite()
            r3.<init>(r4, r5, r2, r6)
            r1.add(r3)
            goto L_0x00f8
        L_0x0121:
            java.util.List<java.lang.String> r13 = r11.f19775a
            if (r13 == 0) goto L_0x012b
            boolean r13 = r13.isEmpty()
            r13 = r13 ^ r7
            goto L_0x012c
        L_0x012b:
            r13 = r0
        L_0x012c:
            com.etsy.android.ui.search.v2.suggestions.w$p r2 = new com.etsy.android.ui.search.v2.suggestions.w$p
            com.etsy.android.ui.search.v2.suggestions.a0$c r3 = com.etsy.android.p327ui.search.p330v2.suggestions.C11040a0.C11043c.f24485a
            r2.<init>(r3, r13)
            r14.add(r2)
            com.etsy.android.ui.search.v2.suggestions.w$k r13 = new com.etsy.android.ui.search.v2.suggestions.w$k
            r13.<init>(r1)
            r14.add(r13)
            r13 = r0
        L_0x013f:
            com.etsy.android.ui.search.v2.suggestions.w$p r1 = new com.etsy.android.ui.search.v2.suggestions.w$p
            com.etsy.android.ui.search.v2.suggestions.a0$d r2 = com.etsy.android.p327ui.search.p330v2.suggestions.C11040a0.C11044d.f24486a
            r1.<init>(r2, r13)
            r14.add(r1)
            com.etsy.android.search.CompositeSuggestions$ShopsResponse r13 = r11.f19776b
            if (r13 == 0) goto L_0x015a
            java.util.List<com.etsy.android.search.CompositeSuggestions$ShopResponse> r13 = r13.f19787a
            if (r13 == 0) goto L_0x015a
            boolean r13 = r13.isEmpty()
            r13 = r13 ^ r7
            if (r13 != r7) goto L_0x015a
            r13 = r7
            goto L_0x015b
        L_0x015a:
            r13 = r0
        L_0x015b:
            if (r13 == 0) goto L_0x0191
            com.etsy.android.search.CompositeSuggestions$ShopsResponse r13 = r11.f19776b
            java.util.List<com.etsy.android.search.CompositeSuggestions$ShopResponse> r13 = r13.f19787a
            java.util.Iterator r13 = r13.iterator()
            r6 = r0
        L_0x0166:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0199
            java.lang.Object r1 = r13.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x018d
            com.etsy.android.search.CompositeSuggestions$ShopResponse r1 = (com.etsy.android.search.CompositeSuggestions.ShopResponse) r1
            com.etsy.android.ui.search.v2.suggestions.w$n r9 = new com.etsy.android.ui.search.v2.suggestions.w$n
            java.lang.String r2 = r1.f19783a
            java.lang.String r3 = r1.f19784b
            if (r3 != 0) goto L_0x0180
            java.lang.String r3 = ""
        L_0x0180:
            java.lang.String r4 = r1.f19785c
            java.lang.String r5 = r1.f19786d
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r14.add(r9)
            r6 = r8
            goto L_0x0166
        L_0x018d:
            p568fn.C17782b.m29877o0()
            throw r15
        L_0x0191:
            com.etsy.android.ui.search.v2.suggestions.w$m r13 = new com.etsy.android.ui.search.v2.suggestions.w$m
            r13.<init>(r12)
            r14.add(r13)
        L_0x0199:
            com.etsy.android.search.CompositeSuggestions$ShopsResponse r13 = r11.f19776b
            if (r13 == 0) goto L_0x01ad
            java.lang.String r13 = r13.f19788b
            if (r13 == 0) goto L_0x01ad
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x01a9
            r13 = r7
            goto L_0x01aa
        L_0x01a9:
            r13 = r0
        L_0x01aa:
            if (r13 != r7) goto L_0x01ad
            goto L_0x01ae
        L_0x01ad:
            r7 = r0
        L_0x01ae:
            if (r7 == 0) goto L_0x01db
            com.etsy.android.ui.search.v2.suggestions.w$j r13 = new com.etsy.android.ui.search.v2.suggestions.w$j
            com.etsy.android.search.CompositeSuggestions$ShopsResponse r11 = r11.f19776b
            java.lang.String r11 = r11.f19788b
            r13.<init>(r12, r11)
            r14.add(r13)
            goto L_0x01db
        L_0x01bd:
            boolean r13 = r15 instanceof com.etsy.android.search.AutoSuggestRepository.C8965a.C8966a
            if (r13 == 0) goto L_0x01dc
            p346fa.C12704b.m20387a(r11)
            r11 = 2
            com.etsy.android.ui.search.v2.suggestions.w[] r11 = new com.etsy.android.p327ui.search.p330v2.suggestions.C11083w[r11]
            com.etsy.android.ui.search.v2.suggestions.w$p r13 = new com.etsy.android.ui.search.v2.suggestions.w$p
            com.etsy.android.ui.search.v2.suggestions.a0$d r14 = com.etsy.android.p327ui.search.p330v2.suggestions.C11040a0.C11044d.f24486a
            r13.<init>(r14, r0)
            r11[r0] = r13
            com.etsy.android.ui.search.v2.suggestions.w$m r13 = new com.etsy.android.ui.search.v2.suggestions.w$m
            r13.<init>(r12)
            r11[r7] = r13
            java.util.List r14 = p568fn.C17782b.m29865e0(r11)
        L_0x01db:
            return r14
        L_0x01dc:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.interstitial.SearchInterstitialViewModel.mo36098d(java.lang.String, java.lang.String, int, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
