package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p711xj.C18785a;

public final class zzb extends zza implements ICameraUpdateFactoryDelegate {
    public zzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final IObjectWrapper newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, cameraPosition);
        return C0087d.m234c(zza(7, zza));
    }

    public final IObjectWrapper newLatLng(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        return C0087d.m234c(zza(8, zza));
    }

    public final IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLngBounds);
        zza.writeInt(i);
        return C0087d.m234c(zza(10, zza));
    }

    public final IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLngBounds);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        return C0087d.m234c(zza(11, zza));
    }

    public final IObjectWrapper newLatLngZoom(LatLng latLng, float f) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        zza.writeFloat(f);
        return C0087d.m234c(zza(9, zza));
    }

    public final IObjectWrapper scrollBy(float f, float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        return C0087d.m234c(zza(3, zza));
    }

    public final IObjectWrapper zoomBy(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        return C0087d.m234c(zza(5, zza));
    }

    public final IObjectWrapper zoomByWithFocus(float f, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeInt(i);
        zza.writeInt(i2);
        return C0087d.m234c(zza(6, zza));
    }

    public final IObjectWrapper zoomIn() throws RemoteException {
        return C0087d.m234c(zza(1, zza()));
    }

    public final IObjectWrapper zoomOut() throws RemoteException {
        return C0087d.m234c(zza(2, zza()));
    }

    public final IObjectWrapper zoomTo(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        return C0087d.m234c(zza(4, zza));
    }
}
