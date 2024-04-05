package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentMethodTokenizationParametersCreator")
@SafeParcelable.Reserved({1})
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzai();
    @SafeParcelable.Field(mo49213id = 2)
    public int zzed;
    @SafeParcelable.Field(mo49213id = 3)
    public Bundle zzef;

    /* renamed from: com.google.android.gms.wallet.PaymentMethodTokenizationParameters$a */
    public final class C15160a {
    }

    @SafeParcelable.Constructor
    public PaymentMethodTokenizationParameters(@SafeParcelable.Param(mo49216id = 2) int i, @SafeParcelable.Param(mo49216id = 3) Bundle bundle) {
        new Bundle();
        this.zzed = i;
        this.zzef = bundle;
    }

    public static C15160a newBuilder() {
        new PaymentMethodTokenizationParameters();
        return new C15160a();
    }

    public final Bundle getParameters() {
        return new Bundle(this.zzef);
    }

    public final int getPaymentMethodTokenizationType() {
        return this.zzed;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzed);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzef, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private PaymentMethodTokenizationParameters() {
        this.zzef = new Bundle();
    }
}
