package com.etsy.android.p327ui.cart.googlepay;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.google.android.gms.wallet.PaymentData;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.googlepay.GooglePayCheckoutSpec */
public final class GooglePayCheckoutSpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GooglePayCheckoutSpec> CREATOR = new Creator();
    private final GooglePayDataContract dataContract;
    private final PaymentData paymentData;

    /* renamed from: com.etsy.android.ui.cart.googlepay.GooglePayCheckoutSpec$Creator */
    public static final class Creator implements Parcelable.Creator<GooglePayCheckoutSpec> {
        public final GooglePayCheckoutSpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new GooglePayCheckoutSpec((PaymentData) parcel.readParcelable(GooglePayCheckoutSpec.class.getClassLoader()), (GooglePayDataContract) parcel.readSerializable());
        }

        public final GooglePayCheckoutSpec[] newArray(int i) {
            return new GooglePayCheckoutSpec[i];
        }
    }

    public GooglePayCheckoutSpec(PaymentData paymentData2, GooglePayDataContract googlePayDataContract) {
        C19383o.m32797g(paymentData2, "paymentData");
        C19383o.m32797g(googlePayDataContract, "dataContract");
        this.paymentData = paymentData2;
        this.dataContract = googlePayDataContract;
    }

    public static /* synthetic */ GooglePayCheckoutSpec copy$default(GooglePayCheckoutSpec googlePayCheckoutSpec, PaymentData paymentData2, GooglePayDataContract googlePayDataContract, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentData2 = googlePayCheckoutSpec.paymentData;
        }
        if ((i & 2) != 0) {
            googlePayDataContract = googlePayCheckoutSpec.dataContract;
        }
        return googlePayCheckoutSpec.copy(paymentData2, googlePayDataContract);
    }

    public final PaymentData component1() {
        return this.paymentData;
    }

    public final GooglePayDataContract component2() {
        return this.dataContract;
    }

    public final GooglePayCheckoutSpec copy(PaymentData paymentData2, GooglePayDataContract googlePayDataContract) {
        C19383o.m32797g(paymentData2, "paymentData");
        C19383o.m32797g(googlePayDataContract, "dataContract");
        return new GooglePayCheckoutSpec(paymentData2, googlePayDataContract);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayCheckoutSpec)) {
            return false;
        }
        GooglePayCheckoutSpec googlePayCheckoutSpec = (GooglePayCheckoutSpec) obj;
        return C19383o.m32792b(this.paymentData, googlePayCheckoutSpec.paymentData) && C19383o.m32792b(this.dataContract, googlePayCheckoutSpec.dataContract);
    }

    public final GooglePayDataContract getDataContract() {
        return this.dataContract;
    }

    public final PaymentData getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        return this.dataContract.hashCode() + (this.paymentData.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GooglePayCheckoutSpec(paymentData=");
        h.append(this.paymentData);
        h.append(", dataContract=");
        h.append(this.dataContract);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeParcelable(this.paymentData, i);
        parcel.writeSerializable(this.dataContract);
    }
}
