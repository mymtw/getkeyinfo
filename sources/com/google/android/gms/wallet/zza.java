package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AddressCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.Field(mo49213id = 2)
    private String name;
    @SafeParcelable.Field(mo49213id = 3)
    private String zzf;
    @SafeParcelable.Field(mo49213id = 4)
    private String zzg;
    @SafeParcelable.Field(mo49213id = 5)
    private String zzh;
    @SafeParcelable.Field(mo49213id = 6)
    private String zzi;
    @SafeParcelable.Field(mo49213id = 7)
    private String zzj;
    @SafeParcelable.Field(mo49213id = 8)
    private String zzk;
    @SafeParcelable.Field(mo49213id = 9)
    private String zzl;
    @SafeParcelable.Field(mo49213id = 10)
    private String zzm;
    @SafeParcelable.Field(mo49213id = 11)
    private boolean zzn;
    @SafeParcelable.Field(mo49213id = 12)
    private String zzo;

    public zza() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzm, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzn);
        SafeParcelWriter.writeString(parcel, 12, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) String str2, @SafeParcelable.Param(mo49216id = 4) String str3, @SafeParcelable.Param(mo49216id = 5) String str4, @SafeParcelable.Param(mo49216id = 6) String str5, @SafeParcelable.Param(mo49216id = 7) String str6, @SafeParcelable.Param(mo49216id = 8) String str7, @SafeParcelable.Param(mo49216id = 9) String str8, @SafeParcelable.Param(mo49216id = 10) String str9, @SafeParcelable.Param(mo49216id = 11) boolean z, @SafeParcelable.Param(mo49216id = 12) String str10) {
        this.name = str;
        this.zzf = str2;
        this.zzg = str3;
        this.zzh = str4;
        this.zzi = str5;
        this.zzj = str6;
        this.zzk = str7;
        this.zzl = str8;
        this.zzm = str9;
        this.zzn = z;
        this.zzo = str10;
    }
}
