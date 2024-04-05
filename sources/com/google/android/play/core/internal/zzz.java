package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzz extends zzk {
    public zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void zzc(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        int i = C15696h0.f35459a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zzb(4, zza);
    }

    public final void zzd(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        int i = C15696h0.f35459a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zzb(3, zza);
    }

    public final void zze(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel zza = zza();
        int i = C15696h0.f35459a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zza.writeInt(1);
        bundle2.writeToParcel(zza, 0);
        zzb(2, zza);
    }
}
