package com.etsy.android.lib.models.apiv3.search;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class GiftGuide {
    public static final int $stable = 8;
    private final String deepLink;
    private final ListingImage image;
    private final String title;

    public GiftGuide(@C17402n(name = "title") String str, @C17402n(name = "image") ListingImage listingImage, @C17402n(name = "deep_link") String str2) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(listingImage, ResponseConstants.IMAGE);
        C19383o.m32797g(str2, "deepLink");
        this.title = str;
        this.image = listingImage;
        this.deepLink = str2;
    }

    public static /* synthetic */ GiftGuide copy$default(GiftGuide giftGuide, String str, ListingImage listingImage, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftGuide.title;
        }
        if ((i & 2) != 0) {
            listingImage = giftGuide.image;
        }
        if ((i & 4) != 0) {
            str2 = giftGuide.deepLink;
        }
        return giftGuide.copy(str, listingImage, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final ListingImage component2() {
        return this.image;
    }

    public final String component3() {
        return this.deepLink;
    }

    public final GiftGuide copy(@C17402n(name = "title") String str, @C17402n(name = "image") ListingImage listingImage, @C17402n(name = "deep_link") String str2) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(listingImage, ResponseConstants.IMAGE);
        C19383o.m32797g(str2, "deepLink");
        return new GiftGuide(str, listingImage, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftGuide)) {
            return false;
        }
        GiftGuide giftGuide = (GiftGuide) obj;
        return C19383o.m32792b(this.title, giftGuide.title) && C19383o.m32792b(this.image, giftGuide.image) && C19383o.m32792b(this.deepLink, giftGuide.deepLink);
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final ListingImage getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode();
        return this.deepLink.hashCode() + ((hashCode + (this.title.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GiftGuide(title=");
        h.append(this.title);
        h.append(", image=");
        h.append(this.image);
        h.append(", deepLink=");
        return C0391c.m1057c(h, this.deepLink, ')');
    }
}
