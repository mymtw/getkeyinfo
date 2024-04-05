package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzcb extends zzl implements zzcc {
    public zzcb() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                zzi(parcel.readInt(), (Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                zzj(parcel.readInt(), (Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                zzb(parcel.readInt(), (Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                zzg(parcel.readInt(), (Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                zzl((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                zzh(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                zzf((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                zzc((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                zzm((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                zzk((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                zzd((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                zze((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
