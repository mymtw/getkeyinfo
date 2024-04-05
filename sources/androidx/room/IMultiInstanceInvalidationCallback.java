package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IMultiInstanceInvalidationCallback extends IInterface {

    public static class Default implements IMultiInstanceInvalidationCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onInvalidation(String[] strArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {
        private static final String DESCRIPTOR = "androidx.room.IMultiInstanceInvalidationCallback";
        public static final int TRANSACTION_onInvalidation = 1;

        /* renamed from: androidx.room.IMultiInstanceInvalidationCallback$Stub$a */
        public static class C3209a implements IMultiInstanceInvalidationCallback {

            /* renamed from: b */
            public static IMultiInstanceInvalidationCallback f7454b;

            /* renamed from: a */
            public IBinder f7455a;

            public C3209a(IBinder iBinder) {
                this.f7455a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f7455a;
            }

            public final void onInvalidation(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    if (this.f7455a.transact(1, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onInvalidation(strArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMultiInstanceInvalidationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) ? new C3209a(iBinder) : (IMultiInstanceInvalidationCallback) queryLocalInterface;
        }

        public static IMultiInstanceInvalidationCallback getDefaultImpl() {
            return C3209a.f7454b;
        }

        public static boolean setDefaultImpl(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback) {
            if (C3209a.f7454b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iMultiInstanceInvalidationCallback == null) {
                return false;
            } else {
                C3209a.f7454b = iMultiInstanceInvalidationCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onInvalidation(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onInvalidation(String[] strArr) throws RemoteException;
}
