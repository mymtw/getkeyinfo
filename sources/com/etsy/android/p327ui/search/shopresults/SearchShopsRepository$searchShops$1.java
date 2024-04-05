package com.etsy.android.p327ui.search.shopresults;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.search.shopresults.SearchShopsRepository", mo70541f = "SearchShopsRepository.kt", mo70542l = {28}, mo70543m = "searchShops")
/* renamed from: com.etsy.android.ui.search.shopresults.SearchShopsRepository$searchShops$1 */
public final class SearchShopsRepository$searchShops$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchShopsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchShopsRepository$searchShops$1(SearchShopsRepository searchShopsRepository, C19340c<? super SearchShopsRepository$searchShops$1> cVar) {
        super(cVar);
        this.this$0 = searchShopsRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo36277a((C10950i) null, this);
    }
}
