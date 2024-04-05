package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.etsy.android.p327ui.discover.DiscoverFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.DiscoverKey */
public final class DiscoverKey implements FragmentNavigationKey {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DiscoverKey> CREATOR = new Creator();
    private final LandingPageInfo pageInfo;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.DiscoverKey$Creator */
    public static final class Creator implements Parcelable.Creator<DiscoverKey> {
        public final DiscoverKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new DiscoverKey(parcel.readString(), (LandingPageInfo) parcel.readSerializable());
        }

        public final DiscoverKey[] newArray(int i) {
            return new DiscoverKey[i];
        }
    }

    public DiscoverKey(String str, LandingPageInfo landingPageInfo) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(landingPageInfo, "pageInfo");
        this.referrer = str;
        this.pageInfo = landingPageInfo;
    }

    public static /* synthetic */ DiscoverKey copy$default(DiscoverKey discoverKey, String str, LandingPageInfo landingPageInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discoverKey.getReferrer();
        }
        if ((i & 2) != 0) {
            landingPageInfo = discoverKey.pageInfo;
        }
        return discoverKey.copy(str, landingPageInfo);
    }

    public final String component1() {
        return getReferrer();
    }

    public final LandingPageInfo component2() {
        return this.pageInfo;
    }

    public final DiscoverKey copy(String str, LandingPageInfo landingPageInfo) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(landingPageInfo, "pageInfo");
        return new DiscoverKey(str, landingPageInfo);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverKey)) {
            return false;
        }
        DiscoverKey discoverKey = (DiscoverKey) obj;
        return C19383o.m32792b(getReferrer(), discoverKey.getReferrer()) && C19383o.m32792b(this.pageInfo, discoverKey.pageInfo);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = DiscoverFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        int storeDataForKey = storeDataForKey(this.pageInfo);
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("transaction-data", Integer.valueOf(storeDataForKey));
        return fVar;
    }

    public final LandingPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        return this.pageInfo.hashCode() + (getReferrer().hashCode() * 31);
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
        StringBuilder h = C0072d.m201h("DiscoverKey(referrer=");
        h.append(getReferrer());
        h.append(", pageInfo=");
        h.append(this.pageInfo);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.pageInfo);
    }
}
