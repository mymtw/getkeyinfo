package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.p327ui.home.explore.ExploreFragment;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ExploreKey */
public final class ExploreKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExploreKey> CREATOR = new Creator();
    private final String apiPath;
    private final String referrer;
    private final Bundle referrerBundle;
    private final String title;
    private final String trackingName;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.ExploreKey$Creator */
    public static final class Creator implements Parcelable.Creator<ExploreKey> {
        public final ExploreKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ExploreKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readBundle());
        }

        public final ExploreKey[] newArray(int i) {
            return new ExploreKey[i];
        }
    }

    public ExploreKey(String str, String str2, String str3, String str4, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.title = str2;
        this.apiPath = str3;
        this.trackingName = str4;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ ExploreKey copy$default(ExploreKey exploreKey, String str, String str2, String str3, String str4, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exploreKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = exploreKey.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = exploreKey.apiPath;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = exploreKey.trackingName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bundle = exploreKey.getReferrerBundle();
        }
        return exploreKey.copy(str, str5, str6, str7, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.apiPath;
    }

    public final String component4() {
        return this.trackingName;
    }

    public final Bundle component5() {
        return getReferrerBundle();
    }

    public final ExploreKey copy(String str, String str2, String str3, String str4, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new ExploreKey(str, str2, str3, str4, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreKey)) {
            return false;
        }
        ExploreKey exploreKey = (ExploreKey) obj;
        return C19383o.m32792b(getReferrer(), exploreKey.getReferrer()) && C19383o.m32792b(this.title, exploreKey.title) && C19383o.m32792b(this.apiPath, exploreKey.apiPath) && C19383o.m32792b(this.trackingName, exploreKey.trackingName) && C19383o.m32792b(getReferrerBundle(), exploreKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public final String getApiPath() {
        return this.apiPath;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = ExploreFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        int storeDataForKey = storeDataForKey(new HomeTab(this.title, this.apiPath, this.trackingName));
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put(HomePagerFragment.IS_EXPLORE, Boolean.TRUE);
        fVar.f28304a.put("title", this.title);
        fVar.f28304a.put("transaction-data", Integer.valueOf(storeDataForKey));
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

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingName() {
        return this.trackingName;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.apiPath;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackingName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
        }
        return hashCode4 + i;
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
        StringBuilder h = C0072d.m201h("ExploreKey(referrer=");
        h.append(getReferrer());
        h.append(", title=");
        h.append(this.title);
        h.append(", apiPath=");
        h.append(this.apiPath);
        h.append(", trackingName=");
        h.append(this.trackingName);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.title);
        parcel.writeString(this.apiPath);
        parcel.writeString(this.trackingName);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExploreKey(String str, String str2, String str3, String str4, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : bundle);
    }
}
