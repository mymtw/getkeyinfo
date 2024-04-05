package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zza;
import p703wj.C18711n;

public final class zzw extends zza implements zzu {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, locationAvailability);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }

    public final void onLocationResult(LocationResult locationResult) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, locationResult);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
