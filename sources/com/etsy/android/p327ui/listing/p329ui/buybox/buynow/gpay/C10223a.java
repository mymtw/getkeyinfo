package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay;

import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.gpay.a */
public final class C10223a extends C10423j {

    /* renamed from: a */
    public static final C10224a f22485a = new C10224a();

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.gpay.a$a */
    public static final class C10224a {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.getUserId();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay.C10223a m18299a(com.etsy.android.lib.models.apiv3.listing.ListingFetch r2, long r3) {
            /*
                com.etsy.android.lib.models.apiv3.listing.User r0 = r2.getSeller()
                if (r0 == 0) goto L_0x0017
                java.lang.Long r0 = r0.getUserId()
                if (r0 != 0) goto L_0x000d
                goto L_0x0017
            L_0x000d:
                long r0 = r0.longValue()
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 != 0) goto L_0x0017
                r3 = 1
                goto L_0x0018
            L_0x0017:
                r3 = 0
            L_0x0018:
                r4 = 0
                if (r3 == 0) goto L_0x001c
                return r4
            L_0x001c:
                com.etsy.android.lib.models.apiv3.listing.Listing r3 = r2.getListing()
                java.lang.String r3 = r3.getState()
                java.lang.String r0 = "active"
                boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r0)
                if (r3 != 0) goto L_0x002d
                return r4
            L_0x002d:
                com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r2 = r2.getSingleListingCheckout()
                if (r2 == 0) goto L_0x004f
                java.lang.Boolean r3 = r2.isExpressCheckoutEligible()
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r0)
                if (r3 == 0) goto L_0x004f
                java.lang.Boolean r2 = r2.getAcceptsGooglePay()
                boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r0)
                if (r2 == 0) goto L_0x004f
                com.etsy.android.ui.listing.ui.buybox.buynow.gpay.a r2 = new com.etsy.android.ui.listing.ui.buybox.buynow.gpay.a
                r2.<init>()
                return r2
            L_0x004f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay.C10223a.C10224a.m18299a(com.etsy.android.lib.models.apiv3.listing.ListingFetch, long):com.etsy.android.ui.listing.ui.buybox.buynow.gpay.a");
        }
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.GOOGLE_PAY;
    }

    public final boolean equals(Object obj) {
        return obj == f22485a;
    }

    public final int hashCode() {
        return C10223a.class.hashCode();
    }
}
