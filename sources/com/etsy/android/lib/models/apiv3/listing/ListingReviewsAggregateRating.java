package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ListingReviewsAggregateRating {
    public static final int $stable = 0;
    private final Float avgRating;
    private final Integer count1;
    private final Integer count2;
    private final Integer count3;
    private final Integer count4;
    private final Integer count5;
    private final Float stars;
    private final Integer totalCount;

    public ListingReviewsAggregateRating(@C17402n(name = "avg_rating") Float f, @C17402n(name = "count_1") Integer num, @C17402n(name = "count_2") Integer num2, @C17402n(name = "count_3") Integer num3, @C17402n(name = "count_4") Integer num4, @C17402n(name = "count_5") Integer num5, @C17402n(name = "stars") Float f2, @C17402n(name = "total_count") Integer num6) {
        this.avgRating = f;
        this.count1 = num;
        this.count2 = num2;
        this.count3 = num3;
        this.count4 = num4;
        this.count5 = num5;
        this.stars = f2;
        this.totalCount = num6;
    }

    public static /* synthetic */ ListingReviewsAggregateRating copy$default(ListingReviewsAggregateRating listingReviewsAggregateRating, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Float f2, Integer num6, int i, Object obj) {
        ListingReviewsAggregateRating listingReviewsAggregateRating2 = listingReviewsAggregateRating;
        int i2 = i;
        return listingReviewsAggregateRating.copy((i2 & 1) != 0 ? listingReviewsAggregateRating2.avgRating : f, (i2 & 2) != 0 ? listingReviewsAggregateRating2.count1 : num, (i2 & 4) != 0 ? listingReviewsAggregateRating2.count2 : num2, (i2 & 8) != 0 ? listingReviewsAggregateRating2.count3 : num3, (i2 & 16) != 0 ? listingReviewsAggregateRating2.count4 : num4, (i2 & 32) != 0 ? listingReviewsAggregateRating2.count5 : num5, (i2 & 64) != 0 ? listingReviewsAggregateRating2.stars : f2, (i2 & 128) != 0 ? listingReviewsAggregateRating2.totalCount : num6);
    }

    public final Float component1() {
        return this.avgRating;
    }

    public final Integer component2() {
        return this.count1;
    }

    public final Integer component3() {
        return this.count2;
    }

    public final Integer component4() {
        return this.count3;
    }

    public final Integer component5() {
        return this.count4;
    }

    public final Integer component6() {
        return this.count5;
    }

    public final Float component7() {
        return this.stars;
    }

    public final Integer component8() {
        return this.totalCount;
    }

    public final ListingReviewsAggregateRating copy(@C17402n(name = "avg_rating") Float f, @C17402n(name = "count_1") Integer num, @C17402n(name = "count_2") Integer num2, @C17402n(name = "count_3") Integer num3, @C17402n(name = "count_4") Integer num4, @C17402n(name = "count_5") Integer num5, @C17402n(name = "stars") Float f2, @C17402n(name = "total_count") Integer num6) {
        return new ListingReviewsAggregateRating(f, num, num2, num3, num4, num5, f2, num6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingReviewsAggregateRating)) {
            return false;
        }
        ListingReviewsAggregateRating listingReviewsAggregateRating = (ListingReviewsAggregateRating) obj;
        return C19383o.m32792b(this.avgRating, listingReviewsAggregateRating.avgRating) && C19383o.m32792b(this.count1, listingReviewsAggregateRating.count1) && C19383o.m32792b(this.count2, listingReviewsAggregateRating.count2) && C19383o.m32792b(this.count3, listingReviewsAggregateRating.count3) && C19383o.m32792b(this.count4, listingReviewsAggregateRating.count4) && C19383o.m32792b(this.count5, listingReviewsAggregateRating.count5) && C19383o.m32792b(this.stars, listingReviewsAggregateRating.stars) && C19383o.m32792b(this.totalCount, listingReviewsAggregateRating.totalCount);
    }

    public final Float getAvgRating() {
        return this.avgRating;
    }

    public final Integer getCount1() {
        return this.count1;
    }

    public final Integer getCount2() {
        return this.count2;
    }

    public final Integer getCount3() {
        return this.count3;
    }

    public final Integer getCount4() {
        return this.count4;
    }

    public final Integer getCount5() {
        return this.count5;
    }

    public final Float getStars() {
        return this.stars;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        Float f = this.avgRating;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.count1;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.count2;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.count3;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.count4;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.count5;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f2 = this.stars;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num6 = this.totalCount;
        if (num6 != null) {
            i = num6.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingReviewsAggregateRating(avgRating=");
        h.append(this.avgRating);
        h.append(", count1=");
        h.append(this.count1);
        h.append(", count2=");
        h.append(this.count2);
        h.append(", count3=");
        h.append(this.count3);
        h.append(", count4=");
        h.append(this.count4);
        h.append(", count5=");
        h.append(this.count5);
        h.append(", stars=");
        h.append(this.stars);
        h.append(", totalCount=");
        return C0023f.m109j(h, this.totalCount, ')');
    }
}
