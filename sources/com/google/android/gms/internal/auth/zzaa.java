package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p646pj.C18389c;

public final class zzaa extends zza implements zzz {
    public zzaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    public final void zza(zzx zzx, zzaf zzaf) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zzx);
        C18389c.m31097c(obtainAndWriteInterfaceToken, zzaf);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzx zzx, zzad zzad) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zzx);
        C18389c.m31097c(obtainAndWriteInterfaceToken, zzad);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzx zzx, zzv zzv) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zzx);
        C18389c.m31097c(obtainAndWriteInterfaceToken, zzv);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzx zzx, zzah zzah) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zzx);
        C18389c.m31097c(obtainAndWriteInterfaceToken, zzah);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzx zzx, zzab zzab) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zzx);
        C18389c.m31097c(obtainAndWriteInterfaceToken, zzab);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }
}
