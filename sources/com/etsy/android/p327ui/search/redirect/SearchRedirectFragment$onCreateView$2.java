package com.etsy.android.p327ui.search.redirect;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.redirect.SearchRedirectFragment$onCreateView$2", mo70541f = "SearchRedirectFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.redirect.SearchRedirectFragment$onCreateView$2 */
public final class SearchRedirectFragment$onCreateView$2 extends SuspendLambda implements C19861p<C10930d, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchRedirectFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRedirectFragment$onCreateView$2(SearchRedirectFragment searchRedirectFragment, C19340c<? super SearchRedirectFragment$onCreateView$2> cVar) {
        super(2, cVar);
        this.this$0 = searchRedirectFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SearchRedirectFragment$onCreateView$2 searchRedirectFragment$onCreateView$2 = new SearchRedirectFragment$onCreateView$2(this.this$0, cVar);
        searchRedirectFragment$onCreateView$2.L$0 = obj;
        return searchRedirectFragment$onCreateView$2;
    }

    public final Object invoke(C10930d dVar, C19340c<? super C19394m> cVar) {
        return ((SearchRedirectFragment$onCreateView$2) create(dVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.handleState((C10930d) this.L$0);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
