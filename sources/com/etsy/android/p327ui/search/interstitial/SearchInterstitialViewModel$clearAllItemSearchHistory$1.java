package com.etsy.android.p327ui.search.interstitial;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.search.SearchHistoryRepository;
import com.etsy.android.p327ui.search.interstitial.C10877c;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$clearAllItemSearchHistory$1", mo70541f = "SearchInterstitialViewModel.kt", mo70542l = {82}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$clearAllItemSearchHistory$1 */
final class SearchInterstitialViewModel$clearAllItemSearchHistory$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $query;
    public int label;
    public final /* synthetic */ SearchInterstitialViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInterstitialViewModel$clearAllItemSearchHistory$1(SearchInterstitialViewModel searchInterstitialViewModel, String str, C19340c<? super SearchInterstitialViewModel$clearAllItemSearchHistory$1> cVar) {
        super(2, cVar);
        this.this$0 = searchInterstitialViewModel;
        this.$query = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchInterstitialViewModel$clearAllItemSearchHistory$1(this.this$0, this.$query, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchInterstitialViewModel$clearAllItemSearchHistory$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SearchHistoryRepository searchHistoryRepository = this.this$0.f24116c;
            this.label = 1;
            obj = searchHistoryRepository.mo35643a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SearchHistoryRepository.C10724a aVar = (SearchHistoryRepository.C10724a) obj;
        if (aVar instanceof SearchHistoryRepository.C10724a.C10726b) {
            SearchInterstitialViewModel searchInterstitialViewModel = this.this$0;
            searchInterstitialViewModel.f24115b.f23663c = null;
            searchInterstitialViewModel.f24118e.f19770b.clear();
            this.this$0.mo36097c(this.$query);
        } else if (aVar instanceof SearchHistoryRepository.C10724a.C10725a) {
            StateFlowImpl stateFlowImpl = this.this$0.f24124k;
            do {
                value = stateFlowImpl.getValue();
            } while (!stateFlowImpl.mo72337i(value, ((C10882d) value).mo36117a(C10877c.C10880c.f24136a)));
        }
        return C19394m.f43287a;
    }
}
