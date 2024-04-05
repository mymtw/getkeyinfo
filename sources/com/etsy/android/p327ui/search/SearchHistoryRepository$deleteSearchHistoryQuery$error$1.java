package com.etsy.android.p327ui.search;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import okhttp3.C19928a0;
import p744gq.C19060c;
import p753kq.C19861p;
import retrofit2.C20145v;

@C19060c(mo70540c = "com.etsy.android.ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$error$1", mo70541f = "SearchHistoryRepository.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.SearchHistoryRepository$deleteSearchHistoryQuery$error$1 */
public final class SearchHistoryRepository$deleteSearchHistoryQuery$error$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super String>, Object> {
    public final /* synthetic */ C20145v<C19394m> $response;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchHistoryRepository$deleteSearchHistoryQuery$error$1(C20145v<C19394m> vVar, C19340c<? super SearchHistoryRepository$deleteSearchHistoryQuery$error$1> cVar) {
        super(2, cVar);
        this.$response = vVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchHistoryRepository$deleteSearchHistoryQuery$error$1(this.$response, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super String> cVar) {
        return ((SearchHistoryRepository$deleteSearchHistoryQuery$error$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C19928a0 a0Var = this.$response.f44616c;
            if (a0Var != null) {
                return a0Var.mo72844g();
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
