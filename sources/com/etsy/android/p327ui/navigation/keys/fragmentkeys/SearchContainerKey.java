package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.container.SearchContainerFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchContainerKey */
public final class SearchContainerKey implements FragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchContainerKey> CREATOR = new Creator();
    private final String referrer;
    private final Bundle referrerBundle;
    private final SearchRedirectSpec searchRedirectSpec;
    private final SearchSpec searchSpec;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchContainerKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchContainerKey> {
        public final SearchContainerKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            SearchRedirectSpec searchRedirectSpec = null;
            SearchSpec createFromParcel = parcel.readInt() == 0 ? null : SearchSpec.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                searchRedirectSpec = SearchRedirectSpec.CREATOR.createFromParcel(parcel);
            }
            return new SearchContainerKey(readString, createFromParcel, searchRedirectSpec, parcel.readBundle());
        }

        public final SearchContainerKey[] newArray(int i) {
            return new SearchContainerKey[i];
        }
    }

    public SearchContainerKey(String str, SearchSpec searchSpec2, SearchRedirectSpec searchRedirectSpec2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.searchSpec = searchSpec2;
        this.searchRedirectSpec = searchRedirectSpec2;
        this.referrerBundle = bundle;
    }

    public static /* synthetic */ SearchContainerKey copy$default(SearchContainerKey searchContainerKey, String str, SearchSpec searchSpec2, SearchRedirectSpec searchRedirectSpec2, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchContainerKey.getReferrer();
        }
        if ((i & 2) != 0) {
            searchSpec2 = searchContainerKey.searchSpec;
        }
        if ((i & 4) != 0) {
            searchRedirectSpec2 = searchContainerKey.searchRedirectSpec;
        }
        if ((i & 8) != 0) {
            bundle = searchContainerKey.getReferrerBundle();
        }
        return searchContainerKey.copy(str, searchSpec2, searchRedirectSpec2, bundle);
    }

    public final String component1() {
        return getReferrer();
    }

    public final SearchSpec component2() {
        return this.searchSpec;
    }

    public final SearchRedirectSpec component3() {
        return this.searchRedirectSpec;
    }

    public final Bundle component4() {
        return getReferrerBundle();
    }

    public final SearchContainerKey copy(String str, SearchSpec searchSpec2, SearchRedirectSpec searchRedirectSpec2, Bundle bundle) {
        C19383o.m32797g(str, "referrer");
        return new SearchContainerKey(str, searchSpec2, searchRedirectSpec2, bundle);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchContainerKey)) {
            return false;
        }
        SearchContainerKey searchContainerKey = (SearchContainerKey) obj;
        return C19383o.m32792b(getReferrer(), searchContainerKey.getReferrer()) && C19383o.m32792b(this.searchSpec, searchContainerKey.searchSpec) && C19383o.m32792b(this.searchRedirectSpec, searchContainerKey.searchRedirectSpec) && C19383o.m32792b(getReferrerBundle(), searchContainerKey.getReferrerBundle());
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = SearchContainerFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        SearchSpec searchSpec2 = this.searchSpec;
        if (searchSpec2 != null) {
            fVar.f28304a.put("SEARCH_IS_RECENT_SEARCH", Boolean.valueOf(searchSpec2.isRecentSearch()));
            fVar.f28304a.put("SEARCH_FEATURED_CATEGORIES", Boolean.valueOf(searchSpec2.getIncludeFeaturedCategories()));
            fVar.f28304a.put("TOP_LEVEL_CATEGORIES", Boolean.valueOf(searchSpec2.getTopLevelCategories()));
            if (C18263b.m30839d0(searchSpec2.getQuery())) {
                fVar.f28304a.put(ResponseConstants.ACTION, "android.intent.action.SEARCH");
                fVar.f28304a.put("query", searchSpec2.getQuery());
            }
            if (searchSpec2.getTaxonomyId() != null) {
                fVar.f28304a.put("search_taxonomy_id", searchSpec2.getTaxonomyId());
                fVar.f28304a.put("SEARCH_TYPE", "SEARCH_TYPE_CATEGORY");
            }
            if (searchSpec2.getSearchOptions() != null) {
                fVar.f28304a.put("SEARCH_OPTIONS", searchSpec2.getSearchOptions());
            }
            if (searchSpec2.getSavedSearchId() != null) {
                fVar.f28304a.put("SAVED_SEARCH_ID", searchSpec2.getSavedSearchId());
            }
            if (C18263b.m30839d0(searchSpec2.getAnchorListingId())) {
                fVar.f28304a.put("ANCHOR_LISTING_ID", searchSpec2.getAnchorListingId());
            }
        }
        SearchRedirectSpec searchRedirectSpec2 = this.searchRedirectSpec;
        if (searchRedirectSpec2 != null) {
            fVar.f28304a.put("SEARCH_CATEGORY_REDIRECT_TAXONOMY_PATH", searchRedirectSpec2.getCategoryTaxonomyPath());
            fVar.f28304a.put("SEARCH_CATEGORY_REDIRECT_QUERY_PARAMS", searchRedirectSpec2.getCategoryRedirectQueryParams());
            fVar.f28304a.put("SEARCH_INITIATED_FROM_WITHIN_APP", Boolean.valueOf(searchRedirectSpec2.getInitiatedFromWithinApp()));
        }
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

    public final SearchRedirectSpec getSearchRedirectSpec() {
        return this.searchRedirectSpec;
    }

    public final SearchSpec getSearchSpec() {
        return this.searchSpec;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        SearchSpec searchSpec2 = this.searchSpec;
        int i = 0;
        int hashCode2 = (hashCode + (searchSpec2 == null ? 0 : searchSpec2.hashCode())) * 31;
        SearchRedirectSpec searchRedirectSpec2 = this.searchRedirectSpec;
        int hashCode3 = (hashCode2 + (searchRedirectSpec2 == null ? 0 : searchRedirectSpec2.hashCode())) * 31;
        if (getReferrerBundle() != null) {
            i = getReferrerBundle().hashCode();
        }
        return hashCode3 + i;
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
        StringBuilder h = C0072d.m201h("SearchContainerKey(referrer=");
        h.append(getReferrer());
        h.append(", searchSpec=");
        h.append(this.searchSpec);
        h.append(", searchRedirectSpec=");
        h.append(this.searchRedirectSpec);
        h.append(", referrerBundle=");
        h.append(getReferrerBundle());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        SearchSpec searchSpec2 = this.searchSpec;
        if (searchSpec2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchSpec2.writeToParcel(parcel, i);
        }
        SearchRedirectSpec searchRedirectSpec2 = this.searchRedirectSpec;
        if (searchRedirectSpec2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchRedirectSpec2.writeToParcel(parcel, i);
        }
        parcel.writeBundle(this.referrerBundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchContainerKey(String str, SearchSpec searchSpec2, SearchRedirectSpec searchRedirectSpec2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : searchSpec2, (i & 4) != 0 ? null : searchRedirectSpec2, (i & 8) != 0 ? null : bundle);
    }
}
