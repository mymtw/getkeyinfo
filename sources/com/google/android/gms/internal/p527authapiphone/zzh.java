package com.google.android.gms.internal.p527authapiphone;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p663rj.C18480a;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzh */
public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = C18480a.f40711a;
        zza((Status) (parcel.readInt() == 0 ? null : creator.createFromParcel(parcel)));
        return true;
    }
}
