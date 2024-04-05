package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;
import p711xj.C18785a;

public abstract class zzas extends zzb implements zzar {
    public zzas() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zza = zza(zzu.zzg(parcel.readStrongBinder()));
        parcel2.writeNoException();
        ClassLoader classLoader = C18785a.f41654a;
        parcel2.writeInt(zza ? 1 : 0);
        return true;
    }
}
