package p703wj;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wj.n */
public final class C18711n {

    /* renamed from: a */
    public static final /* synthetic */ int f41464a = 0;

    static {
        C18711n.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m31555a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m31556b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m31557c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
