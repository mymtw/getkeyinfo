package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;
import p711xj.C18785a;

public final class zzah extends zza implements zzaf {
    public zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public final Tile getTile(int i, int i2, int i3) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        Parcel zza2 = zza(1, zza);
        Tile tile = (Tile) C18785a.m31699a(zza2, Tile.CREATOR);
        zza2.recycle();
        return tile;
    }
}
