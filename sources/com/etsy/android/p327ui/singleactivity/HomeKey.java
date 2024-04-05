package com.etsy.android.p327ui.singleactivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.singleactivity.HomeKey */
public final class HomeKey extends MultistackFragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeKey> CREATOR = new Creator();
    private final Bundle args;
    private final String placeholder;

    /* renamed from: com.etsy.android.ui.singleactivity.HomeKey$Creator */
    public static final class Creator implements Parcelable.Creator<HomeKey> {
        public final HomeKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new HomeKey(parcel.readBundle(), parcel.readString());
        }

        public final HomeKey[] newArray(int i) {
            return new HomeKey[i];
        }
    }

    public HomeKey() {
        this((Bundle) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeKey(Bundle bundle, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle, (i & 2) != 0 ? "" : str);
    }

    private final Bundle component1() {
        return this.args;
    }

    private final String component2() {
        return this.placeholder;
    }

    public static /* synthetic */ HomeKey copy$default(HomeKey homeKey, Bundle bundle, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = homeKey.args;
        }
        if ((i & 2) != 0) {
            str = homeKey.placeholder;
        }
        return homeKey.copy(bundle, str);
    }

    public final HomeKey copy(Bundle bundle, String str) {
        C19383o.m32797g(str, "placeholder");
        return new HomeKey(bundle, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeKey)) {
            return false;
        }
        HomeKey homeKey = (HomeKey) obj;
        return C19383o.m32792b(this.args, homeKey.args) && C19383o.m32792b(this.placeholder, homeKey.placeholder);
    }

    public String fragmentClassName() {
        String canonicalName = HomePagerFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public Bundle getArguments() {
        return this.args;
    }

    public int hashCode() {
        Bundle bundle = this.args;
        return this.placeholder.hashCode() + ((bundle == null ? 0 : bundle.hashCode()) * 31);
    }

    public boolean isSingleTop() {
        return true;
    }

    public String stackIdentifier() {
        return StackType.HOME.name();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("HomeKey(args=");
        h.append(this.args);
        h.append(", placeholder=");
        return C0391c.m1057c(h, this.placeholder, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeBundle(this.args);
        parcel.writeString(this.placeholder);
    }

    public HomeKey(Bundle bundle, String str) {
        C19383o.m32797g(str, "placeholder");
        this.args = bundle;
        this.placeholder = str;
    }
}
