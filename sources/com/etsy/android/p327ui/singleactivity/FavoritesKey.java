package com.etsy.android.p327ui.singleactivity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.favorites.FavoritesTabsContainerFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.singleactivity.FavoritesKey */
public final class FavoritesKey extends MultistackFragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FavoritesKey> CREATOR = new Creator();
    private final String placeholder;

    /* renamed from: com.etsy.android.ui.singleactivity.FavoritesKey$Creator */
    public static final class Creator implements Parcelable.Creator<FavoritesKey> {
        public final FavoritesKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new FavoritesKey(parcel.readString());
        }

        public final FavoritesKey[] newArray(int i) {
            return new FavoritesKey[i];
        }
    }

    public FavoritesKey() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FavoritesKey(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    private final String component1() {
        return this.placeholder;
    }

    public static /* synthetic */ FavoritesKey copy$default(FavoritesKey favoritesKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = favoritesKey.placeholder;
        }
        return favoritesKey.copy(str);
    }

    public final FavoritesKey copy(String str) {
        C19383o.m32797g(str, "placeholder");
        return new FavoritesKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FavoritesKey) && C19383o.m32792b(this.placeholder, ((FavoritesKey) obj).placeholder);
    }

    public String fragmentClassName() {
        String canonicalName = FavoritesTabsContainerFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public int hashCode() {
        return this.placeholder.hashCode();
    }

    public boolean isSingleTop() {
        return true;
    }

    public String stackIdentifier() {
        return StackType.FAVORITES.name();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("FavoritesKey(placeholder="), this.placeholder, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.placeholder);
    }

    public FavoritesKey(String str) {
        C19383o.m32797g(str, "placeholder");
        this.placeholder = str;
    }
}
