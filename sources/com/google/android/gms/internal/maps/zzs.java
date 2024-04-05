package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p711xj.C18785a;

public final class zzs extends zza implements zzq {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    public final void activate() throws RemoteException {
        zzb(3, zza());
    }

    public final String getName() throws RemoteException {
        Parcel zza = zza(1, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final String getShortName() throws RemoteException {
        Parcel zza = zza(2, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final boolean zzb(zzq zzq) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzq);
        Parcel zza2 = zza(4, zza);
        boolean d = C18785a.m31702d(zza2);
        zza2.recycle();
        return d;
    }

    public final int zzj() throws RemoteException {
        Parcel zza = zza(5, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
