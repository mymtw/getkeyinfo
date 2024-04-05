package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ITaxonomyCategory;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyCategory implements ITaxonomyCategory {
    public static final int $stable = 8;
    private DeepLink deepLinkField;
    private List<ListingImage> images;
    private String name;
    private SearchPageLink pageLink;
    private transient EtsyId taxonomyId = new EtsyId(this.taxonomyStringId);
    private String taxonomyStringId;

    public TaxonomyCategory(@C17402n(name = "name") String str, @C17402n(name = "images") List<ListingImage> list, @C17402n(name = "page_link") SearchPageLink searchPageLink, @C17402n(name = "taxonomy_id") String str2, @C17402n(name = "deep_link") DeepLink deepLink) {
        this.name = str;
        this.images = list;
        this.pageLink = searchPageLink;
        this.taxonomyStringId = str2;
        this.deepLinkField = deepLink;
    }

    public static /* synthetic */ TaxonomyCategory copy$default(TaxonomyCategory taxonomyCategory, String str, List<ListingImage> list, SearchPageLink searchPageLink, String str2, DeepLink deepLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxonomyCategory.getName();
        }
        if ((i & 2) != 0) {
            list = taxonomyCategory.getImages();
        }
        List<ListingImage> list2 = list;
        if ((i & 4) != 0) {
            searchPageLink = taxonomyCategory.getPageLink();
        }
        SearchPageLink searchPageLink2 = searchPageLink;
        if ((i & 8) != 0) {
            str2 = taxonomyCategory.taxonomyStringId;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            deepLink = taxonomyCategory.deepLinkField;
        }
        return taxonomyCategory.copy(str, list2, searchPageLink2, str3, deepLink);
    }

    public TaxonomyNode buildTaxonomyNode() {
        String str;
        if (getPageLink() != null) {
            SearchPageLink pageLink2 = getPageLink();
            C19383o.m32794d(pageLink2);
            str = pageLink2.getTaxonomyId().toString();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return new TaxonomyNode(str, getName(), getName());
        }
        return null;
    }

    public final String component1() {
        return getName();
    }

    public final List<ListingImage> component2() {
        return getImages();
    }

    public final SearchPageLink component3() {
        return getPageLink();
    }

    public final String component4() {
        return this.taxonomyStringId;
    }

    public final DeepLink component5() {
        return this.deepLinkField;
    }

    public final TaxonomyCategory copy(@C17402n(name = "name") String str, @C17402n(name = "images") List<ListingImage> list, @C17402n(name = "page_link") SearchPageLink searchPageLink, @C17402n(name = "taxonomy_id") String str2, @C17402n(name = "deep_link") DeepLink deepLink) {
        return new TaxonomyCategory(str, list, searchPageLink, str2, deepLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyCategory)) {
            return false;
        }
        TaxonomyCategory taxonomyCategory = (TaxonomyCategory) obj;
        return C19383o.m32792b(getName(), taxonomyCategory.getName()) && C19383o.m32792b(getImages(), taxonomyCategory.getImages()) && C19383o.m32792b(getPageLink(), taxonomyCategory.getPageLink()) && C19383o.m32792b(this.taxonomyStringId, taxonomyCategory.taxonomyStringId) && C19383o.m32792b(this.deepLinkField, taxonomyCategory.deepLinkField);
    }

    public String getDeepLink() {
        DeepLink deepLink = this.deepLinkField;
        if (deepLink != null) {
            return deepLink.getUrl();
        }
        return null;
    }

    public final DeepLink getDeepLinkField() {
        return this.deepLinkField;
    }

    public List<ListingImage> getImages() {
        return this.images;
    }

    public String getName() {
        return this.name;
    }

    public EtsyId getTaxonomyId() {
        return this.taxonomyId;
    }

    public final String getTaxonomyStringId() {
        return this.taxonomyStringId;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((getName() == null ? 0 : getName().hashCode()) * 31) + (getImages() == null ? 0 : getImages().hashCode())) * 31) + (getPageLink() == null ? 0 : getPageLink().hashCode())) * 31;
        String str = this.taxonomyStringId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.deepLinkField;
        if (deepLink != null) {
            i = deepLink.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setDeepLinkField(DeepLink deepLink) {
        this.deepLinkField = deepLink;
    }

    public void setImages(List<ListingImage> list) {
        this.images = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPageLink(SearchPageLink searchPageLink) {
        this.pageLink = searchPageLink;
    }

    public void setTaxonomyId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "<set-?>");
        this.taxonomyId = etsyId;
    }

    public final void setTaxonomyStringId(String str) {
        this.taxonomyStringId = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyCategory(name=");
        h.append(getName());
        h.append(", images=");
        h.append(getImages());
        h.append(", pageLink=");
        h.append(getPageLink());
        h.append(", taxonomyStringId=");
        h.append(this.taxonomyStringId);
        h.append(", deepLinkField=");
        h.append(this.deepLinkField);
        h.append(')');
        return h.toString();
    }

    public SearchPageLink getPageLink() {
        return this.pageLink;
    }
}
