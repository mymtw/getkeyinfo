package com.etsy.android.p327ui.navigation.specs;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.navigation.specs.CheckoutSpec */
public final class CheckoutSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CheckoutSpec> CREATOR = new Creator();
    private final GooglePaySpec googlePaySpec;
    private final MultishopCheckoutSpec multishopCheckoutSpec;

    /* renamed from: com.etsy.android.ui.navigation.specs.CheckoutSpec$Creator */
    public static final class Creator implements Parcelable.Creator<CheckoutSpec> {
        public final CheckoutSpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            GooglePaySpec googlePaySpec = null;
            MultishopCheckoutSpec createFromParcel = parcel.readInt() == 0 ? null : MultishopCheckoutSpec.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                googlePaySpec = GooglePaySpec.CREATOR.createFromParcel(parcel);
            }
            return new CheckoutSpec(createFromParcel, googlePaySpec);
        }

        public final CheckoutSpec[] newArray(int i) {
            return new CheckoutSpec[i];
        }
    }

    public CheckoutSpec() {
        this((MultishopCheckoutSpec) null, (GooglePaySpec) null, 3, (DefaultConstructorMarker) null);
    }

    public CheckoutSpec(MultishopCheckoutSpec multishopCheckoutSpec2, GooglePaySpec googlePaySpec2) {
        this.multishopCheckoutSpec = multishopCheckoutSpec2;
        this.googlePaySpec = googlePaySpec2;
    }

    public static /* synthetic */ CheckoutSpec copy$default(CheckoutSpec checkoutSpec, MultishopCheckoutSpec multishopCheckoutSpec2, GooglePaySpec googlePaySpec2, int i, Object obj) {
        if ((i & 1) != 0) {
            multishopCheckoutSpec2 = checkoutSpec.multishopCheckoutSpec;
        }
        if ((i & 2) != 0) {
            googlePaySpec2 = checkoutSpec.googlePaySpec;
        }
        return checkoutSpec.copy(multishopCheckoutSpec2, googlePaySpec2);
    }

    public final MultishopCheckoutSpec component1() {
        return this.multishopCheckoutSpec;
    }

    public final GooglePaySpec component2() {
        return this.googlePaySpec;
    }

    public final CheckoutSpec copy(MultishopCheckoutSpec multishopCheckoutSpec2, GooglePaySpec googlePaySpec2) {
        return new CheckoutSpec(multishopCheckoutSpec2, googlePaySpec2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutSpec)) {
            return false;
        }
        CheckoutSpec checkoutSpec = (CheckoutSpec) obj;
        return C19383o.m32792b(this.multishopCheckoutSpec, checkoutSpec.multishopCheckoutSpec) && C19383o.m32792b(this.googlePaySpec, checkoutSpec.googlePaySpec);
    }

    public final GooglePaySpec getGooglePaySpec() {
        return this.googlePaySpec;
    }

    public final MultishopCheckoutSpec getMultishopCheckoutSpec() {
        return this.multishopCheckoutSpec;
    }

    public int hashCode() {
        MultishopCheckoutSpec multishopCheckoutSpec2 = this.multishopCheckoutSpec;
        int i = 0;
        int hashCode = (multishopCheckoutSpec2 == null ? 0 : multishopCheckoutSpec2.hashCode()) * 31;
        GooglePaySpec googlePaySpec2 = this.googlePaySpec;
        if (googlePaySpec2 != null) {
            i = googlePaySpec2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CheckoutSpec(multishopCheckoutSpec=");
        h.append(this.multishopCheckoutSpec);
        h.append(", googlePaySpec=");
        h.append(this.googlePaySpec);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        MultishopCheckoutSpec multishopCheckoutSpec2 = this.multishopCheckoutSpec;
        if (multishopCheckoutSpec2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            multishopCheckoutSpec2.writeToParcel(parcel, i);
        }
        GooglePaySpec googlePaySpec2 = this.googlePaySpec;
        if (googlePaySpec2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        googlePaySpec2.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckoutSpec(MultishopCheckoutSpec multishopCheckoutSpec2, GooglePaySpec googlePaySpec2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : multishopCheckoutSpec2, (i & 2) != 0 ? null : googlePaySpec2);
    }
}
