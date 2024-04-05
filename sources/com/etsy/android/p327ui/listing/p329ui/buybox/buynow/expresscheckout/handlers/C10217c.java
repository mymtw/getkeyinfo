package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers;

import com.etsy.android.p327ui.listing.C10156h;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.handlers.c */
public final class C10217c {

    /* renamed from: a */
    public final C13573c f22472a;

    /* renamed from: b */
    public final C10156h f22473b;

    public C10217c(C10156h hVar, C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(hVar, "listingViewEligibility");
        this.f22472a = cVar;
        this.f22473b = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r7 = com.etsy.android.lib.models.apiv3.listing.extensions.ListingExpressCheckoutExtensionsKt.convertToV2(r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d.C13575a mo33598a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r7, p466vc.C13597g.C13634f0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.a r8 = r8.f30113a
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r7 = r7.f22239g
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r7 = r7.getSingleListingCheckout()
            r0 = 0
            if (r7 == 0) goto L_0x001b
            com.etsy.android.lib.models.SingleListingCheckout r7 = com.etsy.android.lib.models.apiv3.listing.extensions.ListingExpressCheckoutExtensionsKt.convertToV2(r7)
            if (r7 == 0) goto L_0x001b
            com.etsy.android.lib.models.PaymentOption r7 = r7.getDefaultPaymentOption()
            goto L_0x001c
        L_0x001b:
            r7 = r0
        L_0x001c:
            boolean r1 = r8.f22464b
            r2 = 0
            if (r1 != 0) goto L_0x0057
            if (r7 == 0) goto L_0x0057
            vc.g$f r1 = new vc.g$f
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r3 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.LISTING_ID
            long r4 = r8.f22463a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r3, r4)
            java.util.Map r3 = kotlin.reflect.C19421p.m32931U(r5)
            java.lang.String r4 = "listing_buy_it_now_direct_to_checkout"
            r1.<init>(r4, r3)
            boolean r8 = r8.f22466d
            if (r8 == 0) goto L_0x0051
            com.etsy.android.ui.listing.h r8 = r6.f22473b
            com.etsy.android.lib.config.e r8 = r8.f22335a
            com.etsy.android.lib.config.EtsyConfigKey r3 = com.etsy.android.lib.config.C8592b.C8601i.f18895i
            boolean r8 = r8.mo21132b(r3)
            if (r8 == 0) goto L_0x0051
            vc.g$d2 r8 = new vc.g$d2
            r8.<init>(r7)
            goto L_0x0095
        L_0x0051:
            vc.g$f2 r8 = new vc.g$f2
            r8.<init>(r7, r0)
            goto L_0x0095
        L_0x0057:
            boolean r7 = r8.f22465c
            java.lang.String r1 = "start_single_listing_checkout"
            if (r7 == 0) goto L_0x0079
            vc.g$f r7 = new vc.g$f
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r0 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.LISTING_ID
            long r3 = r8.f22463a
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r0, r8)
            java.util.Map r8 = kotlin.reflect.C19421p.m32931U(r3)
            r7.<init>(r1, r8)
            vc.g$x0 r8 = new vc.g$x0
            r8.<init>(r2)
            goto L_0x0094
        L_0x0079:
            vc.g$f r7 = new vc.g$f
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r3 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.LISTING_ID
            long r4 = r8.f22463a
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r8)
            java.util.Map r8 = kotlin.reflect.C19421p.m32931U(r4)
            r7.<init>(r1, r8)
            vc.g$w r8 = new vc.g$w
            r8.<init>(r0)
        L_0x0094:
            r1 = r7
        L_0x0095:
            vc.c r7 = r6.f22472a
            r7.mo38043a(r1)
            vc.c r7 = r6.f22472a
            vc.g$m5 r0 = new vc.g$m5
            r1 = 6
            r0.<init>(r8, r2, r1)
            r7.mo38043a(r0)
            vc.d$a r7 = p466vc.C13574d.C13575a.f29662a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers.C10217c.mo33598a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$f0):vc.d$a");
    }
}
