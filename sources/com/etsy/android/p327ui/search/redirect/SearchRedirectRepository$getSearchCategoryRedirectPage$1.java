package com.etsy.android.p327ui.search.redirect;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.search.redirect.SearchRedirectRepository", mo70541f = "SearchRedirectRepository.kt", mo70542l = {26}, mo70543m = "getSearchCategoryRedirectPage")
/* renamed from: com.etsy.android.ui.search.redirect.SearchRedirectRepository$getSearchCategoryRedirectPage$1 */
public final class SearchRedirectRepository$getSearchCategoryRedirectPage$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchRedirectRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRedirectRepository$getSearchCategoryRedirectPage$1(SearchRedirectRepository searchRedirectRepository, C19340c<? super SearchRedirectRepository$getSearchCategoryRedirectPage$1> cVar) {
        super(cVar);
        this.this$0 = searchRedirectRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo36246b((C10925a) null, this);
    }
}
