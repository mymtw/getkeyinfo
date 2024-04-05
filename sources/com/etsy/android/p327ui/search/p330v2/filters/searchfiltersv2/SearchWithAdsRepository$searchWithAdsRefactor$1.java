package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchWithAdsRepository", mo70541f = "SearchWithAdsRepository.kt", mo70542l = {33, 35}, mo70543m = "searchWithAdsRefactor")
/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.SearchWithAdsRepository$searchWithAdsRefactor$1 */
public final class SearchWithAdsRepository$searchWithAdsRefactor$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchWithAdsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchWithAdsRepository$searchWithAdsRefactor$1(SearchWithAdsRepository searchWithAdsRepository, C19340c<? super SearchWithAdsRepository$searchWithAdsRefactor$1> cVar) {
        super(cVar);
        this.this$0 = searchWithAdsRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo36525a((C11015r) null, this);
    }
}
