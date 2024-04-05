package com.etsy.android.p327ui.search.interstitial;

import com.etsy.android.p327ui.search.interstitial.C10877c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p430qe.C13311c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialFragment$onCreateView$3 */
public final class SearchInterstitialFragment$onCreateView$3 extends Lambda implements C19857l<C13311c, C19394m> {
    public final /* synthetic */ SearchInterstitialFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInterstitialFragment$onCreateView$3(SearchInterstitialFragment searchInterstitialFragment) {
        super(1);
        this.this$0 = searchInterstitialFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13311c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13311c cVar) {
        Object value;
        SearchInterstitialViewModel access$getViewModel = this.this$0.getViewModel();
        C19383o.m32796f(cVar, "it");
        access$getViewModel.getClass();
        StateFlowImpl stateFlowImpl = access$getViewModel.f24124k;
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo72337i(value, ((C10882d) value).mo36117a(new C10877c.C10878a(cVar))));
    }
}
