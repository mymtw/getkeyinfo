package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ListingVideoKt {
    public static final ListingImage toListingImage(ListingVideo listingVideo) {
        C19383o.m32797g(listingVideo, "<this>");
        return new ListingImage((String) null, 0, 0, 0, (String) null, (String) null, 0, (Integer) null, (EtsyId) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 0, 0, (Integer) null, (Integer) null, (Long) null, (String) null, 0, listingVideo.getUrl(), listingVideo.getThumbnailUrl(), true, -1, 0, (DefaultConstructorMarker) null);
    }
}
