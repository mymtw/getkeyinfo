package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowListingInfo */
public final class ReviewFlowListingInfo {

    /* renamed from: a */
    public String f25995a;

    /* renamed from: b */
    public String f25996b;

    /* renamed from: c */
    public ListingImage f25997c;

    public ReviewFlowListingInfo(@C17402n(name = "listing_title") String str, @C17402n(name = "variation") String str2, @C17402n(name = "img") ListingImage listingImage) {
        this.f25995a = str;
        this.f25996b = str2;
        this.f25997c = listingImage;
    }

    public final ReviewFlowListingInfo copy(@C17402n(name = "listing_title") String str, @C17402n(name = "variation") String str2, @C17402n(name = "img") ListingImage listingImage) {
        return new ReviewFlowListingInfo(str, str2, listingImage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowListingInfo)) {
            return false;
        }
        ReviewFlowListingInfo reviewFlowListingInfo = (ReviewFlowListingInfo) obj;
        return C19383o.m32792b(this.f25995a, reviewFlowListingInfo.f25995a) && C19383o.m32792b(this.f25996b, reviewFlowListingInfo.f25996b) && C19383o.m32792b(this.f25997c, reviewFlowListingInfo.f25997c);
    }

    public final int hashCode() {
        String str = this.f25995a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25996b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ListingImage listingImage = this.f25997c;
        if (listingImage != null) {
            i = listingImage.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowListingInfo(title=");
        h.append(this.f25995a);
        h.append(", variationDescription=");
        h.append(this.f25996b);
        h.append(", image=");
        h.append(this.f25997c);
        h.append(')');
        return h.toString();
    }
}
