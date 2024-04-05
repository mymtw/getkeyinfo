package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p711xj.C18785a;

public final class zzp extends zza implements zzn {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    public final int getActiveLevelIndex() throws RemoteException {
        Parcel zza = zza(1, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final int getDefaultLevelIndex() throws RemoteException {
        Parcel zza = zza(2, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final List<IBinder> getLevels() throws RemoteException {
        Parcel zza = zza(3, zza());
        ArrayList<IBinder> createBinderArrayList = zza.createBinderArrayList();
        zza.recycle();
        return createBinderArrayList;
    }

    public final boolean isUnderground() throws RemoteException {
        Parcel zza = zza(4, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean zzb(zzn zzn) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzn);
        Parcel zza2 = zza(5, zza);
        boolean d = C18785a.m31702d(zza2);
        zza2.recycle();
        return d;
    }

    public final int zzj() throws RemoteException {
        Parcel zza = zza(6, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
