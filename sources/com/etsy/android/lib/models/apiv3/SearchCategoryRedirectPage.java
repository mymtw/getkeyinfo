package com.etsy.android.lib.models.apiv3;

import androidx.media.MediaBrowserServiceCompat;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.EtsyArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class SearchCategoryRedirectPage extends BaseFieldModel {
    public static final String PARAM_QUERY = "q";
    private final String KEY_FILTER_PARAMS = "filter_parameters";
    private final String KEY_LANDING_PAGE = ResponseConstants.LANDING_PAGE;
    private final String KEY_NODE = "node";
    private final String KEY_SEARCH_RESULTS = MediaBrowserServiceCompat.KEY_SEARCH_RESULTS;
    public Page mCategoryLandingPage;
    public EtsyArray mFilterParams;
    public SearchWithAds mSearchWithAds;
    public TaxonomyNode mTaxonomyNode;

    public static class SearchCategoryRedirectPageBuilder {
        /* access modifiers changed from: private */
        public Page categoryLandingPage;
        /* access modifiers changed from: private */
        public EtsyArray filterParams;
        /* access modifiers changed from: private */
        public SearchWithAds searchWithAds;
        /* access modifiers changed from: private */
        public TaxonomyNode taxonomyNode;

        public SearchCategoryRedirectPage build() {
            return new SearchCategoryRedirectPage(this);
        }

        public SearchCategoryRedirectPageBuilder categoryLandingPage(Page page) {
            this.categoryLandingPage = page;
            return this;
        }

        public SearchCategoryRedirectPageBuilder filterParams(EtsyArray etsyArray) {
            this.filterParams = etsyArray;
            return this;
        }

        public SearchCategoryRedirectPageBuilder searchWithAds(SearchWithAds searchWithAds2) {
            this.searchWithAds = searchWithAds2;
            return this;
        }

        public SearchCategoryRedirectPageBuilder taxonomyNode(TaxonomyNode taxonomyNode2) {
            this.taxonomyNode = taxonomyNode2;
            return this;
        }
    }

    public SearchCategoryRedirectPage() {
    }

    public String getFilterParam(String str) {
        EtsyArray etsyArray = this.mFilterParams;
        return etsyArray == null ? "" : etsyArray.getData().optString(str, "");
    }

    public SearchWithAds getSearchResults() {
        return this.mSearchWithAds;
    }

    public TaxonomyNode getTaxonomyNode() {
        return this.mTaxonomyNode;
    }

    public boolean isCategoryLandingPage() {
        return this.mCategoryLandingPage != null;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.LANDING_PAGE.equals(str)) {
            this.mCategoryLandingPage = (Page) BaseModel.parseObject(jsonParser, Page.class);
        } else if (MediaBrowserServiceCompat.KEY_SEARCH_RESULTS.equals(str)) {
            this.mSearchWithAds = (SearchWithAds) BaseModel.parseObject(jsonParser, SearchWithAds.class);
        } else if ("node".equals(str)) {
            this.mTaxonomyNode = (TaxonomyNode) BaseModel.parseObject(jsonParser, TaxonomyNode.class);
        } else if (!"filter_parameters".equals(str)) {
            return false;
        } else {
            this.mFilterParams = (EtsyArray) BaseModel.parseObject(jsonParser, EtsyArray.class);
        }
        return true;
    }

    public SearchCategoryRedirectPage(SearchCategoryRedirectPageBuilder searchCategoryRedirectPageBuilder) {
        this.mSearchWithAds = searchCategoryRedirectPageBuilder.searchWithAds;
        this.mCategoryLandingPage = searchCategoryRedirectPageBuilder.categoryLandingPage;
        this.mTaxonomyNode = searchCategoryRedirectPageBuilder.taxonomyNode;
        this.mFilterParams = searchCategoryRedirectPageBuilder.filterParams;
    }
}
