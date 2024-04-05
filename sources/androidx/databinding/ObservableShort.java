package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableShort extends C2440b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new C2423a();
    public static final long serialVersionUID = 1;
    private short mValue;

    /* renamed from: androidx.databinding.ObservableShort$a */
    public class C2423a implements Parcelable.Creator<ObservableShort> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new ObservableShort[i];
        }
    }

    public ObservableShort(short s) {
        this.mValue = s;
    }

    public int describeContents() {
        return 0;
    }

    public short get() {
        return this.mValue;
    }

    public void set(short s) {
        if (s != this.mValue) {
            this.mValue = s;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    public ObservableShort() {
    }

    public ObservableShort(C2451i... iVarArr) {
        super(iVarArr);
    }
}
