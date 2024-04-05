package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C2692a();

    /* renamed from: b */
    public final ArrayList f6078b;

    /* renamed from: c */
    public final ArrayList f6079c;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    public class C2692a implements Parcelable.Creator<BackStackState> {
        public final Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public final Object[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f6078b = parcel.createStringArrayList();
        this.f6079c = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f6078b);
        parcel.writeTypedList(this.f6079c);
    }
}
