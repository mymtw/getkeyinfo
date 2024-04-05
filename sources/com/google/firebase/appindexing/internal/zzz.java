package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "MutateRequestCreator")
@SafeParcelable.Reserved({4})
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();
    @SafeParcelable.Field(mo49213id = 1)
    public final int zza;
    @SafeParcelable.Field(mo49213id = 2)
    public final Thing[] zzb;
    @SafeParcelable.Field(mo49213id = 3)
    public final String[] zzc;
    @SafeParcelable.Field(mo49213id = 5)
    public final String[] zzd;
    @SafeParcelable.Field(mo49213id = 6)
    public final zzc zze;
    @SafeParcelable.Field(mo49213id = 7)
    public final String zzf;
    @SafeParcelable.Field(mo49213id = 8)
    public final String zzg;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) Thing[] thingArr, @SafeParcelable.Param(mo49216id = 3) String[] strArr, @SafeParcelable.Param(mo49216id = 5) String[] strArr2, @SafeParcelable.Param(mo49216id = 6) zzc zzc2, @SafeParcelable.Param(mo49216id = 7) String str, @SafeParcelable.Param(mo49216id = 8) String str2) {
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7)) {
            i = 0;
        }
        this.zza = i;
        this.zzb = thingArr;
        this.zzc = strArr;
        this.zzd = strArr2;
        this.zze = zzc2;
        this.zzf = str;
        this.zzg = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
