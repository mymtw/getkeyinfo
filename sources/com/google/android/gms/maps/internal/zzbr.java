package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import p711xj.C18785a;

public final class zzbr extends zza implements IProjectionDelegate {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    public final LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        Parcel zza2 = zza(1, zza);
        LatLng latLng = (LatLng) C18785a.m31699a(zza2, LatLng.CREATOR);
        zza2.recycle();
        return latLng;
    }

    public final VisibleRegion getVisibleRegion() throws RemoteException {
        Parcel zza = zza(3, zza());
        VisibleRegion visibleRegion = (VisibleRegion) C18785a.m31699a(zza, VisibleRegion.CREATOR);
        zza.recycle();
        return visibleRegion;
    }

    public final IObjectWrapper toScreenLocation(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        return C0087d.m234c(zza(2, zza));
    }
}
