package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class(creator = "RegisterSectionInfoCreator")
@SafeParcelable.Reserved({1000, 8, 9, 10})
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(mo49213id = 1)
    public final String zza;
    @SafeParcelable.Field(mo49213id = 2)
    public final String zzb;
    @SafeParcelable.Field(mo49213id = 3)
    public final boolean zzc;
    @SafeParcelable.Field(defaultValue = "1", mo49213id = 4)
    public final int zzd;
    @SafeParcelable.Field(mo49213id = 5)
    public final boolean zze;
    @SafeParcelable.Field(mo49213id = 6)
    public final String zzf;
    @SafeParcelable.Field(mo49213id = 7)
    public final zzm[] zzg;
    @SafeParcelable.Field(mo49213id = 11)
    public final String zzh;
    @SafeParcelable.Field(mo49213id = 12)
    public final zzu zzi;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(mo49216id = 1) String str, @SafeParcelable.Param(mo49216id = 2) String str2, @SafeParcelable.Param(mo49216id = 3) boolean z, @SafeParcelable.Param(mo49216id = 4) int i, @SafeParcelable.Param(mo49216id = 5) boolean z2, @SafeParcelable.Param(mo49216id = 6) String str3, @SafeParcelable.Param(mo49216id = 7) zzm[] zzmArr, @SafeParcelable.Param(mo49216id = 11) String str4, @SafeParcelable.Param(mo49216id = 12) zzu zzu) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = i;
        this.zze = z2;
        this.zzf = str3;
        this.zzg = zzmArr;
        this.zzh = str4;
        this.zzi = zzu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzs = (zzs) obj;
        return this.zzc == zzs.zzc && this.zzd == zzs.zzd && this.zze == zzs.zze && Objects.equal(this.zza, zzs.zza) && Objects.equal(this.zzb, zzs.zzb) && Objects.equal(this.zzf, zzs.zzf) && Objects.equal(this.zzh, zzs.zzh) && Objects.equal(this.zzi, zzs.zzi) && Arrays.equals(this.zzg, zzs.zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, this.zzi);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
