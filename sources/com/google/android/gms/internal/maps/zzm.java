package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p711xj.C18785a;

public final class zzm extends zza implements zzk {
    public zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    public final float getBearing() throws RemoteException {
        Parcel zza = zza(12, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final LatLngBounds getBounds() throws RemoteException {
        Parcel zza = zza(10, zza());
        LatLngBounds latLngBounds = (LatLngBounds) C18785a.m31699a(zza, LatLngBounds.CREATOR);
        zza.recycle();
        return latLngBounds;
    }

    public final float getHeight() throws RemoteException {
        Parcel zza = zza(8, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final String getId() throws RemoteException {
        Parcel zza = zza(2, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final LatLng getPosition() throws RemoteException {
        Parcel zza = zza(4, zza());
        LatLng latLng = (LatLng) C18785a.m31699a(zza, LatLng.CREATOR);
        zza.recycle();
        return latLng;
    }

    public final float getTransparency() throws RemoteException {
        Parcel zza = zza(18, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final float getWidth() throws RemoteException {
        Parcel zza = zza(7, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final float getZIndex() throws RemoteException {
        Parcel zza = zza(14, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final boolean isClickable() throws RemoteException {
        Parcel zza = zza(23, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isVisible() throws RemoteException {
        Parcel zza = zza(16, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final void remove() throws RemoteException {
        zzb(1, zza());
    }

    public final void setBearing(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(11, zza);
    }

    public final void setClickable(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(22, zza);
    }

    public final void setDimensions(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(5, zza);
    }

    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        zzb(3, zza);
    }

    public final void setPositionFromBounds(LatLngBounds latLngBounds) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLngBounds);
        zzb(9, zza);
    }

    public final void setTransparency(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(17, zza);
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(15, zza);
    }

    public final void setZIndex(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(13, zza);
    }

    public final void zza(float f, float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzb(6, zza);
    }

    public final boolean zzb(zzk zzk) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzk);
        Parcel zza2 = zza(19, zza);
        boolean d = C18785a.m31702d(zza2);
        zza2.recycle();
        return d;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        zzb(24, zza);
    }

    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        zzb(21, zza);
    }

    public final int zzj() throws RemoteException {
        Parcel zza = zza(20, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return C0087d.m234c(zza(25, zza()));
    }
}
