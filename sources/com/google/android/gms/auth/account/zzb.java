package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import p646pj.C18389c;

public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            boolean z = false;
            if (i != 2) {
                return false;
            }
            int i3 = C18389c.f40448a;
            if (parcel.readInt() != 0) {
                z = true;
            }
            zza(z);
        } else {
            zzc((Account) C18389c.m31095a(parcel, Account.CREATOR));
        }
        return true;
    }
}
