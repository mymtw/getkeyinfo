package com.etsy.android.p327ui.search.shopresults;

import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.p327ui.search.shopresults.C10942g;
import java.util.ArrayList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowImpl;
import p346fa.C12703a;

/* renamed from: com.etsy.android.ui.search.shopresults.SearchResultsShopsViewModel */
public final class SearchResultsShopsViewModel extends C2866i0 {

    /* renamed from: b */
    public final SearchShopsRepository f24269b;

    /* renamed from: c */
    public final Connectivity f24270c;

    /* renamed from: d */
    public final StateFlowImpl f24271d;

    /* renamed from: e */
    public final StateFlowImpl f24272e;

    public SearchResultsShopsViewModel(SearchShopsRepository searchShopsRepository, Connectivity connectivity, C12703a aVar) {
        C19383o.m32797g(searchShopsRepository, "searchShopsRepository");
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(aVar, "grafana");
        this.f24269b = searchShopsRepository;
        this.f24270c = connectivity;
        StateFlowImpl g = C19388s.m32862g(new C10941f(0));
        this.f24271d = g;
        this.f24272e = g;
    }

    /* renamed from: b */
    public final void mo36274b() {
        Object value;
        if (!this.f24270c.mo29933a()) {
            mo36275c();
            return;
        }
        if (!C19383o.m32792b(((C10941f) this.f24272e.getValue()).f24290d, C10942g.C10948f.f24296a)) {
            StateFlowImpl stateFlowImpl = this.f24271d;
            do {
                value = stateFlowImpl.getValue();
            } while (!stateFlowImpl.mo72337i(value, C10941f.m18941a((C10941f) value, (ArrayList) null, 0, (String) null, C10942g.C10946d.f24294a, 7)));
        }
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SearchResultsShopsViewModel$doSearch$2(this, (C19340c<? super SearchResultsShopsViewModel$doSearch$2>) null), 3);
    }

    /* renamed from: c */
    public final void mo36275c() {
        Object value;
        Object value2;
        if (((C10941f) this.f24271d.getValue()).f24288b == 0) {
            StateFlowImpl stateFlowImpl = this.f24271d;
            do {
                value2 = stateFlowImpl.getValue();
            } while (!stateFlowImpl.mo72337i(value2, C10941f.m18941a((C10941f) value2, (ArrayList) null, 0, (String) null, C10942g.C10944b.f24292a, 7)));
            return;
        }
        StateFlowImpl stateFlowImpl2 = this.f24271d;
        do {
            value = stateFlowImpl2.getValue();
        } while (!stateFlowImpl2.mo72337i(value, C10941f.m18941a((C10941f) value, (ArrayList) null, 0, (String) null, C10942g.C10947e.f24295a, 7)));
    }
}
