package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CallStatusCreator")
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();
    public static final zzg zza = new zzg(1);
    public static final zzg zzb = new zzg(2);
    public static final zzg zzc = new zzg(3);
    @SafeParcelable.Field(mo49213id = 1)
    public final int zzd;

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(mo49216id = 1) int i) {
        this.zzd = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
