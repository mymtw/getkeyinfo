package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(getter = "getCallingPackage", mo49213id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", mo49213id = 2, type = "android.os.IBinder")
    private final zzi zzb;
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo49213id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo49213id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(mo49216id = 1) String str, @SafeParcelable.Param(mo49216id = 2) IBinder iBinder, @SafeParcelable.Param(mo49216id = 3) boolean z, @SafeParcelable.Param(mo49216id = 4) boolean z2) {
        this.zza = str;
        zzj zzj = null;
        if (iBinder != null) {
            try {
                IObjectWrapper zzd2 = zzy.zzg(iBinder).zzd();
                byte[] bArr = zzd2 == null ? null : (byte[]) ObjectWrapper.unwrap(zzd2);
                if (bArr != null) {
                    zzj = new zzj(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.zzb = zzj;
        this.zzc = z;
        this.zzd = z2;
    }

    public zzs(String str, zzi zzi, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzi;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        zzi zzi = this.zzb;
        if (zzi == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzi = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, zzi, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
