package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.p013v4.media.C0073e;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class zzf extends zza {
    public final IBinder zze;
    public final /* synthetic */ BaseGmsClient zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    public final void zzb(ConnectionResult connectionResult) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    public final boolean zzd() {
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.zzf.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.zzf.getServiceDescriptor();
                Log.w("GmsClient", C0073e.m210j(new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface createServiceInterface = this.zzf.createServiceInterface(this.zze);
            if (createServiceInterface == null || (!BaseGmsClient.zzn(this.zzf, 2, 4, createServiceInterface) && !BaseGmsClient.zzn(this.zzf, 3, 4, createServiceInterface))) {
                return false;
            }
            this.zzf.zzB = null;
            Bundle connectionHint = this.zzf.getConnectionHint();
            BaseGmsClient baseGmsClient = this.zzf;
            if (baseGmsClient.zzw == null) {
                return true;
            }
            baseGmsClient.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
