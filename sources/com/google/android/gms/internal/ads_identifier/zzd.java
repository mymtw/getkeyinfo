package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p637oj.C18307a;

public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String zzc() throws RemoteException {
        Parcel zzb = zzb(1, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final boolean zzd() throws RemoteException {
        Parcel zzb = zzb(6, zza());
        int i = C18307a.f40186a;
        boolean z = zzb.readInt() != 0;
        zzb.recycle();
        return z;
    }

    public final boolean zze(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = C18307a.f40186a;
        boolean z2 = true;
        zza.writeInt(1);
        Parcel zzb = zzb(2, zza);
        if (zzb.readInt() == 0) {
            z2 = false;
        }
        zzb.recycle();
        return z2;
    }
}
