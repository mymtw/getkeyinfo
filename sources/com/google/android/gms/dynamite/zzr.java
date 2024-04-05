package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.C14466f;
import com.google.android.gms.internal.common.zza;

public final class zzr extends zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        C14466f.m22924b(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        C14466f.m22924b(zza, iObjectWrapper2);
        return C0087d.m234c(zzB(2, zza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        C14466f.m22924b(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        C14466f.m22924b(zza, iObjectWrapper2);
        return C0087d.m234c(zzB(3, zza));
    }
}
