package com.etsy.android.p327ui.search.shopresults;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.shopresults.SearchResultsShopsFragment$onViewCreated$1", mo70541f = "SearchResultsShopsFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.shopresults.SearchResultsShopsFragment$onViewCreated$1 */
public final class SearchResultsShopsFragment$onViewCreated$1 extends SuspendLambda implements C19861p<C10941f, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchResultsShopsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsShopsFragment$onViewCreated$1(SearchResultsShopsFragment searchResultsShopsFragment, C19340c<? super SearchResultsShopsFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = searchResultsShopsFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SearchResultsShopsFragment$onViewCreated$1 searchResultsShopsFragment$onViewCreated$1 = new SearchResultsShopsFragment$onViewCreated$1(this.this$0, cVar);
        searchResultsShopsFragment$onViewCreated$1.L$0 = obj;
        return searchResultsShopsFragment$onViewCreated$1;
    }

    public final Object invoke(C10941f fVar, C19340c<? super C19394m> cVar) {
        return ((SearchResultsShopsFragment$onViewCreated$1) create(fVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.handleState((C10941f) this.L$0);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
