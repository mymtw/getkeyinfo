package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;
import p695vj.C18654a;

public final class zzj extends zza implements zzi {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
    }

    public final void zza(zzg zzg, UserAddressRequest userAddressRequest, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        int i = C18654a.f41263a;
        obtainAndWriteInterfaceToken.writeStrongBinder(zzg == null ? null : zzg.asBinder());
        if (userAddressRequest == null) {
            obtainAndWriteInterfaceToken.writeInt(0);
        } else {
            obtainAndWriteInterfaceToken.writeInt(1);
            userAddressRequest.writeToParcel(obtainAndWriteInterfaceToken, 0);
        }
        if (bundle == null) {
            obtainAndWriteInterfaceToken.writeInt(0);
        } else {
            obtainAndWriteInterfaceToken.writeInt(1);
            bundle.writeToParcel(obtainAndWriteInterfaceToken, 0);
        }
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
