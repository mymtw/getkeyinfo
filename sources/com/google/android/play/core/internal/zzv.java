package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public abstract class zzv extends zzl implements zzw {
    public zzv() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                zzn(parcel.readInt(), (Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                zzb(parcel.readInt(), (Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                zzf(parcel.readInt(), (Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                zzg(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                zzi((Bundle) C15696h0.m25522a(parcel, creator), (Bundle) C15696h0.m25522a(parcel, creator));
                return true;
            case 7:
                zzd((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                zzj((Bundle) C15696h0.m25522a(parcel, creator2), (Bundle) C15696h0.m25522a(parcel, creator2));
                return true;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                zzk((Bundle) C15696h0.m25522a(parcel, creator3), (Bundle) C15696h0.m25522a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                zzh((Bundle) C15696h0.m25522a(parcel, creator4), (Bundle) C15696h0.m25522a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                zze((Bundle) C15696h0.m25522a(parcel, creator5), (Bundle) C15696h0.m25522a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                zzm((Bundle) C15696h0.m25522a(parcel, creator6), (Bundle) C15696h0.m25522a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                zzl((Bundle) C15696h0.m25522a(parcel, creator7), (Bundle) C15696h0.m25522a(parcel, creator7));
                return true;
            case 15:
                zzc((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
