package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class RecentlyViewedRequestBody {
    public static final int $stable = 8;
    private final Integer limit;
    private final long listingId;
    private final Map<String, String> listingIdsToTimestamps;
    private final String uaid;

    public RecentlyViewedRequestBody(@C17402n(name = "uaid") String str, @C17402n(name = "limit") Integer num, @C17402n(name = "listing_id") long j, @C17402n(name = "listing_ids_to_timestamps") Map<String, String> map) {
        C19383o.m32797g(str, "uaid");
        C19383o.m32797g(map, "listingIdsToTimestamps");
        this.uaid = str;
        this.limit = num;
        this.listingId = j;
        this.listingIdsToTimestamps = map;
    }

    public static /* synthetic */ RecentlyViewedRequestBody copy$default(RecentlyViewedRequestBody recentlyViewedRequestBody, String str, Integer num, long j, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentlyViewedRequestBody.uaid;
        }
        if ((i & 2) != 0) {
            num = recentlyViewedRequestBody.limit;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            j = recentlyViewedRequestBody.listingId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            map = recentlyViewedRequestBody.listingIdsToTimestamps;
        }
        return recentlyViewedRequestBody.copy(str, num2, j2, map);
    }

    public final String component1() {
        return this.uaid;
    }

    public final Integer component2() {
        return this.limit;
    }

    public final long component3() {
        return this.listingId;
    }

    public final Map<String, String> component4() {
        return this.listingIdsToTimestamps;
    }

    public final RecentlyViewedRequestBody copy(@C17402n(name = "uaid") String str, @C17402n(name = "limit") Integer num, @C17402n(name = "listing_id") long j, @C17402n(name = "listing_ids_to_timestamps") Map<String, String> map) {
        C19383o.m32797g(str, "uaid");
        C19383o.m32797g(map, "listingIdsToTimestamps");
        return new RecentlyViewedRequestBody(str, num, j, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyViewedRequestBody)) {
            return false;
        }
        RecentlyViewedRequestBody recentlyViewedRequestBody = (RecentlyViewedRequestBody) obj;
        return C19383o.m32792b(this.uaid, recentlyViewedRequestBody.uaid) && C19383o.m32792b(this.limit, recentlyViewedRequestBody.limit) && this.listingId == recentlyViewedRequestBody.listingId && C19383o.m32792b(this.listingIdsToTimestamps, recentlyViewedRequestBody.listingIdsToTimestamps);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final long getListingId() {
        return this.listingId;
    }

    public final Map<String, String> getListingIdsToTimestamps() {
        return this.listingIdsToTimestamps;
    }

    public final String getUaid() {
        return this.uaid;
    }

    public int hashCode() {
        int hashCode = this.uaid.hashCode() * 31;
        Integer num = this.limit;
        return this.listingIdsToTimestamps.hashCode() + C0071c.m190b(this.listingId, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("RecentlyViewedRequestBody(uaid=");
        h.append(this.uaid);
        h.append(", limit=");
        h.append(this.limit);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", listingIdsToTimestamps=");
        h.append(this.listingIdsToTimestamps);
        h.append(')');
        return h.toString();
    }
}
