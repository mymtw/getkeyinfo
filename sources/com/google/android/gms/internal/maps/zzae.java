package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p711xj.C18785a;

public final class zzae extends zza implements zzac {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    public final void clearTileCache() throws RemoteException {
        zzb(2, zza());
    }

    public final boolean getFadeIn() throws RemoteException {
        Parcel zza = zza(11, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final String getId() throws RemoteException {
        Parcel zza = zza(3, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final float getTransparency() throws RemoteException {
        Parcel zza = zza(13, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final float getZIndex() throws RemoteException {
        Parcel zza = zza(5, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final boolean isVisible() throws RemoteException {
        Parcel zza = zza(7, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final void remove() throws RemoteException {
        zzb(1, zza());
    }

    public final void setFadeIn(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(10, zza);
    }

    public final void setTransparency(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(12, zza);
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = C18785a.f41654a;
        zza.writeInt(z ? 1 : 0);
        zzb(6, zza);
    }

    public final void setZIndex(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(4, zza);
    }

    public final boolean zza(zzac zzac) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzac);
        Parcel zza2 = zza(8, zza);
        boolean d = C18785a.m31702d(zza2);
        zza2.recycle();
        return d;
    }

    public final int zzj() throws RemoteException {
        Parcel zza = zza(9, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
