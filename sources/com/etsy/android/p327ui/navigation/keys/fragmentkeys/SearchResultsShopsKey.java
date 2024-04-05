package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.search.shopresults.SearchResultsShopsFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchResultsShopsKey */
public final class SearchResultsShopsKey implements SearchContainerDestinationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchResultsShopsKey> CREATOR = new Creator();
    private final String query;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchResultsShopsKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchResultsShopsKey> {
        public final SearchResultsShopsKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SearchResultsShopsKey(parcel.readString(), parcel.readString());
        }

        public final SearchResultsShopsKey[] newArray(int i) {
            return new SearchResultsShopsKey[i];
        }
    }

    public SearchResultsShopsKey(String str, String str2) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.query = str2;
    }

    public static /* synthetic */ SearchResultsShopsKey copy$default(SearchResultsShopsKey searchResultsShopsKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchResultsShopsKey.getReferrer();
        }
        if ((i & 2) != 0) {
            str2 = searchResultsShopsKey.query;
        }
        return searchResultsShopsKey.copy(str, str2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final String component2() {
        return this.query;
    }

    public final SearchResultsShopsKey copy(String str, String str2) {
        C19383o.m32797g(str, "referrer");
        return new SearchResultsShopsKey(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultsShopsKey)) {
            return false;
        }
        SearchResultsShopsKey searchResultsShopsKey = (SearchResultsShopsKey) obj;
        return C19383o.m32792b(getReferrer(), searchResultsShopsKey.getReferrer()) && C19383o.m32792b(this.query, searchResultsShopsKey.query);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = SearchResultsShopsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public Fragment getFragment() {
        return new SearchResultsShopsFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("SEARCH_QUERY", this.query);
        return fVar;
    }

    public final String getQuery() {
        return this.query;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        String str = this.query;
        return hashCode + (str == null ? 0 : str.hashCode());
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
        StringBuilder h = C0072d.m201h("SearchResultsShopsKey(referrer=");
        h.append(getReferrer());
        h.append(", query=");
        return C0391c.m1057c(h, this.query, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        parcel.writeString(this.query);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchResultsShopsKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
