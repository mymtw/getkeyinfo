package com.etsy.android.p327ui.search.redirect;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.search.container.SearchNavigationViewModel;
import com.etsy.android.p327ui.search.redirect.C10930d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* renamed from: com.etsy.android.ui.search.redirect.e */
public final class C10933e extends C2866i0 {

    /* renamed from: b */
    public final SearchRedirectRepository f24265b;

    /* renamed from: c */
    public SearchNavigationViewModel f24266c;

    /* renamed from: d */
    public final StateFlowImpl f24267d;

    /* renamed from: e */
    public final C19662p1 f24268e;

    public C10933e(SearchRedirectRepository searchRedirectRepository) {
        C19383o.m32797g(searchRedirectRepository, "repository");
        this.f24265b = searchRedirectRepository;
        StateFlowImpl g = C19388s.m32862g(C10930d.C10932b.f24264a);
        this.f24267d = g;
        this.f24268e = C0761x.m1750w(g);
    }
}
