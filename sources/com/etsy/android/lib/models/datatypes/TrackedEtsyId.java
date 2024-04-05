package com.etsy.android.lib.models.datatypes;

import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.HashMap;

public class TrackedEtsyId extends UntrackedObject {
    private AnalyticsProperty mAttribute;
    private String mId;

    public TrackedEtsyId(AnalyticsProperty analyticsProperty, EtsyId etsyId) {
        String str;
        this.mAttribute = analyticsProperty;
        if (etsyId == null) {
            str = "";
        } else {
            str = etsyId.getId();
        }
        this.mId = str;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(this.mAttribute, this.mId);
        return hashMap;
    }

    public TrackedEtsyId(AnalyticsProperty analyticsProperty, String str) {
        this.mAttribute = analyticsProperty;
        this.mId = str;
    }

    public TrackedEtsyId(AnalyticsProperty analyticsProperty, Long l) {
        String str;
        this.mAttribute = analyticsProperty;
        if (l == null) {
            str = "";
        } else {
            str = l.toString();
        }
        this.mId = str;
    }
}
