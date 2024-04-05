package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;

@C17403o(generateAdapter = true)
public final class NotificationTooltip {
    public static final int $stable = 0;
    private final int displayIntervalDays;
    private final int requestInMillis;

    public NotificationTooltip(@C17402n(name = "request_in_milliseconds") int i, @C17402n(name = "display_interval_days") int i2) {
        this.requestInMillis = i;
        this.displayIntervalDays = i2;
    }

    public static /* synthetic */ NotificationTooltip copy$default(NotificationTooltip notificationTooltip, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = notificationTooltip.requestInMillis;
        }
        if ((i3 & 2) != 0) {
            i2 = notificationTooltip.displayIntervalDays;
        }
        return notificationTooltip.copy(i, i2);
    }

    public final int component1() {
        return this.requestInMillis;
    }

    public final int component2() {
        return this.displayIntervalDays;
    }

    public final NotificationTooltip copy(@C17402n(name = "request_in_milliseconds") int i, @C17402n(name = "display_interval_days") int i2) {
        return new NotificationTooltip(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationTooltip)) {
            return false;
        }
        NotificationTooltip notificationTooltip = (NotificationTooltip) obj;
        return this.requestInMillis == notificationTooltip.requestInMillis && this.displayIntervalDays == notificationTooltip.displayIntervalDays;
    }

    public final int getDisplayIntervalDays() {
        return this.displayIntervalDays;
    }

    public final int getRequestInMillis() {
        return this.requestInMillis;
    }

    public int hashCode() {
        return Integer.hashCode(this.displayIntervalDays) + (Integer.hashCode(this.requestInMillis) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("NotificationTooltip(requestInMillis=");
        h.append(this.requestInMillis);
        h.append(", displayIntervalDays=");
        return C0073e.m208h(h, this.displayIntervalDays, ')');
    }
}
