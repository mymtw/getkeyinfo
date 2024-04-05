package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class AppreciationVideo {
    public static final int $stable = 8;
    private final Long height;
    private final String posterUrl;
    private final List<Source> sources;
    private final String thumbnailUrl;
    private final String url;
    private final Long width;

    public AppreciationVideo(String str, @C17402n(name = "poster_url") String str2, @C17402n(name = "thumbnail_url") String str3, List<Source> list, Long l, Long l2) {
        this.url = str;
        this.posterUrl = str2;
        this.thumbnailUrl = str3;
        this.sources = list;
        this.width = l;
        this.height = l2;
    }

    public static /* synthetic */ AppreciationVideo copy$default(AppreciationVideo appreciationVideo, String str, String str2, String str3, List<Source> list, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appreciationVideo.url;
        }
        if ((i & 2) != 0) {
            str2 = appreciationVideo.posterUrl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = appreciationVideo.thumbnailUrl;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = appreciationVideo.sources;
        }
        List<Source> list2 = list;
        if ((i & 16) != 0) {
            l = appreciationVideo.width;
        }
        Long l3 = l;
        if ((i & 32) != 0) {
            l2 = appreciationVideo.height;
        }
        return appreciationVideo.copy(str, str4, str5, list2, l3, l2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.posterUrl;
    }

    public final String component3() {
        return this.thumbnailUrl;
    }

    public final List<Source> component4() {
        return this.sources;
    }

    public final Long component5() {
        return this.width;
    }

    public final Long component6() {
        return this.height;
    }

    public final AppreciationVideo copy(String str, @C17402n(name = "poster_url") String str2, @C17402n(name = "thumbnail_url") String str3, List<Source> list, Long l, Long l2) {
        return new AppreciationVideo(str, str2, str3, list, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppreciationVideo)) {
            return false;
        }
        AppreciationVideo appreciationVideo = (AppreciationVideo) obj;
        return C19383o.m32792b(this.url, appreciationVideo.url) && C19383o.m32792b(this.posterUrl, appreciationVideo.posterUrl) && C19383o.m32792b(this.thumbnailUrl, appreciationVideo.thumbnailUrl) && C19383o.m32792b(this.sources, appreciationVideo.sources) && C19383o.m32792b(this.width, appreciationVideo.width) && C19383o.m32792b(this.height, appreciationVideo.height);
    }

    public final Long getHeight() {
        return this.height;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final List<Source> getSources() {
        return this.sources;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Long getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.posterUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbnailUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Source> list = this.sources;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.width;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.height;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AppreciationVideo(url=");
        h.append(this.url);
        h.append(", posterUrl=");
        h.append(this.posterUrl);
        h.append(", thumbnailUrl=");
        h.append(this.thumbnailUrl);
        h.append(", sources=");
        h.append(this.sources);
        h.append(", width=");
        h.append(this.width);
        h.append(", height=");
        h.append(this.height);
        h.append(')');
        return h.toString();
    }
}
