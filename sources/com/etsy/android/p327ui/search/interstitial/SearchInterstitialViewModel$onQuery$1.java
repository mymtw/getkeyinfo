package com.etsy.android.p327ui.search.interstitial;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$onQuery$1", mo70541f = "SearchInterstitialViewModel.kt", mo70542l = {265, 267}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$onQuery$1 */
public final class SearchInterstitialViewModel$onQuery$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $text;
    public int label;
    public final /* synthetic */ SearchInterstitialViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInterstitialViewModel$onQuery$1(String str, SearchInterstitialViewModel searchInterstitialViewModel, C19340c<? super SearchInterstitialViewModel$onQuery$1> cVar) {
        super(2, cVar);
        this.$text = str;
        this.this$0 = searchInterstitialViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchInterstitialViewModel$onQuery$1(this.$text, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchInterstitialViewModel$onQuery$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            String str = this.$text;
            if (str == null) {
                StateFlowImpl stateFlowImpl = this.this$0.f24126m;
                this.label = 1;
                stateFlowImpl.setValue("");
                if (C19394m.f43287a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                StateFlowImpl stateFlowImpl2 = this.this$0.f24126m;
                String obj2 = C19459m.m33035H1(str).toString();
                this.label = 2;
                stateFlowImpl2.setValue(obj2);
                if (C19394m.f43287a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1 || i == 2) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
