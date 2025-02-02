package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p727zj.C18936e;

public abstract class zzr extends zzb implements zzq {
    public zzr() {
        super("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zza(parcel.readInt(), parcel.readInt(), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
