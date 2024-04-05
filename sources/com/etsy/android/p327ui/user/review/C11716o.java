package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.o */
public final class C11716o implements ITrackedObject {
    @JsonIgnore
    public final List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    @JsonIgnore
    public final int getTrackedPosition() {
        return 0;
    }

    public final String getTrackingName() {
        return "review_card_photo_upload_navigate_back";
    }

    @JsonIgnore
    public final Map<AnalyticsProperty, Object> getTrackingParameters() {
        return null;
    }

    @JsonIgnore
    public final void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "onSeenTrackingEvents");
    }

    @JsonIgnore
    public final void setTrackedPosition(int i) {
    }

    public final void setTrackingName(String str) {
    }

    @JsonIgnore
    public final void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }
}
