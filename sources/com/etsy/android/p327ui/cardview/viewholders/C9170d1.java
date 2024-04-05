package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import com.etsy.android.p327ui.search.SearchResultsHeaderView;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p414oe.C13163b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.d1 */
public final class C9170d1 extends C12086e<BasicSectionHeader> {

    /* renamed from: c */
    public final C9141v f20188c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9170d1(android.view.ViewGroup r3, com.etsy.android.p327ui.cardview.clickhandlers.C9141v r4, com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11010o r5) {
        /*
            r2 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "searchFiltersEligibility"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            com.etsy.android.lib.config.e r5 = r5.f24413a
            com.etsy.android.lib.config.EtsyConfigKey r0 = com.etsy.android.lib.config.C8592b.f18766W0
            boolean r5 = r5.mo21132b(r0)
            r0 = 0
            java.lang.String r1 = "parent.context"
            if (r5 == 0) goto L_0x0024
            com.etsy.android.ui.search.SearchResultsFilterHeaderView r5 = new com.etsy.android.ui.search.SearchResultsFilterHeaderView
            android.content.Context r3 = r3.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r3, r1)
            r5.<init>(r3, r0)
            goto L_0x0030
        L_0x0024:
            com.etsy.android.ui.search.SearchFilterHeader3x3View r5 = new com.etsy.android.ui.search.SearchFilterHeader3x3View
            android.content.Context r3 = r3.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r3, r1)
            r5.<init>(r3, r0)
        L_0x0030:
            r2.<init>(r5)
            r2.f20188c = r4
            android.view.View r3 = r2.itemView
            r4 = 1
            r3.setFocusableInTouchMode(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cardview.viewholders.C9170d1.<init>(android.view.ViewGroup, com.etsy.android.ui.cardview.clickhandlers.v, com.etsy.android.ui.search.v2.filters.searchfiltersv2.o):void");
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        BasicSectionHeader basicSectionHeader = (BasicSectionHeader) obj;
        C19383o.m32797g(basicSectionHeader, ResponseConstants.HEADER);
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.ui.search.SearchResultsHeaderView");
        SearchResultsHeaderView.bind$default((SearchResultsHeaderView) view, basicSectionHeader, this.f20188c, true, false, (C13163b) null, 24, (Object) null);
    }
}
