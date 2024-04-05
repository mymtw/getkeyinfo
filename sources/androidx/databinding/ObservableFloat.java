package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableFloat extends C2440b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new C2419a();
    public static final long serialVersionUID = 1;
    private float mValue;

    /* renamed from: androidx.databinding.ObservableFloat$a */
    public class C2419a implements Parcelable.Creator<ObservableFloat> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        public final Object[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    public ObservableFloat(float f) {
        this.mValue = f;
    }

    public int describeContents() {
        return 0;
    }

    public float get() {
        return this.mValue;
    }

    public void set(float f) {
        if (f != this.mValue) {
            this.mValue = f;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }

    public ObservableFloat() {
    }

    public ObservableFloat(C2451i... iVarArr) {
        super(iVarArr);
    }
}
