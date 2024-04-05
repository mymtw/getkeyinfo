package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ReviewCarouselItem {
    public static final int $stable = 8;
    private final ListingImage image;
    private final String listingTitle;
    private final String title;
    private final long transactionId;

    public ReviewCarouselItem(@C17402n(name = "transaction_id") long j, @C17402n(name = "image") ListingImage listingImage, @C17402n(name = "title") String str, @C17402n(name = "listing_title") String str2) {
        C19383o.m32797g(listingImage, ResponseConstants.IMAGE);
        C19383o.m32797g(str, "title");
        C19383o.m32797g(str2, "listingTitle");
        this.transactionId = j;
        this.image = listingImage;
        this.title = str;
        this.listingTitle = str2;
    }

    public static /* synthetic */ ReviewCarouselItem copy$default(ReviewCarouselItem reviewCarouselItem, long j, ListingImage listingImage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = reviewCarouselItem.transactionId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            listingImage = reviewCarouselItem.image;
        }
        ListingImage listingImage2 = listingImage;
        if ((i & 4) != 0) {
            str = reviewCarouselItem.title;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = reviewCarouselItem.listingTitle;
        }
        return reviewCarouselItem.copy(j2, listingImage2, str3, str2);
    }

    public final long component1() {
        return this.transactionId;
    }

    public final ListingImage component2() {
        return this.image;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.listingTitle;
    }

    public final ReviewCarouselItem copy(@C17402n(name = "transaction_id") long j, @C17402n(name = "image") ListingImage listingImage, @C17402n(name = "title") String str, @C17402n(name = "listing_title") String str2) {
        C19383o.m32797g(listingImage, ResponseConstants.IMAGE);
        C19383o.m32797g(str, "title");
        C19383o.m32797g(str2, "listingTitle");
        return new ReviewCarouselItem(j, listingImage, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewCarouselItem)) {
            return false;
        }
        ReviewCarouselItem reviewCarouselItem = (ReviewCarouselItem) obj;
        return this.transactionId == reviewCarouselItem.transactionId && C19383o.m32792b(this.image, reviewCarouselItem.image) && C19383o.m32792b(this.title, reviewCarouselItem.title) && C19383o.m32792b(this.listingTitle, reviewCarouselItem.listingTitle);
    }

    public final ListingImage getImage() {
        return this.image;
    }

    public final String getListingTitle() {
        return this.listingTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode();
        return this.listingTitle.hashCode() + C0023f.m105e(this.title, (hashCode + (Long.hashCode(this.transactionId) * 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ReviewCarouselItem(transactionId=");
        h.append(this.transactionId);
        h.append(", image=");
        h.append(this.image);
        h.append(", title=");
        h.append(this.title);
        h.append(", listingTitle=");
        return C0391c.m1057c(h, this.listingTitle, ')');
    }
}
