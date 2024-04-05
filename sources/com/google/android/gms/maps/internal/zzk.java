package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import p711xj.C18785a;

public final class zzk extends zza implements IMapViewDelegate {
    public zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IGoogleMapDelegate getMap() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 1
            android.os.Parcel r0 = r4.zza(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.IGoogleMapDelegate
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.internal.IGoogleMapDelegate r1 = (com.google.android.gms.maps.internal.IGoogleMapDelegate) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.internal.zzg r2 = new com.google.android.gms.maps.internal.zzg
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzk.getMap():com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final void getMapAsync(zzap zzap) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzap);
        zzb(9, zza);
    }

    public final IObjectWrapper getView() throws RemoteException {
        return C0087d.m234c(zza(8, zza()));
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bundle);
        zzb(2, zza);
    }

    public final void onDestroy() throws RemoteException {
        zzb(5, zza());
    }

    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bundle);
        zzb(10, zza);
    }

    public final void onExitAmbient() throws RemoteException {
        zzb(11, zza());
    }

    public final void onLowMemory() throws RemoteException {
        zzb(6, zza());
    }

    public final void onPause() throws RemoteException {
        zzb(4, zza());
    }

    public final void onResume() throws RemoteException {
        zzb(3, zza());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bundle);
        Parcel zza2 = zza(7, zza);
        if (zza2.readInt() != 0) {
            bundle.readFromParcel(zza2);
        }
        zza2.recycle();
    }

    public final void onStart() throws RemoteException {
        zzb(12, zza());
    }

    public final void onStop() throws RemoteException {
        zzb(13, zza());
    }
}
