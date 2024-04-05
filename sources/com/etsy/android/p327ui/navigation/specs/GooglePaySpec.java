package com.etsy.android.p327ui.navigation.specs;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.google.android.gms.wallet.PaymentData;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.navigation.specs.GooglePaySpec */
public final class GooglePaySpec implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GooglePaySpec> CREATOR = new Creator();
    private final GooglePayDataContract dataContract;
    private final PaymentData paymentData;

    /* renamed from: com.etsy.android.ui.navigation.specs.GooglePaySpec$Creator */
    public static final class Creator implements Parcelable.Creator<GooglePaySpec> {
        public final GooglePaySpec createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new GooglePaySpec((GooglePayDataContract) parcel.readSerializable(), (PaymentData) parcel.readParcelable(GooglePaySpec.class.getClassLoader()));
        }

        public final GooglePaySpec[] newArray(int i) {
            return new GooglePaySpec[i];
        }
    }

    public GooglePaySpec(GooglePayDataContract googlePayDataContract, PaymentData paymentData2) {
        C19383o.m32797g(googlePayDataContract, "dataContract");
        C19383o.m32797g(paymentData2, "paymentData");
        this.dataContract = googlePayDataContract;
        this.paymentData = paymentData2;
    }

    public static /* synthetic */ GooglePaySpec copy$default(GooglePaySpec googlePaySpec, GooglePayDataContract googlePayDataContract, PaymentData paymentData2, int i, Object obj) {
        if ((i & 1) != 0) {
            googlePayDataContract = googlePaySpec.dataContract;
        }
        if ((i & 2) != 0) {
            paymentData2 = googlePaySpec.paymentData;
        }
        return googlePaySpec.copy(googlePayDataContract, paymentData2);
    }

    public final GooglePayDataContract component1() {
        return this.dataContract;
    }

    public final PaymentData component2() {
        return this.paymentData;
    }

    public final GooglePaySpec copy(GooglePayDataContract googlePayDataContract, PaymentData paymentData2) {
        C19383o.m32797g(googlePayDataContract, "dataContract");
        C19383o.m32797g(paymentData2, "paymentData");
        return new GooglePaySpec(googlePayDataContract, paymentData2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePaySpec)) {
            return false;
        }
        GooglePaySpec googlePaySpec = (GooglePaySpec) obj;
        return C19383o.m32792b(this.dataContract, googlePaySpec.dataContract) && C19383o.m32792b(this.paymentData, googlePaySpec.paymentData);
    }

    public final GooglePayDataContract getDataContract() {
        return this.dataContract;
    }

    public final PaymentData getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        return this.paymentData.hashCode() + (this.dataContract.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GooglePaySpec(dataContract=");
        h.append(this.dataContract);
        h.append(", paymentData=");
        h.append(this.paymentData);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeSerializable(this.dataContract);
        parcel.writeParcelable(this.paymentData, i);
    }
}
