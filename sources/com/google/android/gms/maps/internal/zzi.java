package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;
import p711xj.C18785a;

public abstract class zzi extends zzb implements zzh {
    public zzi() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zzh = zzh(zzu.zzg(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C18785a.m31700b(parcel2, zzh);
        } else if (i != 2) {
            return false;
        } else {
            IObjectWrapper zzi = zzi(zzu.zzg(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C18785a.m31700b(parcel2, zzi);
        }
        return true;
    }
}
