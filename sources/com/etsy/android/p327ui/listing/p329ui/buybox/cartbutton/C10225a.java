package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.R;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.User;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.a */
public final class C10225a extends C10423j {

    /* renamed from: a */
    public final int f22489a;

    /* renamed from: b */
    public final boolean f22490b;

    /* renamed from: c */
    public final boolean f22491c;

    /* renamed from: d */
    public final boolean f22492d;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.a$a */
    public static final class C10226a {
        /* renamed from: a */
        public static C10225a m18303a(ListingFetch listingFetch, Long l) {
            C19383o.m32797g(listingFetch, "listingFetch");
            if (l != null) {
                User seller = listingFetch.getSeller();
                if (C19383o.m32792b(seller != null ? seller.getUserId() : null, l)) {
                    return null;
                }
            }
            String state = listingFetch.getListing().getState();
            boolean z = false;
            if (state != null) {
                switch (state.hashCode()) {
                    case -1685839139:
                        if (state.equals(Listing.VACATION_STATE)) {
                            Boolean shouldPushToCart = listingFetch.getShouldPushToCart();
                            return new C10225a((int) R.string.shop_on_vacation, false, shouldPushToCart != null ? shouldPushToCart.booleanValue() : false, 6);
                        }
                        break;
                    case -1422950650:
                        if (state.equals("active")) {
                            Boolean shouldPushToCart2 = listingFetch.getShouldPushToCart();
                            if (shouldPushToCart2 != null) {
                                z = shouldPushToCart2.booleanValue();
                            }
                            return new C10225a((int) R.string.add_to_cart, true, z, 2);
                        }
                        break;
                    case -1309235419:
                        if (state.equals(Listing.EXPIRED_STATE)) {
                            Boolean shouldPushToCart3 = listingFetch.getShouldPushToCart();
                            return new C10225a((int) R.string.item_expired, false, shouldPushToCart3 != null ? shouldPushToCart3.booleanValue() : false, 6);
                        }
                        break;
                    case 1091836000:
                        if (state.equals(Listing.REMOVED_STATE)) {
                            Boolean shouldPushToCart4 = listingFetch.getShouldPushToCart();
                            return new C10225a((int) R.string.item_removed, false, shouldPushToCart4 != null ? shouldPushToCart4.booleanValue() : false, 6);
                        }
                        break;
                    case 1475627363:
                        if (state.equals(Listing.SOLD_OUT_STATE)) {
                            Boolean shouldPushToCart5 = listingFetch.getShouldPushToCart();
                            return new C10225a((int) R.string.sold_out, false, shouldPushToCart5 != null ? shouldPushToCart5.booleanValue() : false, 6);
                        }
                        break;
                }
            }
            Boolean shouldPushToCart6 = listingFetch.getShouldPushToCart();
            return new C10225a((int) R.string.unavailable, false, shouldPushToCart6 != null ? shouldPushToCart6.booleanValue() : false, 6);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10225a(int i, boolean z, boolean z2, int i2) {
        this(i, false, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }

    /* renamed from: b */
    public static C10225a m18301b(C10225a aVar, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = aVar.f22489a;
        }
        if ((i2 & 2) != 0) {
            z = aVar.f22490b;
        }
        boolean z2 = false;
        boolean z3 = (i2 & 4) != 0 ? aVar.f22491c : false;
        if ((i2 & 8) != 0) {
            z2 = aVar.f22492d;
        }
        return new C10225a(i, z, z3, z2);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.CART_BUTTON;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10225a)) {
            return false;
        }
        C10225a aVar = (C10225a) obj;
        return this.f22489a == aVar.f22489a && this.f22490b == aVar.f22490b && this.f22491c == aVar.f22491c && this.f22492d == aVar.f22492d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f22489a) * 31;
        boolean z = this.f22490b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f22491c;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f22492d;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CartButton(text=");
        h.append(this.f22489a);
        h.append(", shouldAnimateTextOnEntrance=");
        h.append(this.f22490b);
        h.append(", isEnabled=");
        h.append(this.f22491c);
        h.append(", shouldPushToCart=");
        return C0391c.m1058d(h, this.f22492d, ')');
    }

    public C10225a(int i, boolean z, boolean z2, boolean z3) {
        this.f22489a = i;
        this.f22490b = z;
        this.f22491c = z2;
        this.f22492d = z3;
    }
}
