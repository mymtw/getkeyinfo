package p415of;

import com.etsy.android.stylekit.views.CollageRadioGroup;

/* renamed from: of.r */
public final class C13189r implements CollageRadioGroup.C9044a {

    /* renamed from: a */
    public final /* synthetic */ C13190s f29018a;

    public C13189r(C13190s sVar) {
        this.f29018a = sVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30994a(boolean r6, com.etsy.android.stylekit.views.CollageRadioButton r7) {
        /*
            r5 = this;
            java.lang.String r6 = "selectedButton"
            kotlin.jvm.internal.C19383o.m32797g(r7, r6)
            of.s r6 = r5.f29018a
            com.etsy.android.lib.models.apiv3.cart.ShippingDetails r6 = r6.f29020b
            r0 = 0
            if (r6 == 0) goto L_0x003c
            java.util.List r6 = r6.getShippingOptions()
            if (r6 == 0) goto L_0x003c
            java.util.Iterator r6 = r6.iterator()
        L_0x0016:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.etsy.android.lib.models.apiv3.cart.ShippingOption r2 = (com.etsy.android.lib.models.apiv3.cart.ShippingOption) r2
            java.lang.String r2 = r2.getNameWithoutPrice()
            java.lang.String r3 = r7.getText()
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r3)
            if (r2 == 0) goto L_0x0016
            goto L_0x0033
        L_0x0032:
            r1 = r0
        L_0x0033:
            com.etsy.android.lib.models.apiv3.cart.ShippingOption r1 = (com.etsy.android.lib.models.apiv3.cart.ShippingOption) r1
            if (r1 == 0) goto L_0x003c
            java.lang.String r6 = r1.getOptionId()
            goto L_0x003d
        L_0x003c:
            r6 = r0
        L_0x003d:
            if (r6 == 0) goto L_0x00b3
            of.s r7 = r5.f29018a
            java.lang.String r1 = r7.f29025g
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r6, r1)
            if (r1 != 0) goto L_0x00b3
            java.util.List<com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction> r1 = r7.f29021c
            java.util.Iterator r1 = r1.iterator()
        L_0x004f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r3 = (com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction) r3
            java.lang.String r3 = r3.getType()
            java.lang.String r4 = "shipping_option"
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x004f
            r0 = r2
        L_0x0069:
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r0 = (com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction) r0
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = "shipping_option_tuple"
            r0.addParam(r1, r6)
            of.a<com.etsy.android.lib.models.apiv3.vespa.UserAction> r1 = r7.f29023e
            r1.mo31328c(r0)
        L_0x0077:
            r7.f29025g = r6
            com.etsy.android.lib.logger.p r0 = r7.f29022d
            android.view.View r7 = r7.f29019a
            android.content.Context r7 = r7.getContext()
            if (r7 == 0) goto L_0x00aa
            r7 = 2
            kotlin.Pair[] r7 = new kotlin.Pair[r7]
            r1 = 0
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r2 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.REFERRER
            com.etsy.android.lib.logger.referrers.Referrer r3 = new com.etsy.android.lib.logger.referrers.Referrer
            java.lang.String r4 = "cart/kebab menu"
            r3.<init>(r4)
            java.lang.String r3 = r3.toString()
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r2, r3)
            r7[r1] = r4
            r1 = 1
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r2 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.SHIPPING_OPTION_ID
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r6)
            r7[r1] = r3
            java.util.Map r6 = kotlin.collections.C19294b0.m32562s0(r7)
            goto L_0x00ae
        L_0x00aa:
            java.util.Map r6 = kotlin.collections.C19294b0.m32559p0()
        L_0x00ae:
            java.lang.String r7 = "shipping_option_updated"
            r0.mo21333d(r7, r6)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p415of.C13189r.mo30994a(boolean, com.etsy.android.stylekit.views.CollageRadioButton):void");
    }
}
