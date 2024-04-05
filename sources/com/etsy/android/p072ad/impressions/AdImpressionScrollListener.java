package com.etsy.android.p072ad.impressions;

import androidx.lifecycle.C2886r;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C19394m;
import p415of.C13173c;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ad.impressions.AdImpressionScrollListener */
public final class AdImpressionScrollListener extends RecyclerView.C3108s implements C2886r {

    /* renamed from: b */
    public final C13173c f14109b;

    /* renamed from: c */
    public final C19861p<String, String, C19394m> f14110c;

    /* renamed from: d */
    public int f14111d = -1;

    /* renamed from: e */
    public int f14112e = -1;

    public AdImpressionScrollListener(C13173c cVar, C19861p<? super String, ? super String, C19394m> pVar) {
        this.f14109b = cVar;
        this.f14110c = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e A[LOOP:0: B:9:0x0043->B:22:0x009e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r3, int r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            super.onScrolled(r3, r4, r5)
            androidx.recyclerview.widget.RecyclerView$o r4 = r3.getLayoutManager()
            boolean r4 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0031
            androidx.recyclerview.widget.RecyclerView$o r4 = r3.getLayoutManager()
            java.lang.String r5 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            kotlin.jvm.internal.C19383o.m32795e(r4, r5)
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            int r4 = r4.mo11279P0()
            r2.f14111d = r4
            androidx.recyclerview.widget.RecyclerView$o r3 = r3.getLayoutManager()
            kotlin.jvm.internal.C19383o.m32795e(r3, r5)
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r3 = r3.mo11283T0()
            r2.f14112e = r3
            goto L_0x0038
        L_0x0031:
            com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.String r4 = "AdImpressionScrollListener currently only supports RecyclerViews with a LinearLayoutManager."
            r3.mo21306a(r4)
        L_0x0038:
            int r3 = r2.f14111d
            r4 = -1
            if (r3 == r4) goto L_0x00a1
            int r5 = r2.f14112e
            if (r5 == r4) goto L_0x00a1
            if (r3 > r5) goto L_0x00a1
        L_0x0043:
            of.c r4 = r2.f14109b
            java.lang.Object r4 = r4.getItem(r3)
            of.o r4 = (p415of.C13186o) r4
            boolean r0 = r4 instanceof com.etsy.android.lib.models.interfaces.Promotable
            if (r0 == 0) goto L_0x007a
            r0 = r4
            com.etsy.android.lib.models.interfaces.Promotable r0 = (com.etsy.android.lib.models.interfaces.Promotable) r0
            java.lang.String r1 = r0.getProlistDisplayLocation()
            boolean r1 = p628nj.C18263b.m30839d0(r1)
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = r0.getProlistLoggingKey()
            boolean r1 = p628nj.C18263b.m30839d0(r1)
            if (r1 == 0) goto L_0x007a
            java.lang.String r4 = r0.getProlistDisplayLocation()
            kotlin.jvm.internal.C19383o.m32794d(r4)
            java.lang.String r0 = r0.getProlistLoggingKey()
            kotlin.jvm.internal.C19383o.m32794d(r0)
            kq.p<java.lang.String, java.lang.String, kotlin.m> r1 = r2.f14110c
            r1.invoke(r4, r0)
            goto L_0x009c
        L_0x007a:
            boolean r0 = r4 instanceof com.etsy.android.lib.models.apiv3.ListingCard
            if (r0 == 0) goto L_0x009c
            com.etsy.android.lib.models.apiv3.ListingCard r4 = (com.etsy.android.lib.models.apiv3.ListingCard) r4
            java.lang.String r0 = r4.getProlistLoggingKey()
            boolean r0 = p628nj.C18263b.m30839d0(r0)
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "a."
            java.lang.String r0 = p003a2.C0015b.m88g(r0, r3)
            java.lang.String r4 = r4.getProlistLoggingKey()
            kotlin.jvm.internal.C19383o.m32794d(r4)
            kq.p<java.lang.String, java.lang.String, kotlin.m> r1 = r2.f14110c
            r1.invoke(r0, r4)
        L_0x009c:
            if (r3 == r5) goto L_0x00a1
            int r3 = r3 + 1
            goto L_0x0043
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p072ad.impressions.AdImpressionScrollListener.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
