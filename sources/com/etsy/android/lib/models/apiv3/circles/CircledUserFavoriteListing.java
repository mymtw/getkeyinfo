package com.etsy.android.lib.models.apiv3.circles;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class CircledUserFavoriteListing {
    public static final int $stable = 8;
    private final CircledUserListingInfo listing;

    public CircledUserFavoriteListing(CircledUserListingInfo circledUserListingInfo) {
        C19383o.m32797g(circledUserListingInfo, ResponseConstants.LISTING);
        this.listing = circledUserListingInfo;
    }

    public static /* synthetic */ CircledUserFavoriteListing copy$default(CircledUserFavoriteListing circledUserFavoriteListing, CircledUserListingInfo circledUserListingInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            circledUserListingInfo = circledUserFavoriteListing.listing;
        }
        return circledUserFavoriteListing.copy(circledUserListingInfo);
    }

    public final CircledUserListingInfo component1() {
        return this.listing;
    }

    public final CircledUserFavoriteListing copy(CircledUserListingInfo circledUserListingInfo) {
        C19383o.m32797g(circledUserListingInfo, ResponseConstants.LISTING);
        return new CircledUserFavoriteListing(circledUserListingInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CircledUserFavoriteListing) && C19383o.m32792b(this.listing, ((CircledUserFavoriteListing) obj).listing);
    }

    public final CircledUserListingInfo getListing() {
        return this.listing;
    }

    public int hashCode() {
        return this.listing.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CircledUserFavoriteListing(listing=");
        h.append(this.listing);
        h.append(')');
        return h.toString();
    }
}
