package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchResultsListingsKey */
public final class SearchResultsListingsKey implements SearchContainerDestinationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchResultsListingsKey> CREATOR = new Creator();
    private final FragmentAnimationMode animation;
    private final String nextPageLink;
    private final String referrer;
    private final SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable;
    private final SearchSpec searchSpec;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchResultsListingsKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchResultsListingsKey> {
        public final SearchResultsListingsKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SearchResultsListingsKey(parcel.readString(), SearchSpec.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SearchCategoryRedirectPageParcelable.CREATOR.createFromParcel(parcel), parcel.readString(), FragmentAnimationMode.CREATOR.createFromParcel(parcel));
        }

        public final SearchResultsListingsKey[] newArray(int i) {
            return new SearchResultsListingsKey[i];
        }
    }

    public SearchResultsListingsKey(String str, SearchSpec searchSpec2, SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable2, String str2, FragmentAnimationMode fragmentAnimationMode) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(searchSpec2, "searchSpec");
        C19383o.m32797g(fragmentAnimationMode, ResponseConstants.ANIMATION);
        this.referrer = str;
        this.searchSpec = searchSpec2;
        this.searchCategoryRedirectPageParcelable = searchCategoryRedirectPageParcelable2;
        this.nextPageLink = str2;
        this.animation = fragmentAnimationMode;
    }

    public static /* synthetic */ SearchResultsListingsKey copy$default(SearchResultsListingsKey searchResultsListingsKey, String str, SearchSpec searchSpec2, SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable2, String str2, FragmentAnimationMode fragmentAnimationMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchResultsListingsKey.getReferrer();
        }
        if ((i & 2) != 0) {
            searchSpec2 = searchResultsListingsKey.searchSpec;
        }
        SearchSpec searchSpec3 = searchSpec2;
        if ((i & 4) != 0) {
            searchCategoryRedirectPageParcelable2 = searchResultsListingsKey.searchCategoryRedirectPageParcelable;
        }
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable3 = searchCategoryRedirectPageParcelable2;
        if ((i & 8) != 0) {
            str2 = searchResultsListingsKey.nextPageLink;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            fragmentAnimationMode = searchResultsListingsKey.animation;
        }
        return searchResultsListingsKey.copy(str, searchSpec3, searchCategoryRedirectPageParcelable3, str3, fragmentAnimationMode);
    }

    public final String component1() {
        return getReferrer();
    }

    public final SearchSpec component2() {
        return this.searchSpec;
    }

    public final SearchCategoryRedirectPageParcelable component3() {
        return this.searchCategoryRedirectPageParcelable;
    }

    public final String component4() {
        return this.nextPageLink;
    }

    public final FragmentAnimationMode component5() {
        return this.animation;
    }

    public final SearchResultsListingsKey copy(String str, SearchSpec searchSpec2, SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable2, String str2, FragmentAnimationMode fragmentAnimationMode) {
        C19383o.m32797g(str, "referrer");
        C19383o.m32797g(searchSpec2, "searchSpec");
        C19383o.m32797g(fragmentAnimationMode, ResponseConstants.ANIMATION);
        return new SearchResultsListingsKey(str, searchSpec2, searchCategoryRedirectPageParcelable2, str2, fragmentAnimationMode);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultsListingsKey)) {
            return false;
        }
        SearchResultsListingsKey searchResultsListingsKey = (SearchResultsListingsKey) obj;
        return C19383o.m32792b(getReferrer(), searchResultsListingsKey.getReferrer()) && C19383o.m32792b(this.searchSpec, searchResultsListingsKey.searchSpec) && C19383o.m32792b(this.searchCategoryRedirectPageParcelable, searchResultsListingsKey.searchCategoryRedirectPageParcelable) && C19383o.m32792b(this.nextPageLink, searchResultsListingsKey.nextPageLink) && this.animation == searchResultsListingsKey.animation;
    }

    public final FragmentAnimationMode getAnimation() {
        return this.animation;
    }

    public FragmentAnimationMode getAnimationType() {
        return this.animation;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = SearchResultsListingsFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public Fragment getFragment() {
        return new SearchResultsListingsFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        SearchSpec searchSpec2 = this.searchSpec;
        fVar.f28304a.put("SEARCH_IS_RECENT_SEARCH", Boolean.valueOf(searchSpec2.isRecentSearch()));
        fVar.f28304a.put("SEARCH_FEATURED_CATEGORIES", Boolean.valueOf(searchSpec2.getIncludeFeaturedCategories()));
        if (C18263b.m30839d0(searchSpec2.getQuery())) {
            fVar.f28304a.put("SEARCH_QUERY", searchSpec2.getQuery());
        }
        if (searchSpec2.getTaxonomyId() != null) {
            fVar.f28304a.put("search_taxonomy_id", searchSpec2.getTaxonomyId());
        }
        if (searchSpec2.getSearchOptions() != null) {
            if (searchSpec2.getSearchWithNewFilters()) {
                fVar.f28304a.put("SEARCH_WITH_NEW_FILTERS", Boolean.valueOf(searchSpec2.getSearchWithNewFilters()));
                fVar.f28304a.put("SEARCH_OPTIONS_FILTERS_V2", searchSpec2.getSearchOptions());
            } else {
                fVar.f28304a.put("SEARCH_OPTIONS", searchSpec2.getSearchOptions());
            }
        }
        if (searchSpec2.getSavedSearchId() != null) {
            fVar.f28304a.put("SAVED_SEARCH_ID", searchSpec2.getSavedSearchId());
        }
        if (C18263b.m30839d0(searchSpec2.getAnchorListingId())) {
            fVar.f28304a.put("ANCHOR_LISTING_ID", this.searchSpec.getAnchorListingId());
        }
        if (searchSpec2.getRequestParams() != null) {
            fVar.f28304a.put("SEARCH_REQUEST_PARAMS", searchSpec2.getRequestParams());
        }
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable2 = this.searchCategoryRedirectPageParcelable;
        if (searchCategoryRedirectPageParcelable2 != null) {
            fVar.f28304a.put("SEARCH_CATEGORY_REDIRECT", searchCategoryRedirectPageParcelable2);
        }
        if (C18263b.m30839d0(this.nextPageLink)) {
            fVar.f28304a.put(ResponseConstants.PAGE_LINK, this.nextPageLink);
        }
        return fVar;
    }

    public final String getNextPageLink() {
        return this.nextPageLink;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public final SearchCategoryRedirectPageParcelable getSearchCategoryRedirectPageParcelable() {
        return this.searchCategoryRedirectPageParcelable;
    }

    public final SearchSpec getSearchSpec() {
        return this.searchSpec;
    }

    public int hashCode() {
        int hashCode = (this.searchSpec.hashCode() + (getReferrer().hashCode() * 31)) * 31;
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable2 = this.searchCategoryRedirectPageParcelable;
        int i = 0;
        int hashCode2 = (hashCode + (searchCategoryRedirectPageParcelable2 == null ? 0 : searchCategoryRedirectPageParcelable2.hashCode())) * 31;
        String str = this.nextPageLink;
        if (str != null) {
            i = str.hashCode();
        }
        return this.animation.hashCode() + ((hashCode2 + i) * 31);
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
        StringBuilder h = C0072d.m201h("SearchResultsListingsKey(referrer=");
        h.append(getReferrer());
        h.append(", searchSpec=");
        h.append(this.searchSpec);
        h.append(", searchCategoryRedirectPageParcelable=");
        h.append(this.searchCategoryRedirectPageParcelable);
        h.append(", nextPageLink=");
        h.append(this.nextPageLink);
        h.append(", animation=");
        h.append(this.animation);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        this.searchSpec.writeToParcel(parcel, i);
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable2 = this.searchCategoryRedirectPageParcelable;
        if (searchCategoryRedirectPageParcelable2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchCategoryRedirectPageParcelable2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextPageLink);
        this.animation.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchResultsListingsKey(String str, SearchSpec searchSpec2, SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable2, String str2, FragmentAnimationMode fragmentAnimationMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, searchSpec2, (i & 4) != 0 ? null : searchCategoryRedirectPageParcelable2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? FragmentAnimationMode.FADE : fragmentAnimationMode);
    }
}
