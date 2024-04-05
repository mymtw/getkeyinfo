package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableInt extends C2440b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new C2420a();
    public static final long serialVersionUID = 1;
    private int mValue;

    /* renamed from: androidx.databinding.ObservableInt$a */
    public class C2420a implements Parcelable.Creator<ObservableInt> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    public ObservableInt(int i) {
        this.mValue = i;
    }

    public int describeContents() {
        return 0;
    }

    public int get() {
        return this.mValue;
    }

    public void set(int i) {
        if (i != this.mValue) {
            this.mValue = i;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    public ObservableInt() {
    }

    public ObservableInt(C2451i... iVarArr) {
        super(iVarArr);
    }
}
