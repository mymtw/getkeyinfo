package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersFragment;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchFiltersRefactorKey */
public final class SearchFiltersRefactorKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchFiltersRefactorKey> CREATOR = new Creator();
    private final FilterParams filterParams;
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchFiltersRefactorKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchFiltersRefactorKey> {
        public final SearchFiltersRefactorKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SearchFiltersRefactorKey(parcel.readString(), FilterParams.CREATOR.createFromParcel(parcel));
        }

        public final SearchFiltersRefactorKey[] newArray(int i) {
            return new SearchFiltersRefactorKey[i];
        }
    }

    public SearchFiltersRefactorKey(String str, FilterParams filterParams2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(filterParams2, "filterParams");
        this.referrer = str;
        this.filterParams = filterParams2;
    }

    public static /* synthetic */ SearchFiltersRefactorKey copy$default(SearchFiltersRefactorKey searchFiltersRefactorKey, String str, FilterParams filterParams2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchFiltersRefactorKey.getReferrer();
        }
        if ((i & 2) != 0) {
            filterParams2 = searchFiltersRefactorKey.filterParams;
        }
        return searchFiltersRefactorKey.copy(str, filterParams2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final FilterParams component2() {
        return this.filterParams;
    }

    public final SearchFiltersRefactorKey copy(String str, FilterParams filterParams2) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(filterParams2, "filterParams");
        return new SearchFiltersRefactorKey(str, filterParams2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFiltersRefactorKey)) {
            return false;
        }
        SearchFiltersRefactorKey searchFiltersRefactorKey = (SearchFiltersRefactorKey) obj;
        return C19383o.m32792b(getReferrer(), searchFiltersRefactorKey.getReferrer()) && C19383o.m32792b(this.filterParams, searchFiltersRefactorKey.filterParams);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = SearchFiltersFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public final FilterParams getFilterParams() {
        return this.filterParams;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        fVar.f28304a.put("FILTER_PARAMS", this.filterParams);
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public int hashCode() {
        return this.filterParams.hashCode() + (getReferrer().hashCode() * 31);
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
        StringBuilder h = C0072d.m201h("SearchFiltersRefactorKey(referrer=");
        h.append(getReferrer());
        h.append(", filterParams=");
        h.append(this.filterParams);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        this.filterParams.writeToParcel(parcel, i);
    }
}
