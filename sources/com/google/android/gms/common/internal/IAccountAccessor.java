package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C14466f;
import com.google.android.gms.internal.common.zzb;

public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends zzb implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static IAccountAccessor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzv(iBinder);
        }

        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account zzb = zzb();
            parcel2.writeNoException();
            int i3 = C14466f.f32597a;
            if (zzb == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                zzb.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }

    Account zzb() throws RemoteException;
}
