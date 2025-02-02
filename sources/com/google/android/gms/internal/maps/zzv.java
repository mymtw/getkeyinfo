package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import p711xj.C18785a;

public final class zzv extends zza implements zzt {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final float getAlpha() throws RemoteException {
        Parcel zza = zza(26, zza());
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

    public final float getRotation() throws RemoteException {
        Parcel zza = zza(23, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final String getSnippet() throws RemoteException {
        Parcel zza = zza(8, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final String getTitle() throws RemoteException {
        Parcel zza = zza(6, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final float getZIndex() throws RemoteException {
        Parcel zza = zza(28, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final void hideInfoWindow() throws RemoteException {
        zzb(12, zza());
    }

    public final boolean isDraggable() throws RemoteException {
        Parcel zza = zza(10, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isFlat() throws RemoteException {
        Parcel zza = zza(21, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isInfoWindowShown() throws RemoteException {
        Parcel zza = zza(13, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final boolean isVisible() throws RemoteException {
        Parcel zza = zza(15, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final void remove() throws RemoteException {
        zzb(1, zza());
    }

    public final void setAlpha(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(25, zza);
    }

    public final void setAnchor(float f, float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzb(19, zza);
    }

    public final void setDraggable(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(9, zza);
    }

    public final void setFlat(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(20, zza);
    }

    public final void setInfoWindowAnchor(float f, float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzb(24, zza);
    }

    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        zzb(3, zza);
    }

    public final void setRotation(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(22, zza);
    }

    public final void setSnippet(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(7, zza);
    }

    public final void setTitle(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(5, zza);
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(14, zza);
    }

    public final void setZIndex(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(27, zza);
    }

    public final void showInfoWindow() throws RemoteException {
        zzb(11, zza());
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        zzb(29, zza);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        zzb(18, zza);
    }

    public final boolean zzj(zzt zzt) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzt);
        Parcel zza2 = zza(16, zza);
        boolean d = C18785a.m31702d(zza2);
        zza2.recycle();
        return d;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return C0087d.m234c(zza(30, zza()));
    }

    public final int zzj() throws RemoteException {
        Parcel zza = zza(17, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
