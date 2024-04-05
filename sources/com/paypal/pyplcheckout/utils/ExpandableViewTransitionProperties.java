package com.paypal.pyplcheckout.utils;

import android.support.p013v4.media.session.C0087d;

public final class ExpandableViewTransitionProperties {
    private final long delay;
    private final long duration;

    public ExpandableViewTransitionProperties(long j, long j2) {
        this.delay = j;
        this.duration = j2;
    }

    public static /* synthetic */ ExpandableViewTransitionProperties copy$default(ExpandableViewTransitionProperties expandableViewTransitionProperties, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = expandableViewTransitionProperties.delay;
        }
        if ((i & 2) != 0) {
            j2 = expandableViewTransitionProperties.duration;
        }
        return expandableViewTransitionProperties.copy(j, j2);
    }

    public final long component1() {
        return this.delay;
    }

    public final long component2() {
        return this.duration;
    }

    public final ExpandableViewTransitionProperties copy(long j, long j2) {
        return new ExpandableViewTransitionProperties(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandableViewTransitionProperties)) {
            return false;
        }
        ExpandableViewTransitionProperties expandableViewTransitionProperties = (ExpandableViewTransitionProperties) obj;
        return this.delay == expandableViewTransitionProperties.delay && this.duration == expandableViewTransitionProperties.duration;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final long getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return Long.hashCode(this.duration) + (Long.hashCode(this.delay) * 31);
    }

    public String toString() {
        long j = this.delay;
        long j2 = this.duration;
        StringBuilder sb = new StringBuilder();
        sb.append("ExpandableViewTransitionProperties(delay=");
        sb.append(j);
        sb.append(", duration=");
        return C0087d.m236f(sb, j2, ")");
    }
}
