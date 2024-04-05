package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.animation.C0391c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField(mo49219id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getTimeMillis", mo49213id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getEventType", mo49213id = 11)
    private int zzc;
    @SafeParcelable.Field(getter = "getWakeLockName", mo49213id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", mo49213id = 10)
    private final String zze;
    @SafeParcelable.Field(getter = "getCodePackage", mo49213id = 17)
    private final String zzf;
    @SafeParcelable.Field(getter = "getWakeLockType", mo49213id = 5)
    private final int zzg;
    @SafeParcelable.Field(getter = "getCallingPackages", mo49213id = 6)
    private final List<String> zzh;
    @SafeParcelable.Field(getter = "getEventKey", mo49213id = 12)
    private final String zzi;
    @SafeParcelable.Field(getter = "getElapsedRealtime", mo49213id = 8)
    private final long zzj;
    @SafeParcelable.Field(getter = "getDeviceState", mo49213id = 14)
    private int zzk;
    @SafeParcelable.Field(getter = "getHostPackage", mo49213id = 13)
    private final String zzl;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", mo49213id = 15)
    private final float zzm;
    @SafeParcelable.Field(getter = "getTimeout", mo49213id = 16)
    private final long zzn;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", mo49213id = 18)
    private final boolean zzo;
    private long zzp = -1;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) long j, @SafeParcelable.Param(mo49216id = 11) int i2, @SafeParcelable.Param(mo49216id = 4) String str, @SafeParcelable.Param(mo49216id = 5) int i3, @SafeParcelable.Param(mo49216id = 6) List<String> list, @SafeParcelable.Param(mo49216id = 12) String str2, @SafeParcelable.Param(mo49216id = 8) long j2, @SafeParcelable.Param(mo49216id = 14) int i4, @SafeParcelable.Param(mo49216id = 10) String str3, @SafeParcelable.Param(mo49216id = 13) String str4, @SafeParcelable.Param(mo49216id = 15) float f, @SafeParcelable.Param(mo49216id = 16) long j3, @SafeParcelable.Param(mo49216id = 17) String str5, @SafeParcelable.Param(mo49216id = 18) boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzp;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final String zzd() {
        List<String> list = this.zzh;
        String str = this.zzd;
        int i = this.zzg;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i2 = this.zzk;
        String str3 = this.zze;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.zzl;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.zzm;
        String str5 = this.zzf;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.zzo;
        StringBuilder sb = new StringBuilder(str2.length() + str4.length() + str3.length() + String.valueOf(str).length() + 51 + String.valueOf(join).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        C0391c.m1061h(sb, "\t", str3, "\t", str4);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}
