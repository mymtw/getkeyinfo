package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.etsy.android.p327ui.home.landingpage.LandingPageFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.LandingPageKey */
public final class LandingPageKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LandingPageKey> CREATOR = new Creator();
    private final String clazzName;
    private final LandingPageInfo pageLink;
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.LandingPageKey$Creator */
    public static final class Creator implements Parcelable.Creator<LandingPageKey> {
        public final LandingPageKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new LandingPageKey(parcel.readString(), (LandingPageInfo) parcel.readSerializable(), parcel.readBundle());
        }

        public final LandingPageKey[] newArray(int i) {
            return new LandingPageKey[i];
        }
    }

    public LandingPageKey(String str, LandingPageInfo landingPageInfo, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(landingPageInfo, "pageLink");
        this.referrer = str;
        this.pageLink = landingPageInfo;
        this.referrerBundle = bundle;
        String canonicalName = LandingPageFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        this.clazzName = canonicalName;
    }

    public static /* synthetic */ LandingPageKey copy$default(LandingPageKey landingPageKey, String str, LandingPageInfo landingPageInfo, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = landingPageKey.getReferrer();
        }
        if ((i & 2) != 0) {
            landingPageInfo = landingPageKey.pageLink;
        }
        if ((i & 4) != 0) {
            bundle = landingPageKey.getReferrerBundle();
        }
        return landingPageKey.copy(str, landingPageInfo, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final LandingPageInfo component2() {
        return this.pageLink;
    }

    public final Bundle component3() {
        return getReferrerBundle();
    }

    public final LandingPageKey copy(String str, LandingPageInfo landingPageInfo, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(landingPageInfo, "pageLink");
        return new LandingPageKey(str, landingPageInfo, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingPageKey)) {
            return false;
        }
        LandingPageKey landingPageKey = (LandingPageKey) obj;
        return C19383o.m32792b(getReferrer(), landingPageKey.getReferrer()) && C19383o.m32792b(this.pageLink, landingPageKey.pageLink) && C19383o.m32792b(getReferrerBundle(), landingPageKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
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
        fVar.f28304a.put(ResponseConstants.PAGE_LINK, this.pageLink);
        if (getReferrerBundle() != null) {
            fVar.f28304a.put("referral_args", getReferrerBundle());
        }
        return fVar;
    }

    public final LandingPageInfo getPageLink() {
        return this.pageLink;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public int hashCode() {
        return ((this.pageLink.hashCode() + (getReferrer().hashCode() * 31)) * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode());
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
        StringBuilder h = C0072d.m201h("LandingPageKey(referrer=");
        h.append(getReferrer());
        h.append(", pageLink=");
        h.append(this.pageLink);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.pageLink);
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LandingPageKey(String str, LandingPageInfo landingPageInfo, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, landingPageInfo, (i & 4) != 0 ? null : bundle);
    }
}
