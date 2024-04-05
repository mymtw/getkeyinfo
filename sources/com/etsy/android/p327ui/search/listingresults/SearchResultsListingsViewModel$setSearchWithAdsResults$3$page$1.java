package com.etsy.android.p327ui.search.listingresults;

import com.etsy.android.lib.models.apiv3.SearchWithAds;
import com.etsy.android.lib.models.cardviewelement.Page;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1", mo70541f = "SearchResultsListingsViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1 */
public final class SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super Page>, Object> {
    public final /* synthetic */ boolean $isFirstPageOfResults;
    public final /* synthetic */ SearchWithAds $results;
    public int label;
    public final /* synthetic */ SearchResultsListingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1(SearchWithAds searchWithAds, SearchResultsListingsViewModel searchResultsListingsViewModel, boolean z, C19340c<? super SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1> cVar) {
        super(2, cVar);
        this.$results = searchWithAds;
        this.this$0 = searchResultsListingsViewModel;
        this.$isFirstPageOfResults = z;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1(this.$results, this.this$0, this.$isFirstPageOfResults, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super Page> cVar) {
        return ((SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r10.label
            if (r0 != 0) goto L_0x012b
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            com.etsy.android.lib.models.apiv3.SearchWithAds r11 = r10.$results
            java.util.List r11 = r11.getListingCardList()
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0054
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r2 = r10.this$0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.C19322o.m32624F0(r11)
            r3.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0022:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0056
            java.lang.Object r4 = r11.next()
            com.etsy.android.lib.models.apiv3.ListingCard r4 = (com.etsy.android.lib.models.apiv3.ListingCard) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r2.getClass()
            boolean r5 = r4.hasVariationPrices()
            if (r5 == 0) goto L_0x004a
            com.etsy.android.ui.search.listingresults.c r5 = r2.f24182l
            com.etsy.android.lib.config.e r5 = r5.f24207a
            com.etsy.android.lib.config.EtsyConfigKey r6 = com.etsy.android.lib.config.C8592b.f18844x1
            boolean r5 = r5.mo21132b(r6)
            if (r5 == 0) goto L_0x004a
            r5 = r0
            goto L_0x004b
        L_0x004a:
            r5 = r1
        L_0x004b:
            com.etsy.android.uikit.viewholder.ListingCardUiModel r6 = new com.etsy.android.uikit.viewholder.ListingCardUiModel
            r6.<init>(r4, r0, r1, r5)
            r3.add(r6)
            goto L_0x0022
        L_0x0054:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x0056:
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r11 = r10.this$0
            com.etsy.android.ui.search.listingresults.a r11 = r11.f24188r
            r11.getClass()
            java.lang.String r2 = "listings"
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            com.etsy.android.lib.util.e0 r2 = r11.f24205b
            r2.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r6 = 24
            long r6 = r2.toMillis(r6)
            long r4 = r4 - r6
            com.etsy.android.lib.persistviewed.PersistViewedBus r2 = r11.f24204a
            com.etsy.android.lib.persistviewed.d r2 = r2.f19374a
            r2.mo30143c(r4)
            com.etsy.android.lib.persistviewed.PersistViewedBus r11 = r11.f24204a
            r11.getClass()
            com.etsy.android.lib.persistviewed.d r2 = r11.f19374a     // Catch:{ all -> 0x0087 }
            java.util.ArrayList r11 = r2.getAll()     // Catch:{ all -> 0x0087 }
            goto L_0x0090
        L_0x0087:
            fa.a r11 = r11.f19376c
            java.lang.String r2 = "persist_viewed.convert_db_model_to_json_body_error"
            r11.mo45474a(r2)
            kotlin.collections.EmptyList r11 = kotlin.collections.EmptyList.INSTANCE
        L_0x0090:
            int r2 = kotlin.collections.C19322o.m32624F0(r11)
            int r2 = kotlin.reflect.C19421p.m32930T(r2)
            r6 = 16
            if (r2 >= r6) goto L_0x009d
            r2 = r6
        L_0x009d:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
        L_0x00a6:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x00cf
            java.lang.Object r2 = r11.next()
            com.etsy.android.lib.persistviewed.f r2 = (com.etsy.android.lib.persistviewed.C8827f) r2
            long r7 = r2.f19394a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            long r8 = r2.f19395b
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r7, r2)
            java.lang.Object r2 = r8.getFirst()
            java.lang.Object r7 = r8.getSecond()
            r6.put(r2, r7)
            goto L_0x00a6
        L_0x00cf:
            java.util.Iterator r11 = r3.iterator()
        L_0x00d3:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0102
            java.lang.Object r2 = r11.next()
            com.etsy.android.uikit.viewholder.ListingCardUiModel r2 = (com.etsy.android.uikit.viewholder.ListingCardUiModel) r2
            com.etsy.android.lib.models.datatypes.EtsyId r7 = r2.getListingId()
            long r7 = r7.getIdAsLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r7 = r6.get(r7)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x00d3
            long r7 = r7.longValue()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x00fd
            r7 = r0
            goto L_0x00fe
        L_0x00fd:
            r7 = r1
        L_0x00fe:
            r2.setViewedInLast24Hours(r7)
            goto L_0x00d3
        L_0x0102:
            com.etsy.android.lib.models.apiv3.SearchWithAds r11 = r10.$results
            java.util.List r11 = r11.getListingCardList()
            if (r11 == 0) goto L_0x010e
            int r1 = r11.size()
        L_0x010e:
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r11 = r10.this$0
            kotlinx.coroutines.flow.p1 r0 = r11.f24191u
            java.lang.Object r0 = r0.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r0 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r0
            int r0 = r0.f24164k
            int r0 = r0 + r1
            r11.mo36204k(r0)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r11 = r10.this$0
            boolean r0 = r10.$isFirstPageOfResults
            com.etsy.android.ui.search.v2.filters.c r1 = r11.f24186p
            com.etsy.android.ui.search.v2.SearchOptions r1 = r1.f24355k
            com.etsy.android.lib.models.cardviewelement.Page r11 = r11.mo36195b(r1, r3, r0)
            return r11
        L_0x012b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.listingresults.SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
