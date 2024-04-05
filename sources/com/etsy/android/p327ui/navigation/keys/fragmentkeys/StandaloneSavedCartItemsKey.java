package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.cart.saved.StandaloneSavedCartItemsFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.StandaloneSavedCartItemsKey */
public final class StandaloneSavedCartItemsKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StandaloneSavedCartItemsKey> CREATOR = new Creator();
    private final String clazzName;
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.StandaloneSavedCartItemsKey$Creator */
    public static final class Creator implements Parcelable.Creator<StandaloneSavedCartItemsKey> {
        public final StandaloneSavedCartItemsKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new StandaloneSavedCartItemsKey(parcel.readString(), parcel.readBundle());
        }

        public final StandaloneSavedCartItemsKey[] newArray(int i) {
            return new StandaloneSavedCartItemsKey[i];
        }
    }

    public StandaloneSavedCartItemsKey(String str, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.referrerBundle = bundle;
        String canonicalName = StandaloneSavedCartItemsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        this.clazzName = canonicalName;
    }

    public static /* synthetic */ StandaloneSavedCartItemsKey copy$default(StandaloneSavedCartItemsKey standaloneSavedCartItemsKey, String str, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = standaloneSavedCartItemsKey.getReferrer();
        }
        if ((i & 2) != 0) {
            bundle = standaloneSavedCartItemsKey.getReferrerBundle();
        }
        return standaloneSavedCartItemsKey.copy(str, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Bundle component2() {
        return getReferrerBundle();
    }

    public final StandaloneSavedCartItemsKey copy(String str, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new StandaloneSavedCartItemsKey(str, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandaloneSavedCartItemsKey)) {
            return false;
        }
        StandaloneSavedCartItemsKey standaloneSavedCartItemsKey = (StandaloneSavedCartItemsKey) obj;
        return C19383o.m32792b(getReferrer(), standaloneSavedCartItemsKey.getReferrer()) && C19383o.m32792b(getReferrerBundle(), standaloneSavedCartItemsKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C19388s();
    }

    public String getClazzName() {
        return this.clazzName;
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
        StringBuilder h = C0072d.m201h("StandaloneSavedCartItemsKey(referrer=");
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
    public /* synthetic */ StandaloneSavedCartItemsKey(String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle);
    }
}
