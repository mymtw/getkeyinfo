package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import p703wj.C18711n;

public abstract class zzak extends zzb implements zzaj {
    public zzak() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza((zzad) C18711n.m31555a(parcel, zzad.CREATOR));
        return true;
    }
}
