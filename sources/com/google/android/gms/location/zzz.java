package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zza;
import p703wj.C18711n;

public final class zzz extends zza implements zzx {
    public zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final void onLocationChanged(Location location) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18711n.m31557c(obtainAndWriteInterfaceToken, location);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
