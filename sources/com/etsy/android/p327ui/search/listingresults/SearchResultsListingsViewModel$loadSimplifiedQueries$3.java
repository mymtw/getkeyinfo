package com.etsy.android.p327ui.search.listingresults;

import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.search.GuidedSearch;
import com.etsy.android.lib.models.apiv3.search.QueryCorrection;
import com.etsy.android.lib.models.cardviewelement.SearchFilterHeader;
import com.etsy.android.p327ui.search.listingresults.C10920j;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState;
import com.etsy.android.p327ui.search.p330v2.C10975f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$loadSimplifiedQueries$3 */
final class SearchResultsListingsViewModel$loadSimplifiedQueries$3 extends Lambda implements C19857l<C10975f, C19394m> {
    public final /* synthetic */ SearchResultsListingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsViewModel$loadSimplifiedQueries$3(SearchResultsListingsViewModel searchResultsListingsViewModel) {
        super(1);
        this.this$0 = searchResultsListingsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10975f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10975f fVar) {
        Object value;
        C10920j.C10921a aVar;
        C10975f fVar2 = fVar;
        C19383o.m32797g(fVar2, "result");
        if (fVar2 instanceof C10975f.C10977b) {
            StateFlowImpl stateFlowImpl = this.this$0.f24190t;
            do {
                value = stateFlowImpl.getValue();
                aVar = r12;
                List<String> queries = ((C10975f.C10977b) fVar2).f24341a.getQueries();
                C19383o.m32796f(queries, "result.simplifiedQueries.queries");
                C10920j.C10921a aVar2 = new C10920j.C10921a(queries);
            } while (!stateFlowImpl.mo72337i(value, SearchResultsListingsState.m18908b((SearchResultsListingsState) value, (ArrayList) null, (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List) null, (SearchResultsListingsState.ViewMode) null, false, false, aVar, 131071)));
        } else if (fVar2 instanceof C10975f.C10976a) {
            C10975f.C10976a aVar3 = (C10975f.C10976a) fVar2;
            this.this$0.f24187q.mo21309d(aVar3.f24338a, aVar3.f24340c);
        }
    }
}
