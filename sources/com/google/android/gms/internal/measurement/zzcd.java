package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcd extends zzbm implements zzcf {
    public zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void zzd(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, bundle);
        zzc(1, zza);
    }
}
