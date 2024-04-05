package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zzab extends zzb implements zzac {
    public zzab() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((Status) C14534p.m23136a(parcel, Status.CREATOR));
        } else if (i == 2) {
            Status status = (Status) C14534p.m23136a(parcel, Status.CREATOR);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C14534p.m23136a(parcel, ParcelFileDescriptor.CREATOR);
        } else if (i != 4) {
            return false;
        } else {
            zzo zzo = (zzo) C14534p.m23136a(parcel, zzo.CREATOR);
        }
        return true;
    }
}
