package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;
import p646pj.C18389c;

public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzb((Status) C18389c.m31095a(parcel, Status.CREATOR));
                return true;
            case 2:
                zza((Status) C18389c.m31095a(parcel, Status.CREATOR), (zzt) C18389c.m31095a(parcel, zzt.CREATOR));
                return true;
            case 3:
                zza((Status) C18389c.m31095a(parcel, Status.CREATOR), (zzl) C18389c.m31095a(parcel, zzl.CREATOR));
                return true;
            case 4:
                zzd();
                return true;
            case 5:
                onFailure((Status) C18389c.m31095a(parcel, Status.CREATOR));
                return true;
            case 6:
                zza(parcel.createByteArray());
                return true;
            case 7:
                zza((DeviceMetaData) C18389c.m31095a(parcel, DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
