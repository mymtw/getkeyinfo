package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;
import p711xj.C18785a;

public final class zzj extends zza implements zzh {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    public final LatLng getCenter() throws RemoteException {
        Parcel zza = zza(4, zza());
        LatLng latLng = (LatLng) C18785a.m31699a(zza, LatLng.CREATOR);
        zza.recycle();
        return latLng;
    }

    public final int getFillColor() throws RemoteException {
        Parcel zza = zza(12, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final String getId() throws RemoteException {
        Parcel zza = zza(2, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final double getRadius() throws RemoteException {
        Parcel zza = zza(6, zza());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    public final int getStrokeColor() throws RemoteException {
        Parcel zza = zza(10, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final List<PatternItem> getStrokePattern() throws RemoteException {
        Parcel zza = zza(22, zza());
        ArrayList<PatternItem> createTypedArrayList = zza.createTypedArrayList(PatternItem.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final float getStrokeWidth() throws RemoteException {
        Parcel zza = zza(8, zza());
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
        Parcel zza = zza(20, zza());
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

    public final void setCenter(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, latLng);
        zzb(3, zza);
    }

    public final void setClickable(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(19, zza);
    }

    public final void setFillColor(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzb(11, zza);
    }

    public final void setRadius(double d) throws RemoteException {
        Parcel zza = zza();
        zza.writeDouble(d);
        zzb(5, zza);
    }

    public final void setStrokeColor(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzb(9, zza);
    }

    public final void setStrokePattern(List<PatternItem> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzb(21, zza);
    }

    public final void setStrokeWidth(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(7, zza);
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

    public final boolean zzb(zzh zzh) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzh);
        Parcel zza2 = zza(17, zza);
        boolean d = C18785a.m31702d(zza2);
        zza2.recycle();
        return d;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        zzb(23, zza);
    }

    public final int zzj() throws RemoteException {
        Parcel zza = zza(18, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return C0087d.m234c(zza(24, zza()));
    }
}
