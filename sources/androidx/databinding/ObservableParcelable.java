package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;

public class ObservableParcelable<T extends Parcelable> extends ObservableField<T> implements Parcelable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new C2422a();
    public static final long serialVersionUID = 1;

    /* renamed from: androidx.databinding.ObservableParcelable$a */
    public class C2422a implements Parcelable.Creator<ObservableParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(C2422a.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) get(), 0);
    }

    public ObservableParcelable() {
    }
}
