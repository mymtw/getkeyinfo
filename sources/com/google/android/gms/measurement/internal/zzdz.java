package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C14660h0;
import com.google.android.gms.internal.measurement.zzbm;
import java.util.ArrayList;
import java.util.List;

public final class zzdz extends zzbm implements zzeb {
    public zzdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final String zzd(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzp);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final List<zzkv> zze(zzp zzp, boolean z) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzp);
        zza.writeInt(z ? 1 : 0);
        Parcel zzb = zzb(7, zza);
        ArrayList<zzkv> createTypedArrayList = zzb.createTypedArrayList(zzkv.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final List<zzab> zzf(String str, String str2, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        C14660h0.m23608b(zza, zzp);
        Parcel zzb = zzb(16, zza);
        ArrayList<zzab> createTypedArrayList = zzb.createTypedArrayList(zzab.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final List<zzab> zzg(String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList<zzab> createTypedArrayList = zzb.createTypedArrayList(zzab.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final List<zzkv> zzh(String str, String str2, boolean z, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        ClassLoader classLoader = C14660h0.f32859a;
        zza.writeInt(z ? 1 : 0);
        C14660h0.m23608b(zza, zzp);
        Parcel zzb = zzb(14, zza);
        ArrayList<zzkv> createTypedArrayList = zzb.createTypedArrayList(zzkv.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final List<zzkv> zzi(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        ClassLoader classLoader = C14660h0.f32859a;
        zza.writeInt(z ? 1 : 0);
        Parcel zzb = zzb(15, zza);
        ArrayList<zzkv> createTypedArrayList = zzb.createTypedArrayList(zzkv.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void zzj(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzp);
        zzc(4, zza);
    }

    public final void zzk(zzat zzat, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzat);
        C14660h0.m23608b(zza, zzp);
        zzc(1, zza);
    }

    public final void zzl(zzat zzat, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzm(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzp);
        zzc(18, zza);
    }

    public final void zzn(zzab zzab, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzab);
        C14660h0.m23608b(zza, zzp);
        zzc(12, zza);
    }

    public final void zzo(zzab zzab) throws RemoteException {
        throw null;
    }

    public final void zzp(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzp);
        zzc(20, zza);
    }

    public final void zzq(long j, String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    public final void zzr(Bundle bundle, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, bundle);
        C14660h0.m23608b(zza, zzp);
        zzc(19, zza);
    }

    public final void zzs(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzp);
        zzc(6, zza);
    }

    public final void zzt(zzkv zzkv, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzkv);
        C14660h0.m23608b(zza, zzp);
        zzc(2, zza);
    }

    public final byte[] zzu(zzat zzat, String str) throws RemoteException {
        Parcel zza = zza();
        C14660h0.m23608b(zza, zzat);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }
}
