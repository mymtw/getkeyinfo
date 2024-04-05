package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzb;
import p703wj.C18711n;

public abstract class zzv extends zzb implements zzu {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof zzu ? (zzu) queryLocalInterface : new zzw(iBinder);
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onLocationResult((LocationResult) C18711n.m31555a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            onLocationAvailability((LocationAvailability) C18711n.m31555a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
