package com.google.android.gms.internal.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import p727zj.C18936e;

public final class zzp extends zza implements zzn {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
    }

    public final int getState() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    public final void initialize(WalletFragmentInitParams walletFragmentInitParams) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, walletFragmentInitParams);
        transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        C18936e.m32030c(obtainAndWriteInterfaceToken, intent);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32029b(obtainAndWriteInterfaceToken, iObjectWrapper);
        C18936e.m32029b(obtainAndWriteInterfaceToken, iObjectWrapper2);
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        return C0087d.m234c(transactAndReadException(3, obtainAndWriteInterfaceToken));
    }

    public final void onPause() throws RemoteException {
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
    }

    public final void onResume() throws RemoteException {
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
        if (transactAndReadException.readInt() != 0) {
            bundle.readFromParcel(transactAndReadException);
        }
        transactAndReadException.recycle();
    }

    public final void onStart() throws RemoteException {
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
    }

    public final void onStop() throws RemoteException {
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken());
    }

    public final void setEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        int i = C18936e.f42223a;
        obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    public final void updateMaskedWallet(MaskedWallet maskedWallet) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, maskedWallet);
        transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
    }

    public final void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, maskedWalletRequest);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    public final void zza(IObjectWrapper iObjectWrapper, WalletFragmentOptions walletFragmentOptions, Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32029b(obtainAndWriteInterfaceToken, iObjectWrapper);
        C18936e.m32030c(obtainAndWriteInterfaceToken, walletFragmentOptions);
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
