package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();
    @SafeParcelable.Field(mo49213id = 2)
    public String zza;
    @SafeParcelable.Field(mo49213id = 3)
    public String zzb;
    @SafeParcelable.Field(mo49213id = 4)
    public zzkv zzc;
    @SafeParcelable.Field(mo49213id = 5)
    public long zzd;
    @SafeParcelable.Field(mo49213id = 6)
    public boolean zze;
    @SafeParcelable.Field(mo49213id = 7)
    public String zzf;
    @SafeParcelable.Field(mo49213id = 8)
    public final zzat zzg;
    @SafeParcelable.Field(mo49213id = 9)
    public long zzh;
    @SafeParcelable.Field(mo49213id = 10)
    public zzat zzi;
    @SafeParcelable.Field(mo49213id = 11)
    public final long zzj;
    @SafeParcelable.Field(mo49213id = 12)
    public final zzat zzk;

    public zzab(zzab zzab) {
        Preconditions.checkNotNull(zzab);
        this.zza = zzab.zza;
        this.zzb = zzab.zzb;
        this.zzc = zzab.zzc;
        this.zzd = zzab.zzd;
        this.zze = zzab.zze;
        this.zzf = zzab.zzf;
        this.zzg = zzab.zzg;
        this.zzh = zzab.zzh;
        this.zzi = zzab.zzi;
        this.zzj = zzab.zzj;
        this.zzk = zzab.zzk;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzab(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) zzkv zzkv, @SafeParcelable.Param(mo49216id = 5) long j, @SafeParcelable.Param(mo49216id = 6) boolean z, @SafeParcelable.Param(mo49216id = 7) String str3, @SafeParcelable.Param(mo49216id = 8) zzat zzat, @SafeParcelable.Param(mo49216id = 9) long j2, @SafeParcelable.Param(mo49216id = 10) zzat zzat2, @SafeParcelable.Param(mo49216id = 11) long j3, @SafeParcelable.Param(mo49216id = 12) zzat zzat3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzkv;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzat;
        this.zzh = j2;
        this.zzi = zzat2;
        this.zzj = j3;
        this.zzk = zzat3;
    }
}
