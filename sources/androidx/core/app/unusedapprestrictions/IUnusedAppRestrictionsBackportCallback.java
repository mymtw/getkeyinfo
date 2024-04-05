package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {
        private static final String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
        public static final int TRANSACTION_onIsPermissionRevocationEnabledForAppResult = 1;

        /* renamed from: androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback$Stub$a */
        public static class C2265a implements IUnusedAppRestrictionsBackportCallback {

            /* renamed from: b */
            public static IUnusedAppRestrictionsBackportCallback f5509b;

            /* renamed from: a */
            public IBinder f5510a;

            public C2265a(IBinder iBinder) {
                this.f5510a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f5510a;
            }

            public final void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    int i = 0;
                    obtain.writeInt(z ? 1 : 0);
                    if (z2) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    if (this.f5510a.transact(1, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onIsPermissionRevocationEnabledForAppResult(z, z2);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) ? new C2265a(iBinder) : (IUnusedAppRestrictionsBackportCallback) queryLocalInterface;
        }

        public static IUnusedAppRestrictionsBackportCallback getDefaultImpl() {
            return C2265a.f5509b;
        }

        public static boolean setDefaultImpl(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
            if (C2265a.f5509b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iUnusedAppRestrictionsBackportCallback == null) {
                return false;
            } else {
                C2265a.f5509b = iUnusedAppRestrictionsBackportCallback;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                onIsPermissionRevocationEnabledForAppResult(z2, z);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException;
}
