package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class Reviews {
    public static final int $stable = 8;
    private final ShopReview featuredListingReview;
    private final List<ReviewImage> listingReviewImages;
    private List<ReviewVideo> listingReviewVideos;
    private final List<ShopReview> listingReviews;
    private final List<ReviewImage> shopReviewImages;
    private final List<ShopReview> shopReviews;
    private final int totalListingReviewsCount;
    private final int totalShopReviewsCount;

    public enum ReviewType {
        LISTING,
        SHOP
    }

    public Reviews() {
        this(0, 0, (List) null, (List) null, (List) null, (List) null, (ShopReview) null, 127, (DefaultConstructorMarker) null);
    }

    public Reviews(@C17402n(name = "total_shop_reviews_count") int i, @C17402n(name = "total_listing_reviews_count") int i2, @C17402n(name = "shop_review_images") List<ReviewImage> list, @C17402n(name = "listing_review_images") List<ReviewImage> list2, @C17402n(name = "shop_reviews") List<ShopReview> list3, @C17402n(name = "listing_reviews") List<ShopReview> list4, @C17402n(name = "featured_listing_review") ShopReview shopReview) {
        this.totalShopReviewsCount = i;
        this.totalListingReviewsCount = i2;
        this.shopReviewImages = list;
        this.listingReviewImages = list2;
        this.shopReviews = list3;
        this.listingReviews = list4;
        this.featuredListingReview = shopReview;
    }

    public static /* synthetic */ Reviews copy$default(Reviews reviews, int i, int i2, List<ReviewImage> list, List<ReviewImage> list2, List<ShopReview> list3, List<ShopReview> list4, ShopReview shopReview, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = reviews.totalShopReviewsCount;
        }
        if ((i3 & 2) != 0) {
            i2 = reviews.totalListingReviewsCount;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            list = reviews.shopReviewImages;
        }
        List<ReviewImage> list5 = list;
        if ((i3 & 8) != 0) {
            list2 = reviews.listingReviewImages;
        }
        List<ReviewImage> list6 = list2;
        if ((i3 & 16) != 0) {
            list3 = reviews.shopReviews;
        }
        List<ShopReview> list7 = list3;
        if ((i3 & 32) != 0) {
            list4 = reviews.listingReviews;
        }
        List<ShopReview> list8 = list4;
        if ((i3 & 64) != 0) {
            shopReview = reviews.featuredListingReview;
        }
        return reviews.copy(i, i4, list5, list6, list7, list8, shopReview);
    }

    public final int component1() {
        return this.totalShopReviewsCount;
    }

    public final int component2() {
        return this.totalListingReviewsCount;
    }

    public final List<ReviewImage> component3() {
        return this.shopReviewImages;
    }

    public final List<ReviewImage> component4() {
        return this.listingReviewImages;
    }

    public final List<ShopReview> component5() {
        return this.shopReviews;
    }

    public final List<ShopReview> component6() {
        return this.listingReviews;
    }

    public final ShopReview component7() {
        return this.featuredListingReview;
    }

    public final Reviews copy(@C17402n(name = "total_shop_reviews_count") int i, @C17402n(name = "total_listing_reviews_count") int i2, @C17402n(name = "shop_review_images") List<ReviewImage> list, @C17402n(name = "listing_review_images") List<ReviewImage> list2, @C17402n(name = "shop_reviews") List<ShopReview> list3, @C17402n(name = "listing_reviews") List<ShopReview> list4, @C17402n(name = "featured_listing_review") ShopReview shopReview) {
        return new Reviews(i, i2, list, list2, list3, list4, shopReview);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reviews)) {
            return false;
        }
        Reviews reviews = (Reviews) obj;
        return this.totalShopReviewsCount == reviews.totalShopReviewsCount && this.totalListingReviewsCount == reviews.totalListingReviewsCount && C19383o.m32792b(this.shopReviewImages, reviews.shopReviewImages) && C19383o.m32792b(this.listingReviewImages, reviews.listingReviewImages) && C19383o.m32792b(this.shopReviews, reviews.shopReviews) && C19383o.m32792b(this.listingReviews, reviews.listingReviews) && C19383o.m32792b(this.featuredListingReview, reviews.featuredListingReview);
    }

    public final ShopReview getFeaturedListingReview() {
        return this.featuredListingReview;
    }

    public final List<ReviewImage> getListingReviewImages() {
        return this.listingReviewImages;
    }

    public final List<ReviewVideo> getListingReviewVideos() {
        return this.listingReviewVideos;
    }

    public final List<ShopReview> getListingReviews() {
        return this.listingReviews;
    }

    public final List<ReviewImage> getShopReviewImages() {
        return this.shopReviewImages;
    }

    public final List<ShopReview> getShopReviews() {
        return this.shopReviews;
    }

    public final int getTotalListingReviewsCount() {
        return this.totalListingReviewsCount;
    }

    public final int getTotalShopReviewsCount() {
        return this.totalShopReviewsCount;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.totalListingReviewsCount, Integer.hashCode(this.totalShopReviewsCount) * 31, 31);
        List<ReviewImage> list = this.shopReviewImages;
        int i = 0;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<ReviewImage> list2 = this.listingReviewImages;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ShopReview> list3 = this.shopReviews;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ShopReview> list4 = this.listingReviews;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ShopReview shopReview = this.featuredListingReview;
        if (shopReview != null) {
            i = shopReview.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setListingReviewVideos(List<ReviewVideo> list) {
        this.listingReviewVideos = list;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Reviews(totalShopReviewsCount=");
        h.append(this.totalShopReviewsCount);
        h.append(", totalListingReviewsCount=");
        h.append(this.totalListingReviewsCount);
        h.append(", shopReviewImages=");
        h.append(this.shopReviewImages);
        h.append(", listingReviewImages=");
        h.append(this.listingReviewImages);
        h.append(", shopReviews=");
        h.append(this.shopReviews);
        h.append(", listingReviews=");
        h.append(this.listingReviews);
        h.append(", featuredListingReview=");
        h.append(this.featuredListingReview);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Reviews(int r6, int r7, java.util.List r8, java.util.List r9, java.util.List r10, java.util.List r11, com.etsy.android.lib.models.apiv3.listing.ShopReview r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0007
            r14 = r0
            goto L_0x0008
        L_0x0007:
            r14 = r6
        L_0x0008:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r7
        L_0x000e:
            r6 = r13 & 4
            r7 = 0
            if (r6 == 0) goto L_0x0015
            r1 = r7
            goto L_0x0016
        L_0x0015:
            r1 = r8
        L_0x0016:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001c
            r2 = r7
            goto L_0x001d
        L_0x001c:
            r2 = r9
        L_0x001d:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0023
            r3 = r7
            goto L_0x0024
        L_0x0023:
            r3 = r10
        L_0x0024:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x002a
            r4 = r7
            goto L_0x002b
        L_0x002a:
            r4 = r11
        L_0x002b:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0031
            r13 = r7
            goto L_0x0032
        L_0x0031:
            r13 = r12
        L_0x0032:
            r6 = r5
            r7 = r14
            r8 = r0
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.Reviews.<init>(int, int, java.util.List, java.util.List, java.util.List, java.util.List, com.etsy.android.lib.models.apiv3.listing.ShopReview, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
