package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbp extends zzbm implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle zzd(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, bundle);
        Parcel zzb = zzb(1, zza);
        Bundle bundle2 = (Bundle) C14660h0.m23607a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }
}
