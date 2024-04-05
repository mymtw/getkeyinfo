package com.etsy.android.p327ui.search.filters.refactor;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.search.filters.refactor.SearchFiltersRepository", mo70541f = "SearchFiltersRepository.kt", mo70542l = {34}, mo70543m = "applySearchFilters")
/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersRepository$applySearchFilters$1 */
public final class SearchFiltersRepository$applySearchFilters$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchFiltersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersRepository$applySearchFilters$1(SearchFiltersRepository searchFiltersRepository, C19340c<? super SearchFiltersRepository$applySearchFilters$1> cVar) {
        super(cVar);
        this.this$0 = searchFiltersRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo35790a((C10854r) null, this);
    }
}
