package com.etsy.android.p327ui.search.filters;

/* renamed from: com.etsy.android.ui.search.filters.b */
public final /* synthetic */ class C10764b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f23720b;

    /* renamed from: c */
    public final /* synthetic */ int f23721c;

    /* renamed from: d */
    public final /* synthetic */ Object f23722d;

    public /* synthetic */ C10764b(Object obj, int i, int i2) {
        this.f23720b = i2;
        this.f23722d = obj;
        this.f23721c = i;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [com.etsy.android.lib.models.apiv3.Alert] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f23720b
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0010
        L_0x0006:
            java.lang.Object r0 = r7.f23722d
            com.etsy.android.ui.search.filters.SearchFiltersV2Fragment r0 = (com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment) r0
            int r1 = r7.f23721c
            com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment.m35032buildContentToggle$lambda33$lambda32(r0, r1)
            return
        L_0x0010:
            java.lang.Object r0 = r7.f23722d
            com.etsy.android.ui.user.review.CreateReviewViewModel r0 = (com.etsy.android.p327ui.user.review.CreateReviewViewModel) r0
            int r1 = r7.f23721c
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            com.etsy.android.ui.user.review.ReviewFlow r2 = r0.f25946x
            r3 = 0
            if (r2 == 0) goto L_0x00aa
            com.etsy.android.ui.user.review.ReviewMetadata r2 = r2.f25980a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.f26037c = r4
            com.etsy.android.ui.user.review.ReviewCard r2 = r0.mo37846d()
            if (r2 != 0) goto L_0x0035
            com.etsy.android.ui.user.review.ReviewScreen r1 = com.etsy.android.p327ui.user.review.ReviewScreen.OVERALL
            r0.mo37857p(r1)
            goto L_0x00a9
        L_0x0035:
            boolean r4 = r0.mo37856o()
            if (r4 == 0) goto L_0x006a
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r1 = r2.f25962d
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r1 = p514bk.C14088a.m21788q(r1)
            androidx.lifecycle.z<com.etsy.android.ui.user.review.s> r2 = r0.f25938p
            com.etsy.android.ui.user.review.s r4 = new com.etsy.android.ui.user.review.s
            if (r1 == 0) goto L_0x004a
            java.lang.String r5 = r1.f25999b
            goto L_0x004b
        L_0x004a:
            r5 = r3
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r1 = r1.f26007j
            goto L_0x0051
        L_0x0050:
            r1 = r3
        L_0x0051:
            com.etsy.android.ui.user.review.NavigationAction r6 = com.etsy.android.p327ui.user.review.NavigationAction.NEXT
            r4.<init>(r5, r1, r6)
            r2.postValue(r4)
            androidx.lifecycle.z<com.etsy.android.lib.models.apiv3.Alert> r1 = r0.f25934l
            com.etsy.android.ui.user.review.ReviewCard r2 = r0.mo37846d()
            if (r2 == 0) goto L_0x0063
            com.etsy.android.lib.models.apiv3.Alert r3 = r2.f25963e
        L_0x0063:
            r1.postValue(r3)
            r1 = 1
            r0.f25909A = r1
            goto L_0x00a9
        L_0x006a:
            androidx.lifecycle.z<com.etsy.android.lib.models.apiv3.Alert> r4 = r0.f25934l
            r4.postValue(r3)
            boolean r4 = r0.f25909A
            if (r4 == 0) goto L_0x0090
            java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption> r1 = r2.f25962d
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption r1 = p514bk.C14088a.m21788q(r1)
            androidx.lifecycle.z<com.etsy.android.ui.user.review.s> r0 = r0.f25938p
            com.etsy.android.ui.user.review.s r2 = new com.etsy.android.ui.user.review.s
            if (r1 == 0) goto L_0x0082
            java.lang.String r4 = r1.f25999b
            goto L_0x0083
        L_0x0082:
            r4 = r3
        L_0x0083:
            if (r1 == 0) goto L_0x0087
            com.etsy.android.ui.user.review.ReviewFlowNavigationOption$a r3 = r1.f26007j
        L_0x0087:
            com.etsy.android.ui.user.review.NavigationAction r1 = com.etsy.android.p327ui.user.review.NavigationAction.NEXT
            r2.<init>(r4, r3, r1)
            r0.postValue(r2)
            goto L_0x00a9
        L_0x0090:
            r0.mo37858q()
            com.etsy.android.lib.logger.p r0 = r0.f25926d
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r2 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.RATING_VALUE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r1)
            java.util.Map r1 = kotlin.reflect.C19421p.m32931U(r3)
            java.lang.String r2 = "listing_star_rating_card_did_rate"
            r0.mo21333d(r2, r1)
        L_0x00a9:
            return
        L_0x00aa:
            java.lang.String r0 = "reviewFlowModel"
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.C10764b.run():void");
    }
}
