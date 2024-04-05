package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.filters.StaticFilters;
import com.etsy.android.lib.models.apiv3.search.GuidedSearch;
import com.etsy.android.lib.models.apiv3.search.QueryCorrection;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.List;

public class SearchWithAds extends BaseModel {
    private static final String FACET_COUNTS = "facet_counts";
    private static final String FEATURED_CATEGORIES = "featured_categories";
    private static final String GUIDED_SEARCH = "guided_search";
    private static final String HEADER_MESSAGES = "header_messages";
    private static final String PRICE_BUCKETS = "price_buckets";
    private static final String SAVED_SEARCH_ID = "saved_search_id";
    private static final String SHOW_EMAIL_SIGNUP_MODAL = "show_email_signup_modal";
    private static final String STATIC_FILTERS = "static_filters";
    private static final String USER_HAS_SAVED_SEARCHES = "user_has_saved_searches";
    public ListingCard anchorListing;
    public List<SearchBannerMessage> bannerMessages;
    public int count;
    public FacetCountListMap facetCounts = new FacetCountListMap();
    public List<FormattedTaxonomyCategory> featuredCategories;
    public GuidedSearch guidedSearch;
    public List<ListingCard> listingCardList;
    public List<Integer> priceBuckets;
    public QueryCorrection queryCorrection;
    public Long savedSearchId = null;
    public boolean showEmailSignUpModal = false;
    public StaticFilters staticFilters;
    public boolean userHasSavedSearches = false;

    public ListingCard getAnchorListing() {
        return this.anchorListing;
    }

    public List<SearchBannerMessage> getBannerMessages() {
        return this.bannerMessages;
    }

    public int getCount() {
        return this.count;
    }

    public FacetCountListMap getFacetCountListMap() {
        return this.facetCounts;
    }

    public List<FormattedTaxonomyCategory> getFeaturedCategories() {
        return this.featuredCategories;
    }

    public GuidedSearch getGuidedSearch() {
        return this.guidedSearch;
    }

    public List<ListingCard> getListingCardList() {
        return this.listingCardList;
    }

    public List<Integer> getPriceBuckets() {
        return this.priceBuckets;
    }

    public QueryCorrection getQueryCorrection() {
        return this.queryCorrection;
    }

    public Long getSavedSearchId() {
        return this.savedSearchId;
    }

    public StaticFilters getStaticFilters() {
        return this.staticFilters;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1792151859:
                        if (currentName.equals("featured_categories")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1486397369:
                        if (currentName.equals(USER_HAS_SAVED_SEARCHES)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -836252886:
                        if (currentName.equals(STATIC_FILTERS)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -711897908:
                        if (currentName.equals(FACET_COUNTS)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 94851343:
                        if (currentName.equals(ResponseConstants.COUNT)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 296460026:
                        if (currentName.equals(ResponseConstants.ANCHOR_LISTING)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 507219765:
                        if (currentName.equals(ResponseConstants.QUERY_CORRECTION)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 648640346:
                        if (currentName.equals("saved_search_id")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1094418699:
                        if (currentName.equals(SHOW_EMAIL_SIGNUP_MODAL)) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1097546742:
                        if (currentName.equals(ResponseConstants.RESULTS)) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1772155603:
                        if (currentName.equals(PRICE_BUCKETS)) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1870061246:
                        if (currentName.equals(HEADER_MESSAGES)) {
                            c = 11;
                            break;
                        }
                        break;
                    case 2009426143:
                        if (currentName.equals(GUIDED_SEARCH)) {
                            c = 12;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.featuredCategories = BaseModel.parseArray(jsonParser, FormattedTaxonomyCategory.class);
                        break;
                    case 1:
                        this.userHasSavedSearches = jsonParser.getBooleanValue();
                        break;
                    case 2:
                        this.staticFilters = (StaticFilters) BaseModel.parseObject(jsonParser, StaticFilters.class);
                        break;
                    case 3:
                        this.facetCounts = (FacetCountListMap) BaseModel.parseObject(jsonParser, FacetCountListMap.class);
                        break;
                    case 4:
                        this.count = jsonParser.getValueAsInt();
                        break;
                    case 5:
                        ListingCard listingCard = (ListingCard) BaseModel.parseObject(jsonParser, ListingCard.class);
                        if (listingCard != null && !listingCard.hasError()) {
                            this.anchorListing = listingCard;
                            break;
                        }
                    case 6:
                        this.queryCorrection = (QueryCorrection) BaseModel.parseObject(jsonParser, QueryCorrection.class);
                        break;
                    case 7:
                        this.savedSearchId = Long.valueOf(jsonParser.getLongValue());
                        break;
                    case 8:
                        this.showEmailSignUpModal = jsonParser.getBooleanValue();
                        break;
                    case 9:
                        this.listingCardList = BaseModel.parseArray(jsonParser, ListingCard.class);
                        break;
                    case 10:
                        this.priceBuckets = BaseModel.parseIntArray(jsonParser);
                        break;
                    case 11:
                        this.bannerMessages = BaseModel.parseArray(jsonParser, SearchBannerMessage.class);
                        break;
                    case 12:
                        this.guidedSearch = (GuidedSearch) BaseModel.parseObject(jsonParser, GuidedSearch.class);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public boolean showEmailSignUpModal() {
        return this.showEmailSignUpModal;
    }

    public boolean userHasSavedSearches() {
        return this.userHasSavedSearches;
    }
}
