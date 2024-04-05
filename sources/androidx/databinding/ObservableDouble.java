package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableDouble extends C2440b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new C2418a();
    public static final long serialVersionUID = 1;
    private double mValue;

    /* renamed from: androidx.databinding.ObservableDouble$a */
    public class C2418a implements Parcelable.Creator<ObservableDouble> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        public final Object[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    public ObservableDouble(double d) {
        this.mValue = d;
    }

    public int describeContents() {
        return 0;
    }

    public double get() {
        return this.mValue;
    }

    public void set(double d) {
        if (d != this.mValue) {
            this.mValue = d;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mValue);
    }

    public ObservableDouble() {
    }

    public ObservableDouble(C2451i... iVarArr) {
        super(iVarArr);
    }
}
