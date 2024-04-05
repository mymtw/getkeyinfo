package com.etsy.android.p327ui.navigation.specs;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.navigation.specs.MultishopCheckoutSpec */
public final class MultishopCheckoutSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MultishopCheckoutSpec> CREATOR = new Creator();
    private final String cartGroupId;
    private final String paymentMethod;

    /* renamed from: com.etsy.android.ui.navigation.specs.MultishopCheckoutSpec$Creator */
    public static final class Creator implements Parcelable.Creator<MultishopCheckoutSpec> {
        public final MultishopCheckoutSpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new MultishopCheckoutSpec(parcel.readString(), parcel.readString());
        }

        public final MultishopCheckoutSpec[] newArray(int i) {
            return new MultishopCheckoutSpec[i];
        }
    }

    public MultishopCheckoutSpec(String str, String str2) {
        C19383o.m32797g(str, "cartGroupId");
        C19383o.m32797g(str2, "paymentMethod");
        this.cartGroupId = str;
        this.paymentMethod = str2;
    }

    public static /* synthetic */ MultishopCheckoutSpec copy$default(MultishopCheckoutSpec multishopCheckoutSpec, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multishopCheckoutSpec.cartGroupId;
        }
        if ((i & 2) != 0) {
            str2 = multishopCheckoutSpec.paymentMethod;
        }
        return multishopCheckoutSpec.copy(str, str2);
    }

    public final String component1() {
        return this.cartGroupId;
    }

    public final String component2() {
        return this.paymentMethod;
    }

    public final MultishopCheckoutSpec copy(String str, String str2) {
        C19383o.m32797g(str, "cartGroupId");
        C19383o.m32797g(str2, "paymentMethod");
        return new MultishopCheckoutSpec(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultishopCheckoutSpec)) {
            return false;
        }
        MultishopCheckoutSpec multishopCheckoutSpec = (MultishopCheckoutSpec) obj;
        return C19383o.m32792b(this.cartGroupId, multishopCheckoutSpec.cartGroupId) && C19383o.m32792b(this.paymentMethod, multishopCheckoutSpec.paymentMethod);
    }

    public final String getCartGroupId() {
        return this.cartGroupId;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public int hashCode() {
        return this.paymentMethod.hashCode() + (this.cartGroupId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("MultishopCheckoutSpec(cartGroupId=");
        h.append(this.cartGroupId);
        h.append(", paymentMethod=");
        return C0391c.m1057c(h, this.paymentMethod, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.cartGroupId);
        parcel.writeString(this.paymentMethod);
    }
}
