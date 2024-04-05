package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WebPaymentDataCreator")
@SafeParcelable.Reserved({1})
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    @SafeParcelable.Field(mo49213id = 2)
    private String zzew;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(mo49216id = 2) String str) {
        this.zzew = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzew, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzas() {
    }
}
