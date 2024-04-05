package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Map;

public interface VespaListingShare extends BasicListingLike {
    String getBtnText();

    @JsonIgnore
    /* synthetic */ List<C8696j> getOnSeenTrackingEvents();

    String getShareText();

    @JsonIgnore
    /* synthetic */ int getTrackedPosition();

    @JsonIgnore
    /* synthetic */ String getTrackingName();

    @JsonIgnore
    /* synthetic */ Map<AnalyticsProperty, Object> getTrackingParameters();

    /* synthetic */ int getViewType();

    @JsonIgnore
    /* synthetic */ void setOnSeenTrackingEvents(List<C8696j> list);

    @JsonIgnore
    /* synthetic */ void setTrackedPosition(int i);

    @JsonIgnore
    /* synthetic */ void setTrackingName(String str);

    @JsonIgnore
    /* synthetic */ void setTrackingParameters(Map<AnalyticsProperty, Object> map);
}
