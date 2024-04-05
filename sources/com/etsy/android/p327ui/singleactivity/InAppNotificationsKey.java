package com.etsy.android.p327ui.singleactivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.user.inappnotifications.InAppNotificationsFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.singleactivity.InAppNotificationsKey */
public final class InAppNotificationsKey extends MultistackFragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InAppNotificationsKey> CREATOR = new Creator();
    private final String placeholder;

    /* renamed from: com.etsy.android.ui.singleactivity.InAppNotificationsKey$Creator */
    public static final class Creator implements Parcelable.Creator<InAppNotificationsKey> {
        public final InAppNotificationsKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new InAppNotificationsKey(parcel.readString());
        }

        public final InAppNotificationsKey[] newArray(int i) {
            return new InAppNotificationsKey[i];
        }
    }

    public InAppNotificationsKey() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationsKey(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    private final String component1() {
        return this.placeholder;
    }

    public static /* synthetic */ InAppNotificationsKey copy$default(InAppNotificationsKey inAppNotificationsKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppNotificationsKey.placeholder;
        }
        return inAppNotificationsKey.copy(str);
    }

    public final InAppNotificationsKey copy(String str) {
        C19383o.m32797g(str, "placeholder");
        return new InAppNotificationsKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppNotificationsKey) && C19383o.m32792b(this.placeholder, ((InAppNotificationsKey) obj).placeholder);
    }

    public String fragmentClassName() {
        String canonicalName = InAppNotificationsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public Bundle getArguments() {
        return null;
    }

    public int hashCode() {
        return this.placeholder.hashCode();
    }

    public String stackIdentifier() {
        return StackType.NOTIFICATIONS.name();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("InAppNotificationsKey(placeholder="), this.placeholder, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.placeholder);
    }

    public InAppNotificationsKey(String str) {
        C19383o.m32797g(str, "placeholder");
        this.placeholder = str;
    }
}
