package com.etsy.android.lib.models.apiv3.circles;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class CircledUserListingInfo {
    public static final int $stable = 8;
    private final List<ListingImage> images;

    public CircledUserListingInfo(List<ListingImage> list) {
        C19383o.m32797g(list, "images");
        this.images = list;
    }

    public static /* synthetic */ CircledUserListingInfo copy$default(CircledUserListingInfo circledUserListingInfo, List<ListingImage> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = circledUserListingInfo.images;
        }
        return circledUserListingInfo.copy(list);
    }

    public final List<ListingImage> component1() {
        return this.images;
    }

    public final CircledUserListingInfo copy(List<ListingImage> list) {
        C19383o.m32797g(list, "images");
        return new CircledUserListingInfo(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CircledUserListingInfo) && C19383o.m32792b(this.images, ((CircledUserListingInfo) obj).images);
    }

    public final List<ListingImage> getImages() {
        return this.images;
    }

    public int hashCode() {
        return this.images.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("CircledUserListingInfo(images="), this.images, ')');
    }
}
