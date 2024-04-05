package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Map;

public interface ListingLike extends BasicListingLike {
    ListingImage getListingImage();

    @JsonIgnore
    /* synthetic */ List<C8696j> getOnSeenTrackingEvents();

    String getProlistLoggingKey() {
        return null;
    }

    EtsyId getShopId();

    String getShopName();

    @JsonIgnore
    /* synthetic */ int getTrackedPosition();

    @JsonIgnore
    /* synthetic */ String getTrackingName();

    @JsonIgnore
    /* synthetic */ Map<AnalyticsProperty, Object> getTrackingParameters();

    /* synthetic */ int getViewType();

    boolean hasCollections();

    boolean isAd();

    boolean isFavorite();

    void setHasCollections(boolean z);

    void setIsFavorite(boolean z);

    @JsonIgnore
    /* synthetic */ void setOnSeenTrackingEvents(List<C8696j> list);

    void setShouldShowRelatedListings(boolean z);

    @JsonIgnore
    /* synthetic */ void setTrackedPosition(int i);

    @JsonIgnore
    /* synthetic */ void setTrackingName(String str);

    @JsonIgnore
    /* synthetic */ void setTrackingParameters(Map<AnalyticsProperty, Object> map);

    boolean shouldShowRelatedListings();
}
