package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import androidx.compose.animation.C0391c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p003a2.C0023f;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new zzau();
    @SafeParcelable.Field(mo49213id = 2)
    public final String zza;
    @SafeParcelable.Field(mo49213id = 3)
    public final zzar zzb;
    @SafeParcelable.Field(mo49213id = 4)
    public final String zzc;
    @SafeParcelable.Field(mo49213id = 5)
    public final long zzd;

    public zzat(zzat zzat, long j) {
        Preconditions.checkNotNull(zzat);
        this.zza = zzat.zza;
        this.zzb = zzat.zzb;
        this.zzc = zzat.zzc;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(C0069a.m171b(String.valueOf(str).length(), 21, String.valueOf(str2).length(), valueOf.length()));
        C0391c.m1061h(sb, "origin=", str, ",name=", str2);
        return C0023f.m110k(sb, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzau.zza(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public zzat(@SafeParcelable.Param(mo49216id = 2) String str, @SafeParcelable.Param(mo49216id = 3) zzar zzar, @SafeParcelable.Param(mo49216id = 4) String str2, @SafeParcelable.Param(mo49216id = 5) long j) {
        this.zza = str;
        this.zzb = zzar;
        this.zzc = str2;
        this.zzd = j;
    }
}
