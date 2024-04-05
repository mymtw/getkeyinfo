package com.etsy.android.p072ad.impressions;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ad.impressions.AdImpressionLog */
public final class AdImpressionLog {

    /* renamed from: a */
    public final List<String> f14107a;

    /* renamed from: b */
    public final List<String> f14108b;

    public AdImpressionLog(@C17402n(name = "display_locs") List<String> list, @C17402n(name = "logging_keys") List<String> list2) {
        C19383o.m32797g(list, "displayLocations");
        C19383o.m32797g(list2, "loggingKeys");
        this.f14107a = list;
        this.f14108b = list2;
    }

    public final AdImpressionLog copy(@C17402n(name = "display_locs") List<String> list, @C17402n(name = "logging_keys") List<String> list2) {
        C19383o.m32797g(list, "displayLocations");
        C19383o.m32797g(list2, "loggingKeys");
        return new AdImpressionLog(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdImpressionLog)) {
            return false;
        }
        AdImpressionLog adImpressionLog = (AdImpressionLog) obj;
        return C19383o.m32792b(this.f14107a, adImpressionLog.f14107a) && C19383o.m32792b(this.f14108b, adImpressionLog.f14108b);
    }

    public final int hashCode() {
        return this.f14108b.hashCode() + (this.f14107a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AdImpressionLog(displayLocations=");
        h.append(this.f14107a);
        h.append(", loggingKeys=");
        return C0070b.m186i(h, this.f14108b, ')');
    }
}
