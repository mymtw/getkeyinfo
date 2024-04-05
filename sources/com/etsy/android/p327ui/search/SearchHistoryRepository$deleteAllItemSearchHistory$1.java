package com.etsy.android.p327ui.search;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.search.SearchHistoryRepository", mo70541f = "SearchHistoryRepository.kt", mo70542l = {20, 24}, mo70543m = "deleteAllItemSearchHistory")
/* renamed from: com.etsy.android.ui.search.SearchHistoryRepository$deleteAllItemSearchHistory$1 */
public final class SearchHistoryRepository$deleteAllItemSearchHistory$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchHistoryRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchHistoryRepository$deleteAllItemSearchHistory$1(SearchHistoryRepository searchHistoryRepository, C19340c<? super SearchHistoryRepository$deleteAllItemSearchHistory$1> cVar) {
        super(cVar);
        this.this$0 = searchHistoryRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo35643a(this);
    }
}
