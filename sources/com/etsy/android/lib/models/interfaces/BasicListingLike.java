package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p415of.C13186o;

public interface BasicListingLike extends Serializable, C13186o, SocialShareable, ITrackedObject {
    EtsyId getListingId();

    ListingImage getListingImage();

    @JsonIgnore
    /* synthetic */ List<C8696j> getOnSeenTrackingEvents();

    EtsyMoney getPrice();

    String getTitle();

    @JsonIgnore
    /* synthetic */ int getTrackedPosition();

    @JsonIgnore
    /* synthetic */ String getTrackingName();

    @JsonIgnore
    /* synthetic */ Map<AnalyticsProperty, Object> getTrackingParameters();

    String getUrl();

    /* synthetic */ int getViewType();

    boolean isAd();

    @JsonIgnore
    /* synthetic */ void setOnSeenTrackingEvents(List<C8696j> list);

    @JsonIgnore
    /* synthetic */ void setTrackedPosition(int i);

    @JsonIgnore
    /* synthetic */ void setTrackingName(String str);

    @JsonIgnore
    /* synthetic */ void setTrackingParameters(Map<AnalyticsProperty, Object> map);
}
