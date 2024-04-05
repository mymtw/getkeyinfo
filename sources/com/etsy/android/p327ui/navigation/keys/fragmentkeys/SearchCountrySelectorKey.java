package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.search.countryselector.SearchCountrySelectorFragment;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchCountrySelectorKey */
public final class SearchCountrySelectorKey implements FragmentNavigationKey {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SearchCountrySelectorKey> CREATOR = new Creator();
    private final FilterCountry filterCountry;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchCountrySelectorKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchCountrySelectorKey> {
        public final SearchCountrySelectorKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SearchCountrySelectorKey(parcel.readString(), FilterCountry.CREATOR.createFromParcel(parcel));
        }

        public final SearchCountrySelectorKey[] newArray(int i) {
            return new SearchCountrySelectorKey[i];
        }
    }

    public SearchCountrySelectorKey(String str, FilterCountry filterCountry2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(filterCountry2, "filterCountry");
        this.referrer = str;
        this.filterCountry = filterCountry2;
    }

    public static /* synthetic */ SearchCountrySelectorKey copy$default(SearchCountrySelectorKey searchCountrySelectorKey, String str, FilterCountry filterCountry2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchCountrySelectorKey.getReferrer();
        }
        if ((i & 2) != 0) {
            filterCountry2 = searchCountrySelectorKey.filterCountry;
        }
        return searchCountrySelectorKey.copy(str, filterCountry2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final FilterCountry component2() {
        return this.filterCountry;
    }

    public final SearchCountrySelectorKey copy(String str, FilterCountry filterCountry2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(filterCountry2, "filterCountry");
        return new SearchCountrySelectorKey(str, filterCountry2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCountrySelectorKey)) {
            return false;
        }
        SearchCountrySelectorKey searchCountrySelectorKey = (SearchCountrySelectorKey) obj;
        return C19383o.m32792b(getReferrer(), searchCountrySelectorKey.getReferrer()) && C19383o.m32792b(this.filterCountry, searchCountrySelectorKey.filterCountry);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = SearchCountrySelectorFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final FilterCountry getFilterCountry() {
        return this.filterCountry;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("ARG_FILTER_COUNTRY", this.filterCountry);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        return this.filterCountry.hashCode() + (getReferrer().hashCode() * 31);
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
        StringBuilder h = C0072d.m201h("SearchCountrySelectorKey(referrer=");
        h.append(getReferrer());
        h.append(", filterCountry=");
        h.append(this.filterCountry);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        this.filterCountry.writeToParcel(parcel, i);
    }
}
