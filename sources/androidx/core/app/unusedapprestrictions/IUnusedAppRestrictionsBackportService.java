package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

public interface IUnusedAppRestrictionsBackportService extends IInterface {

    public static class Default implements IUnusedAppRestrictionsBackportService {
        public IBinder asBinder() {
            return null;
        }

        public void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {
        private static final String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
        public static final int TRANSACTION_isPermissionRevocationEnabledForApp = 1;

        /* renamed from: androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub$a */
        public static class C2266a implements IUnusedAppRestrictionsBackportService {

            /* renamed from: b */
            public static IUnusedAppRestrictionsBackportService f5511b;

            /* renamed from: a */
            public IBinder f5512a;

            public C2266a(IBinder iBinder) {
                this.f5512a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f5512a;
            }

            public final void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iUnusedAppRestrictionsBackportCallback != null ? iUnusedAppRestrictionsBackportCallback.asBinder() : null);
                    if (this.f5512a.transact(1, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().isPermissionRevocationEnabledForApp(iUnusedAppRestrictionsBackportCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IUnusedAppRestrictionsBackportService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) ? new C2266a(iBinder) : (IUnusedAppRestrictionsBackportService) queryLocalInterface;
        }

        public static IUnusedAppRestrictionsBackportService getDefaultImpl() {
            return C2266a.f5511b;
        }

        public static boolean setDefaultImpl(IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportService) {
            if (C2266a.f5511b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iUnusedAppRestrictionsBackportService == null) {
                return false;
            } else {
                C2266a.f5511b = iUnusedAppRestrictionsBackportService;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException;
}
