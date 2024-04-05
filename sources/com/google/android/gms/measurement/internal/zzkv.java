package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzkv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkv> CREATOR = new zzkw();
    @SafeParcelable.Field(mo49213id = 1)
    public final int zza;
    @SafeParcelable.Field(mo49213id = 2)
    public final String zzb;
    @SafeParcelable.Field(mo49213id = 3)
    public final long zzc;
    @SafeParcelable.Field(mo49213id = 4)
    public final Long zzd;
    @SafeParcelable.Field(mo49213id = 6)
    public final String zze;
    @SafeParcelable.Field(mo49213id = 7)
    public final String zzf;
    @SafeParcelable.Field(mo49213id = 8)
    public final Double zzg;

    @SafeParcelable.Constructor
    public zzkv(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) long j, @SafeParcelable.Param(mo49216id = 4) Long l, @SafeParcelable.Param(mo49216id = 5) Float f, @SafeParcelable.Param(mo49216id = 6) String str2, @SafeParcelable.Param(mo49216id = 7) String str3, @SafeParcelable.Param(mo49216id = 8) Double d) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
        this.zzd = l;
        if (i == 1) {
            this.zzg = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.zzg = d;
        }
        this.zze = str2;
        this.zzf = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzkw.zza(this, parcel, i);
    }

    public final Object zza() {
        Long l = this.zzd;
        if (l != null) {
            return l;
        }
        Double d = this.zzg;
        if (d != null) {
            return d;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzkv(C15000i7 i7Var) {
        this(i7Var.f33582c, i7Var.f33583d, i7Var.f33584e, i7Var.f33581b);
    }

    public zzkv(String str, long j, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else if (obj instanceof Double) {
            this.zzd = null;
            this.zzg = (Double) obj;
            this.zze = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
