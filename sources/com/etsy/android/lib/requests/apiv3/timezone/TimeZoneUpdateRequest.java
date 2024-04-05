package com.etsy.android.lib.requests.apiv3.timezone;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TimeZoneUpdateRequest {
    public static final int $stable = 0;
    private final String timeZone;

    public TimeZoneUpdateRequest(@C17402n(name = "timezone") String str) {
        C19383o.m32797g(str, "timeZone");
        this.timeZone = str;
    }

    public static /* synthetic */ TimeZoneUpdateRequest copy$default(TimeZoneUpdateRequest timeZoneUpdateRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timeZoneUpdateRequest.timeZone;
        }
        return timeZoneUpdateRequest.copy(str);
    }

    public final String component1() {
        return this.timeZone;
    }

    public final TimeZoneUpdateRequest copy(@C17402n(name = "timezone") String str) {
        C19383o.m32797g(str, "timeZone");
        return new TimeZoneUpdateRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeZoneUpdateRequest) && C19383o.m32792b(this.timeZone, ((TimeZoneUpdateRequest) obj).timeZone);
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return this.timeZone.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("TimeZoneUpdateRequest(timeZone="), this.timeZone, ')');
    }
}
