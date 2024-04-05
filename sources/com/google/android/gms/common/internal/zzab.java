package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C14466f;
import com.google.android.gms.internal.common.zzb;

public abstract class zzab extends zzb implements IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C14466f.m22923a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            zzb(parcel.readInt(), (Bundle) C14466f.m22923a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzc(parcel.readInt(), parcel.readStrongBinder(), (zzj) C14466f.m22923a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
