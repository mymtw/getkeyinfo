package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.user.profile.UserProfileFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p343ee.C12695c;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.UserProfileKey */
public final class UserProfileKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserProfileKey> CREATOR = new Creator();
    private final String referrer;
    private final Bundle referrerBundle;
    private final EtsyId userId;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.UserProfileKey$Creator */
    public static final class Creator implements Parcelable.Creator<UserProfileKey> {
        public final UserProfileKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new UserProfileKey(parcel.readString(), (EtsyId) parcel.readSerializable(), parcel.readBundle());
        }

        public final UserProfileKey[] newArray(int i) {
            return new UserProfileKey[i];
        }
    }

    public UserProfileKey(String str, EtsyId etsyId, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(etsyId, "userId");
        this.referrer = str;
        this.userId = etsyId;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ UserProfileKey copy$default(UserProfileKey userProfileKey, String str, EtsyId etsyId, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfileKey.getReferrer();
        }
        if ((i & 2) != 0) {
            etsyId = userProfileKey.userId;
        }
        if ((i & 4) != 0) {
            bundle = userProfileKey.getReferrerBundle();
        }
        return userProfileKey.copy(str, etsyId, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final EtsyId component2() {
        return this.userId;
    }

    public final Bundle component3() {
        return getReferrerBundle();
    }

    public final UserProfileKey copy(String str, EtsyId etsyId, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(etsyId, "userId");
        return new UserProfileKey(str, etsyId, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileKey)) {
            return false;
        }
        UserProfileKey userProfileKey = (UserProfileKey) obj;
        return C19383o.m32792b(getReferrer(), userProfileKey.getReferrer()) && C19383o.m32792b(this.userId, userProfileKey.userId) && C19383o.m32792b(getReferrerBundle(), userProfileKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C12695c(false);
    }

    public String getClazzName() {
        String canonicalName = UserProfileFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("user_id", this.userId.getId());
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

    public final EtsyId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return ((this.userId.hashCode() + (getReferrer().hashCode() * 31)) * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode());
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
        StringBuilder h = C0072d.m201h("UserProfileKey(referrer=");
        h.append(getReferrer());
        h.append(", userId=");
        h.append(this.userId);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.userId);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserProfileKey(String str, EtsyId etsyId, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, etsyId, (i & 4) != 0 ? null : bundle);
    }
}
