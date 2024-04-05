package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ReviewsJsonAdapter extends JsonAdapter<Reviews> {
    public static final int $stable = 8;
    private volatile Constructor<Reviews> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<ReviewImage>> nullableListOfReviewImageAdapter;
    private final JsonAdapter<List<ReviewVideo>> nullableListOfReviewVideoAdapter;
    private final JsonAdapter<List<ShopReview>> nullableListOfShopReviewAdapter;
    private final JsonAdapter<ShopReview> nullableShopReviewAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("total_shop_reviews_count", "total_listing_reviews_count", "shop_review_images", "listing_review_images", "shop_reviews", "listing_reviews", "featured_listing_review", "listingReviewVideos");

    public ReviewsJsonAdapter(C17414y yVar) {
        Class<ShopReview> cls = ShopReview.class;
        C19383o.m32797g(yVar, "moshi");
        Class cls2 = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls2, emptySet, "totalShopReviewsCount");
        this.nullableListOfReviewImageAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ReviewImage.class), emptySet, "shopReviewImages");
        this.nullableListOfShopReviewAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "shopReviews");
        this.nullableShopReviewAdapter = yVar.mo68558c(cls, emptySet, "featuredListingReview");
        this.nullableListOfReviewVideoAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ReviewVideo.class), emptySet, "listingReviewVideos");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Reviews)";
    }

    public Reviews fromJson(JsonReader jsonReader) {
        Reviews reviews;
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo68410b();
        boolean z = false;
        int i = -1;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        ShopReview shopReview = null;
        Integer num2 = num;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m("totalShopReviewsCount", "total_shop_reviews_count", jsonReader2);
                    }
                case 1:
                    num2 = this.intAdapter.fromJson(jsonReader2);
                    if (num2 != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C18215a.m30734m("totalListingReviewsCount", "total_listing_reviews_count", jsonReader2);
                    }
                case 2:
                    list2 = this.nullableListOfReviewImageAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    list3 = this.nullableListOfReviewImageAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    list4 = this.nullableListOfShopReviewAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    list5 = this.nullableListOfShopReviewAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    shopReview = this.nullableShopReviewAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    list = this.nullableListOfReviewVideoAdapter.fromJson(jsonReader2);
                    z = true;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -128) {
            reviews = new Reviews(num.intValue(), num2.intValue(), list2, list3, list4, list5, shopReview);
            list = list;
        } else {
            Constructor<Reviews> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                constructor = Reviews.class.getDeclaredConstructor(new Class[]{cls, cls, List.class, List.class, List.class, List.class, ShopReview.class, cls, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "Reviews::class.java.getD…his.constructorRef = it }");
            }
            Reviews newInstance = constructor.newInstance(new Object[]{num, num2, list2, list3, list4, list5, shopReview, Integer.valueOf(i), null});
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            reviews = newInstance;
        }
        if (z) {
            reviews.setListingReviewVideos(list);
        }
        return reviews;
    }

    public void toJson(C17412w wVar, Reviews reviews) {
        C19383o.m32797g(wVar, "writer");
        if (reviews != null) {
            wVar.mo68522b();
            wVar.mo68529h("total_shop_reviews_count");
            this.intAdapter.toJson(wVar, Integer.valueOf(reviews.getTotalShopReviewsCount()));
            wVar.mo68529h("total_listing_reviews_count");
            this.intAdapter.toJson(wVar, Integer.valueOf(reviews.getTotalListingReviewsCount()));
            wVar.mo68529h("shop_review_images");
            this.nullableListOfReviewImageAdapter.toJson(wVar, reviews.getShopReviewImages());
            wVar.mo68529h("listing_review_images");
            this.nullableListOfReviewImageAdapter.toJson(wVar, reviews.getListingReviewImages());
            wVar.mo68529h("shop_reviews");
            this.nullableListOfShopReviewAdapter.toJson(wVar, reviews.getShopReviews());
            wVar.mo68529h("listing_reviews");
            this.nullableListOfShopReviewAdapter.toJson(wVar, reviews.getListingReviews());
            wVar.mo68529h("featured_listing_review");
            this.nullableShopReviewAdapter.toJson(wVar, reviews.getFeaturedListingReview());
            wVar.mo68529h("listingReviewVideos");
            this.nullableListOfReviewVideoAdapter.toJson(wVar, reviews.getListingReviewVideos());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
