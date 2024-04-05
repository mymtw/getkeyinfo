package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.PointOfInterest;
import p711xj.C18785a;

public abstract class zzbc extends zzb implements zzbb {
    public zzbc() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza((PointOfInterest) C18785a.m31699a(parcel, PointOfInterest.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
