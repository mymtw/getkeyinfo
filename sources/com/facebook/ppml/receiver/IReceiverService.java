package com.facebook.ppml.receiver;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IReceiverService extends IInterface {

    public static class Default implements IReceiverService {
        public IBinder asBinder() {
            return null;
        }

        public int sendEvents(Bundle bundle) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IReceiverService {
        private static final String DESCRIPTOR = "com.facebook.ppml.receiver.IReceiverService";
        public static final int TRANSACTION_sendEvents = 1;

        /* renamed from: com.facebook.ppml.receiver.IReceiverService$Stub$a */
        public static class C12337a implements IReceiverService {

            /* renamed from: b */
            public static IReceiverService f27495b;

            /* renamed from: a */
            public IBinder f27496a;

            public C12337a(IBinder iBinder) {
                this.f27496a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f27496a;
            }

            public final int sendEvents(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f27496a.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendEvents(bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IReceiverService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IReceiverService)) ? new C12337a(iBinder) : (IReceiverService) queryLocalInterface;
        }

        public static IReceiverService getDefaultImpl() {
            return C12337a.f27495b;
        }

        public static boolean setDefaultImpl(IReceiverService iReceiverService) {
            if (C12337a.f27495b != null || iReceiverService == null) {
                return false;
            }
            C12337a.f27495b = iReceiverService;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int sendEvents = sendEvents(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(sendEvents);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    int sendEvents(Bundle bundle) throws RemoteException;
}
