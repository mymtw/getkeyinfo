package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.zzas;
import p727zj.C18936e;

public abstract class zzx extends zzb implements zzw {
    public zzx() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z = false;
        switch (i) {
            case 1:
                zza(parcel.readInt(), (MaskedWallet) C18936e.m32028a(parcel, MaskedWallet.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 2:
                zza(parcel.readInt(), (FullWallet) C18936e.m32028a(parcel, FullWallet.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 3:
                int readInt = parcel.readInt();
                int i3 = C18936e.f42223a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                zza(readInt, z, (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 4:
                zza(parcel.readInt(), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 6:
                int readInt2 = parcel.readInt();
                int i4 = C18936e.f42223a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                zzb(readInt2, z, (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 7:
                zza((Status) C18936e.m32028a(parcel, Status.CREATOR), (zzh) C18936e.m32028a(parcel, zzh.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 8:
                zza((Status) C18936e.m32028a(parcel, Status.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 9:
                Status status = (Status) C18936e.m32028a(parcel, Status.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                zza(status, z, (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 10:
                zza((Status) C18936e.m32028a(parcel, Status.CREATOR), (zzj) C18936e.m32028a(parcel, zzj.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 11:
                zzb((Status) C18936e.m32028a(parcel, Status.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 12:
                zza((Status) C18936e.m32028a(parcel, Status.CREATOR), (zzas) C18936e.m32028a(parcel, zzas.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 13:
                zzc((Status) C18936e.m32028a(parcel, Status.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 14:
                zza((Status) C18936e.m32028a(parcel, Status.CREATOR), (PaymentData) C18936e.m32028a(parcel, PaymentData.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            case 15:
                zza((Status) C18936e.m32028a(parcel, Status.CREATOR), (zzl) C18936e.m32028a(parcel, zzl.CREATOR), (Bundle) C18936e.m32028a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
