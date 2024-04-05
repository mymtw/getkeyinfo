package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FacetCountListMap extends BaseModel {
    public List<AttributeFacet> mAttributeFacets;
    public List<FacetCount> mCategoryFacets;
    public MarketplaceFacets mMarketplaceFacets;

    public static class MarketplaceFacets {
        public boolean mHasHandmade;
        public boolean mHasVintage;

        public static MarketplaceFacets empty() {
            return new MarketplaceFacets(new ArrayList(0));
        }

        public MarketplaceFacets() {
        }

        private MarketplaceFacets(List<FacetCount> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                FacetCount facetCount = list.get(i);
                if (facetCount.getId().equals(ResponseConstants.HANDMADE)) {
                    this.mHasHandmade = true;
                } else if (facetCount.getId().equals("vintage")) {
                    this.mHasVintage = true;
                }
            }
        }
    }

    public List<AttributeFacet> getAttributeFacets() {
        List<AttributeFacet> list = this.mAttributeFacets;
        return list != null ? list : new ArrayList();
    }

    public List<FacetCount> getCategoryFacetCounts() {
        List<FacetCount> list = this.mCategoryFacets;
        return list != null ? list : new ArrayList();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("categories".equals(currentName)) {
                    this.mCategoryFacets = BaseModel.parseArray(jsonParser, FacetCount.class);
                } else if (ResponseConstants.MARKETPLACES.equals(currentName)) {
                    this.mMarketplaceFacets = new MarketplaceFacets(BaseModel.parseArray(jsonParser, FacetCount.class));
                } else if (ResponseConstants.ATTRIBUTES.equals(currentName)) {
                    this.mAttributeFacets = BaseModel.parseArray(jsonParser, AttributeFacet.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
