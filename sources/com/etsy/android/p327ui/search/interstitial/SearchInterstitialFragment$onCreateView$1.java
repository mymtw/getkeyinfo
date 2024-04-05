package com.etsy.android.p327ui.search.interstitial;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.interstitial.SearchInterstitialFragment$onCreateView$1", mo70541f = "SearchInterstitialFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialFragment$onCreateView$1 */
public final class SearchInterstitialFragment$onCreateView$1 extends SuspendLambda implements C19861p<C10882d, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchInterstitialFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInterstitialFragment$onCreateView$1(SearchInterstitialFragment searchInterstitialFragment, C19340c<? super SearchInterstitialFragment$onCreateView$1> cVar) {
        super(2, cVar);
        this.this$0 = searchInterstitialFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SearchInterstitialFragment$onCreateView$1 searchInterstitialFragment$onCreateView$1 = new SearchInterstitialFragment$onCreateView$1(this.this$0, cVar);
        searchInterstitialFragment$onCreateView$1.L$0 = obj;
        return searchInterstitialFragment$onCreateView$1;
    }

    public final Object invoke(C10882d dVar, C19340c<? super C19394m> cVar) {
        return ((SearchInterstitialFragment$onCreateView$1) create(dVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.handleState((C10882d) this.L$0);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
