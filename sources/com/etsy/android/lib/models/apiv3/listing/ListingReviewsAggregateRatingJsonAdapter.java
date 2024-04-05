package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ListingReviewsAggregateRatingJsonAdapter extends JsonAdapter<ListingReviewsAggregateRating> {
    public static final int $stable = 8;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("avg_rating", "count_1", "count_2", "count_3", "count_4", "count_5", ResponseConstants.STARS, "total_count");

    public ListingReviewsAggregateRatingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableFloatAdapter = yVar.mo68558c(Float.class, emptySet, "avgRating");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "count1");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingReviewsAggregateRating)";
    }

    public ListingReviewsAggregateRating fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Float f2 = null;
        Integer num6 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    f = this.nullableFloatAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num4 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num5 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    f2 = this.nullableFloatAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    num6 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ListingReviewsAggregateRating(f, num, num2, num3, num4, num5, f2, num6);
    }

    public void toJson(C17412w wVar, ListingReviewsAggregateRating listingReviewsAggregateRating) {
        C19383o.m32797g(wVar, "writer");
        if (listingReviewsAggregateRating != null) {
            wVar.mo68522b();
            wVar.mo68529h("avg_rating");
            this.nullableFloatAdapter.toJson(wVar, listingReviewsAggregateRating.getAvgRating());
            wVar.mo68529h("count_1");
            this.nullableIntAdapter.toJson(wVar, listingReviewsAggregateRating.getCount1());
            wVar.mo68529h("count_2");
            this.nullableIntAdapter.toJson(wVar, listingReviewsAggregateRating.getCount2());
            wVar.mo68529h("count_3");
            this.nullableIntAdapter.toJson(wVar, listingReviewsAggregateRating.getCount3());
            wVar.mo68529h("count_4");
            this.nullableIntAdapter.toJson(wVar, listingReviewsAggregateRating.getCount4());
            wVar.mo68529h("count_5");
            this.nullableIntAdapter.toJson(wVar, listingReviewsAggregateRating.getCount5());
            wVar.mo68529h(ResponseConstants.STARS);
            this.nullableFloatAdapter.toJson(wVar, listingReviewsAggregateRating.getStars());
            wVar.mo68529h("total_count");
            this.nullableIntAdapter.toJson(wVar, listingReviewsAggregateRating.getTotalCount());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
