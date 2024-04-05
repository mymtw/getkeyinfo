package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import p711xj.C18785a;

public final class zzbv extends zza implements IStreetViewPanoramaFragmentDelegate {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate getStreetViewPanorama() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate r1 = (com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.internal.zzbu r2 = new com.google.android.gms.maps.internal.zzbu
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzbv.getStreetViewPanorama():com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    public final void getStreetViewPanoramaAsync(zzbp zzbp) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, zzbp);
        zzb(12, zza);
    }

    public final boolean isReady() throws RemoteException {
        Parcel zza = zza(11, zza());
        boolean d = C18785a.m31702d(zza);
        zza.recycle();
        return d;
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bundle);
        zzb(3, zza);
    }

    public final IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        C18785a.m31700b(zza, iObjectWrapper2);
        C18785a.m31701c(zza, bundle);
        return C0087d.m234c(zza(4, zza));
    }

    public final void onDestroy() throws RemoteException {
        zzb(8, zza());
    }

    public final void onDestroyView() throws RemoteException {
        zzb(7, zza());
    }

    public final void onInflate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31700b(zza, iObjectWrapper);
        C18785a.m31701c(zza, streetViewPanoramaOptions);
        C18785a.m31701c(zza, bundle);
        zzb(2, zza);
    }

    public final void onLowMemory() throws RemoteException {
        zzb(9, zza());
    }

    public final void onPause() throws RemoteException {
        zzb(6, zza());
    }

    public final void onResume() throws RemoteException {
        zzb(5, zza());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C18785a.m31701c(zza, bundle);
        Parcel zza2 = zza(10, zza);
        if (zza2.readInt() != 0) {
            bundle.readFromParcel(zza2);
        }
        zza2.recycle();
    }

    public final void onStart() throws RemoteException {
        zzb(13, zza());
    }

    public final void onStop() throws RemoteException {
        zzb(14, zza());
    }
}
