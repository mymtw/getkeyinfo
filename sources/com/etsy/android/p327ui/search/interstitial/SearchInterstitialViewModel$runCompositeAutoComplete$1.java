package com.etsy.android.p327ui.search.interstitial;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel", mo70541f = "SearchInterstitialViewModel.kt", mo70542l = {177}, mo70543m = "runCompositeAutoComplete")
/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$runCompositeAutoComplete$1 */
public final class SearchInterstitialViewModel$runCompositeAutoComplete$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchInterstitialViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInterstitialViewModel$runCompositeAutoComplete$1(SearchInterstitialViewModel searchInterstitialViewModel, C19340c<? super SearchInterstitialViewModel$runCompositeAutoComplete$1> cVar) {
        super(cVar);
        this.this$0 = searchInterstitialViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo36098d((String) null, (String) null, 0, false, this);
    }
}
