package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableByte extends C2440b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new C2416a();
    public static final long serialVersionUID = 1;
    private byte mValue;

    /* renamed from: androidx.databinding.ObservableByte$a */
    public class C2416a implements Parcelable.Creator<ObservableByte> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        public final Object[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    public ObservableByte(byte b) {
        this.mValue = b;
    }

    public int describeContents() {
        return 0;
    }

    public byte get() {
        return this.mValue;
    }

    public void set(byte b) {
        if (b != this.mValue) {
            this.mValue = b;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mValue);
    }

    public ObservableByte() {
    }

    public ObservableByte(C2451i... iVarArr) {
        super(iVarArr);
    }
}
