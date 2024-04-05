package androidx.test.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.internal.platform.ThreadChecker;

public class ParcelableIBinder implements Parcelable {
    public static final Parcelable.Creator<ParcelableIBinder> CREATOR = new Parcelable.Creator<ParcelableIBinder>() {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableIBinder(parcel);
        }

        public final Object[] newArray(int i) {
            return new ParcelableIBinder[i];
        }
    };
    private final IBinder iBinder;

    public ParcelableIBinder(IBinder iBinder2) {
        ThreadChecker threadChecker = Checks.f7689a;
        iBinder2.getClass();
        this.iBinder = iBinder2;
    }

    public int describeContents() {
        return 0;
    }

    public IBinder getIBinder() {
        return this.iBinder;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.iBinder);
    }

    public ParcelableIBinder(Parcel parcel) {
        this.iBinder = parcel.readStrongBinder();
    }
}
