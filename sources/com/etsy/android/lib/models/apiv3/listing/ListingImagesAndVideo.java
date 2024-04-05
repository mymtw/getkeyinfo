package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingImagesAndVideo {
    public static final int $stable = 8;
    private final List<ListingImage> images;
    private final ListingVideo video;

    public ListingImagesAndVideo() {
        this((List) null, (ListingVideo) null, 3, (DefaultConstructorMarker) null);
    }

    public ListingImagesAndVideo(@C17402n(name = "images") List<ListingImage> list, @C17402n(name = "video") ListingVideo listingVideo) {
        this.images = list;
        this.video = listingVideo;
    }

    public static /* synthetic */ ListingImagesAndVideo copy$default(ListingImagesAndVideo listingImagesAndVideo, List<ListingImage> list, ListingVideo listingVideo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listingImagesAndVideo.images;
        }
        if ((i & 2) != 0) {
            listingVideo = listingImagesAndVideo.video;
        }
        return listingImagesAndVideo.copy(list, listingVideo);
    }

    public final List<ListingImage> component1() {
        return this.images;
    }

    public final ListingVideo component2() {
        return this.video;
    }

    public final ListingImagesAndVideo copy(@C17402n(name = "images") List<ListingImage> list, @C17402n(name = "video") ListingVideo listingVideo) {
        return new ListingImagesAndVideo(list, listingVideo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingImagesAndVideo)) {
            return false;
        }
        ListingImagesAndVideo listingImagesAndVideo = (ListingImagesAndVideo) obj;
        return C19383o.m32792b(this.images, listingImagesAndVideo.images) && C19383o.m32792b(this.video, listingImagesAndVideo.video);
    }

    public final List<ListingImage> getImages() {
        return this.images;
    }

    public final ListingVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        List<ListingImage> list = this.images;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ListingVideo listingVideo = this.video;
        if (listingVideo != null) {
            i = listingVideo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingImagesAndVideo(images=");
        h.append(this.images);
        h.append(", video=");
        h.append(this.video);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingImagesAndVideo(List list, ListingVideo listingVideo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : listingVideo);
    }
}
