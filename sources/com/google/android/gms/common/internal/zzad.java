package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.C14466f;
import com.google.android.gms.internal.common.zza;

public final class zzad extends zza implements zzaf {
    public zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final zzq zze(zzn zzn) throws RemoteException {
        Parcel zza = zza();
        int i = C14466f.f32597a;
        if (zzn == null) {
            zza.writeInt(0);
        } else {
            zza.writeInt(1);
            zzn.writeToParcel(zza, 0);
        }
        Parcel zzB = zzB(6, zza);
        zzq zzq = (zzq) C14466f.m22923a(zzB, zzq.CREATOR);
        zzB.recycle();
        return zzq;
    }

    public final boolean zzf(zzs zzs, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        int i = C14466f.f32597a;
        boolean z = true;
        if (zzs == null) {
            zza.writeInt(0);
        } else {
            zza.writeInt(1);
            zzs.writeToParcel(zza, 0);
        }
        C14466f.m22924b(zza, iObjectWrapper);
        Parcel zzB = zzB(5, zza);
        if (zzB.readInt() == 0) {
            z = false;
        }
        zzB.recycle();
        return z;
    }

    public final boolean zzg() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        int i = C14466f.f32597a;
        boolean z = zzB.readInt() != 0;
        zzB.recycle();
        return z;
    }
}
