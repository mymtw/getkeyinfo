package com.etsy.android.p327ui.search.toplevelcategories;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.etsy.android.p327ui.search.SearchSuggestionsRepository;
import com.etsy.android.p327ui.search.toplevelcategories.C10960e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.toplevelcategories.TopLevelCategoriesViewModel$loadSuggestions$1", mo70541f = "TopLevelCategoriesViewModel.kt", mo70542l = {40}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.toplevelcategories.TopLevelCategoriesViewModel$loadSuggestions$1 */
final class TopLevelCategoriesViewModel$loadSuggestions$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ C10966f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopLevelCategoriesViewModel$loadSuggestions$1(C10966f fVar, C19340c<? super TopLevelCategoriesViewModel$loadSuggestions$1> cVar) {
        super(2, cVar);
        this.this$0 = fVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new TopLevelCategoriesViewModel$loadSuggestions$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((TopLevelCategoriesViewModel$loadSuggestions$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        C10960e eVar;
        Object value2;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            StateFlowImpl stateFlowImpl = this.this$0.f24315d;
            do {
                value3 = stateFlowImpl.getValue();
            } while (!stateFlowImpl.mo72337i(value3, C10959d.m18945a((C10959d) value3, C10960e.C10964d.f24311a, (ArrayList) null, 2)));
            SearchSuggestionsRepository searchSuggestionsRepository = this.this$0.f24313b;
            this.label = 1;
            obj = searchSuggestionsRepository.mo35654a(false, false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Exception unused) {
                StateFlowImpl stateFlowImpl2 = this.this$0.f24315d;
                do {
                    value = stateFlowImpl2.getValue();
                } while (!stateFlowImpl2.mo72337i(value, C10959d.m18945a((C10959d) value, C10960e.C10962b.f24309a, (ArrayList) null, 2)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SearchSuggestionsRepository.C10727a aVar = (SearchSuggestionsRepository.C10727a) obj;
        if (aVar instanceof SearchSuggestionsRepository.C10727a.C10729b) {
            C10955a aVar2 = this.this$0.f24314c;
            SearchLandingSuggestions searchLandingSuggestions = ((SearchSuggestionsRepository.C10727a.C10729b) aVar).f23665a;
            aVar2.getClass();
            List a = C10955a.m18944a(searchLandingSuggestions);
            eVar = a.isEmpty() ? C10960e.C10961a.f24308a : new C10960e.C10965e(a);
        } else {
            eVar = C10960e.C10962b.f24309a;
        }
        StateFlowImpl stateFlowImpl3 = this.this$0.f24315d;
        do {
            value2 = stateFlowImpl3.getValue();
        } while (!stateFlowImpl3.mo72337i(value2, C10959d.m18945a((C10959d) value2, eVar, (ArrayList) null, 2)));
        return C19394m.f43287a;
    }
}
