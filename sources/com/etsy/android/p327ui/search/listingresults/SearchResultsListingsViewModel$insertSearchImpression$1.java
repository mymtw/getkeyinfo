package com.etsy.android.p327ui.search.listingresults;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p422pe.C13224c;
import p422pe.C13225d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$insertSearchImpression$1", mo70541f = "SearchResultsListingsViewModel.kt", mo70542l = {438}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$insertSearchImpression$1 */
final class SearchResultsListingsViewModel$insertSearchImpression$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C13224c $model;
    public int label;
    public final /* synthetic */ SearchResultsListingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsViewModel$insertSearchImpression$1(SearchResultsListingsViewModel searchResultsListingsViewModel, C13224c cVar, C19340c<? super SearchResultsListingsViewModel$insertSearchImpression$1> cVar2) {
        super(2, cVar2);
        this.this$0 = searchResultsListingsViewModel;
        this.$model = cVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchResultsListingsViewModel$insertSearchImpression$1(this.this$0, this.$model, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchResultsListingsViewModel$insertSearchImpression$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C13225d dVar = this.this$0.f24175e;
            C13224c cVar = this.$model;
            this.label = 1;
            dVar.f29071a.mo21308c();
            if (dVar.f29072b.mo45927c(cVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
