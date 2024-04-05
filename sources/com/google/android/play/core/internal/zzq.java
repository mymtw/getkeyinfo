package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzq extends zzl implements zzr {
    public zzq() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            zzb((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
