package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.push.BOENotificationSettingsFragment;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.NotificationSettingsKey */
public final class NotificationSettingsKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationSettingsKey> CREATOR = new Creator();
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.NotificationSettingsKey$Creator */
    public static final class Creator implements Parcelable.Creator<NotificationSettingsKey> {
        public final NotificationSettingsKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new NotificationSettingsKey(parcel.readString(), parcel.readBundle());
        }

        public final NotificationSettingsKey[] newArray(int i) {
            return new NotificationSettingsKey[i];
        }
    }

    public NotificationSettingsKey(String str, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ NotificationSettingsKey copy$default(NotificationSettingsKey notificationSettingsKey, String str, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationSettingsKey.getReferrer();
        }
        if ((i & 2) != 0) {
            bundle = notificationSettingsKey.getReferrerBundle();
        }
        return notificationSettingsKey.copy(str, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Bundle component2() {
        return getReferrerBundle();
    }

    public final NotificationSettingsKey copy(String str, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new NotificationSettingsKey(str, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationSettingsKey)) {
            return false;
        }
        NotificationSettingsKey notificationSettingsKey = (NotificationSettingsKey) obj;
        return C19383o.m32792b(getReferrer(), notificationSettingsKey.getReferrer()) && C19383o.m32792b(getReferrerBundle(), notificationSettingsKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C15562d();
    }

    public String getClazzName() {
        String canonicalName = BOENotificationSettingsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public int hashCode() {
        return (getReferrer().hashCode() * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode());
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isForciblyAddedToCurrentStack() {
        return false;
    }

    public boolean shouldReplaceTop() {
        return false;
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("NotificationSettingsKey(referrer=");
        h.append(getReferrer());
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationSettingsKey(String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle);
    }
}
