package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zab;
import p671sj.C18512b;

public final class zan extends zab implements zao {
    public zan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zaa(zam zam) throws RemoteException {
        Parcel zaa = zaa();
        C18512b.m31228b(zaa, zam);
        zac(1, zaa);
    }
}
