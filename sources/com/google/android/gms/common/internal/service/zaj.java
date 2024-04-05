package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.internal.base.zab;
import p671sj.C18512b;

public final class zaj extends zab implements zak {
    public zaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zaa(zaaa zaaa) throws RemoteException {
        Parcel zaa = zaa();
        C18512b.m31229c(zaa, zaaa);
        zac(1, zaa);
    }
}
