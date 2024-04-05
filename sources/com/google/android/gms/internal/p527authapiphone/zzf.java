package com.google.android.gms.internal.p527authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p663rj.C18480a;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf */
public final class zzf extends zza implements zze {
    public zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zza(zzg zzg) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        int i = C18480a.f40711a;
        obtainAndWriteInterfaceToken.writeStrongBinder(zzg == null ? null : zzg.asBinder());
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
