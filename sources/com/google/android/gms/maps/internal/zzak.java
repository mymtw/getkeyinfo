package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.LatLng;
import p711xj.C18785a;

public abstract class zzak extends zzb implements zzaj {
    public zzak() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onMapClick((LatLng) C18785a.m31699a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
