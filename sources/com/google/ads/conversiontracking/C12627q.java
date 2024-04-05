package com.google.ads.conversiontracking;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.ads.conversiontracking.q */
public interface C12627q extends IInterface {

    /* renamed from: com.google.ads.conversiontracking.q$a */
    public static abstract class C12628a extends Binder implements C12627q {

        /* renamed from: com.google.ads.conversiontracking.q$a$a */
        public static class C12629a implements C12627q {

            /* renamed from: a */
            public IBinder f27852a;

            public C12629a(IBinder iBinder) {
                this.f27852a = iBinder;
            }

            /* renamed from: a */
            public final String mo45410a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f27852a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final String mo45411a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeString(str);
                    this.f27852a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo45412a(String str, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f27852a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo45413a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    this.f27852a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f27852a;
            }
        }

        /* renamed from: a */
        public static C12627q m20305a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C12627q)) ? new C12629a(iBinder) : (C12627q) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                boolean z = false;
                if (i == 2) {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    boolean a = mo45413a(z);
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                } else if (i == 3) {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    String a2 = mo45411a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(a2);
                    return true;
                } else if (i == 4) {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo45412a(readString, z);
                    parcel2.writeNoException();
                    return true;
                } else if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel2.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    return true;
                }
            } else {
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                String a3 = mo45410a();
                parcel2.writeNoException();
                parcel2.writeString(a3);
                return true;
            }
        }
    }

    /* renamed from: a */
    String mo45410a() throws RemoteException;

    /* renamed from: a */
    String mo45411a(String str) throws RemoteException;

    /* renamed from: a */
    void mo45412a(String str, boolean z) throws RemoteException;

    /* renamed from: a */
    boolean mo45413a(boolean z) throws RemoteException;
}
