package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import p671sj.C18512b;

public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.base.zaa implements IStatusCallback {

        public static class zaa extends zab implements IStatusCallback {
            public zaa(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
            }

            public final void onResult(Status status) throws RemoteException {
                Parcel zaa = zaa();
                C18512b.m31229c(zaa, status);
                zac(1, zaa);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @RecentlyNonNull
        public static IStatusCallback asInterface(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof IStatusCallback ? (IStatusCallback) queryLocalInterface : new zaa(iBinder);
        }

        public final boolean zaa(int i, @RecentlyNonNull Parcel parcel, @RecentlyNonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            onResult((Status) C18512b.m31227a(parcel, Status.CREATOR));
            return true;
        }
    }

    void onResult(@RecentlyNonNull Status status) throws RemoteException;
}
