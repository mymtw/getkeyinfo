package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import p727zj.C18936e;

public final class zzt extends zza implements zzs {
    public zzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void zza(MaskedWalletRequest maskedWalletRequest, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, maskedWalletRequest);
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        C18936e.m32029b(obtainAndWriteInterfaceToken, zzw);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }

    public final void zza(FullWalletRequest fullWalletRequest, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, fullWalletRequest);
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        C18936e.m32029b(obtainAndWriteInterfaceToken, zzw);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }

    public final void zza(String str, String str2, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        C18936e.m32029b(obtainAndWriteInterfaceToken, zzw);
        transactOneway(3, obtainAndWriteInterfaceToken);
    }

    public final void zza(Bundle bundle, zzw zzw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        C18936e.m32029b(obtainAndWriteInterfaceToken, zzw);
        transactOneway(5, obtainAndWriteInterfaceToken);
    }

    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, createWalletObjectsRequest);
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        C18936e.m32029b(obtainAndWriteInterfaceToken, zzw);
        transactOneway(6, obtainAndWriteInterfaceToken);
    }

    public final void zza(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, isReadyToPayRequest);
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        C18936e.m32029b(obtainAndWriteInterfaceToken, zzw);
        transactOneway(14, obtainAndWriteInterfaceToken);
    }

    public final void zza(PaymentDataRequest paymentDataRequest, Bundle bundle, zzw zzw) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C18936e.m32030c(obtainAndWriteInterfaceToken, paymentDataRequest);
        C18936e.m32030c(obtainAndWriteInterfaceToken, bundle);
        C18936e.m32029b(obtainAndWriteInterfaceToken, zzw);
        transactOneway(19, obtainAndWriteInterfaceToken);
    }
}
