package com.etsy.android.lib.models.datatypes;

import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.HashMap;

public class TrackedObject extends UntrackedObject {
    private AnalyticsProperty mAttribute;
    private Object mValue;

    public TrackedObject(AnalyticsProperty analyticsProperty, Object obj) {
        this.mAttribute = analyticsProperty;
        this.mValue = obj;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(this.mAttribute, this.mValue);
        return hashMap;
    }
}
