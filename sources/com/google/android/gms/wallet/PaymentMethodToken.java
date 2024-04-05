package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentMethodTokenCreator")
@SafeParcelable.Reserved({1})
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new zzag();
    @SafeParcelable.Field(mo49213id = 2)
    private int zzed;
    @SafeParcelable.Field(mo49213id = 3)
    private String zzee;

    @SafeParcelable.Constructor
    public PaymentMethodToken(@SafeParcelable.Param(mo49216id = 2) int i, @SafeParcelable.Param(mo49216id = 3) String str) {
        this.zzed = i;
        this.zzee = str;
    }

    public final int getPaymentMethodTokenizationType() {
        return this.zzed;
    }

    public final String getToken() {
        return this.zzee;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzed);
        SafeParcelWriter.writeString(parcel, 3, this.zzee, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private PaymentMethodToken() {
    }
}
