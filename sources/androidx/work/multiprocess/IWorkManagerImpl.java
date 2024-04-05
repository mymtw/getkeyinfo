package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.multiprocess.IWorkManagerImplCallback;

public interface IWorkManagerImpl extends IInterface {

    public static class Default implements IWorkManagerImpl {
        public IBinder asBinder() {
            return null;
        }

        public void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        public void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        public void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        public void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        public void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        public void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        public void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }

        public void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImpl {
        private static final String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImpl";
        public static final int TRANSACTION_cancelAllWork = 6;
        public static final int TRANSACTION_cancelAllWorkByTag = 4;
        public static final int TRANSACTION_cancelUniqueWork = 5;
        public static final int TRANSACTION_cancelWorkById = 3;
        public static final int TRANSACTION_enqueueContinuation = 2;
        public static final int TRANSACTION_enqueueWorkRequests = 1;
        public static final int TRANSACTION_queryWorkInfo = 7;
        public static final int TRANSACTION_setProgress = 8;

        /* renamed from: androidx.work.multiprocess.IWorkManagerImpl$Stub$a */
        public static class C3427a implements IWorkManagerImpl {

            /* renamed from: b */
            public static IWorkManagerImpl f8031b;

            /* renamed from: a */
            public IBinder f8032a;

            public C3427a(IBinder iBinder) {
                this.f8032a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f8032a;
            }

            public final void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f8032a.transact(6, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().cancelAllWork(iWorkManagerImplCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public final void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f8032a.transact(4, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().cancelAllWorkByTag(str, iWorkManagerImplCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public final void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f8032a.transact(5, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().cancelUniqueWork(str, iWorkManagerImplCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public final void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f8032a.transact(3, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().cancelWorkById(str, iWorkManagerImplCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public final void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f8032a.transact(2, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().enqueueContinuation(bArr, iWorkManagerImplCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public final void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f8032a.transact(1, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().enqueueWorkRequests(bArr, iWorkManagerImplCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public final void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f8032a.transact(7, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().queryWorkInfo(bArr, iWorkManagerImplCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public final void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(iWorkManagerImplCallback != null ? iWorkManagerImplCallback.asBinder() : null);
                    if (this.f8032a.transact(8, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().setProgress(bArr, iWorkManagerImplCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IWorkManagerImpl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IWorkManagerImpl)) ? new C3427a(iBinder) : (IWorkManagerImpl) queryLocalInterface;
        }

        public static IWorkManagerImpl getDefaultImpl() {
            return C3427a.f8031b;
        }

        public static boolean setDefaultImpl(IWorkManagerImpl iWorkManagerImpl) {
            if (C3427a.f8031b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iWorkManagerImpl == null) {
                return false;
            } else {
                C3427a.f8031b = iWorkManagerImpl;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        enqueueWorkRequests(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        enqueueContinuation(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        cancelWorkById(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        cancelAllWorkByTag(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        cancelUniqueWork(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        cancelAllWork(IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        queryWorkInfo(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        setProgress(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void cancelAllWorkByTag(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void cancelUniqueWork(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void cancelWorkById(String str, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void enqueueContinuation(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void enqueueWorkRequests(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void queryWorkInfo(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;

    void setProgress(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException;
}
