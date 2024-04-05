package com.etsy.android.p327ui.search.toplevelcategories;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.search.SearchSuggestionsRepository;
import com.etsy.android.p327ui.search.toplevelcategories.C10960e;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* renamed from: com.etsy.android.ui.search.toplevelcategories.f */
public final class C10966f extends C2866i0 {

    /* renamed from: b */
    public final SearchSuggestionsRepository f24313b;

    /* renamed from: c */
    public final C10955a f24314c;

    /* renamed from: d */
    public final StateFlowImpl f24315d;

    /* renamed from: e */
    public final C19662p1 f24316e;

    public C10966f(SearchSuggestionsRepository searchSuggestionsRepository, C10955a aVar, C10959d dVar) {
        C19383o.m32797g(searchSuggestionsRepository, "repository");
        C19383o.m32797g(aVar, "mapper");
        C19383o.m32797g(dVar, "initialState");
        this.f24313b = searchSuggestionsRepository;
        this.f24314c = aVar;
        StateFlowImpl g = C19388s.m32862g(dVar);
        this.f24315d = g;
        C19662p1 w = C0761x.m1750w(g);
        this.f24316e = w;
        if (C19383o.m32792b(((C10959d) w.getValue()).f24306a, C10960e.C10963c.f24310a)) {
            C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new TopLevelCategoriesViewModel$loadSuggestions$1(this, (C19340c<? super TopLevelCategoriesViewModel$loadSuggestions$1>) null), 3);
        }
    }
}
