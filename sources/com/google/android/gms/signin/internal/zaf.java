package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zab;
import p671sj.C18512b;

public final class zaf extends zab implements zag {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zaa(int i) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zab(7, zaa);
    }

    public final void zaa(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel zaa = zaa();
        C18512b.m31228b(zaa, iAccountAccessor);
        zaa.writeInt(i);
        zaa.writeInt(z ? 1 : 0);
        zab(9, zaa);
    }

    public final void zaa(zaj zaj, zae zae) throws RemoteException {
        Parcel zaa = zaa();
        C18512b.m31229c(zaa, zaj);
        C18512b.m31228b(zaa, zae);
        zab(12, zaa);
    }
}
