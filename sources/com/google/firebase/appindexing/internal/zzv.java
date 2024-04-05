package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.icing.C14534p;
import com.google.android.gms.internal.icing.zza;

public final class zzv extends zza {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    public final zzg zzd(IStatusCallback iStatusCallback, zzz zzz) throws RemoteException {
        Parcel zza = zza();
        C14534p.m23137b(zza, iStatusCallback);
        zza.writeInt(1);
        zzz.writeToParcel(zza, 0);
        Parcel zzb = zzb(8, zza);
        zzg zzg = (zzg) C14534p.m23136a(zzb, zzg.CREATOR);
        zzb.recycle();
        return zzg;
    }
}
