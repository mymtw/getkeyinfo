package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingVideo {
    public static final int $stable = 8;
    private final List<VideoSize> listingCardSources;
    private final String posterUrl;
    private final List<Map<String, String>> sources;
    private final String thumbnailUrl;
    private final String url;

    public ListingVideo() {
        this((String) null, (String) null, (String) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public ListingVideo(@C17402n(name = "url") String str, @C17402n(name = "thumbnail_url") String str2, @C17402n(name = "poster_url") String str3, @C17402n(name = "sources") List<? extends Map<String, String>> list, @C17402n(name = "listing_card_sources") List<VideoSize> list2) {
        this.url = str;
        this.thumbnailUrl = str2;
        this.posterUrl = str3;
        this.sources = list;
        this.listingCardSources = list2;
    }

    public static /* synthetic */ ListingVideo copy$default(ListingVideo listingVideo, String str, String str2, String str3, List<Map<String, String>> list, List<VideoSize> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listingVideo.url;
        }
        if ((i & 2) != 0) {
            str2 = listingVideo.thumbnailUrl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = listingVideo.posterUrl;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = listingVideo.sources;
        }
        List<Map<String, String>> list3 = list;
        if ((i & 16) != 0) {
            list2 = listingVideo.listingCardSources;
        }
        return listingVideo.copy(str, str4, str5, list3, list2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.thumbnailUrl;
    }

    public final String component3() {
        return this.posterUrl;
    }

    public final List<Map<String, String>> component4() {
        return this.sources;
    }

    public final List<VideoSize> component5() {
        return this.listingCardSources;
    }

    public final ListingVideo copy(@C17402n(name = "url") String str, @C17402n(name = "thumbnail_url") String str2, @C17402n(name = "poster_url") String str3, @C17402n(name = "sources") List<? extends Map<String, String>> list, @C17402n(name = "listing_card_sources") List<VideoSize> list2) {
        return new ListingVideo(str, str2, str3, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingVideo)) {
            return false;
        }
        ListingVideo listingVideo = (ListingVideo) obj;
        return C19383o.m32792b(this.url, listingVideo.url) && C19383o.m32792b(this.thumbnailUrl, listingVideo.thumbnailUrl) && C19383o.m32792b(this.posterUrl, listingVideo.posterUrl) && C19383o.m32792b(this.sources, listingVideo.sources) && C19383o.m32792b(this.listingCardSources, listingVideo.listingCardSources);
    }

    public final List<VideoSize> getListingCardSources() {
        return this.listingCardSources;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final List<Map<String, String>> getSources() {
        return this.sources;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.thumbnailUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.posterUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Map<String, String>> list = this.sources;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoSize> list2 = this.listingCardSources;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingVideo(url=");
        h.append(this.url);
        h.append(", thumbnailUrl=");
        h.append(this.thumbnailUrl);
        h.append(", posterUrl=");
        h.append(this.posterUrl);
        h.append(", sources=");
        h.append(this.sources);
        h.append(", listingCardSources=");
        return C0070b.m186i(h, this.listingCardSources, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingVideo(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.List r8, java.util.List r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingVideo.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
