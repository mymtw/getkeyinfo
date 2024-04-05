package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

@SafeParcelable.Class(creator = "SignInRequestCreator")
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new zal();
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", mo49213id = 2)
    private final zat zab;

    @SafeParcelable.Constructor
    public zaj(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) zat zat) {
        this.zaa = i;
        this.zab = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zaj(zat zat) {
        this(1, zat);
    }
}
