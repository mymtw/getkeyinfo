package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C2945a();

    /* renamed from: b */
    public final UUID f6659b;

    /* renamed from: c */
    public final int f6660c;

    /* renamed from: d */
    public final Bundle f6661d;

    /* renamed from: e */
    public final Bundle f6662e;

    /* renamed from: androidx.navigation.NavBackStackEntryState$a */
    public class C2945a implements Parcelable.Creator<NavBackStackEntryState> {
        public final Object createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        public final Object[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    public NavBackStackEntryState(C2953d dVar) {
        this.f6659b = dVar.f6693g;
        this.f6660c = dVar.f6689c.f6728d;
        this.f6661d = dVar.f6690d;
        Bundle bundle = new Bundle();
        this.f6662e = bundle;
        dVar.f6692f.mo12064b(bundle);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6659b.toString());
        parcel.writeInt(this.f6660c);
        parcel.writeBundle(this.f6661d);
        parcel.writeBundle(this.f6662e);
    }

    public NavBackStackEntryState(Parcel parcel) {
        this.f6659b = UUID.fromString(parcel.readString());
        this.f6660c = parcel.readInt();
        this.f6661d = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.f6662e = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }
}
