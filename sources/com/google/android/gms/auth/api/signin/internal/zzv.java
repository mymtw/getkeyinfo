package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p528authapi.zzc;
import p655qj.C18461a;

public final class zzv extends zzc implements zzu {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zzc(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18461a.m31153b(obtainAndWriteInterfaceToken, zzs);
        C18461a.m31154c(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(101, obtainAndWriteInterfaceToken);
    }

    public final void zzd(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18461a.m31153b(obtainAndWriteInterfaceToken, zzs);
        C18461a.m31154c(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(102, obtainAndWriteInterfaceToken);
    }

    public final void zze(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18461a.m31153b(obtainAndWriteInterfaceToken, zzs);
        C18461a.m31154c(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(103, obtainAndWriteInterfaceToken);
    }
}
