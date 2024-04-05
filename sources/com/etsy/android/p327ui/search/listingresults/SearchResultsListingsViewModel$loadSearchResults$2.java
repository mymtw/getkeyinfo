package com.etsy.android.p327ui.search.listingresults;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.apiv3.SearchWithAds;
import com.etsy.android.p327ui.search.listingresults.C10909i;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11012q;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11015r;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchWithAdsRepository;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$loadSearchResults$2", mo70541f = "SearchResultsListingsViewModel.kt", mo70542l = {222}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$loadSearchResults$2 */
final class SearchResultsListingsViewModel$loadSearchResults$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ boolean $isFirstPageOfResults;
    public final /* synthetic */ C11015r $specs;
    public int label;
    public final /* synthetic */ SearchResultsListingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsViewModel$loadSearchResults$2(SearchResultsListingsViewModel searchResultsListingsViewModel, C11015r rVar, boolean z, C19340c<? super SearchResultsListingsViewModel$loadSearchResults$2> cVar) {
        super(2, cVar);
        this.this$0 = searchResultsListingsViewModel;
        this.$specs = rVar;
        this.$isFirstPageOfResults = z;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchResultsListingsViewModel$loadSearchResults$2(this.this$0, this.$specs, this.$isFirstPageOfResults, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchResultsListingsViewModel$loadSearchResults$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SearchWithAdsRepository searchWithAdsRepository = this.this$0.f24174d;
            C11015r rVar = this.$specs;
            this.label = 1;
            obj = searchWithAdsRepository.mo36525a(rVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11012q qVar = (C11012q) obj;
        if (qVar instanceof C11012q.C11014b) {
            C11012q.C11014b bVar = (C11012q.C11014b) qVar;
            SearchWithAds searchWithAds = bVar.f24415a;
            String str = bVar.f24416b;
            this.this$0.f24180j.mo21370b();
            this.this$0.f24179i.mo46066i(str);
            this.this$0.mo36207n(searchWithAds, this.$isFirstPageOfResults);
        } else if (qVar instanceof C11012q.C11013a) {
            StateFlowImpl stateFlowImpl = this.this$0.f24190t;
            do {
                value = stateFlowImpl.getValue();
            } while (!stateFlowImpl.mo72337i(value, ((SearchResultsListingsState) value).mo36191a(new C10909i.C10913d(((C11012q.C11013a) qVar).f24414a))));
        }
        return C19394m.f43287a;
    }
}
