package com.google.android.gms.internal.p528authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import p655qj.C18461a;

/* renamed from: com.google.android.gms.internal.auth-api.zzx */
public final class zzx extends zzc implements zzw {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zzc(zzu zzu, CredentialRequest credentialRequest) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18461a.m31153b(obtainAndWriteInterfaceToken, zzu);
        C18461a.m31154c(obtainAndWriteInterfaceToken, credentialRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzu zzu, zzy zzy) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18461a.m31153b(obtainAndWriteInterfaceToken, zzu);
        C18461a.m31154c(obtainAndWriteInterfaceToken, zzy);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzu zzu, zzs zzs) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18461a.m31153b(obtainAndWriteInterfaceToken, zzu);
        C18461a.m31154c(obtainAndWriteInterfaceToken, zzs);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzu zzu) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18461a.m31153b(obtainAndWriteInterfaceToken, zzu);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }
}
