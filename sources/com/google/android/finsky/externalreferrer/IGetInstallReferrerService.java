package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.p074a.C6491a;
import com.google.android.p074a.C6492b;
import p011ah.C0049a;

public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends C6492b implements IGetInstallReferrerService {

        public static class Proxy extends C6491a implements IGetInstallReferrerService {
            public Proxy(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: c */
            public final Bundle mo48218c(Bundle bundle) throws RemoteException {
                Parcel a = mo18532a();
                int i = C0049a.f128a;
                a.writeInt(1);
                bundle.writeToParcel(a, 0);
                Parcel b = mo18534b(a);
                Bundle bundle2 = (Bundle) (b.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(b));
                b.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m22876b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) queryLocalInterface : new Proxy(iBinder);
        }

        /* renamed from: a */
        public final boolean mo18535a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i2 = C0049a.f128a;
            Bundle c = mo48218c((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
            parcel2.writeNoException();
            if (c == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                c.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }

    /* renamed from: c */
    Bundle mo48218c(Bundle bundle) throws RemoteException;
}
