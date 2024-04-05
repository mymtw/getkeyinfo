package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;

public interface ISearchSuggestion extends C13186o, ITrackedObject {

    public static final class DefaultImpls {
        @JsonIgnore
        public static List<C8696j> getOnSeenTrackingEvents(ISearchSuggestion iSearchSuggestion) {
            return new ArrayList();
        }

        @JsonIgnore
        public static int getTrackedPosition(ISearchSuggestion iSearchSuggestion) {
            return 0;
        }

        @JsonIgnore
        public static String getTrackingName(ISearchSuggestion iSearchSuggestion) {
            return "";
        }

        @JsonIgnore
        public static Map<AnalyticsProperty, Object> getTrackingParameters(ISearchSuggestion iSearchSuggestion) {
            return null;
        }

        @JsonIgnore
        public static void setOnSeenTrackingEvents(ISearchSuggestion iSearchSuggestion, List<C8696j> list) {
            C19383o.m32797g(list, "onSeenTrackingEvents");
        }

        @JsonIgnore
        public static void setTrackedPosition(ISearchSuggestion iSearchSuggestion, int i) {
        }

        @JsonIgnore
        public static void setTrackingName(ISearchSuggestion iSearchSuggestion, String str) {
        }

        @JsonIgnore
        public static void setTrackingParameters(ISearchSuggestion iSearchSuggestion, Map<AnalyticsProperty, Object> map) {
        }
    }

    ListingImage getImage();

    @JsonIgnore
    /* synthetic */ List<C8696j> getOnSeenTrackingEvents();

    String getQuery();

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
