package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.C14466f;
import com.google.android.gms.internal.common.zza;

public final class zzq extends zza {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        C14466f.m22924b(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        C14466f.m22924b(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel zza = zza();
        C14466f.m22924b(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        return C0087d.m234c(zzB(2, zza));
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        C14466f.m22924b(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        C14466f.m22924b(zza, iObjectWrapper2);
        return C0087d.m234c(zzB(8, zza));
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel zza = zza();
        C14466f.m22924b(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        return C0087d.m234c(zzB(4, zza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel zza = zza();
        C14466f.m22924b(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        return C0087d.m234c(zzB(7, zza));
    }
}
