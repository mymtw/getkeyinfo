package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ISearchPageLink;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class SearchPageLink implements ISearchPageLink, C8698l {
    public static final int $stable = 8;
    private transient boolean isCategoryPage;
    private final String pageTitle;
    private final String pageType;
    private transient EtsyId taxonomyId;
    private final String taxonomyStringId;

    public SearchPageLink(@C17402n(name = "taxonomy_id") String str, @C17402n(name = "page_type") String str2, @C17402n(name = "page_title") String str3) {
        this.taxonomyStringId = str;
        this.pageType = str2;
        this.pageTitle = str3;
        this.taxonomyId = new EtsyId(str);
        this.isCategoryPage = C19383o.m32792b(ResponseConstants.CATEGORY_PAGE, str2);
    }

    public static /* synthetic */ SearchPageLink copy$default(SearchPageLink searchPageLink, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchPageLink.taxonomyStringId;
        }
        if ((i & 2) != 0) {
            str2 = searchPageLink.pageType;
        }
        if ((i & 4) != 0) {
            str3 = searchPageLink.getPageTitle();
        }
        return searchPageLink.copy(str, str2, str3);
    }

    public final String component1() {
        return this.taxonomyStringId;
    }

    public final String component2() {
        return this.pageType;
    }

    public final String component3() {
        return getPageTitle();
    }

    public final SearchPageLink copy(@C17402n(name = "taxonomy_id") String str, @C17402n(name = "page_type") String str2, @C17402n(name = "page_title") String str3) {
        return new SearchPageLink(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPageLink)) {
            return false;
        }
        SearchPageLink searchPageLink = (SearchPageLink) obj;
        return C19383o.m32792b(this.taxonomyStringId, searchPageLink.taxonomyStringId) && C19383o.m32792b(this.pageType, searchPageLink.pageType) && C19383o.m32792b(getPageTitle(), searchPageLink.getPageTitle());
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public EtsyId getTaxonomyId() {
        return this.taxonomyId;
    }

    public final String getTaxonomyStringId() {
        return this.taxonomyStringId;
    }

    public int getViewType() {
        return R.id.view_type_section_link_footer;
    }

    public int hashCode() {
        String str = this.taxonomyStringId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pageType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (getPageTitle() != null) {
            i = getPageTitle().hashCode();
        }
        return hashCode2 + i;
    }

    public boolean isCategoryPage() {
        return this.isCategoryPage;
    }

    public void setCategoryPage(boolean z) {
        this.isCategoryPage = z;
    }

    public void setTaxonomyId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "<set-?>");
        this.taxonomyId = etsyId;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchPageLink(taxonomyStringId=");
        h.append(this.taxonomyStringId);
        h.append(", pageType=");
        h.append(this.pageType);
        h.append(", pageTitle=");
        h.append(getPageTitle());
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchPageLink(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
    }
}
