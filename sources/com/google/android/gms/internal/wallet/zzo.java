package com.google.android.gms.internal.wallet;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzo extends zzb implements zzn {
    public static zzn zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
        return queryLocalInterface instanceof zzn ? (zzn) queryLocalInterface : new zzp(iBinder);
    }
}
