package com.etsy.android.p327ui.search.filters.refactor;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel", mo70541f = "SearchFiltersRefactorViewModel.kt", mo70542l = {629}, mo70543m = "actualLoadFilters")
/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$actualLoadFilters$1 */
final class SearchFiltersRefactorViewModel$actualLoadFilters$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchFiltersRefactorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersRefactorViewModel$actualLoadFilters$1(SearchFiltersRefactorViewModel searchFiltersRefactorViewModel, C19340c<? super SearchFiltersRefactorViewModel$actualLoadFilters$1> cVar) {
        super(cVar);
        this.this$0 = searchFiltersRefactorViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchFiltersRefactorViewModel.m18679b(this.this$0, this);
    }
}
