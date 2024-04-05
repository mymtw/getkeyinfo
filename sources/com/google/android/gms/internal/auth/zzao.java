package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import p646pj.C18389c;

public final class zzao extends zza implements zzan {
    public zzao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zza(zzal zzal, ProxyRequest proxyRequest) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zzal);
        C18389c.m31097c(obtainAndWriteInterfaceToken, proxyRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzal zzal) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zzal);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }
}
