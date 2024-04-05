package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import p646pj.C18389c;

public abstract class zzam extends zzb implements zzal {
    public zzam() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza((ProxyResponse) C18389c.m31095a(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzb(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
