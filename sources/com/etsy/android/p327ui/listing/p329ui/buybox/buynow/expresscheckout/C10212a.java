package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.a */
public final class C10212a extends C10423j {

    /* renamed from: a */
    public final long f22463a;

    /* renamed from: b */
    public final boolean f22464b;

    /* renamed from: c */
    public final boolean f22465c;

    /* renamed from: d */
    public final boolean f22466d = false;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.a$a */
    public static final class C10213a {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getUserId();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.C10212a m18292a(com.etsy.android.lib.models.apiv3.listing.ListingFetch r5, long r6) {
            /*
                com.etsy.android.lib.models.apiv3.listing.User r0 = r5.getSeller()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0019
                java.lang.Long r0 = r0.getUserId()
                if (r0 != 0) goto L_0x000f
                goto L_0x0019
            L_0x000f:
                long r3 = r0.longValue()
                int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r6 != 0) goto L_0x0019
                r6 = r1
                goto L_0x001a
            L_0x0019:
                r6 = r2
            L_0x001a:
                r7 = 0
                if (r6 == 0) goto L_0x001e
                return r7
            L_0x001e:
                com.etsy.android.lib.models.apiv3.listing.Listing r6 = r5.getListing()
                java.lang.String r6 = r6.getState()
                java.lang.String r0 = "active"
                boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r0)
                if (r6 != 0) goto L_0x002f
                return r7
            L_0x002f:
                com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r6 = r5.getSingleListingCheckout()
                if (r6 == 0) goto L_0x008b
                java.util.List r0 = r6.getPaymentOptions()
                if (r0 == 0) goto L_0x0043
                int r0 = r0.size()
                if (r0 != r1) goto L_0x0043
                r0 = r1
                goto L_0x0044
            L_0x0043:
                r0 = r2
            L_0x0044:
                if (r0 == 0) goto L_0x005d
                java.util.List r0 = r6.getPaymentOptions()
                java.lang.Object r0 = kotlin.collections.C19327t.m32638T0(r0)
                com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption r0 = (com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption) r0
                java.lang.String r0 = r0.getPaymentMethod()
                java.lang.String r3 = "paypal"
                boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
                if (r0 == 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r1 = r2
            L_0x005e:
                java.lang.Boolean r0 = r6.isExpressCheckoutEligible()
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
                if (r0 == 0) goto L_0x008b
                java.lang.Boolean r0 = r6.getAcceptsGooglePay()
                boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
                if (r0 != 0) goto L_0x008b
                com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.a r7 = new com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.a
                com.etsy.android.lib.models.apiv3.listing.Listing r5 = r5.getListing()
                long r3 = r5.getListingId()
                java.lang.Boolean r5 = r6.isInternational()
                if (r5 == 0) goto L_0x0088
                boolean r2 = r5.booleanValue()
            L_0x0088:
                r7.<init>(r3, r1, r2)
            L_0x008b:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.C10212a.C10213a.m18292a(com.etsy.android.lib.models.apiv3.listing.ListingFetch, long):com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.a");
        }
    }

    public C10212a(long j, boolean z, boolean z2) {
        this.f22463a = j;
        this.f22464b = z;
        this.f22465c = z2;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.EXPRESS_CHECKOUT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10212a)) {
            return false;
        }
        C10212a aVar = (C10212a) obj;
        return this.f22463a == aVar.f22463a && this.f22464b == aVar.f22464b && this.f22465c == aVar.f22465c && this.f22466d == aVar.f22466d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f22463a) * 31;
        boolean z = this.f22464b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f22465c;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f22466d;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ExpressCheckout(listingId=");
        h.append(this.f22463a);
        h.append(", isStandalonePaypal=");
        h.append(this.f22464b);
        h.append(", isInternationalSingleListingCheckout=");
        h.append(this.f22465c);
        h.append(", isNativeBuyItNowCheckoutEligible=");
        return C0391c.m1058d(h, this.f22466d, ')');
    }
}
