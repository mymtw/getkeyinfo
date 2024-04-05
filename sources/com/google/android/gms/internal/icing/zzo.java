package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class(creator = "GetRecentContextCall_ResponseCreator")
@SafeParcelable.Reserved({1000})
public final class zzo extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field(mo49213id = 1)
    public Status zza;
    @SafeParcelable.Field(mo49213id = 2)
    public List<zzx> zzb;
    @SafeParcelable.Field(mo49213id = 3)
    @Deprecated
    public String[] zzc;

    public zzo() {
    }

    public final Status getStatus() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(mo49216id = 1) Status status, @SafeParcelable.Param(mo49216id = 2) List<zzx> list, @SafeParcelable.Param(mo49216id = 3) String[] strArr) {
        this.zza = status;
        this.zzb = list;
        this.zzc = strArr;
    }
}
