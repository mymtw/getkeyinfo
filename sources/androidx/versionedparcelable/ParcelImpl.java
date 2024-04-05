package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p205p2.C7653c;
import p205p2.C7654d;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C3320a();
    private final C7654d mParcel;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C3320a implements Parcelable.Creator<ParcelImpl> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final Object[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(C7654d dVar) {
        this.mParcel = dVar;
    }

    public int describeContents() {
        return 0;
    }

    public <T extends C7654d> T getVersionedParcel() {
        return this.mParcel;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C7653c(parcel).mo12569G(this.mParcel);
    }

    public ParcelImpl(Parcel parcel) {
        this.mParcel = new C7653c(parcel).mo12587r();
    }
}
