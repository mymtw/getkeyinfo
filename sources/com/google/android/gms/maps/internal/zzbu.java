package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import p711xj.C18785a;

public final class zzbu extends zza implements IStreetViewPanoramaDelegate {
    public zzbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    public final void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, streetViewPanoramaCamera);
        zza.writeLong(j);
        zzb(9, zza);
    }

    public final void enablePanning(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(2, zza);
    }

    public final void enableStreetNames(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(4, zza);
    }

    public final void enableUserNavigation(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(3, zza);
    }

    public final void enableZoom(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(1, zza);
    }

    public final StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException {
        Parcel zza = zza(10, zza());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) C18785a.m31699a(zza, StreetViewPanoramaCamera.CREATOR);
        zza.recycle();
        return streetViewPanoramaCamera;
    }

    public final StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException {
        Parcel zza = zza(14, zza());
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) C18785a.m31699a(zza, StreetViewPanoramaLocation.CREATOR);
        zza.recycle();
        return streetViewPanoramaLocation;
    }

    public final boolean isPanningGesturesEnabled() throws RemoteException {
        Parcel zza = zza(6, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isStreetNamesEnabled() throws RemoteException {
        Parcel zza = zza(8, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isUserNavigationEnabled() throws RemoteException {
        Parcel zza = zza(7, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isZoomGesturesEnabled() throws RemoteException {
        Parcel zza = zza(5, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, streetViewPanoramaOrientation);
        return C0087d.m234c(zza(19, zza));
    }

    public final StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        Parcel zza2 = zza(18, zza);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) C18785a.m31699a(zza2, StreetViewPanoramaOrientation.CREATOR);
        zza2.recycle();
        return streetViewPanoramaOrientation;
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(zzbh zzbh) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbh);
        zzb(16, zza);
    }

    public final void setOnStreetViewPanoramaChangeListener(zzbj zzbj) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbj);
        zzb(15, zza);
    }

    public final void setOnStreetViewPanoramaClickListener(zzbl zzbl) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbl);
        zzb(17, zza);
    }

    public final void setOnStreetViewPanoramaLongClickListener(zzbn zzbn) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbn);
        zzb(20, zza);
    }

    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        zzb(12, zza);
    }

    public final void setPositionWithID(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(11, zza);
    }

    public final void setPositionWithRadius(LatLng latLng, int i) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        zza.writeInt(i);
        zzb(13, zza);
    }

    public final void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        zza.writeInt(i);
        C18785a.m31701c(zza, streetViewSource);
        zzb(22, zza);
    }

    public final void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        C18785a.m31701c(zza, streetViewSource);
        zzb(21, zza);
    }
}
