package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzaf extends IInterface {
    zzq zze(zzn zzn) throws RemoteException;

    boolean zzf(zzs zzs, IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzg() throws RemoteException;
}
