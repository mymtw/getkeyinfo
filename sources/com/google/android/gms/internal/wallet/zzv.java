package com.google.android.gms.internal.wallet;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import p727zj.C18936e;

public final class zzv extends zza implements zzu {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
    }

    public final zzn zza(IObjectWrapper iObjectWrapper, IFragmentWrapper iFragmentWrapper, WalletFragmentOptions walletFragmentOptions, zzq zzq) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32029b(obtainAndWriteInterfaceToken, iObjectWrapper);
        C18936e.m32029b(obtainAndWriteInterfaceToken, iFragmentWrapper);
        C18936e.m32030c(obtainAndWriteInterfaceToken, walletFragmentOptions);
        C18936e.m32029b(obtainAndWriteInterfaceToken, zzq);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzn zza = zzo.zza(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zza;
    }
}
