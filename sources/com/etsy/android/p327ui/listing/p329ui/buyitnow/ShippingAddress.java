package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.ShippingAddress */
public final class ShippingAddress implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShippingAddress> CREATOR = new Creator();
    private final String formattedAddress;
    private final String name;

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.ShippingAddress$Creator */
    public static final class Creator implements Parcelable.Creator<ShippingAddress> {
        public final ShippingAddress createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ShippingAddress(parcel.readString(), parcel.readString());
        }

        public final ShippingAddress[] newArray(int i) {
            return new ShippingAddress[i];
        }
    }

    public ShippingAddress() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public ShippingAddress(String str, String str2) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "formattedAddress");
        this.name = str;
        this.formattedAddress = str2;
    }

    public static /* synthetic */ ShippingAddress copy$default(ShippingAddress shippingAddress, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingAddress.name;
        }
        if ((i & 2) != 0) {
            str2 = shippingAddress.formattedAddress;
        }
        return shippingAddress.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.formattedAddress;
    }

    public final ShippingAddress copy(String str, String str2) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "formattedAddress");
        return new ShippingAddress(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        return C19383o.m32792b(this.name, shippingAddress.name) && C19383o.m32792b(this.formattedAddress, shippingAddress.formattedAddress);
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.formattedAddress.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShippingAddress(name=");
        h.append(this.name);
        h.append(", formattedAddress=");
        return C0391c.m1057c(h, this.formattedAddress, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.formattedAddress);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingAddress(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
