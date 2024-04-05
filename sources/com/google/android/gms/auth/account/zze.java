package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zza;
import p646pj.C18389c;

public final class zze extends zza implements zzc {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final void zza(zza zza, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zza);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void zzb(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        int i = C18389c.f40448a;
        obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final void zza(zza zza, Account account) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18389c.m31096b(obtainAndWriteInterfaceToken, zza);
        C18389c.m31097c(obtainAndWriteInterfaceToken, account);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }
}
