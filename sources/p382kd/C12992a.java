package p382kd;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import java.util.concurrent.TimeUnit;
import p003a2.C0015b;

/* renamed from: kd.a */
public final class C12992a extends C10423j {

    /* renamed from: b */
    public static final long f28601b = TimeUnit.HOURS.toMillis(48);

    /* renamed from: c */
    public static final /* synthetic */ int f28602c = 0;

    /* renamed from: a */
    public final long f28603a;

    /* renamed from: kd.a$a */
    public static final class C12993a {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
            r10 = r10.getSignalPeckingOrder();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p382kd.C12992a m20687a(com.etsy.android.lib.models.apiv3.listing.ListingFetch r9, com.etsy.android.lib.util.C8890e0 r10) {
            /*
                java.lang.String r0 = "listingFetch"
                kotlin.jvm.internal.C19383o.m32797g(r9, r0)
                java.lang.String r0 = "systemTime"
                kotlin.jvm.internal.C19383o.m32797g(r10, r0)
                com.etsy.android.lib.models.apiv3.listing.ListingCard r10 = r9.getListingCard()
                r0 = 0
                if (r10 == 0) goto L_0x001e
                java.util.List r10 = r10.getSignalPeckingOrder()
                if (r10 == 0) goto L_0x001e
                java.lang.Object r10 = kotlin.collections.C19327t.m32640V0(r10)
                java.lang.String r10 = (java.lang.String) r10
                goto L_0x001f
            L_0x001e:
                r10 = r0
            L_0x001f:
                com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage r9 = r9.getPromoMessage()
                if (r9 == 0) goto L_0x002a
                com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotion r9 = r9.getPromoData()
                goto L_0x002b
            L_0x002a:
                r9 = r0
            L_0x002b:
                java.lang.String r1 = "promotion"
                boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r1)
                if (r10 == 0) goto L_0x0073
                if (r9 == 0) goto L_0x0073
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.Long r10 = r9.getStart()
                r3 = 0
                if (r10 == 0) goto L_0x0046
                long r5 = r10.longValue()
                goto L_0x0047
            L_0x0046:
                r5 = r3
            L_0x0047:
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r7
                java.lang.Long r9 = r9.getEnd()
                if (r9 == 0) goto L_0x0055
                long r9 = r9.longValue()
                goto L_0x0056
            L_0x0055:
                r9 = r3
            L_0x0056:
                long r9 = r9 * r7
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 == 0) goto L_0x0073
                int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r3 == 0) goto L_0x0073
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 <= 0) goto L_0x0073
                int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r3 >= 0) goto L_0x0073
                long r9 = r9 - r1
                long r1 = p382kd.C12992a.f28601b
                int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r1 >= 0) goto L_0x0073
                kd.a r0 = new kd.a
                r0.<init>(r9)
            L_0x0073:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p382kd.C12992a.C12993a.m20687a(com.etsy.android.lib.models.apiv3.listing.ListingFetch, com.etsy.android.lib.util.e0):kd.a");
        }
    }

    public C12992a(long j) {
        this.f28603a = j;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.SALE_ENDING_SOON_BADGE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12992a) && this.f28603a == ((C12992a) obj).f28603a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28603a);
    }

    public final String toString() {
        return C0015b.m91j(C0072d.m201h("SaleEndingSoonBadge(saleMillisRemaining="), this.f28603a, ')');
    }
}
