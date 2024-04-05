package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.HomePagerKey */
public final class HomePagerKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomePagerKey> CREATOR = new Creator();
    private final boolean forceClearBackstack;
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.HomePagerKey$Creator */
    public static final class Creator implements Parcelable.Creator<HomePagerKey> {
        public final HomePagerKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new HomePagerKey(parcel.readString(), parcel.readBundle(), parcel.readInt() != 0);
        }

        public final HomePagerKey[] newArray(int i) {
            return new HomePagerKey[i];
        }
    }

    public HomePagerKey(String str, Bundle bundle, boolean z) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.referrerBundle = bundle;
        this.forceClearBackstack = z;
    }

    public static /* synthetic */ HomePagerKey copy$default(HomePagerKey homePagerKey, String str, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homePagerKey.getReferrer();
        }
        if ((i & 2) != 0) {
            bundle = homePagerKey.getReferrerBundle();
        }
        if ((i & 4) != 0) {
            z = homePagerKey.forceClearBackstack;
        }
        return homePagerKey.copy(str, bundle, z);
    }

    public final String component1() {
        return getReferrer();
    }

    public final Bundle component2() {
        return getReferrerBundle();
    }

    public final boolean component3() {
        return this.forceClearBackstack;
    }

    public final HomePagerKey copy(String str, Bundle bundle, boolean z) {
        C19383o.m32797g(str, "referrer");
        return new HomePagerKey(str, bundle, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomePagerKey)) {
            return false;
        }
        HomePagerKey homePagerKey = (HomePagerKey) obj;
        return C19383o.m32792b(getReferrer(), homePagerKey.getReferrer()) && C19383o.m32792b(getReferrerBundle(), homePagerKey.getReferrerBundle()) && this.forceClearBackstack == homePagerKey.forceClearBackstack;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C1993m();
    }

    public String getClazzName() {
        String canonicalName = HomePagerFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return this.forceClearBackstack;
    }

    public final boolean getForceClearBackstack() {
        return this.forceClearBackstack;
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
        int hashCode = ((getReferrer().hashCode() * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode())) * 31;
        boolean z = this.forceClearBackstack;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
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
        StringBuilder h = C0072d.m201h("HomePagerKey(referrer=");
        h.append(getReferrer());
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(", forceClearBackstack=");
        return C0391c.m1058d(h, this.forceClearBackstack, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeBundle(this.referrerBundle);
        parcel.writeInt(this.forceClearBackstack ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomePagerKey(String str, Bundle bundle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? false : z);
    }
}
