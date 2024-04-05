package com.etsy.android.p327ui.search.shopresults;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.search.shopresults.C10939e;
import com.etsy.android.p327ui.search.shopresults.C10942g;
import com.etsy.android.p327ui.search.shopresults.C10951j;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.shopresults.SearchResultsShopsViewModel$doSearch$2", mo70541f = "SearchResultsShopsViewModel.kt", mo70542l = {70}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.shopresults.SearchResultsShopsViewModel$doSearch$2 */
public final class SearchResultsShopsViewModel$doSearch$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ SearchResultsShopsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsShopsViewModel$doSearch$2(SearchResultsShopsViewModel searchResultsShopsViewModel, C19340c<? super SearchResultsShopsViewModel$doSearch$2> cVar) {
        super(2, cVar);
        this.this$0 = searchResultsShopsViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchResultsShopsViewModel$doSearch$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchResultsShopsViewModel$doSearch$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SearchResultsShopsViewModel searchResultsShopsViewModel = this.this$0;
            SearchShopsRepository searchShopsRepository = searchResultsShopsViewModel.f24269b;
            C10950i iVar = new C10950i(((C10941f) searchResultsShopsViewModel.f24271d.getValue()).f24289c, ((C10941f) this.this$0.f24271d.getValue()).f24288b);
            this.label = 1;
            obj = searchShopsRepository.mo36277a(iVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C10951j jVar = (C10951j) obj;
        if (jVar instanceof C10951j.C10953b) {
            C10951j.C10953b bVar = (C10951j.C10953b) jVar;
            if (bVar.f24303b > 0) {
                StateFlowImpl stateFlowImpl = this.this$0.f24271d;
                do {
                    value2 = stateFlowImpl.getValue();
                } while (!stateFlowImpl.mo72337i(value2, C10941f.m18941a((C10941f) value2, (ArrayList) null, 0, (String) null, C10942g.C10948f.f24296a, 7)));
                StateFlowImpl stateFlowImpl2 = this.this$0.f24271d;
                C10939e.C10940a aVar = new C10939e.C10940a(bVar.f24303b, bVar.f24302a);
                C19383o.m32797g(stateFlowImpl2, "<this>");
                C10941f fVar = (C10941f) stateFlowImpl2.getValue();
                fVar.getClass();
                stateFlowImpl2.setValue(C10941f.m18941a(fVar, C19327t.m32651g1(fVar.f24287a, aVar), 0, (String) null, (C10942g) null, 14));
                SearchResultsShopsViewModel searchResultsShopsViewModel2 = this.this$0;
                int i2 = ((C10941f) searchResultsShopsViewModel2.f24271d.getValue()).f24288b + 30;
                StateFlowImpl stateFlowImpl3 = searchResultsShopsViewModel2.f24271d;
                stateFlowImpl3.setValue(C10941f.m18941a((C10941f) stateFlowImpl3.getValue(), (ArrayList) null, i2, (String) null, (C10942g) null, 13));
            } else {
                StateFlowImpl stateFlowImpl4 = this.this$0.f24271d;
                do {
                    value = stateFlowImpl4.getValue();
                } while (!stateFlowImpl4.mo72337i(value, C10941f.m18941a((C10941f) value, (ArrayList) null, 0, (String) null, C10942g.C10943a.f24291a, 7)));
            }
        } else if (jVar instanceof C10951j.C10952a) {
            this.this$0.mo36275c();
        }
        return C19394m.f43287a;
    }
}
