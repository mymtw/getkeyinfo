package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.RecentlyViewedKey */
public final class RecentlyViewedKey implements FragmentNavigationKey {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RecentlyViewedKey> CREATOR = new Creator();
    private final String clazzName;
    private final LandingPageInfo pageLink;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.RecentlyViewedKey$Creator */
    public static final class Creator implements Parcelable.Creator<RecentlyViewedKey> {
        public final RecentlyViewedKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new RecentlyViewedKey(parcel.readString(), (LandingPageInfo) parcel.readSerializable(), parcel.readString());
        }

        public final RecentlyViewedKey[] newArray(int i) {
            return new RecentlyViewedKey[i];
        }
    }

    public RecentlyViewedKey(String str, LandingPageInfo landingPageInfo, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(landingPageInfo, "pageLink");
        C19383o.m32797g(str2, "clazzName");
        this.referrer = str;
        this.pageLink = landingPageInfo;
        this.clazzName = str2;
    }

    public static /* synthetic */ RecentlyViewedKey copy$default(RecentlyViewedKey recentlyViewedKey, String str, LandingPageInfo landingPageInfo, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentlyViewedKey.getReferrer();
        }
        if ((i & 2) != 0) {
            landingPageInfo = recentlyViewedKey.pageLink;
        }
        if ((i & 4) != 0) {
            str2 = recentlyViewedKey.getClazzName();
        }
        return recentlyViewedKey.copy(str, landingPageInfo, str2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final LandingPageInfo component2() {
        return this.pageLink;
    }

    public final String component3() {
        return getClazzName();
    }

    public final RecentlyViewedKey copy(String str, LandingPageInfo landingPageInfo, String str2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(landingPageInfo, "pageLink");
        C19383o.m32797g(str2, "clazzName");
        return new RecentlyViewedKey(str, landingPageInfo, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyViewedKey)) {
            return false;
        }
        RecentlyViewedKey recentlyViewedKey = (RecentlyViewedKey) obj;
        return C19383o.m32792b(getReferrer(), recentlyViewedKey.getReferrer()) && C19383o.m32792b(this.pageLink, recentlyViewedKey.pageLink) && C19383o.m32792b(getClazzName(), recentlyViewedKey.getClazzName());
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
        return fVar;
    }

    public final LandingPageInfo getPageLink() {
        return this.pageLink;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        int hashCode = this.pageLink.hashCode();
        return getClazzName().hashCode() + ((hashCode + (getReferrer().hashCode() * 31)) * 31);
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
        StringBuilder h = C0072d.m201h("RecentlyViewedKey(referrer=");
        h.append(getReferrer());
        h.append(", pageLink=");
        h.append(this.pageLink);
        h.append(", clazzName=");
        h.append(getClazzName());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeSerializable(this.pageLink);
        parcel.writeString(this.clazzName);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RecentlyViewedKey(java.lang.String r1, com.etsy.android.lib.models.homescreen.LandingPageInfo r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000d
            java.lang.Class<com.etsy.android.ui.home.recentlyviewedpage.RecentlyViewedPageFragment> r3 = com.etsy.android.p327ui.home.recentlyviewedpage.RecentlyViewedPageFragment.class
            java.lang.String r3 = r3.getCanonicalName()
            kotlin.jvm.internal.C19383o.m32794d(r3)
        L_0x000d:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.navigation.keys.fragmentkeys.RecentlyViewedKey.<init>(java.lang.String, com.etsy.android.lib.models.homescreen.LandingPageInfo, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
