package com.etsy.android.p327ui.favorites.search;

import android.view.View;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.search.f */
public final class C9892f extends C12086e<C9891e> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9892f(android.view.ViewGroup r3, com.etsy.android.lib.logger.C8703p r4) {
        /*
            r2 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "analyticsTracker"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            android.content.Context r3 = r3.getContext()
            com.etsy.android.ui.favorites.search.SearchView r0 = new com.etsy.android.ui.favorites.search.SearchView
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C19383o.m32796f(r3, r1)
            r0.<init>((com.etsy.android.lib.logger.C8672b) r4, (android.content.Context) r3)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.search.C9892f.<init>(android.view.ViewGroup, com.etsy.android.lib.logger.p):void");
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C9891e eVar = (C9891e) obj;
        C19383o.m32797g(eVar, "data");
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.ui.favorites.search.SearchView");
        ((SearchView) view).bind(eVar);
    }
}
