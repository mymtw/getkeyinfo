package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();
    @SafeParcelable.VersionField(mo49219id = 1)
    public final int zza;
    @SafeParcelable.Field(mo49213id = 2)
    public final int zzb;
    @SafeParcelable.Field(mo49213id = 3)
    public int zzc;
    @SafeParcelable.Field(mo49213id = 4)
    public String zzd;
    @SafeParcelable.Field(mo49213id = 5)
    public IBinder zze;
    @SafeParcelable.Field(mo49213id = 6)
    public Scope[] zzf;
    @SafeParcelable.Field(mo49213id = 7)
    public Bundle zzg;
    @SafeParcelable.Field(mo49213id = 8)
    public Account zzh;
    @SafeParcelable.Field(mo49213id = 10)
    public Feature[] zzi;
    @SafeParcelable.Field(mo49213id = 11)
    public Feature[] zzj;
    @SafeParcelable.Field(mo49213id = 12)
    public boolean zzk;
    @SafeParcelable.Field(defaultValue = "0", mo49213id = 13)
    public int zzl;
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", mo49213id = 14)
    public boolean zzm;
    @SafeParcelable.Field(getter = "getAttributionTag", mo49213id = 15)
    private String zzn;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) int i2, @SafeParcelable.Param(mo49216id = 3) int i3, @SafeParcelable.Param(mo49216id = 4) String str, @SafeParcelable.Param(mo49216id = 5) IBinder iBinder, @SafeParcelable.Param(mo49216id = 6) Scope[] scopeArr, @SafeParcelable.Param(mo49216id = 7) Bundle bundle, @SafeParcelable.Param(mo49216id = 8) Account account, @SafeParcelable.Param(mo49216id = 10) Feature[] featureArr, @SafeParcelable.Param(mo49216id = 11) Feature[] featureArr2, @SafeParcelable.Param(mo49216id = 12) boolean z, @SafeParcelable.Param(mo49216id = 13) int i4, @SafeParcelable.Param(mo49216id = 14) boolean z2, @SafeParcelable.Param(mo49216id = 15) String str2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzd = "com.google.android.gms";
        } else {
            this.zzd = str;
        }
        if (i < 2) {
            this.zzh = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zze = iBinder;
            this.zzh = account;
        }
        this.zzf = scopeArr;
        this.zzg = bundle;
        this.zzi = featureArr;
        this.zzj = featureArr2;
        this.zzk = z;
        this.zzl = i4;
        this.zzm = z2;
        this.zzn = str2;
    }

    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    public final String zza() {
        return this.zzn;
    }

    public GetServiceRequest(int i, String str) {
        this.zza = 6;
        this.zzc = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzb = i;
        this.zzk = true;
        this.zzn = str;
    }
}
