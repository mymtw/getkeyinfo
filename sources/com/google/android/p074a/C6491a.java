package com.google.android.p074a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
public class C6491a implements IInterface {

    /* renamed from: a */
    private final IBinder f14396a;

    /* renamed from: b */
    private final String f14397b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public C6491a(IBinder iBinder) {
        this.f14396a = iBinder;
    }

    /* renamed from: a */
    public final Parcel mo18532a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14397b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f14396a;
    }

    /* renamed from: b */
    public final Parcel mo18534b(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f14396a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
