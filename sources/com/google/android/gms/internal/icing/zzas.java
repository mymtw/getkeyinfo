package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.search.internal.ISearchAuthCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((Status) C14534p.m23136a(parcel, Status.CREATOR), (GoogleNowAuthState) C14534p.m23136a(parcel, GoogleNowAuthState.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzc((Status) C14534p.m23136a(parcel, Status.CREATOR));
        }
        return true;
    }
}
