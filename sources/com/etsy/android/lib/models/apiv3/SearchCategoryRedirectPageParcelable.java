package com.etsy.android.lib.models.apiv3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.EtsyArray;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.cardviewelement.Page;
import kotlin.jvm.internal.C19383o;

public final class SearchCategoryRedirectPageParcelable implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchCategoryRedirectPageParcelable> CREATOR = new Creator();
    private Page categoryLandingPage;
    private EtsyArray filterParams;
    private SearchWithAds searchWithAds;
    private TaxonomyNode taxonomyNode;

    public static final class Creator implements Parcelable.Creator<SearchCategoryRedirectPageParcelable> {
        public final SearchCategoryRedirectPageParcelable createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SearchCategoryRedirectPageParcelable((SearchWithAds) parcel.readSerializable(), (Page) parcel.readSerializable(), (TaxonomyNode) parcel.readSerializable(), (EtsyArray) parcel.readParcelable(SearchCategoryRedirectPageParcelable.class.getClassLoader()));
        }

        public final SearchCategoryRedirectPageParcelable[] newArray(int i) {
            return new SearchCategoryRedirectPageParcelable[i];
        }
    }

    public SearchCategoryRedirectPageParcelable(SearchWithAds searchWithAds2, Page page, TaxonomyNode taxonomyNode2, EtsyArray etsyArray) {
        this.searchWithAds = searchWithAds2;
        this.categoryLandingPage = page;
        this.taxonomyNode = taxonomyNode2;
        this.filterParams = etsyArray;
    }

    public static /* synthetic */ SearchCategoryRedirectPageParcelable copy$default(SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable, SearchWithAds searchWithAds2, Page page, TaxonomyNode taxonomyNode2, EtsyArray etsyArray, int i, Object obj) {
        if ((i & 1) != 0) {
            searchWithAds2 = searchCategoryRedirectPageParcelable.searchWithAds;
        }
        if ((i & 2) != 0) {
            page = searchCategoryRedirectPageParcelable.categoryLandingPage;
        }
        if ((i & 4) != 0) {
            taxonomyNode2 = searchCategoryRedirectPageParcelable.taxonomyNode;
        }
        if ((i & 8) != 0) {
            etsyArray = searchCategoryRedirectPageParcelable.filterParams;
        }
        return searchCategoryRedirectPageParcelable.copy(searchWithAds2, page, taxonomyNode2, etsyArray);
    }

    public final SearchWithAds component1() {
        return this.searchWithAds;
    }

    public final Page component2() {
        return this.categoryLandingPage;
    }

    public final TaxonomyNode component3() {
        return this.taxonomyNode;
    }

    public final EtsyArray component4() {
        return this.filterParams;
    }

    public final SearchCategoryRedirectPageParcelable copy(SearchWithAds searchWithAds2, Page page, TaxonomyNode taxonomyNode2, EtsyArray etsyArray) {
        return new SearchCategoryRedirectPageParcelable(searchWithAds2, page, taxonomyNode2, etsyArray);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCategoryRedirectPageParcelable)) {
            return false;
        }
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable = (SearchCategoryRedirectPageParcelable) obj;
        return C19383o.m32792b(this.searchWithAds, searchCategoryRedirectPageParcelable.searchWithAds) && C19383o.m32792b(this.categoryLandingPage, searchCategoryRedirectPageParcelable.categoryLandingPage) && C19383o.m32792b(this.taxonomyNode, searchCategoryRedirectPageParcelable.taxonomyNode) && C19383o.m32792b(this.filterParams, searchCategoryRedirectPageParcelable.filterParams);
    }

    public final Page getCategoryLandingPage() {
        return this.categoryLandingPage;
    }

    public final EtsyArray getFilterParams() {
        return this.filterParams;
    }

    public final SearchWithAds getSearchWithAds() {
        return this.searchWithAds;
    }

    public final TaxonomyNode getTaxonomyNode() {
        return this.taxonomyNode;
    }

    public int hashCode() {
        SearchWithAds searchWithAds2 = this.searchWithAds;
        int i = 0;
        int hashCode = (searchWithAds2 == null ? 0 : searchWithAds2.hashCode()) * 31;
        Page page = this.categoryLandingPage;
        int hashCode2 = (hashCode + (page == null ? 0 : page.hashCode())) * 31;
        TaxonomyNode taxonomyNode2 = this.taxonomyNode;
        int hashCode3 = (hashCode2 + (taxonomyNode2 == null ? 0 : taxonomyNode2.hashCode())) * 31;
        EtsyArray etsyArray = this.filterParams;
        if (etsyArray != null) {
            i = etsyArray.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setCategoryLandingPage(Page page) {
        this.categoryLandingPage = page;
    }

    public final void setFilterParams(EtsyArray etsyArray) {
        this.filterParams = etsyArray;
    }

    public final void setSearchWithAds(SearchWithAds searchWithAds2) {
        this.searchWithAds = searchWithAds2;
    }

    public final void setTaxonomyNode(TaxonomyNode taxonomyNode2) {
        this.taxonomyNode = taxonomyNode2;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchCategoryRedirectPageParcelable(searchWithAds=");
        h.append(this.searchWithAds);
        h.append(", categoryLandingPage=");
        h.append(this.categoryLandingPage);
        h.append(", taxonomyNode=");
        h.append(this.taxonomyNode);
        h.append(", filterParams=");
        h.append(this.filterParams);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeSerializable(this.searchWithAds);
        parcel.writeSerializable(this.categoryLandingPage);
        parcel.writeSerializable(this.taxonomyNode);
        parcel.writeParcelable(this.filterParams, i);
    }
}
