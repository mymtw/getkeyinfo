package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import p711xj.C18785a;

public final class zzg extends zza implements zze {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final IObjectWrapper zza(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        return C0087d.m234c(zza(1, zza));
    }

    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C0087d.m234c(zza(3, zza));
    }

    public final IObjectWrapper zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C0087d.m234c(zza(7, zza));
    }

    public final IObjectWrapper zzi() throws RemoteException {
        return C0087d.m234c(zza(4, zza()));
    }

    public final IObjectWrapper zza(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C0087d.m234c(zza(2, zza));
    }

    public final IObjectWrapper zza(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        return C0087d.m234c(zza(5, zza));
    }

    public final IObjectWrapper zza(Bitmap bitmap) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bitmap);
        return C0087d.m234c(zza(6, zza));
    }
}
