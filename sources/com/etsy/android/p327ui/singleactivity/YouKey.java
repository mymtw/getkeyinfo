package com.etsy.android.p327ui.singleactivity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.you.YouFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.singleactivity.YouKey */
public final class YouKey extends MultistackFragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<YouKey> CREATOR = new Creator();
    private final String placeholder;

    /* renamed from: com.etsy.android.ui.singleactivity.YouKey$Creator */
    public static final class Creator implements Parcelable.Creator<YouKey> {
        public final YouKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new YouKey(parcel.readString());
        }

        public final YouKey[] newArray(int i) {
            return new YouKey[i];
        }
    }

    public YouKey() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public YouKey(String str) {
        C19383o.m32797g(str, "placeholder");
        this.placeholder = str;
    }

    private final String component1() {
        return this.placeholder;
    }

    public static /* synthetic */ YouKey copy$default(YouKey youKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = youKey.placeholder;
        }
        return youKey.copy(str);
    }

    public final YouKey copy(String str) {
        C19383o.m32797g(str, "placeholder");
        return new YouKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YouKey) && C19383o.m32792b(this.placeholder, ((YouKey) obj).placeholder);
    }

    public String fragmentClassName() {
        String canonicalName = YouFragment.class.getCanonicalName();
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
        return StackType.YOU.name();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("YouKey(placeholder="), this.placeholder, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.placeholder);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YouKey(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
