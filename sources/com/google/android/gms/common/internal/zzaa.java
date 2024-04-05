package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C14466f;
import com.google.android.gms.internal.common.zza;

public final class zzaa extends zza implements IGmsCallbacks {
    public zzaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        int i2 = C14466f.f32597a;
        if (bundle == null) {
            zza.writeInt(0);
        } else {
            zza.writeInt(1);
            bundle.writeToParcel(zza, 0);
        }
        zzC(1, zza);
    }

    public final void zzb(int i, Bundle bundle) throws RemoteException {
        throw null;
    }

    public final void zzc(int i, IBinder iBinder, zzj zzj) throws RemoteException {
        throw null;
    }
}
