package com.etsy.android.p327ui.search.interstitial;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.etsy.android.p327ui.search.SearchSuggestionsRepository;
import com.etsy.android.p327ui.search.interstitial.C10877c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.StateFlowImpl;
import p568fn.C17782b;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$fetchRemainingSavedSearches$1", mo70541f = "SearchInterstitialViewModel.kt", mo70542l = {284}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$fetchRemainingSavedSearches$1 */
final class SearchInterstitialViewModel$fetchRemainingSavedSearches$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ SearchInterstitialViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInterstitialViewModel$fetchRemainingSavedSearches$1(SearchInterstitialViewModel searchInterstitialViewModel, int i, C19340c<? super SearchInterstitialViewModel$fetchRemainingSavedSearches$1> cVar) {
        super(2, cVar);
        this.this$0 = searchInterstitialViewModel;
        this.$position = i;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchInterstitialViewModel$fetchRemainingSavedSearches$1(this.this$0, this.$position, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchInterstitialViewModel$fetchRemainingSavedSearches$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        List<SearchLandingSuggestions.SavableSearchQuery> savedSearches;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SearchSuggestionsRepository searchSuggestionsRepository = this.this$0.f24115b;
            this.label = 1;
            obj = searchSuggestionsRepository.mo35654a(false, false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SearchSuggestionsRepository.C10727a aVar = (SearchSuggestionsRepository.C10727a) obj;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = EmptyList.INSTANCE;
        if ((aVar instanceof SearchSuggestionsRepository.C10727a.C10729b) && (savedSearches = ((SearchSuggestionsRepository.C10727a.C10729b) aVar).f23665a.getSavedSearches()) != null && savedSearches.size() > 3) {
            SearchInterstitialViewModel searchInterstitialViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(savedSearches));
            for (T next : savedSearches) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    SearchLandingSuggestions.SavableSearchQuery savableSearchQuery = (SearchLandingSuggestions.SavableSearchQuery) next;
                    C10875a aVar2 = searchInterstitialViewModel.f24123j;
                    aVar2.getClass();
                    C19383o.m32797g(savableSearchQuery, "query");
                    arrayList.add(aVar2.mo36107a(savableSearchQuery, i2));
                    i2 = i3;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
            ref$ObjectRef.element = arrayList.subList(3, savedSearches.size());
        }
        StateFlowImpl stateFlowImpl = this.this$0.f24124k;
        int i4 = this.$position;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, ((C10882d) value).mo36117a(new C10877c.C10879b(i4, (List) ref$ObjectRef.element))));
        return C19394m.f43287a;
    }
}
