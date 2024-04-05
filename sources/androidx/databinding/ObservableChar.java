package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableChar extends C2440b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new C2417a();
    public static final long serialVersionUID = 1;
    private char mValue;

    /* renamed from: androidx.databinding.ObservableChar$a */
    public class C2417a implements Parcelable.Creator<ObservableChar> {
        public final Object createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new ObservableChar[i];
        }
    }

    public ObservableChar(char c) {
        this.mValue = c;
    }

    public int describeContents() {
        return 0;
    }

    public char get() {
        return this.mValue;
    }

    public void set(char c) {
        if (c != this.mValue) {
            this.mValue = c;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    public ObservableChar() {
    }

    public ObservableChar(C2451i... iVarArr) {
        super(iVarArr);
    }
}
