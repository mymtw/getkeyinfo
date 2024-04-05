package com.etsy.android.p327ui.navigation.keys.fragmentkeys;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.redirect.SearchRedirectFragment;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p343ee.C12693a;
import p363he.C12822e;
import p363he.C12824f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchRedirectKey */
public final class SearchRedirectKey implements SearchContainerDestinationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchRedirectKey> CREATOR = new Creator();
    private final SearchRedirectSpec redirectSpec;
    private final String referrer;
    private final SearchSpec searchSpec;

    /* renamed from: com.etsy.android.ui.navigation.keys.fragmentkeys.SearchRedirectKey$Creator */
    public static final class Creator implements Parcelable.Creator<SearchRedirectKey> {
        public final SearchRedirectKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            SearchSpec searchSpec = null;
            SearchRedirectSpec createFromParcel = parcel.readInt() == 0 ? null : SearchRedirectSpec.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                searchSpec = SearchSpec.CREATOR.createFromParcel(parcel);
            }
            return new SearchRedirectKey(readString, createFromParcel, searchSpec);
        }

        public final SearchRedirectKey[] newArray(int i) {
            return new SearchRedirectKey[i];
        }
    }

    public SearchRedirectKey(String str, SearchRedirectSpec searchRedirectSpec, SearchSpec searchSpec2) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
        this.redirectSpec = searchRedirectSpec;
        this.searchSpec = searchSpec2;
    }

    public static /* synthetic */ SearchRedirectKey copy$default(SearchRedirectKey searchRedirectKey, String str, SearchRedirectSpec searchRedirectSpec, SearchSpec searchSpec2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchRedirectKey.getReferrer();
        }
        if ((i & 2) != 0) {
            searchRedirectSpec = searchRedirectKey.redirectSpec;
        }
        if ((i & 4) != 0) {
            searchSpec2 = searchRedirectKey.searchSpec;
        }
        return searchRedirectKey.copy(str, searchRedirectSpec, searchSpec2);
    }

    public final String component1() {
        return getReferrer();
    }

    public final SearchRedirectSpec component2() {
        return this.redirectSpec;
    }

    public final SearchSpec component3() {
        return this.searchSpec;
    }

    public final SearchRedirectKey copy(String str, SearchRedirectSpec searchRedirectSpec, SearchSpec searchSpec2) {
        C19383o.m32797g(str, "referrer");
        return new SearchRedirectKey(str, searchRedirectSpec, searchSpec2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchRedirectKey)) {
            return false;
        }
        SearchRedirectKey searchRedirectKey = (SearchRedirectKey) obj;
        return C19383o.m32792b(getReferrer(), searchRedirectKey.getReferrer()) && C19383o.m32792b(this.redirectSpec, searchRedirectKey.redirectSpec) && C19383o.m32792b(this.searchSpec, searchRedirectKey.searchSpec);
    }

    public FragmentAnimationMode getAnimationType() {
        return FragmentAnimationMode.FADE;
    }

    public C12693a getBackstackGenerator() {
        return new C0005b();
    }

    public String getClazzName() {
        String canonicalName = SearchRedirectFragment.class.getCanonicalName();
        C19383o.m32794d(canonicalName);
        return canonicalName;
    }

    public boolean getClearBackstack() {
        return false;
    }

    public Fragment getFragment() {
        return new SearchRedirectFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        SearchRedirectSpec searchRedirectSpec = this.redirectSpec;
        if (searchRedirectSpec != null) {
            fVar.f28304a.put("SEARCH_CATEGORY_REDIRECT_TAXONOMY_PATH", searchRedirectSpec.getCategoryTaxonomyPath());
            fVar.f28304a.put("SEARCH_CATEGORY_REDIRECT_QUERY_PARAMS", searchRedirectSpec.getCategoryRedirectQueryParams());
        }
        SearchSpec searchSpec2 = this.searchSpec;
        if (searchSpec2 != null) {
            if (searchSpec2.getSearchOptions() != null) {
                fVar.f28304a.put("SEARCH_OPTIONS", searchSpec2.getSearchOptions());
            }
            if (C18263b.m30839d0(searchSpec2.getAnchorListingId())) {
                fVar.f28304a.put("ANCHOR_LISTING_ID", searchSpec2.getAnchorListingId());
            }
        }
        return fVar;
    }

    public final SearchRedirectSpec getRedirectSpec() {
        return this.redirectSpec;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Bundle getReferrerBundle() {
        return null;
    }

    public final SearchSpec getSearchSpec() {
        return this.searchSpec;
    }

    public int hashCode() {
        int hashCode = getReferrer().hashCode() * 31;
        SearchRedirectSpec searchRedirectSpec = this.redirectSpec;
        int i = 0;
        int hashCode2 = (hashCode + (searchRedirectSpec == null ? 0 : searchRedirectSpec.hashCode())) * 31;
        SearchSpec searchSpec2 = this.searchSpec;
        if (searchSpec2 != null) {
            i = searchSpec2.hashCode();
        }
        return hashCode2 + i;
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
        StringBuilder h = C0072d.m201h("SearchRedirectKey(referrer=");
        h.append(getReferrer());
        h.append(", redirectSpec=");
        h.append(this.redirectSpec);
        h.append(", searchSpec=");
        h.append(this.searchSpec);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
        SearchRedirectSpec searchRedirectSpec = this.redirectSpec;
        if (searchRedirectSpec == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchRedirectSpec.writeToParcel(parcel, i);
        }
        SearchSpec searchSpec2 = this.searchSpec;
        if (searchSpec2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        searchSpec2.writeToParcel(parcel, i);
    }
}
