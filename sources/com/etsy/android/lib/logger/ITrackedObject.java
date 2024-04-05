package com.etsy.android.lib.logger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import java.util.List;
import java.util.Map;

public interface ITrackedObject extends C8698l {

    public static final class DefaultImpls {
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
    }

    @JsonIgnore
    List<C8696j> getOnSeenTrackingEvents();

    @JsonIgnore
    int getTrackedPosition();

    @JsonIgnore
    String getTrackingName();

    @JsonIgnore
    Map<AnalyticsProperty, Object> getTrackingParameters();

    @JsonIgnore
    void setOnSeenTrackingEvents(List<C8696j> list);

    @JsonIgnore
    void setTrackedPosition(int i);

    @JsonIgnore
    void setTrackingName(String str);

    @JsonIgnore
    void setTrackingParameters(Map<AnalyticsProperty, Object> map);
}
