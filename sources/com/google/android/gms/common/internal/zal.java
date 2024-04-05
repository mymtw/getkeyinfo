package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zab;
import p671sj.C18512b;

public final class zal extends zab implements zam {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper zaa(IObjectWrapper iObjectWrapper, zaw zaw) throws RemoteException {
        Parcel zaa = zaa();
        C18512b.m31228b(zaa, iObjectWrapper);
        C18512b.m31229c(zaa, zaw);
        return C0087d.m234c(zaa(2, zaa));
    }
}
