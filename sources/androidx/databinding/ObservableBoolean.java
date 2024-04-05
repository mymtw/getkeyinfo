package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableBoolean extends C2440b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new C2415a();
    public static final long serialVersionUID = 1;
    private boolean mValue;

    /* renamed from: androidx.databinding.ObservableBoolean$a */
    public class C2415a implements Parcelable.Creator<ObservableBoolean> {
        public final Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ObservableBoolean(z);
        }

        public final Object[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    }

    public ObservableBoolean(boolean z) {
        this.mValue = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean get() {
        return this.mValue;
    }

    public void set(boolean z) {
        if (z != this.mValue) {
            this.mValue = z;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue ? 1 : 0);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(C2451i... iVarArr) {
        super(iVarArr);
    }
}
