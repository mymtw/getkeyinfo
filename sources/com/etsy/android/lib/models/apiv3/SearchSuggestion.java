package com.etsy.android.lib.models.apiv3;

import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ISearchSuggestion;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.HashMap;

public class SearchSuggestion extends BaseModel implements ISearchSuggestion {
    public static final String WITH_IMAGE_ITEM_TYPE = "searchTermAndImage";
    private ListingImage image;
    private String mQuery = "";
    private int trackedPosition;
    private HashMap<AnalyticsProperty, Object> trackingParameters = new HashMap<>();
    private int viewType = R.id.view_type_search_term;

    public ListingImage getImage() {
        return this.image;
    }

    public String getQuery() {
        return this.mQuery;
    }

    public int getTrackedPosition() {
        return this.trackedPosition;
    }

    public int getViewType() {
        return this.viewType;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("query".equals(currentName)) {
                    String parseString = BaseModel.parseString(jsonParser);
                    this.mQuery = parseString;
                    this.trackingParameters.put(PredefinedAnalyticsProperty.QUERY, parseString);
                } else if (ResponseConstants.CONTENT_SOURCE.equals(currentName)) {
                    this.trackingParameters.put(PredefinedAnalyticsProperty.CONTENT_SOURCE, BaseModel.parseString(jsonParser));
                } else if (ResponseConstants.IMG.equals(currentName)) {
                    this.image = (ListingImage) BaseModel.parseObject(jsonParser, ListingImage.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setQuery(String str) {
        this.mQuery = str;
    }

    public void setTrackedPosition(int i) {
        this.trackedPosition = i;
    }

    public void setViewType(int i) {
        this.viewType = i;
    }

    @JsonIgnore
    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        return this.trackingParameters;
    }
}
