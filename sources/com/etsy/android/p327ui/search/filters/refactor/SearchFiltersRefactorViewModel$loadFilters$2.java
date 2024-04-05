package com.etsy.android.p327ui.search.filters.refactor;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19671s1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$loadFilters$2", mo70541f = "SearchFiltersRefactorViewModel.kt", mo70542l = {613}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$loadFilters$2 */
public final class SearchFiltersRefactorViewModel$loadFilters$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ SearchFiltersRefactorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersRefactorViewModel$loadFilters$2(SearchFiltersRefactorViewModel searchFiltersRefactorViewModel, C19340c<? super SearchFiltersRefactorViewModel$loadFilters$2> cVar) {
        super(2, cVar);
        this.this$0 = searchFiltersRefactorViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchFiltersRefactorViewModel$loadFilters$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchFiltersRefactorViewModel$loadFilters$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19671s1 s1Var = this.this$0.f23800m;
            Boolean bool = Boolean.TRUE;
            this.label = 1;
            if (s1Var.emit(bool, this) == coroutineSingletons) {
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
