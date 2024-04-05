package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzch extends zzbn implements zzci {
    public zzch() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze(parcel.readString(), parcel.readString(), (Bundle) C14660h0.m23607a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        }
        return true;
    }
}
