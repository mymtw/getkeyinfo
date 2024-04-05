package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.search.interstitial.SearchInterstitialFragment;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchInterstitialKey */
public final class SearchInterstitialKey implements SearchContainerDestinationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchInterstitialKey> CREATOR = new Creator();
    private final String autoSuggestQuery;
    private final boolean recentlyViewed;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchInterstitialKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchInterstitialKey> {
        public final SearchInterstitialKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SearchInterstitialKey(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final SearchInterstitialKey[] newArray(int i) {
            return new SearchInterstitialKey[i];
        }
    }

    public SearchInterstitialKey(String str, String str2, boolean z) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.autoSuggestQuery = str2;
        this.recentlyViewed = z;
    }

    public static /* synthetic */ SearchInterstitialKey copy$default(SearchInterstitialKey searchInterstitialKey, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchInterstitialKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = searchInterstitialKey.autoSuggestQuery;
        }
        if ((i & 4) != 0) {
            z = searchInterstitialKey.recentlyViewed;
        }
        return searchInterstitialKey.copy(str, str2, z);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.autoSuggestQuery;
    }

    public final boolean component3() {
        return this.recentlyViewed;
    }

    public final SearchInterstitialKey copy(String str, String str2, boolean z) {
        C19383o.m32797g(str, "referrer");
        return new SearchInterstitialKey(str, str2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInterstitialKey)) {
            return false;
        }
        SearchInterstitialKey searchInterstitialKey = (SearchInterstitialKey) obj;
        return C19383o.m32792b(getReferrer(), searchInterstitialKey.getReferrer()) && C19383o.m32792b(this.autoSuggestQuery, searchInterstitialKey.autoSuggestQuery) && this.recentlyViewed == searchInterstitialKey.recentlyViewed;
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public final String getAutoSuggestQuery() {
        return this.autoSuggestQuery;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = SearchInterstitialFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public Fragment getFragment() {
        return new SearchInterstitialFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("auto_suggest_query", this.autoSuggestQuery);
        fVar.f28304a.put("show_recently_viewed", Boolean.valueOf(this.recentlyViewed));
        return fVar;
    }

    public final boolean getRecentlyViewed() {
        return this.recentlyViewed;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.autoSuggestQuery;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.recentlyViewed;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
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
        StringBuilder h = C0072d.m201h("SearchInterstitialKey(referrer=");
        h.append(getReferrer());
        h.append(", autoSuggestQuery=");
        h.append(this.autoSuggestQuery);
        h.append(", recentlyViewed=");
        return C0391c.m1058d(h, this.recentlyViewed, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.autoSuggestQuery);
        parcel.writeInt(this.recentlyViewed ? 1 : 0);
    }
}
