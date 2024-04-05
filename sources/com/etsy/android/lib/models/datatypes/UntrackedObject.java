package com.etsy.android.lib.models.datatypes;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public abstract class UntrackedObject implements ITrackedObject {
    public static final int $stable = 0;

    @C17402n(ignore = true)
    public static /* synthetic */ void getOnSeenTrackingEvents$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackedPosition$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingName$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return -1;
    }

    @JsonIgnore
    public String getTrackingName() {
        return "";
    }

    @JsonIgnore
    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return new LinkedHashMap();
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "value");
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    @JsonIgnore
    public void setTrackingName(String str) {
    }

    @JsonIgnore
    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }
}
