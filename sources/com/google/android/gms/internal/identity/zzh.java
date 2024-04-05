package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p695vj.C18654a;

public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        Parcelable.Creator creator = Bundle.CREATOR;
        int i3 = C18654a.f41263a;
        zza(readInt, (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
        parcel2.writeNoException();
        return true;
    }
}
