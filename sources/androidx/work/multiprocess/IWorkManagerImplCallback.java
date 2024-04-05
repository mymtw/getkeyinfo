package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IWorkManagerImplCallback extends IInterface {

    public static class Default implements IWorkManagerImplCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onFailure(String str) throws RemoteException {
        }

        public void onSuccess(byte[] bArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {
        private static final String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImplCallback";
        public static final int TRANSACTION_onFailure = 2;
        public static final int TRANSACTION_onSuccess = 1;

        /* renamed from: androidx.work.multiprocess.IWorkManagerImplCallback$Stub$a */
        public static class C3428a implements IWorkManagerImplCallback {

            /* renamed from: b */
            public static IWorkManagerImplCallback f8033b;

            /* renamed from: a */
            public IBinder f8034a;

            public C3428a(IBinder iBinder) {
                this.f8034a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f8034a;
            }

            public final void onFailure(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.f8034a.transact(2, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onFailure(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public final void onSuccess(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (this.f8034a.transact(1, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onSuccess(bArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IWorkManagerImplCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IWorkManagerImplCallback)) ? new C3428a(iBinder) : (IWorkManagerImplCallback) queryLocalInterface;
        }

        public static IWorkManagerImplCallback getDefaultImpl() {
            return C3428a.f8033b;
        }

        public static boolean setDefaultImpl(IWorkManagerImplCallback iWorkManagerImplCallback) {
            if (C3428a.f8033b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iWorkManagerImplCallback == null) {
                return false;
            } else {
                C3428a.f8033b = iWorkManagerImplCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.createByteArray());
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFailure(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onFailure(String str) throws RemoteException;

    void onSuccess(byte[] bArr) throws RemoteException;
}
