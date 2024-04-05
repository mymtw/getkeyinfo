package com.etsy.android.p327ui.search.filters.refactor;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.filters.refactor.SearchFiltersFragment$onViewCreated$6", mo70541f = "SearchFiltersFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersFragment$onViewCreated$6 */
public final class SearchFiltersFragment$onViewCreated$6 extends SuspendLambda implements C19861p<C10861x, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchFiltersFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersFragment$onViewCreated$6(SearchFiltersFragment searchFiltersFragment, C19340c<? super SearchFiltersFragment$onViewCreated$6> cVar) {
        super(2, cVar);
        this.this$0 = searchFiltersFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SearchFiltersFragment$onViewCreated$6 searchFiltersFragment$onViewCreated$6 = new SearchFiltersFragment$onViewCreated$6(this.this$0, cVar);
        searchFiltersFragment$onViewCreated$6.L$0 = obj;
        return searchFiltersFragment$onViewCreated$6;
    }

    public final Object invoke(C10861x xVar, C19340c<? super C19394m> cVar) {
        return ((SearchFiltersFragment$onViewCreated$6) create(xVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.handleState((C10861x) this.L$0);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
