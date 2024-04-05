package com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p382kd.C12992a;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator */
public final class StockIndicator extends C10423j {

    /* renamed from: a */
    public final StockIndicatorValue f22646a;

    /* renamed from: b */
    public final C12992a f22647b;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue */
    public enum StockIndicatorValue {
        None,
        LowStock,
        InStock,
        OnlyOneLeft,
        Sale
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$a */
    public static final class C10306a {
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
            r7 = r7.getNudge();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator m18362a(com.etsy.android.lib.models.apiv3.listing.ListingFetch r6, com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r7, boolean r8, com.etsy.android.lib.util.C8890e0 r9) {
            /*
                java.lang.String r0 = "listingFetch"
                kotlin.jvm.internal.C19383o.m32797g(r6, r0)
                com.etsy.android.lib.models.apiv3.listing.Nudge r0 = r6.getListingNudge()
                r1 = 0
                if (r0 == 0) goto L_0x0012
                java.lang.String r0 = r0.getType()
                if (r0 != 0) goto L_0x0020
            L_0x0012:
                if (r7 == 0) goto L_0x001f
                com.etsy.android.lib.models.apiv3.listing.Nudge r7 = r7.getNudge()
                if (r7 == 0) goto L_0x001f
                java.lang.String r0 = r7.getType()
                goto L_0x0020
            L_0x001f:
                r0 = r1
            L_0x0020:
                r7 = 6
                java.lang.String[] r7 = new java.lang.String[r7]
                com.etsy.android.ui.core.nudge.NudgeType r2 = com.etsy.android.p327ui.core.nudge.NudgeType.QUANTITY_ONLY
                java.lang.String r2 = r2.name()
                r3 = 0
                r7[r3] = r2
                com.etsy.android.ui.core.nudge.NudgeType r2 = com.etsy.android.p327ui.core.nudge.NudgeType.COMBO_CART_AND_QUANTITY
                java.lang.String r2 = r2.name()
                r4 = 1
                r7[r4] = r2
                r2 = 2
                com.etsy.android.ui.core.nudge.NudgeType r5 = com.etsy.android.p327ui.core.nudge.NudgeType.ONLY_ONE_AVAILABLE
                java.lang.String r5 = r5.name()
                r7[r2] = r5
                r2 = 3
                com.etsy.android.ui.core.nudge.NudgeType r5 = com.etsy.android.p327ui.core.nudge.NudgeType.LP_SCARCITY_WITH_VIEWS
                java.lang.String r5 = r5.name()
                r7[r2] = r5
                r2 = 4
                com.etsy.android.ui.core.nudge.NudgeType r5 = com.etsy.android.p327ui.core.nudge.NudgeType.RARE_FIND_AND_CART_COMBO
                java.lang.String r5 = r5.name()
                r7[r2] = r5
                r2 = 5
                com.etsy.android.ui.core.nudge.NudgeType r5 = com.etsy.android.p327ui.core.nudge.NudgeType.ALMOST_GONE_AND_CART_COMBO
                java.lang.String r5 = r5.name()
                r7[r2] = r5
                java.util.List r7 = p568fn.C17782b.m29865e0(r7)
                if (r0 == 0) goto L_0x0074
                java.util.Locale r2 = java.util.Locale.US
                java.lang.String r5 = "US"
                kotlin.jvm.internal.C19383o.m32796f(r2, r5)
                java.lang.String r0 = r0.toUpperCase(r2)
                java.lang.String r2 = "this as java.lang.String).toUpperCase(locale)"
                kotlin.jvm.internal.C19383o.m32796f(r0, r2)
                boolean r7 = r7.contains(r0)
                goto L_0x0075
            L_0x0074:
                r7 = r3
            L_0x0075:
                com.etsy.android.lib.models.apiv3.listing.Listing r0 = r6.getListing()
                java.lang.Integer r0 = r0.getQuantity()
                if (r0 == 0) goto L_0x0083
                int r3 = r0.intValue()
            L_0x0083:
                if (r7 == 0) goto L_0x008a
                if (r3 != r4) goto L_0x008a
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue r7 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.StockIndicatorValue.OnlyOneLeft
                goto L_0x0098
            L_0x008a:
                if (r7 == 0) goto L_0x0091
                if (r3 <= r4) goto L_0x0091
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue r7 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.StockIndicatorValue.LowStock
                goto L_0x0098
            L_0x0091:
                if (r3 <= 0) goto L_0x0096
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue r7 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.StockIndicatorValue.InStock
                goto L_0x0098
            L_0x0096:
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue r7 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.StockIndicatorValue.None
            L_0x0098:
                if (r8 == 0) goto L_0x00b4
                if (r9 == 0) goto L_0x00b4
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue r8 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.StockIndicatorValue.OnlyOneLeft
                if (r7 == r8) goto L_0x00b4
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue r8 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.StockIndicatorValue.LowStock
                if (r7 == r8) goto L_0x00b4
                int r8 = p382kd.C12992a.f28602c
                kd.a r6 = p382kd.C12992a.C12993a.m20687a(r6, r9)
                if (r6 == 0) goto L_0x00b4
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator r7 = new com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue r8 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.StockIndicatorValue.Sale
                r7.<init>(r8, r6)
                return r7
            L_0x00b4:
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator$StockIndicatorValue r6 = com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.StockIndicatorValue.None
                if (r7 == r6) goto L_0x00be
                com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator r6 = new com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator
                r6.<init>(r7, r1)
                r1 = r6
            L_0x00be:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator.C10306a.m18362a(com.etsy.android.lib.models.apiv3.listing.ListingFetch, com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext, boolean, com.etsy.android.lib.util.e0):com.etsy.android.ui.listing.ui.buybox.stockindicator.StockIndicator");
        }
    }

    public StockIndicator(StockIndicatorValue stockIndicatorValue, C12992a aVar) {
        C19383o.m32797g(stockIndicatorValue, "value");
        this.f22646a = stockIndicatorValue;
        this.f22647b = aVar;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.STOCK_INDICATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockIndicator)) {
            return false;
        }
        StockIndicator stockIndicator = (StockIndicator) obj;
        return this.f22646a == stockIndicator.f22646a && C19383o.m32792b(this.f22647b, stockIndicator.f22647b);
    }

    public final int hashCode() {
        int hashCode = this.f22646a.hashCode() * 31;
        C12992a aVar = this.f22647b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("StockIndicator(value=");
        h.append(this.f22646a);
        h.append(", saleEndingSoon=");
        h.append(this.f22647b);
        h.append(')');
        return h.toString();
    }
}
