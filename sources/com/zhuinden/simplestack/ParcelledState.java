package com.zhuinden.simplestack;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.zhuinden.statebundle.StateBundle;

class ParcelledState implements Parcelable {
    public static final Parcelable.Creator<ParcelledState> CREATOR = new C17515a();

    /* renamed from: b */
    public Parcelable f38308b;

    /* renamed from: c */
    public SparseArray<Parcelable> f38309c;

    /* renamed from: d */
    public StateBundle f38310d;

    /* renamed from: e */
    public StateBundle f38311e;

    /* renamed from: com.zhuinden.simplestack.ParcelledState$a */
    public class C17515a implements Parcelable.Creator<ParcelledState> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelledState(parcel);
        }

        public final Object[] newArray(int i) {
            return new ParcelledState[i];
        }
    }

    public ParcelledState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f38308b, i);
        parcel.writeSparseArray(this.f38309c);
        byte b = 1;
        parcel.writeByte(this.f38310d != null ? (byte) 1 : 0);
        StateBundle stateBundle = this.f38310d;
        if (stateBundle != null) {
            parcel.writeParcelable(stateBundle, 0);
        }
        if (this.f38311e == null) {
            b = 0;
        }
        parcel.writeByte(b);
        StateBundle stateBundle2 = this.f38311e;
        if (stateBundle2 != null) {
            parcel.writeParcelable(stateBundle2, 0);
        }
    }

    public ParcelledState(Parcel parcel) {
        this.f38308b = parcel.readParcelable(getClass().getClassLoader());
        this.f38309c = parcel.readSparseArray(getClass().getClassLoader());
        boolean z = true;
        if (parcel.readByte() > 0) {
            this.f38310d = (StateBundle) parcel.readParcelable(getClass().getClassLoader());
        }
        if (parcel.readByte() <= 0 ? false : z) {
            this.f38311e = (StateBundle) parcel.readParcelable(getClass().getClassLoader());
        }
    }
}
