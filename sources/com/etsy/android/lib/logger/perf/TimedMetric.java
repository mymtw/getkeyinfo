package com.etsy.android.lib.logger.perf;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PlatformAnalyticsProperty;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum TimedMetric {
    ;
    
    private final AnalyticsProperty analyticsLogAttribute;

    public static final class BLOCKING_NETWORK extends TimedMetric {
        public BLOCKING_NETWORK(String str, int i) {
            super(str, i, PlatformAnalyticsProperty.BLOCKING_NETWORK_TIMERS, (DefaultConstructorMarker) null);
        }

        public boolean isTimerGrouped() {
            return true;
        }

        public PlatformAnalyticsProperty getCountAttribute() {
            return PlatformAnalyticsProperty.BLOCKING_NETWORK_COUNT;
        }

        public PlatformAnalyticsProperty getDurationAttribute() {
            return PlatformAnalyticsProperty.BLOCKING_NETWORK_DURATION;
        }
    }

    public static final class NONBLOCKING_NETWORK extends TimedMetric {
        public NONBLOCKING_NETWORK(String str, int i) {
            super(str, i, PlatformAnalyticsProperty.NONBLOCKING_NETWORK_TIMERS, (DefaultConstructorMarker) null);
        }

        public boolean isTimerGrouped() {
            return true;
        }

        public PlatformAnalyticsProperty getCountAttribute() {
            return PlatformAnalyticsProperty.NONBLOCKING_NETWORK_COUNT;
        }

        public PlatformAnalyticsProperty getDurationAttribute() {
            return PlatformAnalyticsProperty.NONBLOCKING_NETWORK_DURATION;
        }
    }

    public static final class TIME_TO_FIRST_CONTENT extends TimedMetric {
        public TIME_TO_FIRST_CONTENT(String str, int i) {
            super(str, i, PlatformAnalyticsProperty.TIME_TO_FIRST_CONTENT, (DefaultConstructorMarker) null);
        }

        public AnalyticsProperty getCountAttribute() {
            return null;
        }

        public AnalyticsProperty getDurationAttribute() {
            return null;
        }

        public boolean isTimerGrouped() {
            return false;
        }
    }

    private TimedMetric(AnalyticsProperty analyticsProperty) {
        this.analyticsLogAttribute = analyticsProperty;
    }

    public final AnalyticsProperty getAnalyticsLogAttribute() {
        return this.analyticsLogAttribute;
    }

    public abstract AnalyticsProperty getCountAttribute();

    public abstract AnalyticsProperty getDurationAttribute();

    public abstract boolean isTimerGrouped();
}
