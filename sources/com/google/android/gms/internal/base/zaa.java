package com.google.android.gms.internal.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p671sj.C18511a;

public class zaa extends Binder implements IInterface {
    private static C18511a zaa;

    public zaa(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return zaa(i, parcel, parcel2, i2);
    }

    public boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
    }
}
