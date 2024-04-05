package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p703wj.C18711n;

public final class zzal extends zza implements zzaj {
    public zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final void zza(zzad zzad) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, zzad);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
