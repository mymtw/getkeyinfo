package com.google.android.gms.internal.p528authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p655qj.C18461a;

/* renamed from: com.google.android.gms.internal.auth-api.zzv */
public abstract class zzv extends zzd implements zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc((Status) C18461a.m31152a(parcel, Status.CREATOR), (Credential) C18461a.m31152a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            zzc((Status) C18461a.m31152a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzc((Status) C18461a.m31152a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
