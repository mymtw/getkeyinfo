package com.etsy.android.p327ui.search.listingresults;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.apiv3.SearchWithAds;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.p327ui.search.listingresults.C10909i;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$setSearchWithAdsResults$3", mo70541f = "SearchResultsListingsViewModel.kt", mo70542l = {517}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$setSearchWithAdsResults$3 */
public final class SearchResultsListingsViewModel$setSearchWithAdsResults$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ boolean $isFirstPageOfResults;
    public final /* synthetic */ SearchWithAds $results;
    public int label;
    public final /* synthetic */ SearchResultsListingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsViewModel$setSearchWithAdsResults$3(SearchResultsListingsViewModel searchResultsListingsViewModel, SearchWithAds searchWithAds, boolean z, C19340c<? super SearchResultsListingsViewModel$setSearchWithAdsResults$3> cVar) {
        super(2, cVar);
        this.this$0 = searchResultsListingsViewModel;
        this.$results = searchWithAds;
        this.$isFirstPageOfResults = z;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchResultsListingsViewModel$setSearchWithAdsResults$3(this.this$0, this.$results, this.$isFirstPageOfResults, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchResultsListingsViewModel$setSearchWithAdsResults$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SearchResultsListingsViewModel searchResultsListingsViewModel = this.this$0;
            CoroutineDispatcher coroutineDispatcher = searchResultsListingsViewModel.f24189s;
            SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1 searchResultsListingsViewModel$setSearchWithAdsResults$3$page$1 = new SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1(this.$results, searchResultsListingsViewModel, this.$isFirstPageOfResults, (C19340c<? super SearchResultsListingsViewModel$setSearchWithAdsResults$3$page$1>) null);
            this.label = 1;
            obj = C19697g.m33471i(this, coroutineDispatcher, searchResultsListingsViewModel$setSearchWithAdsResults$3$page$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                this.this$0.f24187q.error(th);
                StateFlowImpl stateFlowImpl = this.this$0.f24190t;
                do {
                    value = stateFlowImpl.getValue();
                } while (!stateFlowImpl.mo72337i(value, ((SearchResultsListingsState) value).mo36191a(new C10909i.C10913d(th))));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Page page = (Page) obj;
        StateFlowImpl stateFlowImpl2 = this.this$0.f24190t;
        do {
            value2 = stateFlowImpl2.getValue();
        } while (!stateFlowImpl2.mo72337i(value2, ((SearchResultsListingsState) value2).mo36191a(new C10909i.C10914e(page))));
        return C19394m.f43287a;
    }
}
