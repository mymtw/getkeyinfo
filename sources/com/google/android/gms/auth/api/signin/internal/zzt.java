package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p528authapi.zzd;
import p655qj.C18461a;

public abstract class zzt extends zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                zzc((GoogleSignInAccount) C18461a.m31152a(parcel, GoogleSignInAccount.CREATOR), (Status) C18461a.m31152a(parcel, Status.CREATOR));
                break;
            case 102:
                zze((Status) C18461a.m31152a(parcel, Status.CREATOR));
                break;
            case 103:
                zzf((Status) C18461a.m31152a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
