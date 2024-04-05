package com.etsy.android.p327ui.search;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.search.SearchSuggestionsRepository", mo70541f = "SearchSuggestionsRepository.kt", mo70542l = {38}, mo70543m = "getLandingSuggestions")
/* renamed from: com.etsy.android.ui.search.SearchSuggestionsRepository$getLandingSuggestions$1 */
public final class SearchSuggestionsRepository$getLandingSuggestions$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchSuggestionsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchSuggestionsRepository$getLandingSuggestions$1(SearchSuggestionsRepository searchSuggestionsRepository, C19340c<? super SearchSuggestionsRepository$getLandingSuggestions$1> cVar) {
        super(cVar);
        this.this$0 = searchSuggestionsRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo35654a(false, false, this);
    }
}
