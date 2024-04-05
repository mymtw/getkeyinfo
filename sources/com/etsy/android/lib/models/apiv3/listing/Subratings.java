package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.Subrating;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class Subratings implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Subratings> CREATOR = new Creator();
    private final Subrating.ItemQuality itemQuality;
    private final Subrating.SellerCustomerService sellerCustomerService;
    private final Subrating.Shipping shipping;

    public static final class Creator implements Parcelable.Creator<Subratings> {
        public final Subratings createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            Subrating.SellerCustomerService sellerCustomerService = null;
            Subrating.ItemQuality createFromParcel = parcel.readInt() == 0 ? null : Subrating.ItemQuality.CREATOR.createFromParcel(parcel);
            Subrating.Shipping createFromParcel2 = parcel.readInt() == 0 ? null : Subrating.Shipping.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                sellerCustomerService = Subrating.SellerCustomerService.CREATOR.createFromParcel(parcel);
            }
            return new Subratings(createFromParcel, createFromParcel2, sellerCustomerService);
        }

        public final Subratings[] newArray(int i) {
            return new Subratings[i];
        }
    }

    public Subratings() {
        this((Subrating.ItemQuality) null, (Subrating.Shipping) null, (Subrating.SellerCustomerService) null, 7, (DefaultConstructorMarker) null);
    }

    public Subratings(@C17402n(name = "item_quality") Subrating.ItemQuality itemQuality2, @C17402n(name = "shipping") Subrating.Shipping shipping2, @C17402n(name = "seller_customer_service") Subrating.SellerCustomerService sellerCustomerService2) {
        this.itemQuality = itemQuality2;
        this.shipping = shipping2;
        this.sellerCustomerService = sellerCustomerService2;
    }

    public static /* synthetic */ Subratings copy$default(Subratings subratings, Subrating.ItemQuality itemQuality2, Subrating.Shipping shipping2, Subrating.SellerCustomerService sellerCustomerService2, int i, Object obj) {
        if ((i & 1) != 0) {
            itemQuality2 = subratings.itemQuality;
        }
        if ((i & 2) != 0) {
            shipping2 = subratings.shipping;
        }
        if ((i & 4) != 0) {
            sellerCustomerService2 = subratings.sellerCustomerService;
        }
        return subratings.copy(itemQuality2, shipping2, sellerCustomerService2);
    }

    public final Subrating.ItemQuality component1() {
        return this.itemQuality;
    }

    public final Subrating.Shipping component2() {
        return this.shipping;
    }

    public final Subrating.SellerCustomerService component3() {
        return this.sellerCustomerService;
    }

    public final Subratings copy(@C17402n(name = "item_quality") Subrating.ItemQuality itemQuality2, @C17402n(name = "shipping") Subrating.Shipping shipping2, @C17402n(name = "seller_customer_service") Subrating.SellerCustomerService sellerCustomerService2) {
        return new Subratings(itemQuality2, shipping2, sellerCustomerService2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subratings)) {
            return false;
        }
        Subratings subratings = (Subratings) obj;
        return C19383o.m32792b(this.itemQuality, subratings.itemQuality) && C19383o.m32792b(this.shipping, subratings.shipping) && C19383o.m32792b(this.sellerCustomerService, subratings.sellerCustomerService);
    }

    public final Subrating.ItemQuality getItemQuality() {
        return this.itemQuality;
    }

    public final Subrating.SellerCustomerService getSellerCustomerService() {
        return this.sellerCustomerService;
    }

    public final Subrating.Shipping getShipping() {
        return this.shipping;
    }

    public int hashCode() {
        Subrating.ItemQuality itemQuality2 = this.itemQuality;
        int i = 0;
        int hashCode = (itemQuality2 == null ? 0 : itemQuality2.hashCode()) * 31;
        Subrating.Shipping shipping2 = this.shipping;
        int hashCode2 = (hashCode + (shipping2 == null ? 0 : shipping2.hashCode())) * 31;
        Subrating.SellerCustomerService sellerCustomerService2 = this.sellerCustomerService;
        if (sellerCustomerService2 != null) {
            i = sellerCustomerService2.hashCode();
        }
        return hashCode2 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r1.shipping;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = r1.sellerCustomerService;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isEmpty() {
        /*
            r1 = this;
            com.etsy.android.lib.models.apiv3.listing.Subrating$ItemQuality r0 = r1.itemQuality
            if (r0 == 0) goto L_0x000e
            java.lang.Float r0 = r0.getAverage()
            boolean r0 = kotlin.jvm.internal.C19383o.m32791a(r0)
            if (r0 == 0) goto L_0x002b
        L_0x000e:
            com.etsy.android.lib.models.apiv3.listing.Subrating$Shipping r0 = r1.shipping
            if (r0 == 0) goto L_0x001c
            java.lang.Float r0 = r0.getAverage()
            boolean r0 = kotlin.jvm.internal.C19383o.m32791a(r0)
            if (r0 == 0) goto L_0x002b
        L_0x001c:
            com.etsy.android.lib.models.apiv3.listing.Subrating$SellerCustomerService r0 = r1.sellerCustomerService
            if (r0 == 0) goto L_0x002d
            java.lang.Float r0 = r0.getAverage()
            boolean r0 = kotlin.jvm.internal.C19383o.m32791a(r0)
            if (r0 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r0 = 0
            goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.Subratings.isEmpty():boolean");
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Subratings(itemQuality=");
        h.append(this.itemQuality);
        h.append(", shipping=");
        h.append(this.shipping);
        h.append(", sellerCustomerService=");
        h.append(this.sellerCustomerService);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        Subrating.ItemQuality itemQuality2 = this.itemQuality;
        if (itemQuality2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemQuality2.writeToParcel(parcel, i);
        }
        Subrating.Shipping shipping2 = this.shipping;
        if (shipping2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shipping2.writeToParcel(parcel, i);
        }
        Subrating.SellerCustomerService sellerCustomerService2 = this.sellerCustomerService;
        if (sellerCustomerService2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        sellerCustomerService2.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Subratings(Subrating.ItemQuality itemQuality2, Subrating.Shipping shipping2, Subrating.SellerCustomerService sellerCustomerService2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : itemQuality2, (i & 2) != 0 ? null : shipping2, (i & 4) != 0 ? null : sellerCustomerService2);
    }
}
