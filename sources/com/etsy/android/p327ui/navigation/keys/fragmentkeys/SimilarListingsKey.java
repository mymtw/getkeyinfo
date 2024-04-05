package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SimilarListingsKey */
public final class SimilarListingsKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimilarListingsKey> CREATOR = new Creator();
    private final String clazzName;
    private final LandingPageLink pageLink;
    private final String referrer;
    private final Bundle referrerBundle;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SimilarListingsKey$Creator */
    public static final class Creator implements Parcelable.Creator<SimilarListingsKey> {
        public final SimilarListingsKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SimilarListingsKey(parcel.readString(), (LandingPageLink) parcel.readSerializable(), parcel.readBundle(), parcel.readString());
        }

        public final SimilarListingsKey[] newArray(int i) {
            return new SimilarListingsKey[i];
        }
    }

    public SimilarListingsKey(String str, LandingPageLink landingPageLink, Bundle bundle, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(landingPageLink, "pageLink");
        C19383o.m32797g(str2, "clazzName");
        this.referrer = str;
        this.pageLink = landingPageLink;
        this.referrerBundle = bundle;
        this.clazzName = str2;
    }

    public static /* synthetic */ SimilarListingsKey copy$default(SimilarListingsKey similarListingsKey, String str, LandingPageLink landingPageLink, Bundle bundle, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = similarListingsKey.getReferrer();
        }
        if ((i & 2) != 0) {
            landingPageLink = similarListingsKey.pageLink;
        }
        if ((i & 4) != 0) {
            bundle = similarListingsKey.getReferrerBundle();
        }
        if ((i & 8) != 0) {
            str2 = similarListingsKey.getClazzName();
        }
        return similarListingsKey.copy(str, landingPageLink, bundle, str2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final LandingPageLink component2() {
        return this.pageLink;
    }

    public final Bundle component3() {
        return getReferrerBundle();
    }

    public final String component4() {
        return getClazzName();
    }

    public final SimilarListingsKey copy(String str, LandingPageLink landingPageLink, Bundle bundle, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(landingPageLink, "pageLink");
        C19383o.m32797g(str2, "clazzName");
        return new SimilarListingsKey(str, landingPageLink, bundle, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimilarListingsKey)) {
            return false;
        }
        SimilarListingsKey similarListingsKey = (SimilarListingsKey) obj;
        return C19383o.m32792b(getReferrer(), similarListingsKey.getReferrer()) && C19383o.m32792b(this.pageLink, similarListingsKey.pageLink) && C19383o.m32792b(getReferrerBundle(), similarListingsKey.getReferrerBundle()) && C19383o.m32792b(getClazzName(), similarListingsKey.getClazzName());
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

    public final LandingPageLink getPageLink() {
        return this.pageLink;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return this.referrerBundle;
    }

    public int hashCode() {
        return getClazzName().hashCode() + ((((this.pageLink.hashCode() + (getReferrer().hashCode() * 31)) * 31) + (getReferrerBundle() == null ? 0 : getReferrerBundle().hashCode())) * 31);
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
        StringBuilder h = C0072d.m201h("SimilarListingsKey(referrer=");
        h.append(getReferrer());
        h.append(", pageLink=");
        h.append(this.pageLink);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(", clazzName=");
        h.append(getClazzName());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.pageLink);
        parcel.writeBundle(this.referrerBundle);
        parcel.writeString(this.clazzName);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SimilarListingsKey(java.lang.String r1, com.etsy.android.lib.models.homescreen.LandingPageLink r2, android.os.Bundle r3, java.lang.String r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0005
            r3 = 0
        L_0x0005:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0012
            java.lang.Class<com.etsy.android.ui.home.landingpage.LandingPageFragment> r4 = com.etsy.android.p327ui.home.landingpage.LandingPageFragment.class
            java.lang.String r4 = r4.getCanonicalName()
            kotlin.jvm.internal.C19383o.m32794d(r4)
        L_0x0012:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.SimilarListingsKey.<init>(java.lang.String, com.etsy.android.lib.models.homescreen.LandingPageLink, android.os.Bundle, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
