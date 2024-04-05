package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;
import p671sj.C18512b;

public abstract class zad extends zaa implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                zaa((ConnectionResult) C18512b.m31227a(parcel, ConnectionResult.CREATOR), (zaa) C18512b.m31227a(parcel, zaa.CREATOR));
                break;
            case 4:
                zaa((Status) C18512b.m31227a(parcel, Status.CREATOR));
                break;
            case 6:
                zab((Status) C18512b.m31227a(parcel, Status.CREATOR));
                break;
            case 7:
                zaa((Status) C18512b.m31227a(parcel, Status.CREATOR), (GoogleSignInAccount) C18512b.m31227a(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                zaa((zak) C18512b.m31227a(parcel, zak.CREATOR));
                break;
            case 9:
                zaa((zai) C18512b.m31227a(parcel, zai.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
