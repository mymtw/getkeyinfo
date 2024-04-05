package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zza;
import p711xj.C18785a;

public final class zzai extends zza implements zzah {
    public zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    public final void zza(Location location) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, location);
        zzb(2, zza);
    }
}
