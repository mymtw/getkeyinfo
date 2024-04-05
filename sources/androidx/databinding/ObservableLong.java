package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableLong extends C2440b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new C2421a();
    public static final long serialVersionUID = 1;
    private long mValue;

    /* renamed from: androidx.databinding.ObservableLong$a */
    public class C2421a implements Parcelable.Creator<ObservableLong> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        public final Object[] newArray(int i) {
            return new ObservableLong[i];
        }
    }

    public ObservableLong(long j) {
        this.mValue = j;
    }

    public int describeContents() {
        return 0;
    }

    public long get() {
        return this.mValue;
    }

    public void set(long j) {
        if (j != this.mValue) {
            this.mValue = j;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mValue);
    }

    public ObservableLong() {
    }

    public ObservableLong(C2451i... iVarArr) {
        super(iVarArr);
    }
}
