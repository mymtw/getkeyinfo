package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import p711xj.C18785a;

public abstract class zzaw extends zzb implements zzav {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean onMyLocationButtonClick = onMyLocationButtonClick();
        parcel2.writeNoException();
        ClassLoader classLoader = C18785a.f41654a;
        parcel2.writeInt(onMyLocationButtonClick ? 1 : 0);
        return true;
    }
}
