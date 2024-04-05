package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzad extends zzl implements zzae {
    public zzad() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzb((Bundle) C15696h0.m25522a(parcel, Bundle.CREATOR));
        return true;
    }
}
